package iter1;
//คลาสที่ต้องการให้มีการ implement จาก interface Expression

//คลาสที่ต้องรัน

public class Application {
    public static void main(String[] args) {
        // Create the expression: (2 + 3) + 4
        // เรียกใช้งาน AddExpression โดยที่ leftExpr จะเป็น 2 และ rightExpr จะเป็น 3
        // และเอาผลลัพธ์ที่ได้มาบวกกับ 4
        Expression expression = new AddExpression(
                new AddExpression(new NumberExpression(2), new NumberExpression(3)),
                new NumberExpression(4));
        // Create the context, if needed
        // สร้าง context ขึ้นมา
        // โดยที่ context จะเป็นตัวแปรที่เก็บค่าตัวเลขที่ต้องการบวกกัน
        Context context = new Context();
        // Interpret the expression
        // โดยที่ตัวแปรนี้จะถูกส่งไปให้ interpret ของ AddExpression
        // และ interpret ของ NumberExpression ที่คลาสมีการ implement จาก interface
        // Expression กัน
        // โดยที่ interpret ของ AddExpression จะเป็นการบวกของ leftExpr กับ rightExpr
        // ซึ่ง leftExpr และ rightExpr จะเป็นตัวเลขที่ต้องการบวกกัน
        // และ interpret ของ NumberExpression จะเป็นการ return ค่าตัวเลขที่ต้องการบวกกัน

        // result คือ ผลลัพธ์ที่ได้จากการ interpret ของ AddExpression
        int result = expression.interpret(context);
        System.out.println("Result: " + result); // Output: Result: 9
    }
}
