package itf;

import members.factory;

public interface FactoryDao
{
    public factory selectFactory(String fID);

    public void insertFactory(factory factory);

    public void updateFactory(factory factory);

    public void deleteFactory(String fId);
}

