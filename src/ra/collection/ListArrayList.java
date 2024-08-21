package ra.collection;

import java.util.ArrayList;
import java.util.List;

public class ListArrayList {
    public static void main(String[] args) {
        List<Cat> listCat = new ArrayList<>();

        Cat cat1 = new Cat("Meo Tom",84);
        Cat cat2 = new Cat("Mèo Mướp",19);
        Cat cat3 = new Cat("Mèo Mướp",19);
        // thêm phần từ vào List phương thức add(E) thêm phần tử vào cuoosidanh sách
        listCat.add(cat1);
        listCat.add(cat2);
        // Phương thức trả ve kich co cua danh sach
        System.out.println(listCat.size());
        // phương thức kiểm tra xem dah sách co rỗng ko
        System.out.println("Kiem tra rong "+listCat.isEmpty());
        // kiemet tra 1 doi tuong co nam trong danh sach hay khong
        System.out.println(listCat.contains(cat3));
        // chuyen collection thanh array listCat.toArray();
        // xóa ơhaanf tu khoi danh sach
        listCat.remove(cat1);
        System.out.println(listCat.size());

        for (Cat cat : listCat) {
            System.out.println(cat.getCatName());
        }

    }
}
