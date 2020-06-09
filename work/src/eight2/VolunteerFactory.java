package eight2;

public class VolunteerFactory implements IFactory
{
    @Override
    public LeiFeng createLeiFeng()
    {
        return new Volunteer();
    }
}
