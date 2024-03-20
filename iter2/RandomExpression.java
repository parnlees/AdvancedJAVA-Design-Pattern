package iter2;
import java.util.Random;

public class RandomExpression implements Expression {
    private Expression lowerBound;
    private Expression upperBound;

    // method 1
    public RandomExpression(Expression lowerBound, Expression upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    // 2
    public RandomExpression(Expression upperBound){
        this(new NumberExpression(0), upperBound);
    }

    // 3
    public RandomExpression() {
        this(new NumberExpression(0),
        new NumberExpression(Integer.MAX_VALUE));
    }

    @Override
    // return ค่าตัวเลขที่อยู่ในช่วงระหว่าง lowerBound ถึง upperBound
    // ไปให้ interpret ของ NumberExpression
    public int interpret(Context context) {
        // สร้าง random object
        // สร้างตัวแปร rand และให้มันเป็น random object
        // สร้างตัวแปร baseValue และให้มันเรียก interpret ของ lowerBound
        // ทำไมต้องเป็น lowerbound ไม่ใช่ upperbound
        // ต้องเป็น lowerbound เพราะว่าเราต้องการให้ random ออกมาเป็นตัวเลขที่อยู่ในช่วงระหว่าง
        // ตัวเลขที่ interpret จาก lowerbound ถึง upperbound
        // และเราต้องการให้ random ออกมาเป็นตัวเลขที่อยู่ในช่วงระหว่าง
        // 0 ถึง upperbound.interpret(context) - baseValue
        Random rand = new Random();
        int baseValue = lowerBound.interpret(context);

        // rand.nextInt(upperBound.interpret(context) - baseValue) คือการสุ่มตัวเลข
        // โดยที่ตัวเลขที่สุ่มจะอยู่ในช่วงระหว่าง 0 ถึง upperBound.interpret(context) - baseValue
        return baseValue + rand.nextInt(upperBound.interpret(context) - baseValue);
    }
}
