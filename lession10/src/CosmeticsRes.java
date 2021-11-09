import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CosmeticsRes {
    ArrayList<Cosmetics> cosmetic;
    Cosmetics ct1;
    Cosmetics ct2;
    Cosmetics ct3;
    public ArrayList<Cosmetics> getCosmetic(){
        cosmetic = new ArrayList<>();
        ct1 = new Cosmetics(Category.COSMETICS, 1, "Son", 700000,30,10);
        ct2 = new Cosmetics(Category.COSMETICS, 2, "Sữa rửa mặt", 70000,1000,200);
        ct3 = new Cosmetics(Category.COSMETICS, 3, "Dầu gội đầu", 200000,20,5);
        cosmetic.add(ct1);
        cosmetic.add(ct2);
        cosmetic.add(ct3);
        return cosmetic;
    }
    public void print() {
        for (Cosmetics s : cosmetic) {
            System.out.println(s);
        }
    }
    public void print2(){
        if(ct1.getPrice()>100000){
            System.out.println(ct1);
        }
        if (ct2.getPrice()>100000){
            System.out.println(ct2);
        }
        if (ct3.getPrice()>100000){
            System.out.println(ct3);
        }
    }
    public void sortSold(){
        Collections.sort(cosmetic, new Comparator<Cosmetics>(){
            @Override
            public int compare(Cosmetics o1, Cosmetics o2) {
                return o1.getQuantitySold() - o2.getQuantitySold();
            }

        });
        print();
    }
}
