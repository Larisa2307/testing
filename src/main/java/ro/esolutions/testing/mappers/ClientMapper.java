package ro.esolutions.testing.mappers;

import ro.esolutions.testing.entities.Client;
import ro.esolutions.testing.models.ClientModel;

public final class ClientMapper {

    private ClientMapper(){}

    public static ClientModel toModel(Client client) {
        return ClientModel.builder()
                .id(client.getId())
                .name(client.getName())
                .build();
    }

    public static Client toEntity(ClientModel clientModel) {
        return Client.builder()
                .id(clientModel.getId())
                .name(clientModel.getName())
                .build();
    }
}
