package com.dersev.ecampus.services;

import com.dersev.ecampus.models.Unit;

import java.util.List;

public interface UnitService {
    Unit save(Unit unit);
    void delete(int id);
    List<Unit> findAll();
}
