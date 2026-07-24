class Notification
{
    public void sendnotification()
    {
        System.out.println("Notifications sent !!");
    }
}
class EmailNotification extends Notification{
    @Override
    public void sendnotification()
    {
        System.out.println("Email Notifications has been sent!");
    }
}
class SMSNotification extends Notification{
    @Override
    public void sendnotification()
    {
        System.out.println("SMS Notifications has been sent!");
    }
}
class WhatsAppNotification extends Notification{
    @Override
    public void sendnotification()
    {
        System.out.println("WhatsApp Notifications has been sent!");
    }
}


class empnot 
{
    public static void main(String[] args)
    {
        Notification n = new Notification();
        Notification e = new EmailNotification();
        Notification s = new SMSNotification();
        Notification w = new WhatsAppNotification();
        n.sendnotification();
        e.sendnotification();
        s.sendnotification();
        w.sendnotification();

    }
}