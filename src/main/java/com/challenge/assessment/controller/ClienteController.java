package com.challenge.assessment.controller;

import com.challenge.assessment.entity.Cliente;
import com.challenge.assessment.service.impl.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "api/v1")
public class ClienteController {

    @Autowired
    private ClienteServiceImpl clienteService;

    @RequestMapping(value = "/cliente", method = RequestMethod.POST)
    public ResponseEntity<Cliente> guardarCliente(@RequestBody Cliente request){

        Cliente cliente = new Cliente();

        cliente = clienteService.save(request);

        return new ResponseEntity<>(cliente, HttpStatus.OK);

    }

    @RequestMapping(value = "/cliente", method = RequestMethod.GET)
    public ResponseEntity<List<Cliente>> guardarCliente(){

        List<Cliente> clienteList = new ArrayList<>();

        clienteList = clienteService.findAll();

        return new ResponseEntity<>(clienteList, HttpStatus.OK);

    }











}
