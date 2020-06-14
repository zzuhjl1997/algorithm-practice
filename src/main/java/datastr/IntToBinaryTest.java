package datastr;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.*;
import java.util.stream.Collectors;


public class IntToBinaryTest {
    /**
     * 将输入的十进制数字转换为对应的二进制字符串和十六进制字符串
     *
     * @param number string字符串 十进制数字字符串
     * @return string字符串
     */
    public static String changeFormatNumber(String number) {
        Scanner in = new Scanner(System.in);
        //十进制转二进制
        String a = Integer.toBinaryString(in.nextInt());
        //十进制转16进制
        String b = Integer.toHexString(in.nextInt()).toUpperCase();
        try {
            System.out.println(in.nextInt());
        } catch (InputMismatchException ie) {
            System.out.println("IPUTERROR" + "输出输入非法");
        }
        List<String> aneed = new ArrayList<String>();
        List<String> bneed = new ArrayList<String>();


        if (a.length() <= 16 && a.length() >= 4) {
            int c = 16 - a.length();
            for (int i = 1; i <= c; i++) {
                aneed.add("0");
            }
            for (String s : aneed) {
                System.out.println(s);
            }
        } else if (a.length() >= 16) {
            a.substring(0, 16);
        }

        a = aneed.toString() + a;
        if (b.length() < 4) {
            int c = 16 - b.length();
            for (int i = 1; i <= c; i++) {
                bneed.add("0");
            }
            for (String s : bneed) {
                System.out.println(s);
            }
        } else if (b.length() >= 4) {
            b.substring(0, 4);
        }

        b = bneed.toString() + b;
        String res = a + "," + b;
//        res[0]=a;
//        res[1]=b;

        return res;
    }

    // write code here
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String res = null;
        try {
            int input = in.nextInt();
            //十进制转二进制
            String a = Integer.toBinaryString(input);
            //十进制转16进制
            String b = Integer.toHexString(input).toUpperCase();
            List<String> aneed = new ArrayList<String>();
            List<String> bneed = new ArrayList<String>();


            if (a.length() <= 16 && a.length() >= 4) {
                int c = 16 - a.length();
                for (int i = 1; i <= c; i++) {
                    aneed.add("0");
                }
           /* for (String s : aneed) {
                System.out.println(s);
            }*/

                String a1 = aneed.stream().collect(Collectors.joining());
                a = a1 + a;
            } else if (a.length() > 16) {
                a = a.substring(0, 16);
            }
            if (b.length() <= 4) {
                int c = 4 - b.length();
                for (int i = 1; i <= c; i++) {
                    bneed.add("0");
                }
           /* for (String s : bneed) {
                System.out.println(s);
            }*/

                String b1 = bneed.stream().collect(Collectors.joining());
                b = b1 + b;
            } else if (b.length() > 4) {
                b = b.substring(0, 4);
            }
            res = a + "," + b;
//        res[0]=a;
//        res[1]=b;
        } catch (InputMismatchException ie) {
            System.out.println("IPUTERROR" + "输出输入非法");
        }
        System.out.println(res);

    }


}