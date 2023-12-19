public class Main
{
    public static void main(String[] args)
    {
        Car car1 = new Car("Challenger", "Dodge", 2023, 450000, "purple", 4);

        System.out.println(car1.toString());
        System.out.println(car1.getColor());
        car1.sell(1);
        car1.delivery(2);
        int year = car1.getYear();
        car1.setColor("red");
        System.out.println(car1.toString());
    }
}