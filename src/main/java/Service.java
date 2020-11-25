import javax.lang.model.type.NullType;
import java.util.ArrayList;

public class Service {
    private ArrayList<Dishes> dishes = new ArrayList<>();

    public Service() {}

    public ArrayList<Dishes> getDishes() {
        return dishes;
    }

    public void setDishes(ArrayList<Dishes> dishes) {
        this.dishes = dishes;
    }

    public void addDishes(Dishes dish) {
        dishes.add(dish);
    }

    public Dishes getDish(String name){
        Dishes find = null;
        for(Dishes dish : this.dishes){
            if(dish.getName() == name){
                find = dish;
                break;
            }
        }
        return find;
    }

    @Override
    public String toString() {
        return "Service" + dishes;
    }
}
