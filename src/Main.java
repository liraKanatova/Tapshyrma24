import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

       Set<Integer> set1 = new LinkedHashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(0, 1, 2));

        System.out.println(symmetricDifference(set1, set2));
    }

    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> set = new TreeSet<>();

        for (Integer integer : set1) {
            if (set2.contains(integer)) set.remove(integer);
            else set.add(integer);
        }
        for (Integer integer : set2) {
            if (set1.contains(integer)) set.remove(integer);
            else set.add(integer);
        }
        return set;
    }
}