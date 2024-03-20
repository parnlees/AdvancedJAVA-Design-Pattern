public interface Expression<T> {
    // ใส่ T เพื่อให้สามารถ return ค่าได้ทุกชนิด
    // ใส่ T ใน interpret(Context context) แทนการใส่ Object
    // ไม่ต้องใส่ type ตอน return แล้ว
    T interpret(Context context);
}
