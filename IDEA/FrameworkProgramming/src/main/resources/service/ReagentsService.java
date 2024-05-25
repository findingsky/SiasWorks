package service;

import pojo.reagents;

public interface ReagentsService
{

    // 删除试剂
    int deleteReagents(char[] rId);

    // 更新试剂
    int updateReagents(reagents r);

    // 查询试剂
    reagents selectReagents(char[] rId);

    // 插入试剂
    int insertReagents(reagents r);

    // 查询所有试剂
    List<reagents> selectAllReagent();

    // 根据工厂查询试剂
    reagents selectReagentsFactory(char[] rId);
}
