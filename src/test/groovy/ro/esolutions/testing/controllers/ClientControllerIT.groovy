package ro.esolutions.testing.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.core.ParameterizedTypeReference
import org.springframework.http.HttpMethod
import org.springframework.http.HttpStatus
import org.springframework.test.context.jdbc.Sql
import org.springframework.test.context.jdbc.SqlGroup
import ro.esolutions.testing.models.ClientModel
import ro.esolutions.testing.repository.ClientRepository
import spock.lang.Specification

import static ro.esolutions.testing.testData.ClientDataGenerator.aClientModel

@SqlGroup(
        @Sql(value = '/sql/client.sql', executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ClientControllerIT extends Specification{

    @Autowired
    TestRestTemplate restTemplate

    @Autowired
    ClientRepository clientRepository

    def 'get all clients'() {
        given:
        def url = '/client/all'

        when:
        def result = restTemplate.exchange(url, HttpMethod.GET, null,
                new ParameterizedTypeReference<ClientModel>() {})

        then:
        result.statusCode == HttpStatus.OK
        result.getBody() == [aClientModel()]
    }
}
