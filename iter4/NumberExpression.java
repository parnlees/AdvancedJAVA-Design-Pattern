// Terminal Expression การที่จะเป็นตัวเลข หรือตัวอักษร หรือตัวอักษรที่มีค่าคงที่
public class NumberExpression implements Expression<Integer> {
    private Integer number;

    public NumberExpression(Integer number) {
        this.number = number;
    }

    @Override
    public Integer interpret(Context context) {
        if (context.isReverse() == ContextType.REVERSE) {
            return number * (-1);
        }
        return number;
        // auto unboxing of java
        // can be done without any compile
    }
}
