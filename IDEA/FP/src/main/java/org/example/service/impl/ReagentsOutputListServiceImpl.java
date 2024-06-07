package org.example.service.impl;

import org.example.itf.ReagentsOutputListMapper;
import org.example.service.ReagentsOutputListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.pojo.ReagentsOutputList;

@Service
public class ReagentsOutputListServiceImpl implements ReagentsOutputListService
{

    @Autowired
    private ReagentsOutputListMapper reagentsOutputListMapper;

    @Override
    public ReagentsOutputList create(ReagentsOutputList rol)throws Exception
    {
        reagentsOutputListMapper.insertReagentsOutputList(rol);
        return rol;
    }

    @Override
    public ReagentsOutputList read(char[] rlId)throws Exception
    {
        return reagentsOutputListMapper.selectReagentsOutputList(rlId);
    }

    @Override
    public ReagentsOutputList update(ReagentsOutputList rol)throws Exception
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
