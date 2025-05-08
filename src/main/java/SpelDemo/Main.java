package SpelDemo;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {

    public static void main(String[] args) {

        ExpressionParser parser = new SpelExpressionParser();
        Expression exp = parser.parseExpression(" 'Hello World' ");
        Object obj = exp.getValue();
        System.out.println(obj);
    }
}
