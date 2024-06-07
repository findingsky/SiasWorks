package org.example.service;

import org.example.pojo.Factory;

public interface FactoryService {

    // 创建工厂实体类对象
    Factory create(Factory f) throws Exception;

    // 读取工厂实体类对象
    Factory read(char[] fId) throws Exception;

    // 更新工厂实体类对象
    Factory update(Factory f) throws Exception;

    // 删除工厂实体类对象
    void delete(char[] fId) throws Exception;
}
