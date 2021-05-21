package mock.two.q9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Question9 {
    public static void main(String[] args) {

        Point p1_3 = new Point(1, 3);
        Point p7_7 = new Point(7, 7);
        Point p4_7 = new Point(4, 7);
        Point p7_4 = new Point(7, 4);
        Point p2_19 = new Point(2, 19);
        Point p2_18 = new Point(2, 18);
        Point p42_8 = new Point(42, 8);
        Point p42_9 = new Point(100, 100);

        HashMap<String, Point> map = new HashMap<>();
        map.put("a", p1_3);
        map.put("be", p4_7);
        map.put("cat", p1_3);
        map.put("dog", p2_18);
        map.put("bear", p7_4);
        map.put("apple", p7_7);
        map.put("carpet", p2_19);
        map.put("student", p1_3);
        map.put("umbrella", p42_8);
        map.put("specialty", p7_4);

        System.out.println(sumStrings(map));

    }

    static Map<Integer, Point> sumStrings(Map<String, Point> map){
        Map<Integer, Point> out = new HashMap<>();

        Set<Map.Entry<String, Point>> entries = map.entrySet();
        Stream<Map.Entry<String, Point>> entriesStream = entries.stream();

        entriesStream.forEach(a -> {
            if (out.containsKey(a.getKey().length())) {
                Point p = out.get(a.getKey().length());
//                Point newPoint = new Point();
            } else {
                out.put(a.getKey().length(), new Point(a.getValue().x, a.getValue().y));
            }
        });

        return out;
    }
}

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "[x="+this.x+",y="+this.y+"]";
    }
}
