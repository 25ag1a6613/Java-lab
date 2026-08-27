class Student
{
    String name = "Anu";
}
class Teacher extends Student{
    String name = "Bhanu";
    void display()
    {
        System.out.println("Teacher Name:" + name);
        System.out.println("Student Name:" +super.name);
    }
}
class sup3
{
    public static void main(String args[])
    {
        Teacher t = new Teacher();
        t.display();
    }
}