public class Wilder {
    //attributs
    private String firstname;
    private boolean aware;

    //constructors
    public Wilder() {
    }

    public Wilder(String firstname) {
        this.firstname = firstname;
    }

    public Wilder(boolean aware) {
        this.aware = aware;
    }

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }
    //getters and setters

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public boolean isAware() {
        return aware;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }
    // static method

    //instance method
    public String whoAmI () {
      if(this.isAware()) return "Je m'appelle " + this.getFirstname() + " et je suis aware.";
      return "Je m'appelle " + this.getFirstname() + " et je ne suis pas aware.";
    };
}
