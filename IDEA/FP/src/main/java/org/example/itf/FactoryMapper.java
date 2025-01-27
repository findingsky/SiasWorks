package org.example.itf;

import org.example.pojo.Factory;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface FactoryMapper
{

    @Delete("delete from factory where fId = #{fId};")
    int deleteFactory(char[] fId);

    @Insert("insert into factory values (#{fID}, #{fName}, #{fTel}, #{fAddress});")
    int insertFactory(Factory factory);

    @Select("SELECT * FROM factory where fID = #{fID};")
    Factory selectFactory(char[] fId);

    @Select("select * from factory;")
    List<Factory> selectAllFactory();

    @Update("update factory set fID=#{fID}, fName=#{fName}, fTel=#{fTel}, fAddress=#{fAddress} where fID=#{fID};")
    int updateFactory(Factory factory);

    @Select("select rId,rDate,rFactory,rUser from reagents,factory where fId=reagents.rFactory and fId=#{fId};")
    List<Factory> selectReagentsByFactory(char[] fId);
}

