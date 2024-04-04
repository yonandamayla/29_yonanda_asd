public class Postfix29 {
    int top;
    char[] stack;

    public Postfix29(int total) {
        top = -1;
        stack = new char[total];
        push('(');
    }

    public void push(char c) {
        top++;
        stack[top] = c;
    }

    public char pop() {
        char item = stack[top];
        top--;
        return item;
    }

    public boolean isOperand(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '.' || c == ' ';
    }

    public boolean isOperator(char c) {
        return c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+';
    }

    public int derajat(char c) {
        switch (c) {
            case '^':
                return 3;
            case '%':
            case '/':
            case '*':
                return 2;
            case '-':
            case '+':
                return 1;
            default:
                return 0;
        }
    }

    public String konversi(String Q) {
        String P = "";
        char c;
        for (int i = 0; i < Q.length(); i++) {
            c = Q.charAt(i);
            if (isOperand(c)) {
                P += c;
            } else if (c == '(') {
                push(c);
            } else if (c == ')') {
                while (stack[top] != '(') {
                    P += pop();
                }
                pop(); // Pop '('
            } else if (isOperator(c)) {
                while (top != -1 && derajat(stack[top]) >= derajat(c) && stack[top] != '(') {
                    P += pop();
                }
                push(c);
            }
        }

        while (top != -1) {
            if (stack[top] == '(') {
                top--; // Remove '('
            } else {
                P += pop();
            }
        }
        return P;
    }
}
