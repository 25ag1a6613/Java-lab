class Parents
{
    public void  Parents()
    {
        System.out.println("Two parents");
    }
}
interface Mother
{
    public void show();
}
interface Father
{
    public void show();
}
public class child extends Parents implements Mother, Father{
    public void show()
    {
        System.out.println("Mother and Father are parents");
    }
    public void displayChild()
    {
        System.out.println("Mother and Father have one child");
    }
    public static void main(String args[])
    {
        child obj = new child();
        System.out.println("Implementation of hybrid Inheritance of hybrid inheritance in java");
        obj.show();
        obj.displayChild();
    }
}