import java.util.ArrayList;
import java.util.Scanner;

public class ProductRes extends Product {
    ArrayList<Product> listProduct;
    Scanner sc = new Scanner(System.in);
    public ProductRes() {

    }
    public ProductRes(int id, String name, String description, long price, int quantity, int quantitySort, String company, Category category) {
        super(id, name, description, price, quantity, quantitySort, company, category);
    }

    public ArrayList<Product> getData() {
        listProduct = new ArrayList<>();
        listProduct.add(new Product(1, "Oppo Reno5 8GB-128GB", "Oppo Reno5 8GB-128GB", 6688000L, 10, 7, "OPPO", Category.PHONE));
        listProduct.add(new Product(2, "Oppo Reno4 Pro", "Oppo Reno4 Pro", 11490000L, 25, 10, "OPPO", Category.PHONE));
        listProduct.add(new Product(3, "Samsung Galaxy Z Flip", "Samsung Galaxy Z Flip", 20990000L, 19, 3, "Samsung", Category.PHONE));
        listProduct.add(new Product(4, "Oppo A92", "Oppo A92", 5990000L, 30, 15, "OPPO", Category.PHONE));
        listProduct.add(new Product(5, "Xiaomi Redmi 9 4GB-64GB", "Xiaomi Redmi 9 4GB-64GB", 3190000L, 30, 25, "Xiaomi", Category.PHONE));
        listProduct.add(new Product(6, "Asus Zenbook UX325EA-EG079T", "Asus Zenbook UX325EA-EG079T", 20790000L, 10, 6, "Asus", Category.LAPTOP));
        listProduct.add(new Product(7, "Dell G3 15 i5 10300H", "Dell G3 15 i5 10300H", 21840000L, 15, 4, "DELL", Category.LAPTOP));
        listProduct.add(new Product(8, "Dell Inspiron N7501 i7 10750H", "Dell Inspiron N7501 i7 10750H", 28970000L, 10, 1, "DELL", Category.LAPTOP));
        listProduct.add(new Product(9, "iPhone 12 Pro Max 128GB", "iPhone 12 Pro Max 128GB", 30990000L, 5, 2, "iPhone", Category.APPLE));
        listProduct.add(new Product(10, "MacBook Air 13\" 2020 M1 16GB/256GB", "MacBook Air 13\" 2020 M1 16GB/256GB", 33990000L, 20, 4, "MacBook", Category.APPLE));
        listProduct.add(new Product(11, "Loa bluetooth Compact 2", "Loa bluetooth Compact 2", 290000L, 20, 15, "Xiaomi", Category.ACCESSORY));
        listProduct.add(new Product(12, "Loa bluetooth i.value BT116", "Loa bluetooth i.value BT116", 490000L, 30, 19, "i.value", Category.ACCESSORY));
        listProduct.add(new Product(13, "Pin s???c d??? ph??ng 10000mAh Mi Ultra Compact", " Pin s???c d??? ph??ng 10000mAh Mi Ultra Compact", 710000L, 20, 10, "Xiaomi", Category.ACCESSORY));
        listProduct.add(new Product(14, " Vivo Y20 4GB-64GB", " Vivo Y20 4GB-64GB", 3690000L, 15, 1, "Vivo", Category.PHONE));
        return listProduct;
    }
    public void printCategory(){


        System.out.println("Nh???p v??o s??? sau ????? th???c hi???n in s???n ph???m theo danh m???c: ");
        System.out.println("1 - In ra c??c s???n ph???m ??i???n tho???i");
        System.out.println("2 - In ra c??c s???n ph???m Laptop");
        System.out.println("3 - In ra c??c s???n ph???m Apple");
        System.out.println("4 - In ra c??c s???n ph???m Ph??? ki???n");
        int x = sc.nextInt();
        switch (x){
            case 1:
                for (Product s : listProduct) {
                    if (s.category == Category.PHONE){
                        System.out.println(s);
                    }
                }
                break;
            case 2:
                for (Product s : listProduct) {
                    if (s.category == Category.APPLE){
                        System.out.println(s);
                    }
                }
                break;
            case 3:
                for (Product s : listProduct) {
                    if (s.category == Category.LAPTOP){
                        System.out.println(s);
                    }
                }
                break;
            case 4:
                for (Product s : listProduct) {
                    if (s.category == Category.ACCESSORY){
                        System.out.println(s);
                    }
                }
                break;
            default:
                System.out.println("Nh???p sai s???");
        }
    }
    public void printCompany(){

        System.out.println("Nh???p s??? sau ????? th???c hi???n in th??ng tin theo h??ng: ");
        System.out.println("1 - In ra c??c s???n ph???m c???a OPPO");
        System.out.println("2 - In ra c??c s???n ph???m c???a Samsung");
        System.out.println("3 - In ra c??c s???n ph???m c???a Xiaomi");
        System.out.println("4 - In ra c??c s???n ph???m c???a DELL");
        System.out.println("5 - In ra c??c s???n ph???m c???a iPhone");
        System.out.println("6 - In ra c??c s???n ph???m c???a MacBook");
        System.out.println("7 - In ra c??c s???n ph???m c???a Vivo");
        System.out.println("8 - In ra c??c s???n ph???m c???a Asus");
        System.out.println("9 - In ra c??c s???n ph???m c???a i.value");

        int input = sc.nextInt();
        switch (input){
            case 1:
                for (Product s : listProduct){
                    if(s.company.equals("OPPO")){
                        System.out.println(s);
                    }
                }
                break;
            case 2:
                for (Product s : listProduct){
                    if(s.company.equals("Samsung")){
                        System.out.println(s);
                    }
                }
                break;
            case 3:
                for (Product s : listProduct){
                    if(s.company.equals("Xiaomi")){
                        System.out.println(s);
                    }
                }
                break;
            case 4:
                for (Product s : listProduct){
                    if(s.company.equals("DELL")){
                        System.out.println(s);
                    }
                }
                break;
            case 5:
                for (Product s : listProduct){
                    if(s.company.equals("iPhone")){
                        System.out.println(s);
                    }
                }
                break;
            case 6:
                for (Product s : listProduct){
                    if(s.company.equals("MacBook")){
                        System.out.println(s);
                    }
                }
                break;
            case 7:
                for (Product s : listProduct){
                    if(s.company.equals("Vivo")){
                        System.out.println(s);
                    }
                }
                break;
            case 8:
                for (Product s : listProduct){
                    if(s.company.equals("Asus")){
                        System.out.println(s);
                    }
                }
                break;
            case 9:
                for (Product s : listProduct){
                    if(s.company.equals("i.value")){
                        System.out.println(s);
                    }
                }
                break;
            default:
                System.out.println("Nh???p sai s???");

        }
    }
    public void printPrice(){
        System.out.println("In c??c s???n ph???m theo m???c gi?? sau: ");
        System.out.println("1 - D?????i 2 tri???u");
        System.out.println("2 - T??? 2 - 4 tri???u");
        System.out.println("3 - T??? 4 - 7 tri???u");
        System.out.println("4 - T??? 7 ?????n 13 tri???u");
        System.out.println("5 - Tr??n 13 tri???u");
        int x = sc.nextInt();
        switch (x){
            case 1:
                for (Product s : listProduct){
                    if(s.getPrice()<2000000){
                        System.out.println(s);
                    }
                }
                break;
            case 2:
                for (Product s : listProduct){
                    if(s.getPrice()>2000000 && s.getPrice()<=4000000){
                        System.out.println(s);
                    }
                }
                break;
            case 3:
                for (Product s : listProduct){
                    if(s.getPrice()>=4000000 && s.getPrice()<=7000000){
                        System.out.println(s);
                    }
                }
                break;
            case 4:
                for (Product s : listProduct){
                    if(s.getPrice()>=7000000 && s.getPrice()<=13000000){
                        System.out.println(s);
                    }
                }
                break;
            case 5:
                for (Product s : listProduct){
                    if(s.getPrice()>=13000000){
                        System.out.println(s);
                    }
                }
                break;
            default:
                System.out.println("Nh???p sai s???");
        }
    }
    public void print(){
        System.out.println("Nh???p v??o 1 chu???i b???t k???: ");
        String x = sc.nextLine();
        for (Product s : listProduct){
            if(s.getName().contains(x)){
                System.out.println(s);
            }
        }
    }
}
