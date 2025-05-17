package com.gestionClient.service;

import com.gestionClient.model.Client;
import com.gestionClient.repos.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    // Créer un nouveau client
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    // Récupérer tous les clients
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    // Récupérer un client par son ID
    public Optional<Client> getClientById(long id) {
        return clientRepository.findById((long) id);
    }

    // Mettre à jour un client
    public Client updateClient(Client client) {
        return clientRepository.save(client);
    }

    // Supprimer un client
    public void deleteClient(long id) {
        clientRepository.deleteById((long) id);
    }
}
