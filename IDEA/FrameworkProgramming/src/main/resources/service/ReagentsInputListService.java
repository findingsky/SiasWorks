package service;

import pojo.reagentsInputList;

public interface ReagentsInputListService
{

    // 创建试剂输入列表实体类对象
    reagentsInputList create(reagentsInputList ril)throws Exception;

    // 读取试剂输入列表实体类对象
    reagentsInputList read(char[] rlId)throws Exception;

    // 更新试剂输入列表实体类对象
    reagentsInputList update(reagentsInputList ril)throws Exception;

    // 删除试剂输入列表实体类对象
    void delete(char[] rlId)throws Exception;

    // 检查输入的试剂是否符合要求
    boolean checkInput(reagentsInputList ril)throws Exception;
}
