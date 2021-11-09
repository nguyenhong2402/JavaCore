import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class HousewareRes {
    ArrayList<Houseware> dogiadung;
    Houseware hr1;
    Houseware hr2;
    Houseware hr3;
    public ArrayList<Houseware> getDogiadung(){
        dogiadung = new ArrayList<>();
        hr1 = new Houseware(Category.HOUSEWARE, 1, "Nồi", 500000,100,40);
        hr2 = new Houseware(Category.HOUSEWARE, 2, "Chảo", 300000,80,60);
        hr3 = new Houseware(Category.HOUSEWARE, 3, "Máy lọc", 3500000,20,5);
        dogiadung.add(hr1);
        dogiadung.add(hr2);
        dogiadung.add(hr3);
        return dogiadung;
    }
    public void print() {
        for (Houseware s : dogiadung) {
            System.out.println(s);
        }
    }
    public void print2(){
        if(hr1.getPrice()>100000){
            System.out.println(hr1);
        }
        if (hr2.getPrice()>100000){
            System.out.println(hr2);
        }
        if (hr3.getPrice()>100000){
            System.out.println(hr3);
        }
    }
    public void sortSold(){
        Collections.sort(dogiadung, new Comparator<Houseware>(){
            @Override
            public int compare(Houseware o1, Houseware o2) {
                return o1.getQuantitySold() - o2.getQuantitySold();
            }

        });
        print();
    }
//    public int getSoldmax(){
//
//    }

}
