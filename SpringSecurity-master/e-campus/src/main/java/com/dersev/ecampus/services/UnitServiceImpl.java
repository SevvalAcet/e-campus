package com.dersev.ecampus.services;

import com.dersev.ecampus.models.Unit;
import com.dersev.ecampus.repositories.UnitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnitServiceImpl implements UnitService{

    private UnitDao unitDao;
    @Autowired
    public UnitServiceImpl(UnitDao unitDao) {
        this.unitDao = unitDao;
    }

    @Override
    public Unit save(Unit unit) {
        return unitDao.save(unit);
    }

    @Override
    public void delete(int id) {
        unitDao.deleteById(id);
    }

    @Override
    public List<Unit> findAll() {
        return unitDao.findAll();
    }
}
