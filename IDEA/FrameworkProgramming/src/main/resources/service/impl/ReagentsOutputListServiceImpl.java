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
    public reagentsOutputList create(reagentsOutputList rol)
    {
        reagentsOutputListMapper.insertReagentsOutputList(rol);
        return rol;
    }

    @Override
    public reagentsOutputList read(char[] rlId)
    {
        return reagentsOutputListMapper.selectReagentsOutputList(rlId);
    }

    @Override
    public reagentsOutputList update(reagentsOutputList rol)
    {
        reagentsOutputListMapper.updateReagentsOutputList(rol);
        return rol;
    }

    @Override
    public void delete(char[] rlId)
    {
        reagentsOutputListMapper.deleteReagentsOutputList(rlId);
    }
}
