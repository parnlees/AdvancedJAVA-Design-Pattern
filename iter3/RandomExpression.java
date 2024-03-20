package iter3;
import java.util.Random;

public class RandomExpression implements Expression {
    private Expression lowerBound;
    private Expression upperBound;

    public RandomExpression(Expression lowerBound, Expression UpperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public RandomExpression(Expression upperBound) {
        this.upperBound = upperBound;
        this.lowerBound = new NumberExpression(0);
    }

    public RandomExpression() {
        this.upperBound = new NumberExpression(0);
        this.lowerBound = new NumberExpression(Integer.MAX_VALUE);
    }

    @Override
    public Object interpret(Context context) {
        return new Random().nextInt((Integer) upperBound.interpret(context) - (Integer) lowerBound.interpret(context));
    }
}
