import java.util.*;

public class StudentsDatabase {
    public static void main(String[] args) {
        HashMap<Integer, String> ID_Name = new HashMap<Integer, String>();

        ID_Name.put(1, "Viraj Patil");
        ID_Name.put(2, "Swaraj Bangar");
        ID_Name.put(3, "Aniket Patil");
        ID_Name.put(4, "Varad Patil");
        System.out.println(ID_Name.size());
        System.out.println(ID_Name);

        HashMap<Integer, Integer> ID_Mark = new HashMap<Integer, Integer>();

        ID_Mark.put(1, 80);
        ID_Mark.put(2, 81);
        ID_Mark.put(3, 79);
        ID_Mark.put(4, 78);

        System.out.println(ID_Mark.size());
        System.out.println(ID_Mark);

        int max_marks = Collections.max(ID_Mark.values());
        int min_marks = Collections.min(ID_Mark.values());
        System.out.println("Maximum Marks : " + max_marks);
        System.out.println("Minimum Marks : " + min_marks);

        int max = ID_Mark.get(1);
        int min = ID_Mark.get(1);
        for (int i = 1; i <= 4; i++) {
            if (ID_Mark.get(i) >= max) {
                max = ID_Mark.get(i);
            }
            if (ID_Mark.get(i) <= min) {
                min = ID_Mark.get(i);
            }
        }
        System.out.println("Maximum Marks : " + max);
        System.out.println("Minimum Marks : " + min);

        for(Map.Entry<Integer, Integer> entry: ID_Mark.entrySet()) {
            if(entry.getValue() == max) {
                System.out.println("Marks : " + max + " ID : " + entry.getKey()+" Name : "+ID_Name.get(entry.getKey()));
                break;
            }
        }
        for(Map.Entry<Integer, Integer> entry: ID_Mark.entrySet()) {
            if(entry.getValue() == min) {
                System.out.println("Marks : " + min + " ID : " + entry.getKey()+" Name : "+ID_Name.get(entry.getKey()));
                break;
            }
        }
    }
}
