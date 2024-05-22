package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.factory;
import service.FactoryService;

import java.util.List;

@Service
public class FactoryServiceImpl implements FactoryService
{
    @Autowired
    private factoryDao factoryDao;

    @Override
    public int deleteFactory(char[] fId)
    {
        return factoryDao.deleteFactory(fId);
    }

    @Override
    public int insertFactory(factory factory)
    {
        return factoryDao.insertFactory(factory);
    }

    @Override
    public factory selectFactory(int fId)
    {
        return factoryDao.selectFactory(fId);
    }

    @Override
    public List<factory> selectAllFactory()
    {
        return factoryDao.selectAllFactory();
    }

    @Override
    public int updateFactory(factory factory)
    {
        return factoryDao.updateFactory(factory);
    }

    @Override
    public List<factory> selectReagentsByFactory(char fId)
    {
        return factoryDao.selectReagentsByFactory(fId);
    }
}
