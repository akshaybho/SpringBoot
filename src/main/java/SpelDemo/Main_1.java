package SpelDemo;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class Main_1 {

    public static void main(String[] args) {

       /* ExpressionParser parser = new SpelExpressionParser();
        Expression exp = parser.parseExpression(" 10+20 ");
        Object obj = exp.getValue();
        System.out.println(obj);*/

        // '10+20' Output ----> 10+20
        // 10+20   Output ----> 30

        ExpressionParser parser = new SpelExpressionParser();
        EvaluationContext context = new StandardEvaluationContext();
        context.setVariable("no1", 100);
        context.setVariable("no2", 200);

        Expression exp = parser.parseExpression(" #no1 + #no2 ");
        Object obj = exp.getValue(context);
        System.out.println(obj);

    }
}
