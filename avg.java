import java.util.Scanner;
class Codechef
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        for (int i = 0; i < t; i++) {
            int A = read.nextInt();
            int C = read.nextInt();
            if (A % 2 == 0 && C % 2 == 0) {
                int B = (A + C) / 2;
                System.out.println(B);
            }
            else if (A % 2 != 0 && C % 2 != 0) {
                int B = (A + C) / 2;
                System.out.println(B);
            }
            else {
                System.out.println(-1);
            }
        }
    }
}
