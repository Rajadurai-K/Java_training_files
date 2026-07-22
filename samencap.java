class Shop
{
    private double price;
    public void setshopping(double price)
    {
        if(price>0)
        {
            this.price = price;
        }else
        {
            System.out.println("Invalid price");
        }
    }
    public double getshopping()
    {
        return price ;
    }
}
class samencap
{
    public static void main(String[] args)
    {
        Shop p = new Shop();
        p.setshopping(200);
        System.out.println("Porduct price : "+p.getshopping());
    }
}