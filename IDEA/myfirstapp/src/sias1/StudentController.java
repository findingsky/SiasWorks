package sias1;

import bean.StudentBean;

public class StudentController
{
    private StudentBean model;
    private StudentView view;

    public StudentController(StudentBean model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void searchButtonClicked() {
        String name = view.getTextName().getText().trim();

        // 这里应该添加从数据库检索学生信息的逻辑
        // 然后更新Model的数据
        // model.setData(...);

        // 更新View以显示Model中的数据
        view.updateView(model);
    }
}
