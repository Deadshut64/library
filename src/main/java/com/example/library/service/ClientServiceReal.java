package com.example.library.service;

import com.example.library.model.Client;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class ClientServiceReal implements ClientService{

    private static final Map<Integer,Client> Data_Base_Client = new HashMap<>();
    private static final AtomicInteger ID = new AtomicInteger();

    @Override
    public void create(Client client) {
        final int id = ID.incrementAndGet();
        client.setId(id);
        Data_Base_Client.put(id,client);
    }

    @Override
    public List<Client> readAll() {
        return new ArrayList<>(Data_Base_Client.values());
    }

    @Override
    public Client read(int id) {
        return Data_Base_Client.get(id);
    }

    @Override
    public boolean update(Client client, int id) {
        if (Data_Base_Client.containsKey(id)){
            client.setId(id);
            Data_Base_Client.put(id, client);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        return Data_Base_Client.remove(id) != null;
    }
}
