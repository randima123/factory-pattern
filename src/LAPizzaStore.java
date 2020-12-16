public class LAPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {

        if(type.equals("cheese")){
            return new LACheesePizza();
        }else if(type.equals("onion")){
            return new LAOnionPizza();
        }else{
            return null;
        }
    }
}
