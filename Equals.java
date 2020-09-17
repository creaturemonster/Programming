public class Equals {
    public static boolean eq(int[] a, int[] b) {

        int N = a.length;
        int M = b.length;

        boolean result = true;
        if(M != N)
            return false;

        for(int i = 0; i<M;i++)
            if(a[i] != b[i])
                return false;

        return result;

    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int[] N = new int[args.length];
        int[] M = new int[args.length];
        for (int i = 0; i < a; i++) {
            M = new int[i];
            N = new int[i];
        }
        System.out.print(eq(N, M));
        System.out.println();
    }
}