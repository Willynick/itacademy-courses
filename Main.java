import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        int x = 5 + 5;
        int y = 6;

        int resultNum = num % 2 == 0 ? x : y;

        System.out.println(resultNum);
    }
}
