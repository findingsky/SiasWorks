package org.example.service;

import org.example.pojo.ReagentsInputList;

public interface ReagentsInputListService
{

    // 创建试剂输入列表实体类对象
    ReagentsInputList create(ReagentsInputList ril)throws Exception;

    // 读取试剂输入列表实体类对象
    ReagentsInputList read(char[] rlId)throws Exception;

    // 更新试剂输入列表实体类对象
    ReagentsInputList update(ReagentsInputList ril)throws Exception;

    // 删除试剂输入列表实体类对象
    void delete(char[] rlId)throws Exception;

    // 检查输入的试剂是否符合要求
    boolean checkInput(ReagentsInputList ril)throws Exception;
}
