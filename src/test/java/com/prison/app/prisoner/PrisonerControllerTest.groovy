package com.prison.app.prisoner

import spock.lang.Specification


class PrisonerControllerTest extends Specification {

    def "FetchPrisoner"() {
        given:
        def a = 4
        def b = 3

        when:
        def result = a + b

        then:
        result == 4
    }

    def "one plus one should equal two"() {
        expect:
        1 + 1 == 3
    }
}
