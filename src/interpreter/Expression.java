package interpreter;

import java.util.HashMap;

/**
 * @author EricRaww
 * @create 2021-03-28
 * 抽象类表达式，通过HashMap键值对，可以获取到变量的值
 */
public abstract class Expression {
    public abstract int interpreter(HashMap<String,Integer>var);
}
