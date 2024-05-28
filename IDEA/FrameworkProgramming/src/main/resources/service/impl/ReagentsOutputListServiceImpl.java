package service.impl;

import mapper.ReagentsOutputListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.reagentsOutputList;

@Service
public class ReagentsOutputListServiceImpl implements ReagentsOutputListService
{

    @Autowired
    private ReagentsOutputListMapper reagentsOutputListMapper;

    @Override
    public reagentsOutputList create(reagentsOutputList rol)throws Exception
    {
        reagentsOutputListMapper.insertReagentsOutputList(rol);
        return rol;
    }

    @Override
    public reagentsOutputList read(char[] rlId)throws Exception
    {
        return reagentsOutputListMapper.selectReagentsOutputList(rlId);
    }

    @Override
    public reagentsOutputList update(reagentsOutputList rol)throws Exception
    {
        reagentsOutputListMapper.updateReagentsOutputList(rol);
        return rol;
    }

    @Override
    public void delete(char[] rlId)throws Exception
    {
        reagentsOutputListMapper.deleteReagentsOutputList(rlId);
    }
}
