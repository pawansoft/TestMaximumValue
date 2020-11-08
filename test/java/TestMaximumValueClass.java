import org.junit.Assert;
import org.junit.Test;

class TestMaximumValue {

    @Test
    public void testMaximum_ProvideFirstValueMaximum_ShouldReturnFirst() {
        Integer arr[] = {10, 7, 4, 8, 2,9};
        FindMaximum findMaximum = new FindMaximum(arr);
        Comparable max = findMaximum.maxValueFromThree();
        Assert.assertEquals(10, max);
    }

    @Test
    public void testMaximum_ProvideSecondValueMaximum_ShouldReturnSecond() {
        Integer arr[] = {7, 9, 8, 2};
        FindMaximum findMaximum = new FindMaximum(arr);
        Comparable max = findMaximum.maxValueFromThree();
        Assert.assertEquals(9, max);
    }

    @Test
    public void testMaximum_ProvideThirdValueMaximum_ShouldReturnThird() {
        Integer arr[] = {7, 9, 20, 5};
        FindMaximum findMaximum = new FindMaximum(arr);
        Comparable max = findMaximum.maxValueFromThree();
        Assert.assertEquals(20, max);
    }

    @Test
    public void testMaximum_ProvideWrongInput_ShouldReturnFalse() {
        Integer arr[] = {9, 7, 8 , 11};
        FindMaximum findMaximum = new FindMaximum(arr);
        Comparable max = findMaximum.maxValueFromThree();
        Assert.assertNotEquals(7, max);
    }

    @Test
    public void testMaximum_ProvideFirstFlotValueMaximum_ShouldReturnFirstValue() {
        Float fArr[] = {20.2f, 9.1f, 8.7f, 2.0f};
        FindMaximum findMaximum = new FindMaximum(fArr);
        Comparable max = findMaximum.maxValueFromThree();
        Assert.assertEquals(20.2f, max);
    }

    @Test
    public void testMaximum_ProvideSecondFlotValueMaximum_ShouldReturnSecondValue() {
        Float fArr[] = {9.1f, 20.2f, 8.7f, 1.1f};
        FindMaximum findMaximum = new FindMaximum(fArr);
        Comparable max = findMaximum.maxValueFromThree();
        Assert.assertEquals(20.2f, max);
    }

    @Test
    public void testMaximum_ProvideThirdFlotValueMaximum_ShouldReturnThirdValue() {
        Float fArray[] = {20.2f, 9.1f, 21.7f, 2.8f};
        FindMaximum findMaximum = new FindMaximum(fArray);
        Comparable max = findMaximum.maxValueFromThree();
        Assert.assertEquals(21.7f, max);
    }

    @Test
    public void provideFloatValue_passWrongMaximum_shouldReturnFalse() {
        Float fArr[] = {33.3f, 27.7f, 7.7f};
        FindMaximum maximum = new FindMaximum(fArr);
        Comparable max = maximum.maxValueFromThree();
        Assert.assertNotEquals(27.7f, max);
    }
    @Test
    public void testMaximum_ProvideFirstStringAsLarge_ShouldReturnFirstString() {
        String sArr[] = {"abcde" ,"abcd", "abc"};
        FindMaximum findMaximum = new FindMaximum(sArr);
        Comparable max = findMaximum.maxValueFromThree();
        Assert.assertEquals("abcde", max);
    }

    @Test
    public void testMaximum_ProvideSecondStringAsLarge_ShouldReturnSecondString() {
        String sArr[] = {"abcd" ,"abcde", "abc"};
        FindMaximum findMaximum = new FindMaximum(sArr);
        Comparable max = findMaximum.maxValueFromThree();
        Assert.assertEquals("abcde", max);
    }

    @Test
    public void testMaximum_ProvideThirdStringAsLarge_ShouldReturnThirdString() {
        String sArr[] = {"abcd" ,"abc", "abcde"};
        FindMaximum findMaximum = new FindMaximum(sArr);
        Comparable max = findMaximum.maxValueFromThree();
        Assert.assertEquals("abcde", max);
    }

    @Test
    public void testMaximum_ProvideWrongStringAsLarge_ShouldReturnFalse(){
        String sArr[] = {"Orange","Aple","Guava"};
        FindMaximum maximum = new FindMaximum(sArr);
        Comparable max = maximum.maxValueFromThree();
        Assert.assertNotEquals("Guava", max);
    }
}

