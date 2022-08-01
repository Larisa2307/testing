package ro.esolutions.testing.repository

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ClientRepositoryIT extends Specification{

    @Autowired
    ClientRepository clientRepository

    def 'get all clients'() {
        expect:
        clientRepository.findAll() == []
    }
}
