package org.example.service;

import org.example.pojo.Reagents;

import java.util.List;

public interface ReagentsService
{

    // 删除试剂
    int deleteReagents(char[] rId)throws Exception;

    // 更新试剂
    int updateReagents(Reagents r)throws Exception;

    // 查询试剂
    List<Reagents> selectReagents(char[] rId)throws Exception;

    // 插入试剂
    int insertReagents(Reagents r)throws Exception;

    // 查询所有试剂
    List<Reagents> selectAllReagent()throws Exception;

    // 根据工厂查询试剂
    Reagents selectReagentsFactory(char[] rId)throws Exception;
}
