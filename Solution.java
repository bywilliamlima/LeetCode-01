import java.util.Scanner;

public class Solution {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int a = 0, b = 1, result = 0;

       
        for (int i = 2; i <= n; i++) {
            result = a + b; 
            a = b;         
            b = result;    
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número para calcular F(n): ");
        int n = scanner.nextInt(); 
        
        Solution solution = new Solution();
        
        System.out.println("F(" + n + ") = " + solution.fib(n));
        
        scanner.close(); 
    }
}