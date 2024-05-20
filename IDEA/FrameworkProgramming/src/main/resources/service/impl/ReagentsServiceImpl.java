package service.impl;

import pojo.reagents;
import service.ReagentsService;

public class ReagentsServiceImpl implements ReagentsService {

    @Override
    public reagents create(reagents r) {
        // 在这里实现创建试剂实体类对象的逻辑
        return r;
    }

    @Override
    public reagents read(char[] rid) {
        // 在这里实现根据试剂ID读取试剂实体类对象的逻辑
        reagents r = new reagents();
        r.setRid(rid);
        return r;
    }

    @Override
    public reagents update(reagents r) {
        // 在这里实现更新试剂实体类对象的逻辑
        return r;
    }

    @Override
    public void delete(char[] rid) {
        // 在这里实现根据试剂ID删除试剂实体类对象的逻辑
    }
}
