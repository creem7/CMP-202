public class LandAnimal extends Animal {

    private String fur;

    public LandAnimal(String color, double height, String fur) {
        super(color,height);
        this.fur = fur;
    }
    public void furType(String fur) {
        System.out.println("The animal has a " + fur);
    }
    public String move() {
        return "Walks on legs";
    }
    public void habitat() {
        System.out.println("Animal lives on land");
    }
    @Override
    public void Speaks() {
        System.out.println("The LandAnimal speaks");
    }
}
