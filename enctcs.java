class emp
{
    private int empid;
    private String name;
    private int salary;
    public void setde(int empid,String name,int salary)
    {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
    }
    public int getid()
    {
        return empid;
    }
    public String getna()
    {
        return name;
    }
    public int getde()
    {
        return salary;
    }
}
class enctcs
{
    public static void main(String[] args)
    {
        emp e = new emp();
        e.setde(23,"java",23000);
        System.out.println(e.getid());
        System.out.println(e.getna());
        System.out.println(e.getde());
    }
}