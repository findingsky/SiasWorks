package itf;

import java.util.List;

<<<<<<< HEAD
=======
import pojo.factory;
import pojo.reagents;


>>>>>>> bdca16bac9bb6a107563af7fffec257439e9b48f
public interface FactoryMapper
{
    public factory selectFactory(String fId);

    public List<factory> selectAllFactory();

    public int insertFactory(factory factory);

    public int updateFactory(factory factory);

    public int deleteFactory(String fId);

    public List<reagents> selectReagentsByFactory(String fId)
}

