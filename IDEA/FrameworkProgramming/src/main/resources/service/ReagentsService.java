package service;

import pojo.reagents;

public interface ReagentsService
{

    // 删除试剂
    int deleteReagents(char[] rId)throws Exception;

    // 更新试剂
    int updateReagents(reagents r)throws Exception;

    // 查询试剂
    reagents selectReagents(char[] rId)throws Exception;

    // 插入试剂
    int insertReagents(reagents r)throws Exception;

    // 查询所有试剂
    List<reagents> selectAllReagent()throws Exception;

    // 根据工厂查询试剂
    reagents selectReagentsFactory(char[] rId)throws Exception;
}
