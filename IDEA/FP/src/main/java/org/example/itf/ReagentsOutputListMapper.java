package org.example.itf;

import org.apache.ibatis.annotations.*;
import org.example.pojo.ReagentsOutputList;

@Mapper
public interface ReagentsOutputListMapper
{

    @Delete("delete from reagentsOutputlist where rlId = #{rlId};")
    int deleteReagentsOutputList(@Param("rlId") char[] rlId);

    @Insert("insert into reagentsinputlist values (#{rlId}, #{rlDate}, #{roUsage}, #{rLReg});")
    int insertReagentsOutputList(@Param("rlId") char[] rlId,
                                 @Param("rlDate") String rlDate,
                                 @Param("roUsage") String roUsage,
                                 @Param("rLReg") String rLReg);

    @Select("SELECT * FROM reagentsoutputlist where rlId = #{rlId};")
    ReagentsOutputList selectReagentsOutputList(@Param("rlId") char[] rlId);

    @Update("update reagentsOutputlist set rlId=#{rlId}, rlDate=#{rlDate}, roUsage=#{roUsage}, rLReg=#{rLReg} where rlId=#{rlId};")
    int updateReagentsOutputList(@Param("rlId") char[] rlId,
                                 @Param("rlDate") String rlDate,
                                 @Param("roUsage") String roUsage,
                                 @Param("rLReg") String rLReg);

    @Select("SELECT * FROM reagentsoutputlist;")
    void insertReagentsOutputList(ReagentsOutputList rol);

    @Select("SELECT * FROM reagentsoutputlist where rlId = #{rlId};")
    void updateReagentsOutputList(ReagentsOutputList rol);
}
