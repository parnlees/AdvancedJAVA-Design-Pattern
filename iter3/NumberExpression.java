// Terminal Expression การที่จะเป็นตัวเลข หรือตัวอักษร หรือตัวอักษรที่มีค่าคงที่
package iter3;
public class NumberExpression implements Expression{
    private int number;
    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public Object interpret(Context context) {
        // ไม่ต้อง (Integer) ก็ได้
        // (Integer) มีค่าเท่ากับ Integer.valueOf(number);
        return Integer.valueOf(number);
        // auto unboxing of java
        // can be done without any compile
    }
}
