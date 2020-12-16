public class NewYorkPizzaStore extends PizzaStore {


    @Override
    public Pizza createPizza(String type) {

        if(type.equals("cheese")){
            return new NYCheesePizza();
        }else if(type.equals("onion")){
            return new NYOnionPizza();
        }else{
            return null;
        }
    }
}
