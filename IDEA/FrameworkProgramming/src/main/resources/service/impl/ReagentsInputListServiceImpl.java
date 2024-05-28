package service.impl;

import mapper.ReagentsInputListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.reagentsInputList;

@Service
public class ReagentsInputListServiceImpl implements ReagentsInputListService
{

    @Autowired
    private ReagentsInputListMapper reagentsInputListMapper;

    @Override
    public reagentsInputList create(reagentsInputList ril)throws Exception
    {
        reagentsInputListMapper.insertReagentsInputList(ril);
        return ril;
    }

    @Override
    public reagentsInputList read(char[] rlId)throws Exception
    {
        return reagentsInputListMapper.selectReagentsInputList(rlId);
    }

    @Override
    public reagentsInputList update(reagentsInputList ril)throws Exception
    {
        reagentsInputListMapper.updateReagentsInputList(ril);
        return ril;
    }

    @Override
    public void delete(char[] rlId)throws Exception
    {
        reagentsInputListMapper.deleteReagentsInputList(rlId);
    }

    @Override
    public boolean checkInput(reagentsInputList ril)throws Exception
    {
        return ril.checkInput();
    }
}
