package service;

import pojo.factory;

public interface FactoryService {

    // 创建工厂实体类对象
    factory create(factory f);

    // 读取工厂实体类对象
    factory read(char[] fId);

    // 更新工厂实体类对象
    factory update(factory f);

    // 删除工厂实体类对象
    void delete(char[] fId);
}
