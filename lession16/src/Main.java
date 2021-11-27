import java.util.*;

public class Main {

    public static void main(String[] args) {
        ProductRepo re = new ProductRepo();
        Map<Category, Integer> map = new LinkedHashMap<>();
        map.put(Category.PHONE, 0);
        map.put(Category.ACCESSORY, 0);
        map.put(Category.LAPTOP, 0);
        map.put(Category.APPLE, 0);
        Set s = map.keySet();


        for (int i = 0 ; i< re.listProduct.size(); i++){
            for (Object a: s) {
                if (a.equals(re.listProduct.get(i).getCategory())){
                    map.put(re.listProduct.get(i).getCategory(), map.get(re.listProduct.get(i).getCategory())+1);
                }
            }
        }
        for (Map.Entry<Category , Integer> a: map.entrySet()
             ) {
            System.out.println(a.getKey() + " có " + a.getValue());

        }
        System.out.println("-----------------------------------------------------");
        Map<String, Integer> m = new LinkedHashMap<>();
        Set z = m.keySet();
        for (int i = 0; i<re.listProduct.size();i++){
            m.put(re.listProduct.get(i).getBrand(), 0);
        }


        for (int i = 0 ; i< re.listProduct.size(); i++){
            for (Object a: z) {
                if (a.equals(re.listProduct.get(i).getBrand())){
                    m.put(re.listProduct.get(i).getBrand(), m.get(re.listProduct.get(i).getBrand())+1);
                }
            }
        }

        for (Map.Entry<String , Integer> a: m.entrySet()
        ) {
            System.out.println(a.getKey() + " có " + a.getValue());

        }
        System.out.println("--------------------------------------------------------");
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm tìm kiếm");
        String name = sc.nextLine();
        for (int i = 0 ; i< re.listProduct.size(); i++){
                if (re.listProduct.get(i).getName().toLowerCase().contains(name.toLowerCase())){
                    count++;
                    System.out.println(re.listProduct.get(i).toString());
                }
            }
        System.out.println("Tìm thấy tất cả : " + count + " sản phẩm");
    }

    }

