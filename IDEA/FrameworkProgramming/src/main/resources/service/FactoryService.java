package service;

import pojo.factory;

import java.util.List;

public interface FactoryService {

    int deleteFactory(char[] fId);
    int insertFactory(Factory factory);
    Factory selectFactory(int fId);
    List<Factory> selectAllFactory();
    int updateFactory(Factory factory);
    List<Factory> selectReagentsByFactory(char fId);

}
