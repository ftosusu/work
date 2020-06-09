package six3;

public class Person extends Main
{
    private String	name;

    public Person()
    {
    }

    public Person(String name)
    {
        this.name = name;
    }

    public void show()
    {
        System.out.println("装扮的" + name);
    }
}