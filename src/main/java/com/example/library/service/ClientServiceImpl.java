package com.example.library.service;

import com.example.library.model.Client;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;


@Service
public class ClientServiceImpl implements ClientService{

    private static final Map<Integer,Client> listClients = new ConcurrentHashMap<>();
    private final AtomicInteger ID = new AtomicInteger();
    @Override
    public void create(Client client) {
        int id = ID.incrementAndGet();
        client.setId(id);
        listClients.put(id,client);
    }

    @Override
    public List<Client> readAll() {
        return new ArrayList<>(listClients.values());
    }

    @Override
    public Client read(int id) {
        return listClients.get(id);
    }

    @Override
    public boolean update(Client client, int id) {
        if (listClients.containsKey(id)){
            client.setId(id);
            listClients.put(id, client);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        return listClients.remove(id) != null;
    }
}
