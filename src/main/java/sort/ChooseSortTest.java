package sort;

public class ChooseSortTest {

    private static void chooseSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            //从未排序的的部分里拿出最小值
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] a={4,7,2,9,6};
//        System.out.println(chooseSort(a));
        chooseSort(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
