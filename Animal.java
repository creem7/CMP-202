public class Animal {
    protected String color;
    protected double height;
    public Animal(String color, double height) {
        this.color = color;
        this.height = height;
    }
    public void Speaks() {
        System.out.println("The Animal speaks");
    }
}
