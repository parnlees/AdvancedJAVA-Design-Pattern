// Terminal Expression การที่จะเป็นตัวเลข หรือตัวอักษร หรือตัวอักษรที่มีค่าคงที่
public class BooleanExpression implements Expression<Boolean> {
    private Boolean bool;

    public BooleanExpression(Boolean bool) {
        this.bool = bool;
    }

    @Override
    public Boolean interpret(Context context) {
        // เงื่อนไขนี้คือ ถ้าเป็น reverse ให้ return ค่าตรงข้ามกลับไป
    
        if (context.isReverse() == ContextType.REVERSE) {
            return !bool;
        }
        return bool;
    }
}
