package service;

import pojo.factory;

public interface FactoryService {

    // 创建工厂实体类对象
    factory create(factory f) throws Exception;

    // 读取工厂实体类对象
    factory read(char[] fId) throws Exception;

    // 更新工厂实体类对象
    factory update(factory f) throws Exception;

    // 删除工厂实体类对象
    void delete(char[] fId) throws Exception;
}
