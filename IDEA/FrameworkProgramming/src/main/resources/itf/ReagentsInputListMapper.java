package itf;

import pojo.ReagentsInputList;


interface ReagentsInputListMapper
{
    int deleteReagentsInputList(String rlId);

    int insertReagentsInputList(reagentsInputList reagentsInputList);

    int updateReagentsInputList(reagentsInputList reagentsInputList);

    reagentsInputList selectReagentsInputList(String rlId);
}