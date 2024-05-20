package service.impl;

import pojo.factory;
import service.FactoryService;

public class FactoryServiceImpl implements FactoryService
{

    @Override
    public factory create(factory f)
    {
        // 在这里实现创建工厂实体类对象的逻辑
        return f;
    }

    @Override
    public factory read(char[] fId)
    {
        // 在这里实现根据工厂ID读取工厂实体类对象的逻辑
        factory f = new factory();
        f.setFId(fId);
        return f;
    }

    @Override
    public factory update(factory f)
    {
        // 在这里实现更新工厂实体类对象的逻辑
        return f;
    }

    @Override
    public void delete(char[] fId)
    {
        // 在这里实现根据工厂ID删除工厂实体类对象的逻辑
    }
}
