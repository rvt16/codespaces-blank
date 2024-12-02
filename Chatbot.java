  import java.util.Scanner;

  public class Chatbot {
  
      public static void main(String[] args) {
          
          boolean bye = false;
          int random;
          
  
          random=(int)(Math.random()*2);
          if(random==0){
              System.out.println("Greetings! I am your Pizza Palace informational bot. Would you like to know about the menu or the times that it is open? If you want to stop, type bye");
          }
  
          if(random==1){
              System.out.println("Hello! Welcome to the Pizza Palace information center. I am your personal chatbot with information  on what you would like to know about our restaurant menu and opening times. What would you like to know? Type bye to stop");
          }
  
          Pizza margherita = new Pizza("Margherita", "tomato sauce, fresh mozzarella, basil, and olive oil", 12.75);
          Pizza pepperoni = new Pizza("Pepperoni", "pepperoni slices and mozzarella cheese", 11.00);
          Pizza hawaiian = new Pizza("Hawaiian", "ham, pineapple, and mozzarella cheese", 13.25);
          Pizza vegetarian = new Pizza("Vegetarian","vegetables like bell peppers, onions, mushrooms, olives, and spinach", 14.75 );
          Pizza mushroom = new Pizza("Mushroom", "mushrooms and mozzarella, often with garlic",11.50);
          Pizza bbqChicken = new Pizza("BBQ Chicken","grilled chicken, barbecue sauce, red onions, cilantro", 10.75);
          Pizza meatLovers= new Pizza("Meat Lover's", "sausage, bacon, ham, ground beef", 15.25);
          Pizza fourCheese= new Pizza("Four Cheese", "cheddar, parmesan, gorgonzola", 12.95);
          Pizza buffaloChicken= new Pizza("Buffalo Chicken", "grilled chicken, blue cheese, ranch dressing", 16.25);
          Pizza capricciosa = new Pizza("Capricciosa","ham, artichokes, olives, mushrooms, mozzarella cheese", 18.15);
          Scanner in = new Scanner (System.in);
  
  
  
          while(bye==false){
  
  
              String userResp = in.nextLine();
  
              String[] keywords = {"hi",
              
              "hello", "hey", "good morning", "good afternoon", "good evening", "howdy", "hola", "bonjour", "ciao", "greetings", "salutations", "namaste", "aloha","margherita", "pepperoni", "hawaiian", "vegetarian", "mushroom", "bbq chicken", "meat lover's", "meat lovers", "four cheese", "buffalo chicken", "capricciosa","menu", "option", "select", "choice","possibilit", "item", "list", "food", "card", "dish", "offer", "variet", "plate", "spread", "catalog", "bill","bye","pizza","no", "nope", "nah", "negative", "not at all", "never", "no way", "not really","opening time", "open", "hour", "time", "schedule", "operating hour", "business hour", "when open", "working hour", "availab", "operating time", "open now", "clos", "open today", "open hour", "time", "have"};
  
              boolean containsKeyword = false;
  
              for (String keyword : keywords) {
                  if (userResp.toLowerCase().contains(keyword)) {
                      containsKeyword = true;
                      break;
                  }
              }
  
              if(!containsKeyword){
                if (userResp.trim().isEmpty()) {
                    switch((int)(Math.random()*3)){
                      case 0 -> System.out.println("It seems you didn't type anything. Please try again!");
                      case 1 -> System.out.println("Please enter a response");
                      case 2 -> System.out.println("I am sorry, I cannot help unless you tell me what you want");
                    }
                    continue;
                }
                else{
                  switch ((int) (Math.random() * 5)) {
                      case 0 -> System.out.println("Sorry, I didn’t quite catch that. Could you please rephrase or clarify?");
                      case 1 -> System.out.println("Hmm, I’m not sure I understand. Could you provide more details or ask in a different way?");
                      case 2 -> System.out.println("Oops! I’m having trouble processing that. Can you try again with different wording?");
                      case 3 -> System.out.println("I’m not certain what you mean. Could you write it out a bit differently?");
                      case 4 -> System.out.println("I didn’t quite get that. Could you please clarify your request?");
                  }
                }
              }
  
  
              
  
              if(userResp.toLowerCase().contains("bye")){
                  int goodbye=(int)(Math.random()*3);
                  if(goodbye==0){
                    System.out.println("Have a good day!");
                  }
                  else if(goodbye==1){
                    System.out.println("Thank you so much for your cooperation. I hope to help you another time.");
                  }
                  else if(goodbye==2){
                    System.out.println("I hope this experience has been helpful for you. Make sure to stop by Pizza Palace!");
                  }
                  bye = true;
              }
  String[] pizzas = {"menu", "option", "select", "choice","possibilit", "item", "list", "food", "card", "dish", "offer", "variet", "plate", "spread", "catalog", "bill", "have"};
              for(String menu:pizzas){
                  if(userResp.toLowerCase().contains(menu)){
  
                  System.out.println("Sure! Here is our menu.");
                  System.out.println("Margherita");
                  System.out.println("Pepperoni");
                  System.out.println("Hawaiian");
                  System.out.println("Vegetarian");
                  System.out.println("Mushroom");
                  System.out.println("BBQ Chicken");
                  System.out.println("Meat Lover's");
                  System.out.println("Four Cheese");
                  System.out.println("Buffalo Chicken");
                  System.out.println("Capricciosa");
  
                  System.out.println("If you want to learn more about any of these pizzas, just ask!");
  
                  }
  
              }
  
  
  
              
  
  
  
              
  
              String[] greetings = {"hello","hi", "hey", "good morning", "good afternoon", "good evening", "howdy", "hola", "bonjour", "ciao", "greetings", "salutations", "namaste", "aloha"};
  
                  for(String greeting:greetings){
                      if(userResp.toLowerCase().contains(greeting)){
                          switch((int)(Math.random()*3)){
  
                            case 0 -> System.out.println("Good morning! I hope you are doing well. Do you want to learn about what pizzas are on the menu or do you want to know about the available times?");
                            case 1 -> System.out.println("Hello! How’s everything? Do you want to learn about the timings or the delightful pizza options you can choose from?");
                            case 2 -> System.out.println("Hey! Today is such a wonderful day to have a customer like you. Do you want to learn what’s on the pizza menu today, or do you want to know when you can stop by?");
  
                      }    
                  }
              }
          
              if (userResp.toLowerCase().contains("margherita")) {
                  margherita.pizzaDescription();
              }
              if (userResp.toLowerCase().contains("pepperoni")) {
                  pepperoni.pizzaDescription();
              }
              if (userResp.toLowerCase().contains("hawaiian")) {
                  hawaiian.pizzaDescription();
              }
              if (userResp.toLowerCase().contains("vegetarian")) {
                  vegetarian.pizzaDescription();
              }
              if (userResp.toLowerCase().contains("mushroom")) {
                  mushroom.pizzaDescription();
              }
              if (userResp.toLowerCase().contains("bbq chicken")) {
                  bbqChicken.pizzaDescription();
              }
              if (userResp.toLowerCase().contains("meat lover's")||userResp.toLowerCase().contains("meat lovers")) {
                  meatLovers.pizzaDescription();
              }
              if (userResp.toLowerCase().contains("four cheese")) {
                  fourCheese.pizzaDescription();
              }
              if (userResp.toLowerCase().contains("buffalo chicken")) {
                  buffaloChicken.pizzaDescription();
              }
              if (userResp.toLowerCase().contains("capricciosa")) {
                  capricciosa.pizzaDescription();
              }
              String[] hour = {"opening time", "open", "hour", "time", "schedule", "operating hour", "business hour", "when open", "working hour", "availab", "operating time", "open now", "clos", "open today", "open hour", "time"};
              for (String keyword : hour) {
                if (userResp.toLowerCase().contains(keyword)) {
                    switch((int)(Math.random()*2)){
                        case 0 ->System.out.println("Our restaurant is open daily from 10:00 AM to 10:00 PM.");
                        case 1->System.out.println("You can always stop by from 10:00 AM to 10:00 PM.");
                    }
                    break;
                }
              }
  
  
  
              String[] noWords = {"no", "nope", "nah", "negative", "not at all", "never", "no way", "not really"};
  
              for(String no:noWords){
                  if(userResp.toLowerCase().contains(no)){
  
                      switch((int)(Math.random()*2)){
                      case 0 -> System.out.println("Okay! You can always type 'bye' to exit the informational bot");
                      case 1 -> System.out.println("Thank you for your feedback. If there is nothing else you would like to ask, you can always type 'bye' to exit the chatbot");
                  
                      }
                  }
              }
  
  
  
              
  
  
              
          }
  
  
  
          
  
          
  
  
      }
  
  
      
  }
  