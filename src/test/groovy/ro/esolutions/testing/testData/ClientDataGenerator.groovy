package ro.esolutions.testing.testData

import ro.esolutions.testing.models.ClientModel

// pt consruirea modelelor si testelor mai usor
// [:] -> Map gol
// [] -> lista goala
class ClientDataGenerator {

    static ClientModel aClientModel(Map override = [:]) {
        Map defaults = [
                id: 1,
                name: 'Gigi'
        ]
        defaults << override
        new ClientModel(defaults)
    }
}
