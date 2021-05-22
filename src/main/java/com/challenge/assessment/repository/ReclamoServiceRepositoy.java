package com.challenge.assessment.repository;

import com.challenge.assessment.entity.Reclamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface ReclamoServiceRepositoy extends JpaRepository<Reclamo,Integer> {



}
