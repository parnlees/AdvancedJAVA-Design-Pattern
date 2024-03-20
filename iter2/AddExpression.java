// Non Terminal Expression
package iter2;
public class AddExpression implements Expression{
    private Expression leftExpr;
    private Expression rightExpr;

    public AddExpression(Expression leftExpr, Expression rightExpr) {
        this.leftExpr = leftExpr;
        this.rightExpr = rightExpr;
    }

    @Override
    public int interpret(Context context) {
        return leftExpr.interpret(context) + rightExpr.interpret(context);
    }
}
