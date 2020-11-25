public class Cup extends Dishes{

    private final boolean hasHandle;
    private Material materialHandle;

    public Cup(String name, Material material, String producer, Handle handle, Size sizeOfCup) {
        super(name, material, producer, sizeOfCup);
        this.hasHandle = checkHandle(handle);
    }
    public Cup(String name, Material material, String producer, Size sizeOfCup) {
        super(name, material, producer, sizeOfCup);
        this.hasHandle = false;
    }

    public boolean checkHandle(Handle handle) {
        this.materialHandle = handle.getMaterial();
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        var objTemp = (Cup) obj;
        return objTemp.getName().equals(this.getName()) && objTemp.getMaterial() == this.getMaterial() &&
                objTemp.getProducer().equals(this.getProducer()) && objTemp.getSize() == this.getSize();
    }

    public boolean isHasHandle() {
        return hasHandle;
    }
}
