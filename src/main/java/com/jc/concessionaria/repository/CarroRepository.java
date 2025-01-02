package com.jc.concessionaria.repository;

import com.jc.concessionaria.model.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}

