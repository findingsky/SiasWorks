package itf;

import members.factory;

public interface FactoryDao
{
    public factory selectFactory(String fID);

    public int insertFactory(factory factory);

    public int updateFactory(factory factory);

    public int deleteFactory(String fId);
}

