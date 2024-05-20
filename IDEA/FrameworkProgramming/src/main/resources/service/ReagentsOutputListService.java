package service;

import pojo.reagentsOutputList;

public interface ReagentsOutputListService
{
    reagentsOutputList getReagentsOutputListById(char[] id);
    void addReagentsOutputList(reagentsOutputList ro);
    void updateReagentsOutputList(reagentsOutputList ro);
    void deleteReagentsOutputList(char[] id);
    java.util.List<reagentsOutputList> getAllReagentsOutputLists();
}
