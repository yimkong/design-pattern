package duty_chain;

/**
 * author yg
 * description
 * date 2019/1/25
 */
class DepartmentManager extends Handler {
    public DepartmentManager(int day) {
        super(day);
    }
    @Override
    protected void reply(int day) {
        System.err.println(day + "天请假，部门经理审批通过");
    }
}
