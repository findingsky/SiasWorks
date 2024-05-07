package itf;

import org.apache.ibatis.session.SqlSession;

public Class ReagentsInputListDaoImpl implements

ReagentsInputListMapper
{
    public SqlSession sqlSession;
    public void updateReagentsInputList (ReagentsInputList
    reagentsInputList)
    {
        this.sqlSession.update("updateReagentsInputList", reagentsInputList);
    }

    public void deleteReagentsInputList (String rlId)
    {

        this.sqlSession.delete("deleteReagentsInputList", rlId);
    }

    public void insertReagentsInputList (ReagentsInputList
    reagentsInputList)
    {

        this.sqlSession.insert("insertReagentsInputList", reagentsInputList);
    }

    public ReagentsInputList getReagentsInputList
    (String rlId)
    {

        return this.sqlSession.selectOne("getReagentsInputList", rlId);
    }
}