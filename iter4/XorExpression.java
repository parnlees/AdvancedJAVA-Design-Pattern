public class XorExpression implements Expression<Boolean>{
    private Expression<Boolean> leftExpr;
    private Expression<Boolean> rightExpr;

    public XorExpression(Expression<Boolean> leftExpr, Expression<Boolean> rightExpr) {
        this.leftExpr = leftExpr;
        this.rightExpr = rightExpr;
    }

    @Override
    public Boolean interpret(Context context) {
        // making convenient use of the bitwise XOR operator (^) here
        return (leftExpr.interpret(context)) ^ (rightExpr.interpret(context));
        // right.interpret(context)) == 1 ? 1 : 0;
    }
}
