public class ExcuseLetterStack {
    ExcuseLetter4[] letterStack;
    int top, size;

    public ExcuseLetterStack(int size) {
        this.size = size;
        top = -1;
        letterStack = new ExcuseLetter4[size];
    }

    boolean isFull() {
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    void push (ExcuseLetter4 ltr) {
        if (!isFull()) {
            top++;
            letterStack[top] = ltr;
        } else {
            System.out.println("Stack is already full");
        }
    }

    ExcuseLetter4 pop() {
        if (!isEmpty()) {
            ExcuseLetter4 ltr = letterStack[top];
            top--;
            return ltr;
        } else {
            System.out.println("There is no data in Stack");
            return null;
        }
    }

    ExcuseLetter4 peek() {
        if (!isEmpty()) {
            return letterStack[top];
        } else {
            System.out.println("There is no data in Stack");
            return null;
        }
    }

    ExcuseLetter4 searchLetter(String searchName) {
        for (int i = 0; i <= top; i++) {
            if (letterStack[i].name.equalsIgnoreCase(searchName)) {
                return letterStack[i];
            }
        }
        System.out.println("Letter for name " + searchName + " not found");
        return null;
    }
}
