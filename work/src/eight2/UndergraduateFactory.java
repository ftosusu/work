package eight2;

public class UndergraduateFactory implements IFactory
{
    @Override
    public LeiFeng createLeiFeng()
    {
        return new Undergraduate();
    }
}
