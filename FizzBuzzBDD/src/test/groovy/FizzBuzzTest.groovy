import spock.lang.Specification

class FizzBuzz2Test extends Specification{
    def "Should show Stringvalue for input number "() {
        expect:
        "1" == new FizzBuzz().convert(1)
        "2" == new FizzBuzz().convert(2)
        "4" == new FizzBuzz().convert(4)
        "7" == new FizzBuzz().convert(7)
        "8" == new FizzBuzz().convert(8)
        "11" == new FizzBuzz().convert(11)
        "13" == new FizzBuzz().convert(13)
        "14" == new FizzBuzz().convert(14)
    }

    def "Should show Fizz for numbers divisible by 3"() {
        expect:
        "Fizz" == new FizzBuzz().convert(3)
        "Fizz" == new FizzBuzz().convert(6)
        "Fizz" == new FizzBuzz().convert(9)
        "Fizz" == new FizzBuzz().convert(12)
    }

    def "Should show Buzz for numbers divisible by 5"() {
        expect:
        "Buzz" == new FizzBuzz().convert(5)
        "Buzz" == new FizzBuzz().convert(10)
    }

    def "Should show FizzBuzz for numbers divisible by 15"() {
        expect:
        "FizzBuzz" == new FizzBuzz().convert(15)
        "FizzBuzz" == new FizzBuzz().convert(30)
    }

}
