// Client
public class Application {
    public static void main(String[] args) {
        // Create the expression: (2+3)+4
        Expression<Integer> addExpr = new AddExpression(
                new AddExpression(new NumberExpression(2), new NumberExpression(3)),
                new NumberExpression(4)) ;

        // Create the increment by 1 expression: 10++
        Expression<Integer> ppExpr = new IncrementExpression(new NumberExpression(10));
        // Create the random number expression: rand.nextINt(6) --> [0,5]
        Expression<Integer> randomExpr1 = new RandomExpression(new NumberExpression(6));
        // Create the random number expression: rand.nextInt(3,6) --> [3,5]
        Expression<Integer> randomExpr2 = new RandomExpression(new NumberExpression(3), new NumberExpression(6));
        // Create the xor expression: (1^0) ^ (0^1)
        Expression<Boolean> XorExpr = new XorExpression(
                new XorExpression(
                new BooleanExpression(true), new BooleanExpression(false)),
                new XorExpression(new BooleanExpression(false), new BooleanExpression(true)));
        
        // Create the context, if needed
        Context context = new Context();
        // Intepret the expression
        System.out.println("Add result: " + addExpr.interpret(context)); // Output: Add result:9
        System.out.println("Increment result: " + ppExpr.interpret(context)); // Output: Increment result: 6
        System.out.println("Random result 1: " + randomExpr1.interpret(context)); // Output --> [0,5]
        System.out.println("Random result 2: " + randomExpr2.interpret(context)); // Output --> [3,5]
        System.out.println("XOR result: " + XorExpr.interpret(context)); // Output: XOR result: false

        System.out.println();

        Context contextR = new Context(ContextType.REVERSE);
        System.out.println("Add result: " + addExpr.interpret(contextR)); // Output: Add result:9
        System.out.println("Increment result: " + ppExpr.interpret(contextR)); // Output: Increment result: 6
        System.out.println("Random result 1: " + randomExpr1.interpret(contextR)); // Output --> [0,5]
        System.out.println("Random result 2: " + randomExpr2.interpret(contextR)); // Output --> [3,5]
        System.out.println("XOR result: " + XorExpr.interpret(contextR)); // Output: XOR result: false
    }
}