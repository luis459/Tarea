import java.util.Scanner;
public class nPrimos{
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
        int a=0,n;
        boolean Primo;

	System.out.println("\ningrese un numero: ");
	n=sc.nextInt();

        for (int i = 1; i <=n; i++) {
            Primo = true;

            for (int j = 2; j <= Math.sqrt(i) && Primo; j++) {
                if (i % j == 0) {
                    Primo = false;
                }
            }

            if (Primo) {
                System.out.println(i);
            }
        }
	
    }
}