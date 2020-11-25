public class DishesException extends Exception {
    private Dishes dishEx;

    public DishesException(String message, Dishes dishEx){
        super(message);
        this.dishEx = dishEx;
    }

    public Dishes getDishEx() {
        return dishEx;
    }

    public void setDishEx(Dishes dishEx) {
        this.dishEx = dishEx;
    }
}