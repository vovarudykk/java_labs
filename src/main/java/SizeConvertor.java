public class SizeConvertor {
    public String smToMm(double radius, double deep) {
        String str = "radius =";
        double[] size = new double[2];
        size[0] = radius;
        size[1] = deep;
        double flag = 0;
        for(int i = 0; i < size.length; i++) {
            if (size[i] < 1) {
                str += (" " + size[i] * 10 + "мм");
            } else if (size[i] > 99) {
                str += (" " +size[i] / 100 + "м");
            } else {
                str += (" " +size[i] + "см");
            }
            if(flag == 0) {
                str += "; deep =";
                flag++;
            }
        }
        return str;
    }
}
