package com.challenge.assessment.repository;

import com.challenge.assessment.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface ClienteServiceRepositoy extends JpaRepository<Cliente,Integer> {



}
