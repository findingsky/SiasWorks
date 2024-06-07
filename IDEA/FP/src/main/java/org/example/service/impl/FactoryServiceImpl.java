package org.example.service.impl;

import org.example.itf.FactoryMapper;
import org.example.service.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.pojo.Factory;

@Service
public class FactoryServiceImpl implements FactoryService
{

    @Autowired
    private FactoryMapper factoryMapper;

    @Override
    public Factory create(Factory f) throws Exception {
        factoryMapper.insertFactory(f);
        return f;
    }

    @Override
    public Factory read(char[] fId) throws Exception {
        return factoryMapper.selectFactory(fId);
    }

    @Override
    public Factory update(Factory f) throws Exception {
        factoryMapper.updateFactory(f);
        return f;
    }

    @Override
    public void delete(char[] fId) throws Exception {
        factoryMapper.deleteFactory(fId);
    }
}
