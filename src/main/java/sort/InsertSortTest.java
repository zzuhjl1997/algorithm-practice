package sort;

public class InsertSortTest {
    /**
     * 直接插入
     *
     * @param arr
     */
    private static void insertSort(int[] arr) {
        //已排序列表下标
        int j;
        //待排序元素
        int t;
        for (int i = 1; i <arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                //赋值给待排序元素
                t = arr[i];
                for (j = i - 1; j >= 0 && arr[j] > t; j--) {
                    //从后往前遍历已排序数组，如果已排序元素较大，则将他后裔
                    arr[j + 1] = arr[j];
                }
                arr[j + 1] = t;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 5, 8, 2, 9, 1};
        insertSort(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
