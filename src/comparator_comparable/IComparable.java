package comparator_comparable;


import java.util.ArrayList;
import java.util.List;

public class IComparable {

    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("BMW", 2020, 3.0));
        carList.add(new Car("Audi", 2021, 2.0));
        carList.add(new Car("Kia", 2019, 1.6));

        System.out.println("\u001B[34m");
        carList.forEach(System.out::println);
        carList.sort(new ComparatorByEngineDisplacement());
        System.out.println("\u001B[31m");
        carList.forEach(System.out::println);
        System.out.println("\u001B[0m");

    }


}
