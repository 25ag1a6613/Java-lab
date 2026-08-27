class car {
    car(){
    System.out.println("Inside car constructor");
 }
}
class Bus extends car{
    Bus()
    {
        super();
        System.out.println("Inside Bus constructor");
    }
}
    class supcons
    {
        public static void main(String[] args )
        {
            Bus b = new Bus();
        }
    }
