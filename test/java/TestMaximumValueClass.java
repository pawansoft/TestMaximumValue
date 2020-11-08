import org.junit.Assert;
import org.junit.Test;

class TestMaximumValue {

    @Test
    public void testMaximum_ProvideFirstValueMaximum_ShouldReturnFirst() {
        FindMaximum findMaximum = new FindMaximum(9, 7, 8);
        Comparable max = findMaximum.maxValueFromThree();
        Assert.assertEquals(9, max);
    }

    @Test
    public void testMaximum_ProvideSecondValueMaximum_ShouldReturnSecond() {
        FindMaximum findMaximum = new FindMaximum(7, 9, 8);
        Comparable max = findMaximum.maxValueFromThree();
        Assert.assertEquals(9, max);
    }

    @Test
    public void testMaximum_ProvideThirdValueMaximum_ShouldReturnThird() {
        FindMaximum findMaximum = new FindMaximum(7, 9, 20);
        Comparable max = findMaximum.maxValueFromThree();
        Assert.assertEquals(20, max);
    }

    @Test
    public void testMaximum_ProvideWrongInput_ShouldReturnFalse() {
        FindMaximum findMaximum = new FindMaximum(9, 7, 8);
        Comparable max = findMaximum.maxValueFromThree();
        Assert.assertNotEquals(7, max);
    }

    @Test
    public void testMaximum_ProvideFirstFlotValueMaximum_ShouldReturnFirstValue() {
        FindMaximum findMaximum = new FindMaximum(20.2f, 9.1f, 8.7f);
        Comparable max = findMaximum.maxValueFromThree();
        Assert.assertEquals(20.2f, max);
    }

    @Test
    public void testMaximum_ProvideSecondFlotValueMaximum_ShouldReturnSecondValue() {
        FindMaximum findMaximum = new FindMaximum(9.1f, 20.2f, 8.7f);
        Comparable max = findMaximum.maxValueFromThree();
        Assert.assertEquals(20.2f, max);
    }

    @Test
    public void testMaximum_ProvideThirdFlotValueMaximum_ShouldReturnThirdValue() {
        FindMaximum findMaximum = new FindMaximum(20.2f, 9.1f, 21.7f);
        Comparable max = findMaximum.maxValueFromThree();
        Assert.assertEquals(21.7f, max);
    }

    @Test
    public void provideFloatValue_passWrongMaximum_shouldReturnFalse() {
        FindMaximum maximum = new FindMaximum(33.3f, 27.7f, 7.7f);
        Comparable max = maximum.maxValueFromThree();
        Assert.assertNotEquals(27.7f, max);
    }
    @Test
    public void testMaximum_ProvideFirstStringAsLarge_ShouldReturnFirstString() {
        FindMaximum findMaximum = new FindMaximum("abcde" ,"abcd", "abc");
        Comparable max = findMaximum.maxValueFromThree();
        Assert.assertEquals("abcde", max);
    }

    @Test
    public void testMaximum_ProvideSecondStringAsLarge_ShouldReturnSecondString() {
        FindMaximum findMaximum = new FindMaximum("abcd" ,"abcde", "abc");
        Comparable max = findMaximum.maxValueFromThree();
        Assert.assertEquals("abcde", max);
    }

    @Test
    public void testMaximum_ProvideThirdStringAsLarge_ShouldReturnThirdString() {
        FindMaximum findMaximum = new FindMaximum("abcd" ,"abc", "abcde");
        Comparable max = findMaximum.maxValueFromThree();
        Assert.assertEquals("abcde", max);
    }

    @Test
    public void testMaximum_ProvideWrongStringAsLarge_ShouldReturnFalse(){
        FindMaximum maximum = new FindMaximum("Orange","Aple","Guava");
        Comparable max = maximum.maxValueFromThree();
        Assert.assertNotEquals("Guava", max);
    }
}

