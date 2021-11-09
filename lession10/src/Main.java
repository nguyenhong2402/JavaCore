import java.util.*;

public class Main {

    public static void main(String[] args) {
        HousewareRes house = new HousewareRes();
        house.dogiadung = house.getDogiadung();
        FoodRes fd = new FoodRes();
        fd.food= fd.getFood();
        CosmeticsRes cr = new CosmeticsRes();
        cr.cosmetic = cr.getCosmetic();
        FashionRes fr = new FashionRes();
        fr.fashion = fr.getFashion();
        Scanner sc = new Scanner(System.in);

        System.out.println("Chọn 1 trong các số sau để: ");
        System.out.println("1 - In thông tin tất cả sản phẩm ra màn hình");
        System.out.println("2 - In thông tin các sản phẩm có giá lớn hơn 100.000");
        System.out.println("3 - Sắp xếp sản phẩm theo số lượng bán được");
        System.out.println("4 - Lấy ra sản phẩm bán chạy nhất");
        System.out.println("5 - In thông tin sản phẩm theo danh mục:");
        System.out.println("6 - Tìm kiếm sản phẩm theo tên");
        System.out.println("0 - Thoát chương trình");
        int x = sc.nextInt();
        switch (x){
            case 1:
                System.out.println("Danh sách tất cả sản phẩm");
                house.print();
                fd.print();
                cr.print();
                fr.print();
            case 2:
                System.out.println("Các sản phẩm có giá trên 100.000");
                house.print2();
                fd.print2();
                cr.print2();
                fr.print2();
            case 3:
                System.out.println("Sắp xếp sản phẩm theo số lượng bán được");
                house.sortSold();
                fd.sortSold();
                cr.sortSold();
                fr.sortSold();
            case 4:
                System.out.println("Số lượng đã bán nhiều nhất của từng mục: ");
               int[] sort = new int[4];
               sort[0]=house.getSoldmax();
               sort[1]= fd.getSoldmax();
               sort[2]=cr.getSoldmax();
               sort[3]=fr.getSoldmax();
               int max=sort[0];
               for (int i = 0;i<sort.length;i++){
                   if (sort[i]>max){
                       max=sort[i];
                   }
               }
                System.out.println("----------------------------------------");
                System.out.println("Sản phẩm đã bán nhiều nhất được: " +max);


        }
    }
}
