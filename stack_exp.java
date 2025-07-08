import java.util.*;

public class stack_exp {
    public static int PostfixEvaluation(String s) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else if ("+-*/^".indexOf(ch) != -1) {
                int pop1 = stack.pop();
                int pop2 = stack.pop();
                switch (ch) {
                    case '+': stack.push(pop2 + pop1); break;
                    case '-': stack.push(pop2 - pop1); break;
                    case '*': stack.push(pop2 * pop1); break;
                    case '/': stack.push(pop2 / pop1); break;
                    case '^': stack.push((int) Math.pow(pop2, pop1)); break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String s = "23*54*+";
        System.out.println("Postfix Evaluation: " + PostfixEvaluation(s));  
    }
}
