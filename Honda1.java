class Bike
{
    void run()
    {
        System.out.println("Running safely with 100kmph");
    }
}

class Honda1 extends Bike
{
    void run1()
    {
        System.out.println("Running safely with 100kmph");
    }

    public static void main(String[] args)
    {
        Honda1 honda = new Honda1();

        honda.run();
        honda.run1();
    }
}