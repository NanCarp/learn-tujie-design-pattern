package chapter20_flyweight;

import java.util.HashMap;

/**
 * Created by nanca on 11/29/2017.
 */
public class BigCharFactory {
    // 管理应生成的 BigChar 实例
    private HashMap pool = new HashMap();
    // Singleton 模式
    private static BigCharFactory singleton = new BigCharFactory();

    // 构造函数
    private BigCharFactory() {

    }

    // 获取唯一的实例
    public static BigCharFactory getInstance() {
        return singleton;
    }

    // 生成（共享）BigChar 类的实例
    public synchronized BigChar getBigChar(char charname) {
        BigChar bc = (BigChar) pool.get("" + charname);
        if (bc == null) {
            bc = new BigChar(charname); // 生成 BigChar 实例
            pool.put("" + charname, bc);
        }
        return bc;
    }
}
