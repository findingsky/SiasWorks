package service.impl;

import mapper.FactoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.factory;

import java.util.List;

@Service
public class FactoryServiceImpl implements FactoryService
{

    @Autowired
    private FactoryMapper factoryMapper;

    @Override
    public factory create(factory f) throws Exception
    {
        factoryMapper.insertFactory(f);
        return f;
    }

    @Override
    public factory read(char[] fId) throws Exception
    {
        return factoryMapper.selectFactory(fId);
    }

    @Override
    public factory update(factory f) throws Exception
    {
        factoryMapper.updateFactory(f);
        return f;
    }

    @Override
    public void delete(char[] fId) throws Exception
    {
        factoryMapper.deleteFactory(fId);
    }
}
