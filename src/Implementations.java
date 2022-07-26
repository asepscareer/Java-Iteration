import java.util.ArrayList;
import java.util.Iterator;

public class Implementations {

    void whileloop() {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }

    void dowhile() {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);
    }

    void forloop() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }

    void foreach() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
    }

    void iterator() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ayu");
        names.add("Asep");
        names.add("Wawan");
        names.add("Aceng");
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String i = it.next();
            if (i.length() < 4) {
                it.remove();
            }
        }
        System.out.println(names);
    }

}
