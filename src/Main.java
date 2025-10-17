import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        Set<String> set = new LinkedHashSet<>();

        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");


        System.out.println(set.contains("Notebook"));
        set.remove("Tv");
        set.removeIf(x -> x.charAt(0) == 'N');


        for (String p : set){
            System.out.println(p);
        }
        */

        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        //union
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //diference
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);

        //teste de igualdade

    }
}