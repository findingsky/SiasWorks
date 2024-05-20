package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.reagentsOutputList;
import service.ReagentsOutputListService;

import java.util.List;

@Service
public class ReagentsOutputListServiceImpl implements ReagentsOutputListService
{
    @Autowired
    private ReagentsOutputListDao reagentsOutputListDao;

    @Override
    public reagentsOutputList getReagentsOutputListById(char[] id)
    {
        return reagentsOutputListDao.getReagentsOutputListById(id);
    }

    @Override
    public void addReagentsOutputList(reagentsOutputList ro)
    {
        reagentsOutputListDao.addReagentsOutputList(ro);
    }

    @Override
    public void updateReagentsOutputList(reagentsOutputList ro)
    {
        reagentsOutputListDao.updateReagentsOutputList(ro);
    }

    @Override
    public void deleteReagentsOutputList(char[] id)
    {
        reagentsOutputListDao.deleteReagentsOutputList(id);
    }

    @Override
    public List<reagentsOutputList> getAllReagentsOutputLists()
    {
        return reagentsOutputListDao.getAllReagentsOutputLists();
    }
}
