package ra.bt;

import ra.bt.entity.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopManagement {
    private static List<Category> categories = new ArrayList<>();
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
                                System.out.println("Them moi danh mục ");
                                Category category = new Category();
                                category.inputData(scanner,categories);
                                categories.add(category);
                                break;
                            case 2:
                                System.out.println("Danh saách danh mục ");
                                for (Category category1 : categories) {
                                    category1.displayData();
                                }
                                break;
                            case 3:
                                System.out.println("Nhap vao ma danh mục cân Cập nhật ");
                                int categoryId = Integer.parseInt(scanner.nextLine());
                                for (Category category1 : categories) {
                                    if(category1.getCategoryId() == categoryId){
                                        ShopManagement.updateCategory(category1,scanner,categories);
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("Nhap vao ma danh mục cân can xoa ");
                                int idDelete = Integer.parseInt(scanner.nextLine());
                                for (Category category1 : categories) {
                                    if(category1.getCategoryId() == idDelete){
                                       categories.remove(category1);
                                    }
                                }
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

    public static boolean checkIdUpdateCategory(int inputId,int idCategory,List<Category> list){
        if(idCategory == inputId){
            return true;
        }
        for (Category category : list) {
            if(category.getCategoryId() == inputId){
                return false;
            }
        }
        return true;
    }

    public static boolean updateCategory(Category category,Scanner scanner,List<Category> categories){
        do {
            System.out.println("Nhap vao ma danh muc ");
            int ipInput = Integer.parseInt(scanner.nextLine());
            if(checkIdUpdateCategory(ipInput,category.getCategoryId(),categories)){
                //xet lai gia tri moi cho id cua danh muc
                category.setCategoryId(ipInput);
                return true;
            }
            System.err.println("Da ton tai");
        } while (true);

    }
}
