package duty_chain;

/**
 * author yg
 * description
 * date 2019/1/25
 */
class ProjectManager extends Handler {
    public ProjectManager(int day) {
        super(day);
    }
    @Override
    protected void reply(int day) {
        System.err.println(day + "天请假，项目经理直接审批通过");
    }
}
