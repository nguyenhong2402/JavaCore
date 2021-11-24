import java.util.ArrayList;

public class Repo {
    ArrayList<Waiter> listWaiter;
    ArrayList<Kitchen> listKitchen;
    public Repo() {
        listWaiter = new ArrayList<>();
        listKitchen = new ArrayList<>();
        listWaiter.add(new Waiter(1,"Hong",24,6000000,4000000));
        listWaiter.add(new Waiter(2,"Ha",25,7000000,2000000));
        listWaiter.add(new Waiter(3,"Hung",26,10000000,4000000));
        listKitchen.add(new Kitchen(4,"Huy",22,5000000,4000000));
        listKitchen.add(new Kitchen(5,"Huy",21,4000000,6000000));
        listKitchen.add(new Kitchen(6,"Huy",29,8000000,5000000));
    }
    public void print(ArrayList<? extends Employee> list){
        for (Object s : list) {
            System.out.println(s);
        }
    }
}
