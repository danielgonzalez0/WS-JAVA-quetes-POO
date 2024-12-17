public class Classroom {
    public static void main (String... args){

        Wilder wilder1 = new Wilder("Pierre", true);
        Wilder wilder2 = new Wilder("Paul", false);
        Wilder wilder3 = new Wilder("Jack", true);

        System.out.println(wilder1.whoAmI());
        System.out.println(wilder2.whoAmI());
        System.out.println(wilder3.whoAmI());

    }
}
