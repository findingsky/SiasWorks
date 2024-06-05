package itf;

import org.apache.ibatis.annotations.*;
import pojo.ReagentsOutputList;

import java.util.List;

@Mapper
public interface ReagentsOutputListMapper
{

    @Delete("delete from reagentsOutputlist where rlId = #{rlId};")
    int deleteReagentsOutputList(@Param("rlId") int rlId);

    @Insert("insert into reagentsinputlist values (#{rlId}, #{rlDate}, #{roUsage}, #{rLReg});")
    int insertReagentsOutputList(@Param("rlId") int rlId,
                                 @Param("rlDate") String rlDate,
                                 @Param("roUsage") String roUsage,
                                 @Param("rLReg") String rLReg);

    @Select("SELECT * FROM reagentsoutputlist where rlId = #{rlId};")
    List<ReagentsOutputList> selectReagentsOutputList(@Param("rlId") int rlId);

    @Update("update reagentsinputlist set rlId=#{rlId}, rlDate=#{rlDate}, rlFactory=#{roUsage}, rLReg=#{rLReg} where rlId=#{rlId};")
    int updateReagentsOutputList(@Param("rlId") int rlId,
                                 @Param("rlDate") String rlDate,
                                 @Param("roUsage") String roUsage,
                                 @Param("rLReg") String rLReg);
}
