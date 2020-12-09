import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PlatesArrayList {
    private List<Plate> plates = new ArrayList<>();

    PlatesArrayList() {
        plates.add(new Plate("Plate1", Material.PORCELAIN, "China", new Dishes.Size(20.5, 2)));
        plates.add(new Plate("Plate2", Material.CERAMICS, "Italy", new Dishes.Size(16, 1.8)));
        plates.add(new Plate("Plate3", Material.GLASS, "China", new Dishes.Size(22, 3)));
        plates.add(new Plate("Plate4", Material.STEEL, "Ukraine", new Dishes.Size(17.5, 1.8)));
        plates.add(new Plate("Plate5", Material.CERAMICS, "Ukraine", new Dishes.Size(18, 2)));
    }

    public double getMaxRadius() {
        DoubleSummaryStatistics collect = plates.stream()
                .filter(s -> s.getRadius() > 0)
                .collect(Collectors.summarizingDouble(Plate::getRadius));
        return collect.getMax();
    }

    public double getSumDeep() {
        DoubleSummaryStatistics collect = plates.stream()
                .filter(s -> s.getDeep() > 0)
                .collect(Collectors.summarizingDouble(Plate::getDeep));
        return collect.getSum();
    }

    public double getAverageRadius() {
        DoubleSummaryStatistics collect = plates.stream()
                .filter(s -> s.getRadius() > 0)
                .collect(Collectors.summarizingDouble(Plate::getRadius));
        return collect.getAverage();
    }


    public List<String> getAllPlatesOneProducer(Material material, Predicate<Plate> predicateInstance) {
        List<String> collect = plates.stream()
                .filter(s -> s.getMaterial().equals(material))
                .filter(predicateInstance)
                .map(Plate::getName)
                .distinct()
                .collect(Collectors.toList());
        return collect;
    }

    public double findPlateFromListOfLists(int index_input) {
        List<List<Plate>> listInListOfPlates = new ArrayList<>();
        listInListOfPlates.add(plates);

        List<Plate> plates2 = new ArrayList<>();
        plates2.add(new Plate("Plate2_1", Material.PORCELAIN, "China", new Dishes.Size(20.5, 2)));
        plates2.add(new Plate("Plate2_2", Material.CERAMICS, "Italy", new Dishes.Size(16, 1.8)));
        plates2.add(new Plate("Plate2_3", Material.CERAMICS, "China", new Dishes.Size(22, 3)));
        listInListOfPlates.add(plates2);

        int index = index_input > 0 ? index_input : 0;
        List<Double> collect = listInListOfPlates.get(index).stream()
                .map(Plate::getRadius)
                .distinct()
                .collect(Collectors.toList());

        double average = 0;
        for (Double radius : collect) {
            average += radius;
        }

        return average / collect.size();
    }
}
