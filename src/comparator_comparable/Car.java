package comparator_comparable;

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

        return this.year - otherCar.year;
    }

    @Override
    public String toString() {
        return name + " " + year + " " + engineDisplacement;
    }
}
