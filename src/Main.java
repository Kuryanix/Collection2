import java.lang.invoke.MutableCallSite;
import java.util.*;

import Product.*;
import Math.*;

public class Main {
    public static void main(String[] args) {

        Product apple = new Product("Яблоко", 32, 5);
        Product orange = new Product("Апельсин", 57, 2);

        ProductList productList = new ProductList();
        productList.addProduct(apple);
        productList.addProduct(orange);
        System.out.println(productList);
        numbersSetRemoveEven();
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        System.out.println(multiplicationTable);
        Task task = new Task(3, 4);
        Task task2 = new Task(4, 3);
        Set<Task> set = new HashSet<>();
        set.add(task);
        set.add(task2);
        System.out.println(set);
    }

    private static void numbersSetRemoveEven() {
        Set<Integer> numbers = new HashSet<>(20);
        Random random = new Random();

        while (numbers.size() < 20) {
            numbers.add(random.nextInt(1000));
        }
        System.out.println(numbers);
        Iterator<Integer> numbersIterator = numbers.iterator();
        while (numbersIterator.hasNext()) {
            int number = numbersIterator.next();
            if (number % 2 != 0) {
                numbersIterator.remove();
            }
        }
        System.out.println(numbers);
    }

    // Задание 4
    // HashSet будет быстрее, так как он умеет находить элемент за константное время

    // Не пойму почему выдает ошибки на строках 16 и 25 на листе ProductList
}
