package duty_chain;

/**
 * author yg
 * description 职责链模式
 * date 2019/1/25
 */
public class Main {
    public static void main(String[] args) {
        Handler projectManager = new ProjectManager(3);
        Handler departmentManager = new DepartmentManager(5);
        Handler generalManager = new GeneralManager(15);
        //创建职责链
        projectManager.setNextHandler(departmentManager);
        departmentManager.setNextHandler(generalManager);
        //发起一次请求
        projectManager.handleRequest(4);
        projectManager.handleRequest(9);
        projectManager.handleRequest(1);
    }

}
