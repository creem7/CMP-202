public class Aquatic extends Animal {
    private String scales;
    public Aquatic(String color,double height,String scales) {
        super(color,height);
        this.scales = scales;
    }
    public void scaleType(String scales) {
        System.out.println("The animal has a " + scales);
    }
    public String move() {
        return "Moves in water";
    }
    public void habitat() {
        System.out.println("Animal Lives in water");
    }
    @Override
    public void Speaks() {
        System.out.println("Aquatic animal speaks");
    }

}
