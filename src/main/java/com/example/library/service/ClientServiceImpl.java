package com.example.library.service;

import com.example.library.model.Client;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


@Service
public class ClientServiceImpl implements ClientService{

    private JdbcTemplate jdbcTemplate;
    @Override
    public int create(Client client) {
        return jdbcTemplate.update(
                "insert into person (person_id, first_name, last_name) values(?,?,?)",
                client.getId(),client.getFirstName(),client.getLastName());
    }

    @Override
    public List<Client> readAll() {
        return jdbcTemplate.query(
                "select * from person",
                (rs, rowNum) ->
                        new Client(
                                rs.getInt(1),
                                rs.getString(2),
                                rs.getString(3)
                        )
        );
    }

    @Override
    public Client read(int id) {
        return jdbcTemplate.query(
                "select * from person where person_id = ?",
                
        );

    }

    @Override
    public boolean update(Client client, int id) {
        return jdbcTemplate.update(
                "update Person set first_name = ? where id = ?",
                client.getFirstName(), client.getId()) > 0;
    }

    @Override
    public boolean delete(int id) {
        return jdbcTemplate.update(
                "delete Person where person_id = ?", id) > 0;
    }

    }

