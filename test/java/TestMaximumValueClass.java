import org.junit.Assert;
import org.junit.Test;

class TestMaximumValue {

    @Test
    public void testMaximum_ProvideFirstValueMaximum_ShouldReturnFirst() {
        FindMaximum findMaximum = new FindMaximum();
        int max = findMaximum.maximumValue(9, 7, 8);
        Assert.assertEquals(9, max);
    }

    @Test
    public void testMaximum_ProvideSecondValueMaximum_ShouldReturnSecond() {
        FindMaximum findMaximum = new FindMaximum();
        int max = findMaximum.maximumValue(7, 9, 8);
        Assert.assertEquals(9, max);
    }

    @Test
    public void testMaximum_ProvideThirdValueMaximum_ShouldReturnThird() {
        FindMaximum findMaximum = new FindMaximum();
        int max = findMaximum.maximumValue(7, 9, 20);
        Assert.assertEquals(20, max);
    }

    @Test
    public void testMaximum_ProvideWrongInput_ShouldReturnFalse() {
        FindMaximum findMaximum = new FindMaximum();
        int max = findMaximum.maximumValue(9, 7, 8);
        Assert.assertNotEquals(7, max);
    }

    @Test
    public void testMaximum_ProvideFirstFlotValueMaximum_ShouldReturnFirstValue() {
        FindMaximum findMaximum = new FindMaximum();
        float max = findMaximum.maximumFloatValue(20.2f, 9.1f, 8.7f);
        Assert.assertEquals(20.2f, max, 0.00002);
    }

    @Test
    public void testMaximum_ProvideSecondFlotValueMaximum_ShouldReturnSecondValue() {
        FindMaximum findMaximum = new FindMaximum();
        float max = findMaximum.maximumFloatValue(9.1f, 20.2f, 8.7f);
        Assert.assertEquals(20.2f, max, 0.00002);
    }

    @Test
    public void testMaximum_ProvideThirdFlotValueMaximum_ShouldReturnThirdValue() {
        FindMaximum findMaximum = new FindMaximum();
        float max = findMaximum.maximumFloatValue(20.2f, 9.1f, 21.7f);
        Assert.assertEquals(21.7f, max, 0.00002);
    }

    @Test
    public void provideFloatValue_passWrongMaximum_shouldReturnFalse() {
        FindMaximum maximum = new FindMaximum();
        float max = maximum.maximumFloatValue(33.3f, 27.7f, 7.7f);
        Assert.assertNotEquals(27.7f, max, 0.00003);
    }



}
