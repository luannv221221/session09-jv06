package ra.collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        //
        Map<Integer,String> map = new HashMap<>();
        // thêm phần tử vào map
        map.put(1,"Nguyên Mai");
        map.put(2,"AN");
        map.put(3,"Ánh");

        // truy cập lấy ra theo kye
        System.out.println(map.get(1));
        // xoa phan tu theo key
        map.remove(3);
    }
}
