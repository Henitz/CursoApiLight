package com.sistema.api.service;

import com.sistema.api.model.Cliente;
import com.sistema.api.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;







    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }




    public Optional<Cliente> findById(Integer id) {
        return clienteRepository.findById(id);
    }



}
