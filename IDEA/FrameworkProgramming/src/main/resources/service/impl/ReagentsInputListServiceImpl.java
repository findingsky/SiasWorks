package service.impl;

import pojo.reagentsInputList;
import service.ReagentsInputListService;

public class ReagentsInputListServiceImpl implements ReagentsInputListService {

    @Override
    public reagentsInputList create(reagentsInputList ril) {
        // 在这里实现创建试剂输入列表实体类对象的逻辑
        return ril;
    }

    @Override
    public reagentsInputList read(char[] riId) {
        // 在这里实现根据试剂ID读取试剂输入列表实体类对象的逻辑
        reagentsInputList ril = new reagentsInputList();
        ril.setRiId(riId);
        return ril;
    }

    @Override
    public reagentsInputList update(reagentsInputList ril) {
        // 在这里实现更新试剂输入列表实体类对象的逻辑
        return ril;
    }

    @Override
    public void delete(char[] riId) {
        // 在这里实现根据试剂ID删除试剂输入列表实体类对象的逻辑
    }

    @Override
    public boolean checkInput(reagentsInputList ril) {
        // 在这里实现检查输入的试剂是否符合要求的逻辑
        return ril.checkInput();
    }
}
