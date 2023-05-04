import spock.lang.Specification

class FizzBuzz2Test extends Specification{
    def "Should show 1 for 1"() {
        expect:
        "1" == new FizzBuzz2().convert(1)
    }

    def "Should show 2 for 2"() {
        expect:
        "2" == new FizzBuzz2().convert(2)
    }
}
