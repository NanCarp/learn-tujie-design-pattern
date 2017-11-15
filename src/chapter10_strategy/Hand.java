package chapter10_strategy;

/**
 * Created by nanca on 11/15/2017.
 */
public class Hand {
    public static final int HANDVALUE_GUU = 0; // 石头
    public static final int HANDVALUE_CHO = 1; // 剪刀
    public static final int HANDVALUE_PAA = 2; // 布

    public static final Hand[] hand = {
            new Hand(HANDVALUE_GUU),
            new Hand(HANDVALUE_CHO),
            new Hand(HANDVALUE_PAA)
    };

    private static final String[] name = {
            "石头","剪刀","布"
    };

    private int handvalue; // 猜拳中出的手势值

    private Hand(int handvalue) {
        this.handvalue = handvalue;
    }

    public static Hand getHand(int handvalue) { // 根据手势的值获取其对应的实例
        return hand[handvalue];
    }

    public boolean isStrongerThan(Hand h) { // 如果 this 胜了 h 则返回 true
        return fight(h) == 1;
    }

    public boolean isWeakerThan(Hand h) {  // 如果 this 输给了 h 则返回 true
        return fight(h) == -1;
    }

    private int fight(Hand h) {
        if (this == h) {
            return 0;
        } else if ((this.handvalue + 1) % 3 == h.handvalue) {
            return 1;
        } else {
            return -1;
        }
    }

    public String toString() {
        return name[handvalue];
    }
}
