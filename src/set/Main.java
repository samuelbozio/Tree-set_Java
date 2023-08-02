package set;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Product> set =  new HashSet<>();

        set.add(new Product("TV", 200.00));
        set.add(new Product("Notebook", 2000.00));
        set.add(new Product("Tablet", 100.00));

        Product  prod =  new Product("Notebook", 2000.00);

        System.out.println(set.contains(prod));


    }
}