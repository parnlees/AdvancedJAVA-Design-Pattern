package iter1;
// บรรทัด 3-9 เป็นสิ่งที่ต้องมีเป็นปกติทุกคลาส
public class AddExpression implements Expression {
    private Expression leftExpr;
    private Expression rightExpr;

    public AddExpression(Expression leftExpr, Expression rightExpr) {
        this.leftExpr = leftExpr;
        this.rightExpr = rightExpr;
    }
// การ implement ของ interpret จะเป็นการบวกของ leftExpr กับ rightExpr
// ซึ่ง leftExpr และ rightExpr จะเป็นตัวเลขที่ต้องการบวกกัน
// การ override คือการเขียนทับ เป็นการเขียนทับของ method interpret จาก interface Expression
// โดยที่ method interpret จะรับค่า context และ return ค่าเป็นผลบวกของ leftExpr กับ rightExpr
// โดยที่ leftExpr และ rightExpr จะเป็นตัวเลขที่ต้องการบวกกัน
    @Override
    // return with type int
    public int interpret(Context context) {
        // return the sum of left expression and right expression
        return leftExpr.interpret(context) + rightExpr.interpret(context);
    }
}
