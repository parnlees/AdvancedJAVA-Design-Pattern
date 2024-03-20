// Terminal Expression การที่จะเป็นตัวเลข หรือตัวอักษร หรือตัวอักษรที่มีค่าคงที่
package iter2;
public class NumberExpression implements Expression{
    private int number;
    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret(Context context) {
        return number;
    }
}
