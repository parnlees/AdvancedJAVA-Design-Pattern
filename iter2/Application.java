// Client
package iter2;
public class Application {
    public static void main(String[] args) {
        // Create the expression: (2+3)+4
        Expression expression = new AddExpression(
                new AddExpression( new NumberExpression(2), new NumberExpression(3)),
                new NumberExpression(4));

        // Create the context, if needed
        Context context = new Context();

        // Interpret the expression
        int result = expression.interpret(context);
        System.out.println("Result: " + result); // Output: Result: 9

        // Extend the expression with the "++" 
        // operator: ++(2+3)
        // Create the increment expression: ++(2+3)
        Expression incrementExpression = new IncrementExpression(
                new AddExpression(new NumberExpression(2), new NumberExpression(3)));

        // Create the increment by 1 expression: 10++
        Expression ppExpr = new IncrementExpression(new NumberExpression(10));

        // Create the random number expression: rand.nextINt(6) --> [0,5]
        // 6 ตัว
        Expression randomExpr1 = new RandomExpression(new NumberExpression(6));

        // Create the random number expression: rand.nextInt
        // 3 ถึง 6
        Expression randomExpr2 = new RandomExpression(new NumberExpression(3), new NumberExpression(6));

        System.out.println("Incremented Result1:" + incrementExpression.interpret(context));
        System.out.println("Incremented Result2:" + ppExpr.interpret(context));
        System.out.println("Random result 1: " + randomExpr1.interpret(context)); 
        System.out.println("Random result 2: " + randomExpr2.interpret(context)); 
        }
}