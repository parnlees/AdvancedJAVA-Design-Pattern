package iter3;
public class IncrementExpression implements Expression{
    private Expression baseExpr;
    
    public IncrementExpression(Expression baseExpr) {
        this.baseExpr = baseExpr;
    }
    
    @Override
    public Object interpret(Context context) {
        return (Integer) baseExpr.interpret(context) + 1;
    }
}
