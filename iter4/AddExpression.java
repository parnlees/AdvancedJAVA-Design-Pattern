// Non Terminal Expression
public class AddExpression implements Expression<Integer>{
    // Expression<Integer> ใส่เพราะว่าเป็นการ return ค่าเป็น Integer
    private Expression<Integer> leftExpr;
    private Expression<Integer> rightExpr;

    public AddExpression(Expression<Integer> leftExpr, Expression<Integer> rightExpr) {
        this.leftExpr = leftExpr;
        this.rightExpr = rightExpr;
    }

    @Override
    public Integer interpret(Context context) {
        // ไม่ต้องใส่ (Integer) แล้ว
        return leftExpr.interpret(context) + rightExpr.interpret(context);
    }
}
