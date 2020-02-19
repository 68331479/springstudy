package src.main.java.com.kuang.demo02;

public class UserServiceProxy implements UserService {

    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void add() {
        printlog("add");
        userService.add();
    }

    public void delete() {
        printlog("delete");
        userService.delete();
    }

    public void update() {
        printlog("update");
        userService.update();
    }

    public void query() {
        printlog("query");
        userService.query();
    }

    public void printlog(String msg){
        System.out.println("调用了"+msg+"方法");
    }
}
