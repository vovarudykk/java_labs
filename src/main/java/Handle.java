public class Handle implements Printable{
    private Material material;

    public Handle(Material material) {
        this.material = material;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override
    public void printData() {
        System.out.println("Handle material is " + material);
    }
}
