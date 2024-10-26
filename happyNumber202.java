import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> seenNumbers = new HashSet<>();

        while (n != 1 && !seenNumbers.contains(n)) {
            seenNumbers.add(n);
            n = getNext(n);
        }

        return n == 1;
    }

    private int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int digit = n % 10;
            totalSum += digit * digit;
            n /= 10;
        }
        return totalSum;
    }

    public static void main(String[] args) {
        HappyNumber happyNumber = new HappyNumber();
        int n = 19;
        System.out.println("Is " + n + " a happy number? " + happyNumber.isHappy(n));
    }
}
