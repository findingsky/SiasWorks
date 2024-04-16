import members.factory;

import java.util.List;

public interface ReagentsDao
{
    public int deleteReagent(String rId);

    public int updateReagent(Reagents reagent);

    public Reagents selectReagent(String rId);

    public int insertReagent(Reagents reagent);

    public List<Reagents> selectAllReagents();

    public factory selectReagentsFactory(String rId);
}