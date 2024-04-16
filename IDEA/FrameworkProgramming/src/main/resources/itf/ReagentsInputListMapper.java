package itf;

interface ReagentsInputListMapper
{
    int deleteReagentsInputList(String rlId);

    int insertReagentsInputList(ReagentsInputList reagentsInputList);

    int updateReagentsInputList(ReagentsInputList reagentsInputList);

    ReagentsInputList selectReagentsInputList(String rlId);
}