package ra.bt.entity;

import ra.bt.IShop;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Category implements IShop {
    private int categoryId;
    private int categoryName;
    private boolean categoryStatus;

    public Category() {
    }

    public Category(int categoryId, int categoryName, boolean categoryStatus) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryStatus = categoryStatus;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(int categoryName) {
        this.categoryName = categoryName;
    }

    public boolean isCategoryStatus() {
        return categoryStatus;
    }

    public void setCategoryStatus(boolean categoryStatus) {
        this.categoryStatus = categoryStatus;
    }


    @Override
    public void inputData(Scanner scanner, List<Category> categories) {

        do {
            System.out.println("Nhập vào mã danh mục ");
            String id = scanner.nextLine();
            if(Pattern.matches("[1-9]{1,100}",id)){
                this.categoryId = Integer.parseInt(id);
                // kiem tra trung lap
                if(!checkIdExist(this.categoryId,categories)){
                   break;
                }
                System.err.println("AI đi đã tồn tại ");
            } else {
                System.err.println("Phai la so nguyen duong");
            }
        } while (true);
    }

    // phương thức kiểm tra xem id đã tồn tại hay chưa
    public boolean checkIdExist(int id,List<Category> categories){
        for (Category category : categories) {
            if(category.getCategoryId() == id){
                return true;
            }
        }
        return false;
    }
    @Override
    public void displayData() {
        System.out.println("==========Danh muc=========");
        System.out.println("ID : "+this.categoryId);
    }


}
