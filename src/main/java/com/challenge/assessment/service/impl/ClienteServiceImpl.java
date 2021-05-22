package com.challenge.assessment.service.impl;

import com.challenge.assessment.entity.Cliente;
import com.challenge.assessment.repository.ClienteServiceRepositoy;
import com.challenge.assessment.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteServiceRepositoy clienteServiceRepositoy;

    @Override
    public Cliente save(Cliente cliente) {
        return clienteServiceRepositoy.save(cliente);

    }

    @Override
    public List<Cliente> findAll() {
        return clienteServiceRepositoy.findAll();
    }

    @Override
    public void findDeleteAll() {
        clienteServiceRepositoy.deleteAll();
    }

}
