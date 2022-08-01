package ro.esolutions.testing.testData

import ro.esolutions.testing.models.ClientModel

// pt consruirea modelelor si testelor mai usor
// [:] -> Map gol
// [] -> lista goala
class ClientDataGenerator {

    static ClientModel aClientModel(Map override = [:]) {
        Map defaults = [
                id: 100,
                name: 'George'
        ]
        defaults << override
        new ClientModel(defaults)
    }
}
