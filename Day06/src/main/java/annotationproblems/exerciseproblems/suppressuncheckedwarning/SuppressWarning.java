package annotationproblems.exerciseproblems.suppressuncheckedwarning;

import java.util.ArrayList;

public class SuppressWarning {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList list = new ArrayList();  // No generics used, causes unchecked warning
        list.add("Hello");
        list.add(100);
        list.add(true);

        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
