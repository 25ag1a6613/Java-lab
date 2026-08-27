import java.io.*;

class MyInput
{
    public static void main(String args[]) throws IOException
    {
        String text;

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter some text:");

        text = br.readLine();

        System.out.println(text);
    }
}