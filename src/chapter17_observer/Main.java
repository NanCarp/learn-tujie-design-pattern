package chapter17_observer;

/**
 * Created by nanca on 11/26/2017.
 */
public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        generator.add(observer1);
        generator.add(observer2);
        generator.execute();
    }
}
