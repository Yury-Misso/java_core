package genericsLesson;

public class ParameterizedClass {
    public static void main(String[] args) {
        SomeParameterizedClass<String, Integer> someParameterizedClass = new SomeParameterizedClass<>("Value 1", 1);

        System.out.println(someParameterizedClass);

        SomeParameterizedClass<Integer, Integer> integerIntegerSomeParameterizedClass =
                new SomeParameterizedClass<>(1, 1);

        System.out.println(integerIntegerSomeParameterizedClass);

        SomeParameterizedClass<Double, Double> doubleDoubleSomeParameterizedClass =
                new SomeParameterizedClass<>(3.14, 5.78);

        System.out.println(doubleDoubleSomeParameterizedClass);


        OtherSomeParameterizedClass<Integer> integerOtherSomeParameterizedClass =
                new OtherSomeParameterizedClass<>(12, 56);

        System.out.println(integerOtherSomeParameterizedClass);


    }
}

class SomeParameterizedClass<V1, V2> {
    private V1 value1;
    private V2 value2;

    public SomeParameterizedClass(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "SomeParameterizedClass{" +
                "value1= " + value1 +
                ", value2= " + value2 +
                '}';
    }
}

class OtherSomeParameterizedClass<V> {
    private V value1;
    private V value2;

    public OtherSomeParameterizedClass(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "SomeParameterizedClass{" +
                "value1= " + value1 +
                ", value2= " + value2 +
                '}';
    }
}