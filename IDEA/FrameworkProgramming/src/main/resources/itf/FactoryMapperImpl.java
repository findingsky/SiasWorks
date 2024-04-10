package itf;


public class FactoryDaoImpl implements FactoryMapper
{
    public SqlSession sqlSession;

    public FactoryDaoImpl(SqlSession sqlSession)
    {
        this.sqlSession = sqlSession;
    }
    @Override
    public factory selectAll(String fID)
    {
        return this.sqlSession.selectOne("selectFactory", fID);
    }
    @Override
    public void insertFactory(factory factory)
    {
        this.sqlSession.insert("insertFactory", factory);
    }
    @Override
    public void updateFactory(factory factory)
    {
        this.sqlSession.update("updateFactory", factory);
    }
    @Override
    public void deleteFactory(String fID)
    {
        this.sqlSession.delete("deleteFactory", fID);
    }
}
