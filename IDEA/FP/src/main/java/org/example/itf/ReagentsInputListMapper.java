package org.example.itf;

import org.apache.ibatis.annotations.*;
import org.example.pojo.ReagentsInputList;

@Mapper
public interface ReagentsInputListMapper
{

    @Delete("delete from reagentsinputlist where rlId=#{rlId};")
    int deleteReagentsInputList(char[] rlId);

    @Insert("insert into reagentsinputlist values (#{rlId}, #{rlDate}, #{rlFactory}, #{rLReg});")
    int insertReagentsInputList(ReagentsInputList reagentsInputList);

    @Select("SELECT * FROM reagentsinputlist where reagentsinputlist.rlId = #{rlId};")
    ReagentsInputList selectReagentsInputList(char[] rlId);

    @Update("""
            update reagentsinputlist
            <trim prefix="set" suffixOverrides=",">
                rlId=#{rlId},
                rlDate=#{rlDate},
                rlFactory=#{rlFactory},
                rLReg=#{rLReg},
            </trim>
            where rlId=#{rlId};""")
    int updateReagentsInputList(ReagentsInputList reagentsInputList);
}
