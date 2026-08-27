class Bike1
{
    int speedlimit = 90;

    void run()
    {
        speedlimit = 400;
        System.out.println("Speed limit: " + speedlimit);
    }

    public static void main(String args[])
    {
        Bike1 obj = new Bike1();
        obj.run();
    }
}