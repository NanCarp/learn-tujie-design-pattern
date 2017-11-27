package chapter18_memento;

import chapter18_memento.game.Gamer;
import chapter18_memento.game.Memento;

/**
 * Created by nanca on 11/27/2017.
 */
public class Main {

    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 100; i++) {
            System.out.println("==== " + i);
            System.out.println("当前状态：" + gamer);

            gamer.bet();

            System.out.println("所持金钱为 " + gamer.getMoney() + "元。");
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println();
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                gamer.restoreMemento(memento);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            System.out.println("");
        }
    }

}
