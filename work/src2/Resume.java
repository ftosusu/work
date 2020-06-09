public class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;
    private String duty;
    private String company;
    private String ball;
    private String teacher;

    public Resume(String name) {
        this.name = name;
    }

    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String duty, String company) {
        this.company = company;
        this.duty = duty;
    }

    public void setBility(String ball,String teacher) {
        this.ball = ball;
        this.teacher =teacher;


    }

    public void display() {
        System.out.println(name + "     " + sex + "     " + age);
        System.out.println("工作单位：" + company + "   " + "职责: "+ duty);
        System.out.println("本领：" + ball+"   "+ "老师： "+ teacher);
    }

    @Override
    public Resume clone() {
        try {
            return (Resume) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
