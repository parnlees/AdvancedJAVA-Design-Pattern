package iter3;
// Terminal Expression การที่จะเป็นตัวเลข หรือตัวอักษร หรือตัวอักษรที่มีค่าคงที่
public class BooleanExpression implements Expression{
    // ไม่ได้ private Expression จึงไม่มีลูกศร
    // หัวเพชร และ -> 
    private boolean bool;

    public BooleanExpression(boolean bool) {
        this.bool = bool;
    }

    @Override
    public Object interpret(Context context) {
        // return the boolean value
        // และเพราะว่าผลลัพธ์ของการ interpret สามารถเป็นชนิดใดก็ได้
        // จึงต้อง return ผลลัพธ์เป็น Object
        return Boolean.valueOf(bool);
    }
}
