import java.util.HashSet;
import java.util.Scanner;

public class D01P04_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int N = scanner.nextInt();
     
     HashSet<Integer> set = new HashSet<>();
     
        int firstRepeatingIndex = -1;

        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            if (!set.add(num)) { 
                firstRepeatingIndex = i;
                break;
            }
        }
    
        if (firstRepeatingIndex != -1) {
            System.out.println(firstRepeatingIndex);
        } else {
            System.out.println("No repeating element found.");
        }

        scanner.close();
    }
}
