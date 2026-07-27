interface mother 
{
    void car();
}
interface father 
{
    void carr();
}
class Child implements mother, father
{
    public void car()
    {
            System.out.println("Mother has a car");
    }
    public void carr()
    {
            System.out.println("Father has a car");
    }
}
public class Multi
{
    public static void main(String[] args)
    {
        Child m = new Child();
        m.car();
        m.carr();
    }
}