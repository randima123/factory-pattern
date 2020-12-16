public class Main {

    public static void main(String[] args) {

        PizzaStore pizzaStore = new PizzaStore();

        String type = "cheese";
        Pizza pizza;

        switch (type){
            case "cheese":
                pizza = new NYCheesePizza();
                break;

            case "onion":
                pizza = new NYOnionPizza();
                break;

            default:
                System.out.println("default");

        }





    }
}
