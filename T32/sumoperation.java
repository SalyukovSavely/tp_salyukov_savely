import java.io.*;
import java.util.*;

public class sumoperation {
    public static void main(String[] args) {
        String Name = "testmult.txt";
        long[] numbers = getList(Name);
        System.out.println("Min: " + _min(numbers));
        System.out.println("Max: " + _max(numbers));
        System.out.println("Sum: " + _sum(numbers));
        System.out.println("Mult: " + _mult(numbers));
    }
    public static long[] getList(String fileName) {
        List<Long> numbersList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            if (line != null) {
                String[] numbersString = line.split(" ");
                for (String num : numbersString) {
                    numbersList.add(Long.parseLong(num.trim()));
                }
            }
        } catch (IOException e) {
            System.err.println("ReadFile error: " + e.getMessage());
        }

        long[] numbers = new long[numbersList.size()];
        for (int i = 0; i < numbersList.size(); i++) {
            numbers[i] = numbersList.get(i);
        }
        return numbers;
    }
        
    public static long _min(long[] numbers) {
        long t1 = System.nanoTime();
        long min = Long.MAX_VALUE;
        for (long number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        long t2 = System.nanoTime();
        System.out.println("Time: " + (t2 - t1));
        return min;
    }

    public static long _max(long[] numbers) {
        long t1 = System.nanoTime();
        long max = Long.MIN_VALUE;
        for (long number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        long t2 = System.nanoTime();
        System.out.println("Time: " + (t2 - t1));
        return max;
    }

    public static long _sum(long[] numbers) {
        long t1 = System.nanoTime();
        long sum = 0;
        for (long number : numbers) {
            sum += number;
        }
        long t2 = System.nanoTime();
        System.out.println("Time: " + (t2 - t1));
        return sum;
    }

    public static long _mult(long[] numbers) {
        long t1 = System.nanoTime();
        long mult = 1;
        for (long number : numbers) {
            mult *= number;
        }
        long t2 = System.nanoTime();
        System.out.println("Time: " + (t2 - t1));
        return mult;
    }
}