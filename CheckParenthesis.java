package org.itstep;

import java.util.Stack;

//Используется стек для проверки выражения, содержащего скобки
public class CheckParenthesis {
    public static void main(String[] args) {
        String parenthesis = "(){}[]";
        //String s = "(1*[2+3]);"; //Правильное выражение
        //String s = "2+3]);"; //Только закрывающие скобки
        String s = "[(2+3]);"; //Несоответствующие скобки
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = parenthesis.indexOf(c);
            if (index != -1)
                if (index % 2 == 0)
                stack.push((Character) c);
                else {
                    if (stack.empty()) {
                        System.out.println("Ошибка в позиции "+i);
                        break;
                    }
                    char c2 = stack.peek();
                    int index2 = parenthesis.indexOf(c2);
                    if (index-index2==1)
                        stack.pop();
                    else  System.out.println("Ошибка в позиции "+i);
                }
        }
        int count = s.length()-1;
        if (!stack.empty()) System.out.println("Ошибка в позиции "+count);
    }
}
