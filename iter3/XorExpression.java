package iter3;
public class XorExpression implements Expression{
    private Expression leftExpr;
    private Expression rightExpr;

    public XorExpression(Expression  leftExpr, Expression rightExpr) {
        this.leftExpr = leftExpr;
        this.rightExpr = rightExpr;
    }

    @Override
    public Object interpret(Context context) {
        // making convenient use of the bitwise XOR operator (^) here
        return ((Boolean) leftExpr.interpret(context)) ^ ((Boolean) rightExpr.interpret(context));
        // right.interpret(context)) == 1 ? 1 : 0;
    }
}
