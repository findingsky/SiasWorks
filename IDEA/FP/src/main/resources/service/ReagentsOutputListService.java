package service;

import pojo.ReagentsOutputList;

public interface ReagentsOutputListService
{

    // 创建试剂输出列表实体类对象
    ReagentsOutputList create(ReagentsOutputList rol)throws Exception;

    // 读取试剂输出列表实体类对象
    ReagentsOutputList read(char[] rlId)throws Exception;

    // 更新试剂输出列表实体类对象
    ReagentsOutputList update(ReagentsOutputList rol)throws Exception;

    // 删除试剂输出列表实体类对象
    void delete(char[] rlId)throws Exception;
}
