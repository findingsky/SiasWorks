package itf;

import org.apache.ibatis.session.SqlSession;

public Class ReagentsDaoImpl implements

ReagentsDao
{
    public SqlSession sqlSession;
    public int deleteReagent (String rId)
    {
        this.sqlSession.delete("deleteReagent", rId);
    }
    public int updateReagent (reagents reagent)
    {
        this.sqlSession.update("updateReagent", reagent);
    }
    public reagents selectReagent (String rId)
    {
        return this.sqlSession.selectOne("selectReagent", rId);
    }
    public int insertReagent (reagents reagent)
    {
        return this.sqlSession.insert("insertReagent", reagent);
    }

    public List<reagents> selectAllReagents ()
    {
        return this.sqlSession.selectList("selectAllReagents");
    }
    public factory selectReagentsFactory (String rId)
    {
        return this.sqlSession.selectOne("selectReagentsFactory", rId);
    }
}