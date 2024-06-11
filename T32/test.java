import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

public class test {

    @Test
    public void testMin() {
        String fileName = "testmin.txt";
        long[] numbers = sumoperation.getList(fileName);
        long minNumber = sumoperation._min(numbers);
        assertEquals(minNumber, 1);
    }

    @Test
    public void testMax() {
        String fileName = "testmax.txt";
        long[] numbers = sumoperation.getList(fileName);
        long maxNumber = sumoperation._max(numbers);
        assertEquals(maxNumber, 7);
    }

    @Test
    public void testSum() {
        String fileName = "testsum.txt";
        long[] numbers = sumoperation.getList(fileName);
        long sumNumber = sumoperation._sum(numbers);
        assertEquals(sumNumber, 28);
    }

    @Test
    public void testMult() {
        String fileName = "testmult.txt";
        long[] numbers = sumoperation.getList(fileName);
        long multNumber = sumoperation._mult(numbers);
        assertEquals(multNumber, 5040);
    }

    @Test
    @Disabled
    public void testTimeout() {
        String fileName = "testMin.txt";
        assertTimeout(ofMillis(200), () -> {
            Thread.sleep(200);
        });
        long[] numbers = sumoperation.getList(fileName);
        long minNumber = sumoperation._min(numbers);
        long maxNumber = sumoperation._max(numbers);
        long sumNumber = sumoperation._sum(numbers);
        long multNumber = sumoperation._mult(numbers);
    }

    @Test
    @Disabled
    public void minandmax() {
        String fileName = "testnimandmax.txt";
        long[] numbers = sumoperation.getList(fileName);
        long sumNumber = sumoperation._min(numbers)  + sumoperation._max(numbers);
        assertEquals(sumNumber, 12);
    }
}