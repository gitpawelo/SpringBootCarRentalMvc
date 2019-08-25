package com.mycompany.interfaces;

import com.mycompany.model.Engine;

import java.util.List;

public interface EngineService {

    List<Engine> getAllEngines();
    Engine addEngine(Engine engine);
    Engine updateEngine(Engine engine);
    void deleteEngne(Engine engine);

}
