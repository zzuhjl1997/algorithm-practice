package sort;

public class BubbleSortTest {
    private static  int[] bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
             for (int j=i+1;j<arr.length;j++){
                 if(arr[i]>arr[j]){
                     int temp=arr[i];
                     arr[i]=arr[j];
                     arr[j]=temp;
                 }
             }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] a={2,3,7,8,4,9,0};
        System.out.println(bubbleSort(a));
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
