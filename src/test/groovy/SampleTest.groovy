import spock.lang.Specification

class SampleTest extends  Specification {

    def "test 1"() {
        when:
            def result = 'a'
        then:
            result == 'a'
    }

    def "test 2"() {
        when:
            def result = 'b'
        then:
            result == 'b'
    }

}
