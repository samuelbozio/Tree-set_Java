package treeset;

import set.Product;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<ProductTreeSet> set =  new TreeSet<>();

        set.add(new ProductTreeSet("TV", 200.00));
        set.add(new ProductTreeSet("Notebook", 2000.00));
        set.add(new ProductTreeSet("Tablet", 100.00));

        for (ProductTreeSet p : set) {
            System.out.println(p);
        }


    }
}