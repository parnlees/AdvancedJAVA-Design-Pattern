import java.util.Random;

public class RandomExpression implements Expression<Integer> {
    private Expression<Integer> left;
    private Expression<Integer> right;

    public RandomExpression(Expression<Integer> left, Expression<Integer> right) {
        this.left = left;
        this.right = right;
    }

    public RandomExpression(Expression<Integer> right) {
        this.right = right;
        this.left = new NumberExpression(0);
    }

    public RandomExpression() {
        this(new NumberExpression(0), new NumberExpression(Integer.MAX_VALUE));
    }

    @Override
    public Integer interpret(Context context) {
        Random rand = new Random();
        int leftValue = left.interpret(context);
        int rightValue = right.interpret(context);
        int minValue = Math.min(leftValue, rightValue);
        int maxValue = Math.max(leftValue, rightValue);

        return minValue + rand.nextInt(maxValue - minValue);
    }
}
