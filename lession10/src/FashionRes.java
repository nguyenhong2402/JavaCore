import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FashionRes {
    ArrayList<Fashion> fashion;
    Fashion fs1;
    Fashion fs2;
    Fashion fs3;
    public ArrayList<Fashion> getFashion(){
        fashion = new ArrayList<>();
        fs1 = new Fashion(Category.FASHION, 1, "Áo", 350000,55,30);
        fs2 = new Fashion(Category.FASHION, 2, "Quần", 550000,50,40);
        fs3 = new Fashion(Category.FASHION, 3, "Áo khoác", 1000000,30,10);
        fashion.add(fs1);
        fashion.add(fs2);
        fashion.add(fs3);
        return fashion;
    }
    public void print() {
        for (Fashion s : fashion) {
            System.out.println(s);
        }
    }
    public void print2(){
        if(fs1.getPrice()>100000){
            System.out.println(fs1);
        }
        if (fs2.getPrice()>100000){
            System.out.println(fs2);
        }
        if (fs3.getPrice()>100000){
            System.out.println(fs3);
        }
    }
    public void sortSold(){
        Collections.sort(fashion, new Comparator<Fashion>(){
            @Override
            public int compare(Fashion o1, Fashion o2) {
                return o1.getQuantitySold() - o2.getQuantitySold();
            }

        });
        print();
    }
    public int getSoldmax(){
        int max;
        if (fs1.getQuantitySold() >= fs2.getQuantitySold()){
            if (fs1.getQuantitySold()>=fs3.getQuantitySold()){
                max = fs1.getQuantitySold();
                System.out.println(fs1);
            }else {
                max = fs3.getQuantitySold();
                System.out.println(fs3);
            }
        }else {
            if (fs2.getQuantitySold()>= fs3.getQuantitySold()){
                max = fs2.getQuantitySold();
                System.out.println(fs2);
            }else {
                max = fs3.getQuantitySold();
                System.out.println(fs3);
            }
        }
        return max;
    }
}
