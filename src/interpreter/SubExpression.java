package interpreter;

import java.util.HashMap;

/**
 * @author EricRaww
 * @create 2021-03-29
 */
public class SubExpression extends SymbolExpression {
    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var)-super.right.interpreter(var);
    }


}
