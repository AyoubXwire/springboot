package cigma.service;

import cigma.models.Client;
import cigma.repositories.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ClientService implements IClientService {

    @Autowired
    private IClientRepository clientRepository;

    @Override
    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    @Override
    public Optional<Client> getOne(long id) {
        return clientRepository.findById(id);
    }

    @Override
    @Transactional
    public void save(Client client) {
        clientRepository.save(client);
    }

    @Override
    @Transactional
    public void remove(long id) {
        clientRepository.deleteById(id);
    }

    @Override
    @Transactional
    public Client update(Client newClient) {
        //Client oldClient = clientRepository.findById(newClient.getId());
        //oldClient.setName(newClient.getName());
        //return clientRepository.save(oldClient);
        return null;
    }

}
