import java.util.Scanner;
class GetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  the n  number:");
        int n = sc.nextInt();
        System.out.println("enter the i number:");
        int i = sc.nextInt();
        int bitmask=1<<i;
        if ((n & bitmask) != 0) {
            System.out.println("3rd bit is 1");
        } else {
            System.out.println("3rd bit is 0");
        }
        sc.close();
    }
}