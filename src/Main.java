import java.util.HashSet;
import java.util.Set;

import static javax.lang.model.type.TypeKind.UNION;

public class Main {
    public static void main(String[] args) {


        Set<Integer>set1= new HashSet<>();
        set1.add(1);
        set1.add(6);
        set1.add(3);
        set1.add(0);
        System.out.println("List of set1:");
        System.out.println(set1);

        Set<Integer>set2=new HashSet<>();
        set2.add(0);
        set2.add(5);
        set2.add(4);
        set2.add(1);
        System.out.println("List of set2:");
        System.out.println(set2);

        System.out.println("SymmetricDifference of set1 and set2 is:");
        System.out.println(symmetricDifference(set1,set2));




    }
    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer>result=new HashSet<>(set1);
        for (Integer element:set2
             ) {
            if(!result.add(element)){
                result.remove(element);
            }
        }return result;
    }


}