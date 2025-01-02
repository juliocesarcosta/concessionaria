package com.jc.concessionaria.service;

import com.jc.concessionaria.model.Carro;
import java.util.List;
import java.util.Optional;

public interface CarroService {
    List<Carro> getAllCarros();
    Optional<Carro> getCarroById(Long id);
    Carro createCarro(Carro carro);
    Carro updateCarro(Long id, Carro carro);
    void deleteCarro(Long id);
}

