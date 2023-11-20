import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Map<Integer,Integer>map=new HashMap<>();
//        map.put(0,1);
//        map.put(1,1);
//        map.put(2,1);
//        map.put(3,2);
//        map.put(4,3);
//        map.put(5,3);
//        map.put(6,3);
//        map.put(7,4);
//        for (Map.Entry<Integer,Integer> p :map.entrySet()) {
//            map.getOrDefault(p,0)+1
//        }
        int[] array = {1, 2, 3, 1, 2, 4, 1};

        // Sử dụng HashMap để lưu trữ số lần xuất hiện
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Duyệt qua mảng và cập nhật Map
        for (int number : array) {
            if (frequencyMap.containsKey(number)) {
                // Tăng giá trị đếm nếu phần tử đã tồn tại
                frequencyMap.put(number, frequencyMap.get(number) + 1);
            } else {
                // Thêm phần tử mới với giá trị đếm là 1
                frequencyMap.put(number, 1);
            }
        }

        // In kết quả
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Phần tử " + entry.getKey() + " xuất hiện " + entry.getValue() + " lần");
        }
    }
}