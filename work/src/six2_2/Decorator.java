package six2_2;

public class Decorator implements Component
{
    protected Component	component;

    @Override
    public void operation()
    {
        if (null != component)
        {
            component.operation();
        }
    }

    public Component getComponent()
    {
        return component;
    }

    public void setComponent(Component component)
    {
        this.component = component;
    }
}