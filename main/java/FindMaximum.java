import java.util.Arrays;

public class FindMaximum <T extends Comparable<T>>{

    T arrayOfValue[];
    public FindMaximum(T[] arrayOfValue) {
        this.arrayOfValue = arrayOfValue;
    }

    public T maxValueFromThree() {
        Arrays.sort(arrayOfValue);

        Arrays.stream(arrayOfValue).forEach(System.out :: println);
        return arrayOfValue[arrayOfValue.length - 1];
    }

}
