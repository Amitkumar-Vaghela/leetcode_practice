import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer> stack = new ArrayList<>();

        for (int a : asteroids) {
            while (!stack.isEmpty() && a < 0 && stack.get(stack.size() - 1) > 0) {
                int last = stack.get(stack.size() - 1);

                if (last < -a) { // last smaller → remove it, check again
                    stack.remove(stack.size() - 1);
                    continue;
                }
                if (last == -a) { // same size → remove last
                    stack.remove(stack.size() - 1);
                }
                a = 0; // current destroyed
                break;
            }
            if (a != 0) stack.add(a);
        }

        // Convert to array
        int[] res = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) res[i] = stack.get(i);
        return res;
    }


public class Main {
    public static void main(String[] args) {
        AsteroidCollision ac = new AsteroidCollision();
        
        int[] asteroids1 = {5, 10, -5};
        System.out.println(Arrays.toString(ac.asteroidCollision(asteroids1))); // [5, 10]
        
        int[] asteroids2 = {8, -8};
        System.out.println(Arrays.toString(ac.asteroidCollision(asteroids2))); // []
        
        int[] asteroids3 = {10, 2, -5};
        System.out.println(Arrays.toString(ac.asteroidCollision(asteroids3))); // [10]
    }
}

}
