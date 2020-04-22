public class ClimbStairs {


    static int count(int n) {
        if (n <= 2) {
            return n;
        }
        return count(n - 1) + count(n - 2);
    }

    static int count2(int n) {

        if (n <= 2) {
            return n;
        }
        int a = 1, b = 2, temp = 0; //用于累加f(b) = f(n-1) + f(b-2);

        for (int i = 3; i <= n; i++) {
            temp = b;
            b = a + b;
            a = temp;
        }

        return b;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            System.out.println("当楼梯数为 " + i + " 时，有 " + count(i) + " " + count2(i) + " 总爬法");
        }
    }

}
