package com.challenge.assessment.service;

import com.challenge.assessment.entity.Cliente;
import com.challenge.assessment.entity.Producto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductoService {

    Producto save(Producto cliente);
    List<Producto> findAll();
    void findDeleteAll();

}
