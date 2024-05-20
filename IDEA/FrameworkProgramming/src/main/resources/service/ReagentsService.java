package service;

import pojo.reagents;

public interface ReagentsService {

    // 创建试剂实体类对象
    reagents create(reagents r);

    // 读取试剂实体类对象
    reagents read(char[] rid);

    // 更新试剂实体类对象
    reagents update(reagents r);

    // 删除试剂实体类对象
    void delete(char[] rid);
}
