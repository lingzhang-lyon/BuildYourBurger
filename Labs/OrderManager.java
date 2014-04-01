
public class OrderManager{
   public static double PriceForOneThridLb=9.50; 
   public static double PriceForTwoThridLb=11.50; 
   public static double PriceForOneLb=15.50; 
   public static double PriceForBowl=1.00; 
   public static double PriceForExtraCheese=1.00; 
   public static double PriceForExtraTopping=0.75; 
   public static double PriceForPremiumTopping=1.50; 
   public static double PriceForExtraSauce=0.75; 
   
    
    
   public static void printOrderAndPrice(){
       Burger yourburger=new AddSauceBurger(new AddToppingBurger(new AddCheeseBurger(new BaseBurger())));
       double FinalPrice= yourburger.calPrice();
       String FinalDescription= yourburger.orderDescription();
       System.out.println( "\nBuild Your Own Burger---------");
       System.out.println( FinalDescription);
       System.out.println( "---------- $" + FinalPrice );
       
       
    }


}
