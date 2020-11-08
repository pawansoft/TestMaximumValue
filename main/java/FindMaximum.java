
public class FindMaximum {

    public int maximumValue(Integer fValue, Integer sValue, Integer tValue) {

        Integer max = fValue;

        if(sValue.compareTo(max) > 0)
        {
            max = sValue;
        }
        if(tValue.compareTo(max) > 0)
        {
            max = tValue;
        }

        return max;
    }

    public float maximumFloatValue(Float value1, Float value2, Float value3) {
        Float max = value1;

        if(value1.compareTo(max) > 0)
        {
            max = value2;
        }
        if(value2.compareTo(max) > 0)
        {
            max = value3;
        }
        return max;

    }

    public String maximumValueOfString(String value1, String value2, String value3) {
        String max = value1;
        if (value2.compareTo(max) > 0)
        {
            max = value2;
        }
        if (value3.compareTo(max) > 0)
        {
            max = value3;
        }
        return max;
    }
}
