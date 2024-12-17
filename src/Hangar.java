public class Hangar {
    public static void main (String... args){

        Car car1 = new Car("peugeot 208", 120);
        Car car2 = new Car("peugeot 308", 130);

        Boat boat1 = new Boat("ferry", 40);
        Boat boat2 = new Boat ("zodiac", 70);

        System.out.println(car1.doStuff());
        System.out.println(car2.doStuff());
        System.out.println(boat1.doStuff());
        System.out.println(boat2.doStuff());
    }
}
