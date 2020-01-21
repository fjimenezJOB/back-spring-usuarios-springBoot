package com.voltex.springboot.backend.apirest.springbootbackendapirest.models.service;

import java.util.List;

import com.voltex.springboot.backend.apirest.springbootbackendapirest.models.entity.Cliente;

public interface IClienteService {
    public List<Cliente> findAll();

    public Cliente save(Cliente cliente);
    public void delete(Long id);
    public Cliente findById(Long id);

}
