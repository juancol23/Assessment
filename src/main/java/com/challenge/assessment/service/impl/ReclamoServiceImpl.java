package com.challenge.assessment.service.impl;

import com.challenge.assessment.entity.Producto;
import com.challenge.assessment.entity.Reclamo;
import com.challenge.assessment.repository.ProductoServiceRepositoy;
import com.challenge.assessment.repository.ReclamoServiceRepositoy;
import com.challenge.assessment.service.ProductoService;
import com.challenge.assessment.service.ReclamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReclamoServiceImpl implements ReclamoService {

    @Autowired
    private ReclamoServiceRepositoy reclamoServiceRepositoy;

    @Override
    public Reclamo save(Reclamo reclamo) {
        return reclamoServiceRepositoy.save(reclamo);

    }

    @Override
    public List<Reclamo> findAll() {
        return reclamoServiceRepositoy.findAll();
    }

    @Override
    public void findDeleteAll() {
        reclamoServiceRepositoy.deleteAll();
    }

}
