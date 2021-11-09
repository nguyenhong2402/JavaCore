import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FoodRes {
    ArrayList<Food> food;
    Food fd1;
    Food fd2;
    Food fd3;
    public ArrayList<Food> getFood(){
        food = new ArrayList<>();
        fd1 = new Food(Category.FOOD, 1, "Hộp khô gà", 100000,95,50);
        fd2 = new Food(Category.FOOD, 2, "Hộp khô bò", 120000,50,30);
        fd3 = new Food(Category.FOOD, 3, "Bịch xúc xích", 60000,120,60);
        food.add(fd1);
        food.add(fd2);
        food.add(fd3);
        return food;
    }
    public void print() {
        for (Food s : food) {
            System.out.println(s);
        }
    }
    public void print2(){
        if(fd1.getPrice()>100000){
            System.out.println(fd1);
        }
        if (fd2.getPrice()>100000){
            System.out.println(fd2);
        }
        if (fd3.getPrice()>100000){
            System.out.println(fd3);
        }
    }
    public void sortSold(){
        Collections.sort(food, new Comparator<Food>(){
            @Override
            public int compare(Food o1, Food o2) {
                return o1.getQuantitySold() - o2.getQuantitySold();
            }

        });
        print();
    }
}
