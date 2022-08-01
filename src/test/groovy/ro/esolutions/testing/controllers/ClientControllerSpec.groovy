package ro.esolutions.testing.controllers

import org.springframework.http.HttpStatus
import ro.esolutions.testing.services.ClientService
import spock.lang.Specification
import spock.lang.Subject

class ClientControllerSpec extends Specification{

    def clientService = Mock(ClientService)

    @Subject
    def controller = new ClientController(clientService)

    def 'get all clients'() {

        when:
        def response = controller.getAllClients()

        then:
        1 * clientService.getAllClients() >> [] // se apeleaza o singura data
        0 * _ // se face doar o singura apelare ne mai existand alta apleare

        and:
        response.statusCode == HttpStatus.OK
        response.getBody() == []
    }
}
