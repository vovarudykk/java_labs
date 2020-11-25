public class SoupPlate extends Dishes{

    private double side_width;

    public SoupPlate(String name, Material material, String producer, Size sizeOfSoupPlate, double side_width) {
        super(name, material, producer, sizeOfSoupPlate);
        this.side_width = side_width;
    }

    public double getSide_width() {return side_width;}

    public void setSide_width(double side_width) {this.side_width = side_width; }
}
