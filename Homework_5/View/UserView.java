package OOP_Java.Homework_5.View;

import java.util.List;

import OOP_Java.Homework_5.Controler.UserController;
import OOP_Java.Homework_5.Model.StudentModel;
import OOP_Java.Homework_5.Model.TeacherModel;

public class UserView {
    UserController controllerUser = new UserController();

    public UserView() {
        this.controllerUser = controllerUser;
    }

    public void saveGroup(TeacherModel teacherId, List<StudentModel> studentId, String name){
        controllerUser.createSG(teacherId,studentId,name);
    }

    public void getGroup(String name){
        System.out.println(controllerUser.getByName(name));
    }

}
