import java.util.Stack;

public class parentheses {
    public static void main(String[] args) {

        String s = "(}})";

        System.out.println(new parentheses().isValid(s));
    }

    public boolean isValid(String s) {

        if(s.length()%2!=0){
            return false;
        }

        Stack<Character> stack = new Stack<>();

        char[] chars = s.toCharArray();

        for(char c: chars){
        if(c == '(' || c == '[' || c == '{'){
            stack.push(c);
        }else if((c == ')' && !stack.isEmpty() && stack.peek() == '(') || (c == ']' && !stack.isEmpty() && stack.peek() == '[') || (c == '}' && !stack.isEmpty() && stack.peek() == '{')){
            stack.pop();
        }else{
            return false;
        }
        }

        return stack.empty();
    }
}
