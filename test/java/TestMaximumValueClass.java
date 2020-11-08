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
}
