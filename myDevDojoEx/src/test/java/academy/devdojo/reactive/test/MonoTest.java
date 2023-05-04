package academy.devdojo.reactive.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.reactivestreams.Subscription;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@Slf4j
/**
 * Reactive Streams
 * 1. Asynchronous
 * 2. Non-blocking
 * 3. Backpressure
 * Publisher <- (subscribe) Subscriber
 * Subscription is created
 * Publisher will call (onSubscribe with the subscription) -> Subscriber
 * Subscription can be used to handle backpressure <- (request N) Subscriber
 * Publisher calls -> (onNext) Subscriber
 * until:
 * 1. Publisher ssends all the objects requested.
 * 2. Publisher sends all the objects it has. (onComplete) subscriber and subscription will be canceled
 * 3. If there an error (onError)  -> subscriber and subscription will be canceled
 *
 */
public class MonoTest {

  @Test
  public void monoSubscriber(){
    // In devdojo Project Reactor 3
    String name = "Farokh Eduljee";
    Mono<String> mono = Mono.just(name) // This mono is a Publishser
        .log();

    mono.subscribe();  // To get information about this publisher, you need to Subscribe
    log.info("-------------------------");
    StepVerifier.create(mono)
        .expectNext(name)
        .verifyComplete();
  }

  @Test
  public void monoSubscriberConsumer(){
    // In devdojo Project Reactor 4
    String name = "Farokh Eduljee";
    Mono<String> mono = Mono.just(name) // This mono is a Publishser
        .log();

    mono.subscribe(s -> log.info("Value: {}", s));  // To get information about this publisher, you need to Subscribe
    log.info("-------------------------");

    StepVerifier.create(mono)
        .expectNext(name)
        .verifyComplete();
  }

  @Test
  public void monoSubscriberConsumerError(){
    // In devdojo Project Reactor 4
    String name = "Farokh Eduljee";
    Mono<String> mono = Mono.just(name) // This mono is a Publishser
        .map(s -> {throw new RuntimeException("Testing mono with error...");});

    mono.subscribe(s -> log.info("Value: {}", s), s-> log.error("Something bad happened"));  // To get information about this
    mono.subscribe(s -> log.info("Value: {}", s), Throwable::printStackTrace);  // Print stack-trace
    // publisher, you need to
    // Subscribe
    log.info("-------------------------");

    StepVerifier.create(mono)
        .expectError(RuntimeException.class)
        .verify();
  }

  @Test
  public void monoSubscriberConsumerComplete(){
    // In devdojo Project Reactor 5
    String name = "Farokh Eduljee";
    Mono<String> mono = Mono.just(name) // This mono is a Publishser
        .log()
        .map(String::toUpperCase);

    mono.subscribe(s -> log.info("Value: {}", s),
        Throwable::printStackTrace,
        () -> log.info("FINISHED"));  // When successfully Complete

    log.info("-------------------------");

    StepVerifier.create(mono)
        .expectNext(name.toUpperCase())
        .verifyComplete();
  }

  @Test
  public void monoSubscriberConsumerSubscription(){
    // In devdojo Project Reactor 5
    String name = "Farokh Eduljee";
    Mono<String> mono = Mono.just(name) // This mono is a Publishser
        .log()
        .map(String::toUpperCase);

    mono.subscribe(s -> log.info("Value: {}", s),
        Throwable::printStackTrace,
        () -> log.info("FINISHED"),
        Subscription::cancel);  // To cancel Subscription

    log.info("-------------------------");

    StepVerifier.create(mono)
        .expectNext(name.toUpperCase())
        .verifyComplete();
  }


  @Test
  public void monoSubscriberConsumerSubscriptionWithRequestNum(){
    // In devdojo Project Reactor 6
    // more appropriate for Flux and not for Mono

    String name = "Farokh Eduljee";
    Mono<String> mono = Mono.just(name) // This mono is a Publishser
        .log()
        .map(String::toUpperCase);

    mono.subscribe(s -> log.info("Value: {}", s),
        Throwable::printStackTrace,
        () -> log.info("FINISHED"),
        subscription -> subscription.request(5));  // To cancel Subscription

    log.info("-------------------------");

    StepVerifier.create(mono)
        .expectNext(name.toUpperCase())
        .verifyComplete();
  }


  @Test
  public void monoDoOnMethods(){
    // In devdojo Project Reactor 6
    String name = "Farokh Eduljee";
    Mono<Object> mono = Mono.just(name) // This mono is a Publishser
        .log()
        .map(String::toUpperCase)
        .doOnSubscribe(subscription -> log.info("Subscribed"))
        .doOnRequest(longNumber -> log.info("Request received, started doing something..."))
        .doOnNext(s -> log.info("Value is here. Executing 1st doOnNext {}", s))
        .flatMap(s -> Mono.empty())  // setting mono to empty here so, ...
        .doOnNext(s -> log.info("Value is here. Executing 2nd doOnNext {}", s))  // will not be executed
        .doOnSuccess(s -> log.info("doOnSuccess executed {}", s));

    mono.subscribe(s -> log.info("Value: {}", s),
        Throwable::printStackTrace,
        () -> log.info("FINISHED"));  // When successfully Complete

    log.info("-------------------------");

//    StepVerifier.create(mono)
//        .expectNext(name.toUpperCase())
//        .verifyComplete();
  }

  @Test
  public void monoDoOnError(){
    // In devdojo Project Reactor 7
    Mono<Object> error = Mono.error(new IllegalArgumentException("Illegal argument exception"))
        .doOnError(e -> MonoTest.log.error("Error message: {}", e.getMessage()))
        .doOnNext(s -> log.info("Executing this doOnNext"))
        .log();

    StepVerifier.create(error)
        .expectError(IllegalAccessException.class)
        .verify();
  }

  @Test
  public void monoOnErrorResume(){
    // In devdojo Project Reactor 7
    String name = "Farokh Eduljee";
    Mono<Object> error = Mono.error(new IllegalArgumentException("Illegal argument exception"))
        .onErrorResume(s -> {
          log.info("Executing this onErrorResume");
          return Mono.just(name);
        })
        .doOnError(e -> log.error("Error message: {}", e.getMessage()))
        .log();

    StepVerifier.create(error)
        .expectNext(name)
        .verifyComplete();
  }


  @Test
  public void monoOnErrorReturn(){
    // In devdojo Project Reactor 7
    String name = "Farokh Eduljee";
    Mono<Object> error = Mono.error(new IllegalArgumentException("Illegal argument exception"))
        .onErrorReturn("EMPTY")
        .onErrorResume(s -> {
          log.info("Executing this onErrorResume");
          return Mono.just(name);
        })
        .doOnError(e -> log.error("Error message: {}", e.getMessage()))
        .log();

    StepVerifier.create(error)
        .expectNext("EMPTY")
        .verifyComplete();
  }
}
