// Non Terminal Expression
package iter3;
public class AddExpression implements Expression{
    private Expression leftExpr;
    private Expression rightExpr;

    public AddExpression(Expression leftExpr, Expression rightExpr) {
        this.leftExpr = leftExpr;
        this.rightExpr = rightExpr;
    }

    @Override
    // return with type Object
    // และเพราะว่าผลลัพธ์ของการบวกสามารถเป็นชนิดใดก็ได้
    // จึงต้อง return ผลลัพธ์เป็น Object
    // แล้วทำการ cast ผลลัพธ์เป็นชนิดที่ต้องการ
    public Object interpret(Context context) {
        return (Integer) leftExpr.interpret(context) + (Integer) rightExpr.interpret(context);
    }
}
