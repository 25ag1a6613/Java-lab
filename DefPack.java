import java.util.Random;

public class DefPack
{
    public static void main(String args[])
    {
        Random rand = new Random();

        int val;

        val = rand.nextInt(100);

        System.out.println("Random val: " + val);
    }
}