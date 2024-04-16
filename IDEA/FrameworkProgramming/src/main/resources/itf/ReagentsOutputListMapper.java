package itf;

import pojo.ReagentsOutputList;


interface ReagentsOutputListMapper {
     reagentsOutputList selectReagentsOutputList(String rlId);

     int insertReagentsOutputList(reagentsOutputList reagentsOutputList);

     int updateReagentsOutputList(reagentsOutputList reagentsOutputList);

     int deleteReagentsOutputList(String rlId);
}