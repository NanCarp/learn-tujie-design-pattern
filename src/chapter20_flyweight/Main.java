package chapter20_flyweight;

/**
 * Created by nanca on 11/29/2017.
 */
public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Main dgits");
            System.out.println("Example: java Main 1212123");
            System.exit(0);
        }

        BigString bs = new BigString(args[0]);
        bs.print();
    }
}
