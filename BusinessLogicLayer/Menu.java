package BusinessLogicLayer;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String foodItem;
    private String foodName;
    private String foodType;
    private String foodDescription;
    private Double foodCost;
    private int numberOfAdults;
    private int numberOfKids;

    public Menu(){}

    public Menu(String _foodItem, String _foodName, String _foodType, String _foodDescription) {
        this.foodItem = _foodItem;
        this.foodName = _foodName;
        this.foodType = _foodType;
        this.foodDescription = _foodDescription;
    }

    List<Menu> menuList = new ArrayList<Menu>();

    public List<Menu> getMenus(){

        return menuList;
    }

    public int getNumberOfAdults()
    {return numberOfAdults;}

    public int getNumberOfKids()
    {return numberOfKids;}
    
    public String getFoodItem() {
        return foodItem;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getFoodType() {
        return foodType;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public Double getFoodCost(){
        return foodCost;
    }

    //Total Cost Calculation Method
    public Double MenuTotalCost() {    
        int totalPeople= numberOfAdults+numberOfKids; 

        Double sum = 0.00;
        Double total=0.00;
        for(Menu item : menuList)
        {
            sum += item.getFoodCost();
        }

        Double discount =sum*0.15;

        if (totalPeople>40) {
            total = sum-discount;
            return total;
        }
        else
        {
            return sum;
        }
        
    }

}