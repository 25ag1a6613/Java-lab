class Bike
{
    final void run()
    {
        System.out.println("Running");
    }
}
class Honda extends Bike
{
    void display()
    {
        System.out.println("Running safely with 100kmph");
    }

    public static void main(String[] args)
    {
        Honda honda = new Honda();

        honda.run();
        honda.display();
    }
}  