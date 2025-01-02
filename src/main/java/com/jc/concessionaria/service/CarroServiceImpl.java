package com.jc.concessionaria.service;

import com.jc.concessionaria.model.Carro;
import com.jc.concessionaria.repository.CarroRepository;
import com.jc.concessionaria.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarroServiceImpl implements CarroService {

    @Autowired
    private CarroRepository carroRepository;

    @Override
    public List<Carro> getAllCarros() {
        return carroRepository.findAll();
    }

    @Override
    public Optional<Carro> getCarroById(Long id) {
        return carroRepository.findById(id);
    }

    @Override
    public Carro createCarro(Carro carro) {
        return carroRepository.save(carro);
    }

    @Override
    public Carro updateCarro(Long id, Carro carro) {
        carro.setId(id);
        return carroRepository.save(carro);
    }

    @Override
    public void deleteCarro(Long id) {
        carroRepository.deleteById(id);
    }
}

