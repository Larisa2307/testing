package ro.esolutions.testing

import spock.lang.Specification

class FirstTestClassSpec extends Specification{

    def 'test with expect'() {
        expect:
        1 == 1
    }

//    def 'test with give-when-then'() {
//        given:
//        def numberOfSides = 4
//
//        when:
//        def polygon = new Polygon(numberOfSides)
//
//        then:
//        polygon.getNumberOfSides() == 4
//    }

    def 'test with give-when-then number of sides: #numberOfSides'() {
        when:
        def polygon = new Polygon(numberOfSides)

        then:
        polygon.getNumberOfSides() == numberOfSides

        where:
        numberOfSides << [3, 5, 8, 10]
    }

    def 'polygon throws exception'() {
        when:
        new Polygon(numberOfSides)

        then:
        def exception = thrown(RuntimeException)
        exception.message == "the number of sides must be min 3"

        where:
        numberOfSides << [-1, 0, 2]
    }

    def 'test min with data tables: a: #a, b: #b, min: #min'() {
        expect:
        Math.min(a, b) == min

        // se poate pune la rez si | , dar si ||
        where:
        a  | b  || min
        1  | 2  || 1
        -1 | -3 || -3
        0  | 0  || 0
    }
}
