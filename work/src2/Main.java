public class Main {
    public static void main(String[]args){
        Resume a = new Resume("孙悟空");
        a.setPersonalInfo("猴", "未知");
        a.setWorkExperience("当大王", "花果山");
        a.setBility("无","无");

        Resume d = a.clone();
        d.setWorkExperience("放马", "天庭");
        d.setBility("七十二变，筋斗云","菩提老祖");

        Resume b =a.clone();
        b.setWorkExperience("保护唐僧", "取经");
        b.setBility("七十二变，筋斗云,火眼金睛","菩提老祖");

        Resume c = b.clone();
        c.setWorkExperience("诵经", "西天");
        c.setPersonalInfo("斗战胜佛","未知");

        a.display();
        d.display();
        b.display();
        c.display();
    }


}
