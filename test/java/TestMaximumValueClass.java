import org.junit.Assert;
import org.junit.Test;

class TestMaximumValue {

    @Test
    public void testMaximum_ProvideFirstValueMaximum_ShouldReturnFirst() {
        FindMaximum findMaximum = new FindMaximum();
        int max = findMaximum.maxValueFromThree(9, 7, 8);
        Assert.assertEquals(9, max);
    }

    @Test
    public void testMaximum_ProvideSecondValueMaximum_ShouldReturnSecond() {
        FindMaximum findMaximum = new FindMaximum();
        int max = findMaximum.maxValueFromThree(7, 9, 8);
        Assert.assertEquals(9, max);
    }

    @Test
    public void testMaximum_ProvideThirdValueMaximum_ShouldReturnThird() {
        FindMaximum findMaximum = new FindMaximum();
        int max = findMaximum.maxValueFromThree(7, 9, 20);
        Assert.assertEquals(20, max);
    }

    @Test
    public void testMaximum_ProvideWrongInput_ShouldReturnFalse() {
        FindMaximum findMaximum = new FindMaximum();
        int max = findMaximum.maxValueFromThree(9, 7, 8);
        Assert.assertNotEquals(7, max);
    }

    @Test
    public void testMaximum_ProvideFirstFlotValueMaximum_ShouldReturnFirstValue() {
        FindMaximum findMaximum = new FindMaximum();
        float max = findMaximum.maxValueFromThree(20.2f, 9.1f, 8.7f);
        Assert.assertEquals(20.2f, max, 0.00002);
    }

    @Test
    public void testMaximum_ProvideSecondFlotValueMaximum_ShouldReturnSecondValue() {
        FindMaximum findMaximum = new FindMaximum();
        float max = findMaximum.maxValueFromThree(9.1f, 20.2f, 8.7f);
        Assert.assertEquals(20.2f, max, 0.00002);
    }

    @Test
    public void testMaximum_ProvideThirdFlotValueMaximum_ShouldReturnThirdValue() {
        FindMaximum findMaximum = new FindMaximum();
        float max = findMaximum.maxValueFromThree(20.2f, 9.1f, 21.7f);
        Assert.assertEquals(21.7f, max, 0.00002);
    }

    @Test
    public void provideFloatValue_passWrongMaximum_shouldReturnFalse() {
        FindMaximum maximum = new FindMaximum();
        float max = maximum.maxValueFromThree(33.3f, 27.7f, 7.7f);
        Assert.assertNotEquals(27.7f, max, 0.00003);
    }
    @Test
    public void testMaximum_ProvideFirstStringAsLarge_ShouldReturnFirstString() {
        FindMaximum findMaximum = new FindMaximum();
        String max = findMaximum.maxValueFromThree("abcde" ,"abcd", "abc");
        Assert.assertEquals("abcde", max);
    }

    @Test
    public void testMaximum_ProvideSecondStringAsLarge_ShouldReturnSecondString() {
        FindMaximum findMaximum = new FindMaximum();
        String max = findMaximum.maxValueFromThree("abcd" ,"abcde", "abc");
        Assert.assertEquals("abcde", max);
    }

    @Test
    public void testMaximum_ProvideThirdStringAsLarge_ShouldReturnThirdString() {
        FindMaximum findMaximum = new FindMaximum();
        String max = findMaximum.maxValueFromThree("abcd" ,"abc", "abcde");
        Assert.assertEquals("abcde", max);
    }

    @Test
    public void testMaximum_ProvideWrongStringAsLarge_ShouldReturnFalse(){
        FindMaximum maximum = new FindMaximum();
        String max = maximum.maxValueFromThree("Orange","Aple","Guava");
        Assert.assertNotEquals("Guava", max);
    }
}

