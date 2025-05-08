package SpelDemo;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class MethodInvocation {

    public static void main(String[] args) {

        ExpressionParser parser = new SpelExpressionParser();
        String s = " 'akshay bhogale'.length() ";
        Expression exp = parser.parseExpression(s);
        System.out.println(exp.getValue());

        String s2= " 'akshay bhogale'.toUpperCase() ";
        Expression exp2 = parser.parseExpression(s2);
        System.out.println(exp2.getValue());
    }
}
