public class Boat extends Vehicle{

    public Boat (String brand, int kilometers){
        super(brand, kilometers);
    }

    public String doStuff(){
        return "je suis " + this.getBrand() + " et je fais glou glou !";
    }
}
