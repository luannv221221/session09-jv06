package ra.bt;

import java.util.Scanner;

public class ShopManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("*************************SHOP MANAGEMENT*************** \n" +
                    "1. Quản lý danh mục sản phẩm \n" +
                    "2. Quản lý sản phẩm\n" +
                    "3. Thoat");
            System.out.println("Mời bạn chọn ");
            int choice = Integer.parseInt(scanner.nextLine());
            boolean check = true;
            switch (choice){
                case 1:
                    do {
                        System.out.println("***************** CATALOG MANAGEMENT************** \n" +
                                "1. Thêm mới danh mục \n" +
                                "2. Hiển thị thông tin các danh mục \n" +
                                "3. Cập nhật tên danh mục theo mã danh mục \n" +
                                "4. Xóa danh mục theo mã danh mục (Danh mục chưa chứa sản phẩm) \n" +
                                "5. Thoát (Quay lại Shop Management) ");
                        System.out.println("Moi chon ");
                        choice = Integer.parseInt(scanner.nextLine());

                        switch (choice){
                            case 1:
                                System.out.println("Them moi");
                                break;
                            case 5:
                                check = false;
                                break;
                        }
                    } while (check);

                case 2:
                    break;
                case 3:
                    System.exit(0);

            }
        } while (true);
    }
}
