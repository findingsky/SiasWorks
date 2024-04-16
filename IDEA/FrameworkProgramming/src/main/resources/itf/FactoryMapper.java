package itf;


public interface FactoryMapper
{
    public factory selectFactory(String fId);

    public List<factory> selectAllFactory();

    public int insertFactory(factory factory);

    public int updateFactory(factory factory);

    public int deleteFactory(String fId);

    public List<reagents> selectReagentsByFactory(String fId)
}

