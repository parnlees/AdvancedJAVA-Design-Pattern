public class IncrementExpression implements Expression<Integer>{
    private Expression<Integer> baseExpr;
    
    public IncrementExpression(Expression<Integer> baseExpr) {
        this.baseExpr = baseExpr;
    }
    
    @Override
    public Integer interpret(Context context) {
        return baseExpr.interpret(context) + 1;
    }
}
