package iter3;

// Abstract Expression
interface Expression {
    // เพราะมีการเพิ่ม method ที่ไม่ใช่แค่ int เข้ามา
    // จึงต้องเปลี่ยนจาก int เป็น Object
    // และเพราะว่าผลลัพธ์ของการ interpret สามารถเป็นชนิดใดก็ได้
    Object interpret(Context context);
}

