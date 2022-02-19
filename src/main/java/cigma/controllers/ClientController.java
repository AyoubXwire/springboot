package cigma.controllers;

import cigma.models.Client;
import cigma.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private IClientService clientService;

    @GetMapping("/")
    public List<Client> getAll() {
        return clientService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Client> getOne(@PathVariable("id") long id) {
        return clientService.getOne(id);
    }

    @PostMapping("/")
    public void save(@RequestBody Client client) {
        clientService.save(client);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable("id") long id) {
        clientService.remove(id);
    }

    @PutMapping("/{id}")
    public Client update(Client client) {
        return clientService.update(client);
    }

}
