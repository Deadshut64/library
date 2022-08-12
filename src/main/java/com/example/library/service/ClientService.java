package com.example.library.service;

import com.example.library.model.Client;

import java.util.List;

public interface ClientService {

    int create(Client client);

    List<Client> readAll();

    Client read(int id);

    boolean update(Client client, int id);

    boolean delete(int id);

}
