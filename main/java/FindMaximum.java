import java.util.Arrays;

public class FindMaximum <T extends Comparable<T>>{

    T arrayOfValue[];
    public FindMaximum(T[] arrayOfValue) {
        this.arrayOfValue = arrayOfValue;
    }

    public T maxValueFromThree() {
        Arrays.sort(arrayOfValue);

        T max = arrayOfValue[arrayOfValue.length - 1];

        displayResult(arrayOfValue, max);

        return max;
    }

    public void displayResult(T arr[], T max)
    {
        Arrays.stream(arr).forEach(System.out :: println);
        System.out.println("Shorted Array : " + arr + " Max Value Of an Array : " + max);
    }

}
