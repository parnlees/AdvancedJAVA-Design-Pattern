package iter2;
public class IncrementExpression implements Expression{
    private Expression baseExpr;
    
    public IncrementExpression(Expression baseExpr) {
        this.baseExpr = baseExpr;
    }
    
    @Override
    public int interpret(Context context) {
        // Increment the value of the operand by 1
        return baseExpr.interpret(context) + 1;
    }
}
