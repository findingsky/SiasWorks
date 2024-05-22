package service;
import pojo.Reagents;
import pojo.Factory;
import itf.ReagentsDao;

import java.util.List;

public interface ReagentsService {

    int deleteReagents(char[] rId);

    int updateReagents(Reagents reagents);

    List<Reagents> selectReagents(char[] rId);

    int insertReagents(Reagents reagents);

    List<Factory> selectReagentsFactory(char[] rId);

    List<Reagents> selectAllReagents();
}
