package itf;

import members.factory;

import java.util.List;

public interface FactoryDao
{
    public factory selectFactory(String fID);

    public List<factory> selectAllFactory();

    public int insertFactory(factory factory);

    public int updateFactory(factory factory);

    public int deleteFactory(String fId);

    public int deleteFactory(factory factory);

    public List<reagents> selectReagentsByFactory(String fId)
}

