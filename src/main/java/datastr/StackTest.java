package datastr;

import java.awt.image.SampleModel;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
//        String s={"5+","4","*","6","/","2","+","3","+","(","4","*","5",")""/""5"};
//        System.out.println(convert(s));
//
//        String[] a=convert(s);
//        for (String s1 : a) {
//            System.out.print(s1);
//        }


    }


    public static int level(Character c) {
        if ("(".indexOf(c) > -1) {
            return 3;
        } else if (("/*").indexOf(c) > -1) {
            return 2;
        } else if ("+-".indexOf(c) > -1) {
            return 1;
        } else if (")".indexOf(c) > -1) {
            return 0;
        }
        return -1;
    }

    public static String[] convert(String ss) {
        Stack<Character> stack = new Stack<Character>();
        List<Character> res = new ArrayList<Character>();
        //进行判断
        for (int i = 0; i < ss.length(); i++) {
            Character c = ss.charAt(i);
            if (level(c) == -1) {
                res.add(c);
            } else {
                if (stack.isEmpty()) {
                    stack.push(c);
                } else {
                    if (level(c) > level(stack.peek())) {
                        stack.push(c);
                    } else {
                        if (level(stack.peek()) == 3) {
                            if (level(c) != 0) {
                                stack.push(c);
                            } else {

                            }
                        } else {
                            if (level(c) == 0) {
                                while (level(stack.peek()) != 3) {
                                    res.add(stack.pop());
                                }
                                if (level(stack.peek()) == 3) {
                                    stack.pop();
                                }


                            } else if (level(c) != 0) {
                                res.add(stack.pop());
                                while (!stack.isEmpty() && level(stack.peek()) >= level(c) && level(c) != 3) {
                                    res.add(stack.pop());
                                }
                                stack.push(c);
                            }
                        }
                    }

                }
            }



        }


        while (!stack.isEmpty()){
            res.add(stack.pop());
        }
        String[] strings=new String[res.size()];

        for(int i=0;i<res.size();i++){
            strings[i]=res.get(i).toString();

        }
        return strings ;
    }
}
