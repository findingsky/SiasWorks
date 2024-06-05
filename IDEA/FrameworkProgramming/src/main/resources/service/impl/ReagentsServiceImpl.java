package service.impl;

import mapper.ReagentsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Reagents;

import java.util.List;

@Service
public class ReagentsServiceImpl implements ReagentsService
{

    @Autowired
    private ReagentsMapper reagentsMapper;

    @Override
    public int deleteReagents(char[] rId)throws Exception
    {
        return reagentsMapper.deleteReagents(rId);
    }

    @Override
    public int updateReagents(Reagents r)throws Exception
    {
        return reagentsMapper.updateReagents(r);
    }

    @Override
    public Reagents selectReagents(char[] rId)throws Exception
    {
        return reagentsMapper.selectReagents(rId);
    }

    @Override
    public int insertReagents(Reagents r)throws Exception
    {
        return reagentsMapper.insertReagents(r);
    }

    @Override
    public List<Reagents> selectAllReagent()throws Exception
    {
        return reagentsMapper.selectAllReagent();
    }

    @Override
    public Reagents selectReagentsFactory(char[] rId)throws Exception
    {
        return reagentsMapper.selectReagentsFactory(rId);
    }
}
