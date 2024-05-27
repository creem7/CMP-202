public class Monkey extends LandAnimal{
    public Monkey(String color, double height, String fur) {
        super(color,height,fur);
    }
    public String getFur() {
        return "Brownish short thick fur";
    }
    @Override
    public String move() {
        return "Swings on trees";
    }

    @Override
    public void habitat() {
        System.out.println("Monkey lives in caves");
    }

    @Override
    public void Speaks() {
        System.out.println("Hoo Hoo Ha Ha");
    }
}
