import members.factory;

import java.util.List;
import pojo.reagents;
import pojo.reagents;


public interface ReagentsMapper
{
    public int deleteReagent(String rId);

    public int updateReagent(reagents reagent);

    public reagents selectReagent(String rId);

    public int insertReagent(reagents reagent);

    public List<reagents> selectAllReagents();

    public factory selectReagentsFactory(String rId);
}