package com.farokh.primefactor

import spock.lang.Specification

class PrimeFactorTest extends Specification {
    PrimeFactor primeFactor
    void setup() {
       primeFactor = new PrimeFactor()
    }

    def "Should return list of factors for given input"() {
        expect:
        RESULT == primeFactor.factorize(INPUT)

        where:
        INPUT  | RESULT
        0      | List.of()
        1      | List.of()
        2      | List.of(2)
        3      | List.of(3)
        4      | List.of(2, 2)
        5      | List.of(5)
        6      | List.of(2, 3)
        7      | List.of(7)
        8      | List.of(2, 2, 2)
        9      | List.of(3, 3)
        2*11*17*53 | List.of(2,11,17,53)


    }
}
