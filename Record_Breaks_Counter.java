import java.util.*;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     // number of the games
     int n = sc.nextInt();
     int [] score = new int[n];
     
     // read all the score
     for (int i = 0; i<n; i++){
       score[i] = sc.nextInt();
     }
     
     int min = score[0];
     int max = score[0];
     int minCount = 0;
     int maxCount = 0;
     
     for(int i = 1; i<n; i++){
       if(score[i] > max){
         max = score[i];
         maxCount++;
       }
       else if(score[i] < min){
         min = score[i];
         minCount++;
       }
     }
    
    System.out.println(maxCount + " " + minCount);
     
  }
}

// input

// Example 1:
// Input
// 9
// 10 5 20 20 4 5 2 25 1

// Output
// 2 4

// Example 2:
// Input
// 10
// 3 4 21 36 10 28 35 5 24 42

// Output
// 4 0

// Example 3:
// Input
// 9
// 10 5 20 20 4 5 2 25 1

// Output
// 2 4
