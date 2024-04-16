package itf;

interface ReagentsOutputListMapper {
     ReagentsOutputList selectReagentsOutputList(String rlId);

     int insertReagentsOutputList(ReagentsOutputList reagentsOutputList);

     int updateReagentsOutputList(ReagentsOutputList reagentsOutputList);

     int deleteReagentsOutputList(String rlId);
}