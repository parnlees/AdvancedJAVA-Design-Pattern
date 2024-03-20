package iter1;
// context class คือ class ที่เก็บข้อมูลที่ต้องการส่งไปให้ interpret ของ AddExpression
// โดยที่ interpret ของ AddExpression จะเป็นการบวกของ leftExpr กับ rightExpr
// ซึ่ง leftExpr และ rightExpr จะเป็นตัวเลขที่ต้องการบวกกัน
// และส่งไปให้ interpret ของ NumberExpression จะเป็นการ return ค่าตัวเลขที่ต้องการบวกกัน
class Context {
    // รับค่าตัวเลขที่ต้องการบวกกัน
    // และส่งต่อไปให้ interpret ของ NumberExpression
    // และ interpret ของ AddExpression
}
