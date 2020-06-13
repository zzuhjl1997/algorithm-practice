package datastr;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class StringTest {
    /**
     * 递归反转字符串
     *
     * @param str
     * @return
     */
    private static String reverseStr(String str, int end) {

        if (end == 0) {
            return "" + str.charAt(0);
        }
        return str.charAt(end) + reverseStr(str, end - 1);
    }

    public static void main(String[] args) {
        System.out.println(reverseStr("asdh", 3));
    }

}
