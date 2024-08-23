package ra.bt.entity;

import ra.bt.IShop;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Category implements IShop {
    private int categoryId;
    private String categoryName;
    private boolean categoryStatus;

    public Category() {
    }

    public Category(int categoryId, String categoryName, boolean categoryStatus) {
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

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
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

        // nhap thong tin cho id
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

        // nhap thong tin cho categoryName
        do {
            System.out.println("Nhập vào tên danh mục ");
            this.categoryName = scanner.nextLine();
            if(!checkNameExist(categoryName,categories)){
                break;
            } else {
                System.err.println(categoryName +" đã tồn tại " );
            }
        } while (true);
        // nhập cho trạng thái
        System.out.println("Nhập vào trạng thái");
        this.categoryStatus = Boolean.parseBoolean(scanner.nextLine());
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

    // phương thưức kiểm tra xem name đã tồn tại hay chưa
    public boolean checkNameExist(String categoryName,List<Category> categories){
        for (Category category : categories) {
            if(category.getCategoryName().equals(categoryName)){
                return true;
            }
        }
        return false;
    }
    @Override
    public void displayData() {
        System.out.println("==========Danh muc=========");
        System.out.println("ID : "+this.categoryId);
        System.out.println("Name : "+this.categoryName);
        System.out.println("Status : "+this.categoryStatus);
    }


}
