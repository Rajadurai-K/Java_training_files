interface RideBooking
{
    void bookRide();
} 
interface Payment
{
    void PayFare();
} 
class CabService implements RideBooking, Payment
{
    public void bookRide()
    {
        System.out.println("Your booking is booked");
    }
    public void PayFare()
    {
        System.out.println("payment is not completed !");
    }
}

public class cab {
 public static void main(String[] args)
 {
    CabService s = new CabService();
        s.bookRide();
        s.PayFare();
 }
}
