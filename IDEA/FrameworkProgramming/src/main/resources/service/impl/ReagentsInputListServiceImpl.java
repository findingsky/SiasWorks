package service.impl;

import mapper.ReagentsInputListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.ReagentsInputList;

@Service
public class ReagentsInputListServiceImpl implements ReagentsInputListService
{

    @Autowired
    private ReagentsInputListMapper reagentsInputListMapper;

    @Override
    public ReagentsInputList create(ReagentsInputList ril)throws Exception
    {
        reagentsInputListMapper.insertReagentsInputList(ril);
        return ril;
    }

    @Override
    public ReagentsInputList read(char[] rlId)throws Exception
    {
        return reagentsInputListMapper.selectReagentsInputList(rlId);
    }

    @Override
    public ReagentsInputList update(ReagentsInputList ril)throws Exception
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
    public boolean checkInput(ReagentsInputList ril)throws Exception
    {
        return ril.checkInput();
    }
}
