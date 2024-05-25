package service;

import pojo.reagentsInputList;

public interface ReagentsInputListService
{

    // 创建试剂输入列表实体类对象
    reagentsInputList create(reagentsInputList ril);

    // 读取试剂输入列表实体类对象
    reagentsInputList read(char[] rlId);

    // 更新试剂输入列表实体类对象
    reagentsInputList update(reagentsInputList ril);

    // 删除试剂输入列表实体类对象
    void delete(char[] rlId);

    // 检查输入的试剂是否符合要求
    boolean checkInput(reagentsInputList ril);
}
