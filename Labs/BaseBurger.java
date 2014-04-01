import java.lang.String;

public class BaseBurger implements Burger
{  
    private String Meat;
    private String Weight;
    private String BunOrBowl;    
    private String LettuceOrMix;
    
    public BaseBurger(){  //default constructor for test
        Meat="Beef";
        Weight="1/3lb";
        BunOrBowl="On A Bun";    
        LettuceOrMix="Lettuce Blend";
    }
    
    public BaseBurger (String meat, String weight, String bunOrBowl, String lettuceOrMix){
        Meat=meat;
        Weight=weight;
        BunOrBowl=bunOrBowl;
        LettuceOrMix=lettuceOrMix;
    }
    
    public double calPrice(){
        double price;
        String tempweight=this.Weight;
        switch (tempweight) {
            case "1/3lb" : price=OrderManager.PriceForOneThridLb; break;
            case "2/3lb" : price=OrderManager.PriceForTwoThridLb; break;
            case "1lb"   : price=OrderManager.PriceForOneLb; break;
            default : price=0; break;
        }
        
        if (BunOrBowl=="In A Bowl") price +=OrderManager.PriceForBowl;
        
        return price;
        
    }
   
    public String orderDescription(){
        String result = Meat + ", " + Weight + ", " + BunOrBowl;
        if (BunOrBowl=="In A Bowl") result += ", " + LettuceOrMix;
        return result;
    }
    
}
