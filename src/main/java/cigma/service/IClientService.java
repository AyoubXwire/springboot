package cigma.service;

import cigma.models.Client;

import java.util.List;
import java.util.Optional;

public interface IClientService {

    List<Client> getAll();

    Optional<Client> getOne(long id);

    void save(Client client);

    void remove(long id);

    Client update(Client client);

}
