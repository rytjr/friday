import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[][] list = new int[100][100];

        int sum = num*100;

        for(int i = 0; i < num; i++) {
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();

            for(int a = num2; a < num2+10; a++) {
                for ( int s = num3; s < num3+10; s++) {
                    ++list[a][s];
                }
            }

            for(int a = num2; a < num2+10; a++) {
                for ( int s = num3; s < num3+10; s++) {
                    if(list[a][s] >=2) {
                        --sum;
                    }
                }
            }
        }
        System.out.print(sum);
    }
}