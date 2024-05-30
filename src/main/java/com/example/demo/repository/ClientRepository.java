package com.example.demo.repository;

import com.example.demo.model.Client;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ClientRepository extends MongoRepository<Client, String> {
    Client FindByUsername(String username);

    //Client findByUsernameAndPassword(String username, String password);
}
