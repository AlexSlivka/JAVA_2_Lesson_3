import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Paris");
        arrayList.add("London");
        arrayList.add("Rome");
        arrayList.add("Moscow");
        arrayList.add("Paris");
        arrayList.add("Rome");
        arrayList.add("Paris");
        arrayList.add("Madrid");
        arrayList.add("Paris");

        System.out.println(arrayList);

        Map<String , Integer> hm = new HashMap<>();

        int colString = 0;

        for (String l:arrayList) {
            colString = 0;
            for (String i:arrayList) {
                if (l.equals(i)){
                    colString+=1;
                }
            }
            hm.put(l,colString);
        }

        hm.forEach ((k,v)->{
            System.out.println(k + " количество = " + v);
        });
    }
}
