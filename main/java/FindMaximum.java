
public class FindMaximum <T extends Comparable<T>>{

    private T fValue, sValue, tValue;

    public FindMaximum(T fValue, T sValue, T tValue) {
        this.fValue = fValue;
        this.sValue = sValue;
        this.tValue = tValue;
    }

    public T getfValue() {
        return fValue;
    }

    public T getsValue() {
        return sValue;
    }

    public T gettValue() {
        return tValue;
    }

    public T maxValueFromThree() {
        T max = getfValue();

        if(getsValue().compareTo(max) > 0)
        {
            max = getsValue();
        }
        if (gettValue().compareTo(max) > 0)
        {
            max = gettValue();
        }
        return max;
    }

}
