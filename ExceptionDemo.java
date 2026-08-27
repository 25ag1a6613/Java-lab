class ExceptionDemo
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 0;
        int c;

        try
        {
            c = a / b;
            System.out.println("The value is: " + c);
        }
        catch (ArithmeticException e)
        {
            System.out.println("This is an Exception: Cannot divide by zero");
        }
    }
}
