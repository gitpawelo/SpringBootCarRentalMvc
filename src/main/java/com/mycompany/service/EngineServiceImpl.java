package com.mycompany.service;

import com.mycompany.interfaces.EngineService;
import com.mycompany.model.Engine;
import com.mycompany.repository.EngineRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EngineServiceImpl implements EngineService {

    @Autowired
    EngineRepository engineRepository;

    @Override
    public List<Engine> getAllEngines() {
        return engineRepository.findAll();
    }

    @Override
    public Engine addEngine(Engine engine) {
        return engineRepository.save(engine);
    }

    @Override
    public Engine updateEngine(Engine engine) {
        return engineRepository.save(engine);
    }

    @Override
    public void deleteEngne(Engine engine) {
        engineRepository.delete(engine);
    }
}
