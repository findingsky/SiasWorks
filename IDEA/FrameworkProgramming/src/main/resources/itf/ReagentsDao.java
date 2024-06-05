package itf;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import pojo.*;

import java.util.List;

@Mapper
public interface ReagentsDao
{

    @Delete("delete from reagents where rId = #{rId}")
    int deleteReagents(@Param("rId") char[] rId);

    @Update("update reagents set rDate=#{rDate}, rFactory=#{rFactory}, rUser=#{rUser} where fID=#{fID}")
    int updateReagents(@Param("rId") char[] rId, @Param("rDate") String rDate, @Param("rFactory") String rFactory, @Param("rUser") String rUser);

    @Select("SELECT * FROM reagents where rId=#{rId}")
    List<Reagents> selectReagents(@Param("rId") char[] rId);

    @Insert("insert into reagents values (#{rId}, #{rDate}, #{rFactory}, #{rUser})")
    int insertReagents(@Param("rId") char[] rId, @Param("rDate") String rDate, @Param("rFactory") String rFactory, @Param("rUser") String rUser);

    @Select("SELECT * FROM reagents")
    List<Reagents> selectAllReagent();

    @Select("SELECT fID,fName,fAddress,fTel FROM factory,reagents where rId=#{rId} and factory.fID=reagents.rFactory")
    List<Factory> selectReagentsFactory(@Param("rId") char[] rId);
}
