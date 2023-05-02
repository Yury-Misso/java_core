package comparator_comparable;

import java.util.Comparator;

public class Car implements Comparable<Car> {
    String name;
    int year;
    double engineDisplacement;

    public Car(String name, int year, double engineDisplacement) {
        this.name = name;
        this.year = year;
        this.engineDisplacement = engineDisplacement;
    }


    @Override
    public int compareTo(Car otherCar) {

        return this.name.compareTo(otherCar.name);
    }

    @Override
    public String toString() {
        return name + " " + year + " " + engineDisplacement;
    }
}

class ComparatorByYear implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.year - o2.year;
    }
}

class ComparatorByEngineDisplacement implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return Double.compare(o1.engineDisplacement, o2.engineDisplacement);
    }
}