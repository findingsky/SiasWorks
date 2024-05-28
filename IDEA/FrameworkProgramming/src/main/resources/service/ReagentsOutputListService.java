package service;

import pojo.reagentsOutputList;

public interface ReagentsOutputListService
{

    // 创建试剂输出列表实体类对象
    reagentsOutputList create(reagentsOutputList rol)throws Exception;

    // 读取试剂输出列表实体类对象
    reagentsOutputList read(char[] rlId)throws Exception;

    // 更新试剂输出列表实体类对象
    reagentsOutputList update(reagentsOutputList rol)throws Exception;

    // 删除试剂输出列表实体类对象
    void delete(char[] rlId)throws Exception;
}
