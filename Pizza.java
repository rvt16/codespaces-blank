public class Pizza {
    private String name;
    private String toppings;
    private double cost;
    public Pizza(String n, String t, double c){
       name=n;
       toppings=t;
       cost=c;
    }
    public void pizzaDescription(){
        int random;
        random = (int)(Math.random()*4);
        if(random==0){
            System.out.println("This " + name + " pizza is topped with " + toppings + ", creating a vibrant and delicious combination. Priced at $" + cost + ", it’s the perfect choice for a light, casual dinner or a family gathering.");
        }
        if(random==1){
            System.out.println("This " + name + " pizza is topped with " + toppings + ", creating a simple and delicious flavor. Priced at $" + cost + ", it’s the perfect choice for enjoying pizza at places like a local pizzeria or at home.");
        }
        if(random==2){
            System.out.println("This " + name + " pizza is topped with " + toppings + ", delivering a savory and satisfying combination. Priced at $" + cost + ", it’s the perfect choice for enjoying pizza at places like a casual diner or during a movie night.");
        }
        if(random==3){
            System.out.println("This " + name + " pizza is topped with " + toppings + ", offering a unique and flavorful twist. Priced at $" + cost + ", it’s the perfect choice for enjoying pizza at places like a weekend barbecue or a family gathering.");
        }

        
    }
}

