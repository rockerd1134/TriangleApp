import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TriangleReaderTest {

    TriangleReader TR;

    @Before
    public void setup() {
        TR = new TriangleReader();
    }

    @Test
    public void isTriangleTest(int a = TR.sideA, int b = TR.sideB, int c = TR.sideC) {
        // Test that the three inputs equate to an actual triangle.

        Assert.assertThat(
                (a + b > c) && (a + c > b) && (b + c > a),
                is(true)
        );
    }
}