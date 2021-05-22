package com.challenge.assessment.repository;

import com.challenge.assessment.entity.Cliente;
import com.challenge.assessment.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface ProductoServiceRepositoy extends JpaRepository<Producto,Integer> {



}
