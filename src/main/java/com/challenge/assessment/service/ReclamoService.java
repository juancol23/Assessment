package com.challenge.assessment.service;

import com.challenge.assessment.entity.Producto;
import com.challenge.assessment.entity.Reclamo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReclamoService {

    Reclamo save(Reclamo reclamo);
    List<Reclamo> findAll();
    void findDeleteAll();

}
