package service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Reagents;
import pojo.Factory;
import itf.ReagentsDao;

import java.util.List;

@Service
public class ReagentsServiceImpl implements ReagentsService
{
    @Autowired
    private ReagentsDao reagentsDao;

    @Override
    public int deleteReagents(char[] rId)
    {
        return reagentsDao.deleteReagents(rId);
    }

    @Override
    public int updateReagents(Reagents reagents)
    {
        return reagentsDao.updateReagents(reagents);
    }

    @Override
    public List<Reagents> selectReagents(char[] rId)
    {
        return reagentsDao.selectReagents(rId);
    }

    @Override
    public int insertReagents(Reagents reagents)
    {
        return reagentsDao.insertReagents(reagents);
    }

    @Override
    public List<Factory> selectReagentsFactory(char[] rId)
    {
        return reagentsDao.selectReagentsFactory(rId);
    }

    @Override
    public List<Reagents> selectAllReagents()
    {
        return reagentsDao.selectAllReagents();
    }
}
