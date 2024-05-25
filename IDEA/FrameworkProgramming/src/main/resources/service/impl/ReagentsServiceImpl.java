package service.impl;

import mapper.ReagentsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.reagents;

import java.util.List;

@Service
public class ReagentsServiceImpl implements ReagentsService
{

    @Autowired
    private ReagentsMapper reagentsMapper;

    @Override
    public int deleteReagents(char[] rId)
    {
        return reagentsMapper.deleteReagents(rId);
    }

    @Override
    public int updateReagents(reagents r)
    {
        return reagentsMapper.updateReagents(r);
    }

    @Override
    public reagents selectReagents(char[] rId)
    {
        return reagentsMapper.selectReagents(rId);
    }

    @Override
    public int insertReagents(reagents r)
    {
        return reagentsMapper.insertReagents(r);
    }

    @Override
    public List<reagents> selectAllReagent()
    {
        return reagentsMapper.selectAllReagent();
    }

    @Override
    public reagents selectReagentsFactory(char[] rId)
    {
        return reagentsMapper.selectReagentsFactory(rId);
    }
}
