import java.io.*;

class ConsoleEg
{
    public static void main(String args[])
    {
        String name;

        System.out.println("Enter your name:");

        Console c = System.console();

        name = c.readLine();

        System.out.println("Your name is: " + name);
    }
}