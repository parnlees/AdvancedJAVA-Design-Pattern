package iter1;
// Abstract Expression
interface Expression {
    // interpret คือ method ที่จะถูก implement ขึ้นมาในคลาสที่ implement จาก interface Expression
    // โดยที่ method นี้จะรับค่า context และ return ค่าเป็นผลลัพธ์ที่ต้องการ
    int interpret(Context context);
}
