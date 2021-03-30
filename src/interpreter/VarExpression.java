package interpreter;

import java.util.HashMap;

/**
 * @author EricRaww
 * @create 2021-03-28
 * 变量的解释器
 */
public class VarExpression extends Expression {

    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
