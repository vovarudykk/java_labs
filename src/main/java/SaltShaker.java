public class SaltShaker extends Dishes{
    private final Salt salt = new Salt();

    public SaltShaker(String name, Material material, String producer, Size sizeOfShaker) {
        super(name, material, producer, sizeOfShaker);
    }

    public void addSaltInSH(double count) {
        salt.addSalt(count);
    }

    public double getSaltCount() {
        return this.salt.getCount();
    }

    private static class Salt {
        private double count;

        public Salt() {
            this.count = 0;
        }

        public void addSalt(double add) {
            this.count += add;
        }
        public void addSalt(int add) {
            this.count += add;
        }

        public double getCount() {
            return this.count;
        }
    }
}
