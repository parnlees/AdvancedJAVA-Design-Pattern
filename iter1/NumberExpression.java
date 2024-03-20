package iter1;
//Terminal Expression

public class NumberExpression implements Expression {
    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret(Context context) {
        // return ตัวเลขที่ต้องการบวกกัน
        // โดยที่ตัวแปรนี้จะถูกส่งไปให้ interpret ของ AddExpression
        return number;
    }
}
