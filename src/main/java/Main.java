import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Dishes> dishes_list = new ArrayList<>();

        Dishes.Size sizeOfPlate = new Dishes.Size(20.5, 2);
        Dishes plate1 = new Plate("Plate1", Material.PORCELAIN, "China", sizeOfPlate);
        dishes_list.add(plate1);

        Dishes.Size sizeOfSoupPlate = new Dishes.Size(8, 5);
        Dishes soup_plate1 = new SoupPlate("SoupPlate1", Material.CERAMICS, "Ukraine", sizeOfSoupPlate, 2);
        dishes_list.add(soup_plate1);

        Handle handle1 = new Handle(Material.STEEL);
        Dishes.Size sizeOfCup1 = new Dishes.Size(5, 12);
        Dishes cup1 = new Cup("Cup1", Material.GLASS, "China", handle1, sizeOfCup1);
        dishes_list.add(cup1);

        Dishes.Size sizeOfCup2 = new Dishes.Size(7, 8);
        Dishes cup2 = new Cup("Cup2", Material.CERAMICS, "Ukraine", sizeOfCup2);
        dishes_list.add(cup2);

        Dishes.Size sizeOfShaker = new Dishes.Size(1.5, 5);
        SaltShaker saltshaker1 = new SaltShaker("SaltShaker1", Material.STEEL, "China", sizeOfShaker);
        dishes_list.add(saltshaker1);

        Service service1 = new Service();

        Iterator<Dishes> iterator = dishes_list.iterator();
        while(iterator.hasNext()){
            service1.addDishes(iterator.next());
        }
        System.out.println(service1);

        System.out.println(Material.getStringAll());

        System.out.println(service1.getDish("Plate1"));

//        System.out.println(saltshaker1.getSaltCount());
//        saltshaker1.addSaltInSH(5);
//        System.out.println(saltshaker1.getSaltCount());

//        handle1.printData();

//    Dishes cup4 = new Cup("Cup1", Material.GLASS, "China", handle1, sizeOfCup1);
//    System.out.println(cup1.equals(cup4));

//        Dishes.Size size1 = new Dishes.Size(0.7, 100);
//        Dishes.Size size2 = new Dishes.Size(200, 99);
//        Dishes.Size size3 = new Dishes.Size(0.5, 110);
//        System.out.println(size1);
//        System.out.println(size2);
//        System.out.println(size3);
    }
}
