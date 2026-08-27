import java.io.*;

class ReadingConsoleInputTest
{
    public static void main(String args[]) throws IOException
    {
        char ch;

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Enter characters, enter 'X' to exit:");

        do
        {
            ch = (char) br.read();
            System.out.println(ch);
        }
        while (ch != 'X');
    }
}