package itf;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ReagentsInputListMappers {

   @Delete("delete from reagentsinputlist where rlId=#{rlId};")
   int deleteReagentsInputList(int rlId);

   @Insert("insert into reagentsinputlist values (#{rlId}, #{rlDate}, #{rlFactory}, #{rLReg});")
   int insertReagentsInputList(ReagentsInputList reagentsInputList);

   @Select("SELECT * FROM reagentsinputlist where reagentsinputlist.rlId = #{rlId};")
   ReagentsInputList selectReagentsInputList(int rlId);

   @Update("update reagentsinputlist\n" +
           "<trim prefix=\"set\" suffixOverrides=\",\">\n" +
           "    rlId=#{rlId},\n" +
           "    rlDate=#{rlDate},\n" +
           "    rlFactory=#{rlFactory},\n" +
           "    rLReg=#{rLReg},\n" +
           "</trim>\n" +
           "where rlId=#{rlId};")
   int updateReagentsInputList(ReagentsInputList reagentsInputList);
}
