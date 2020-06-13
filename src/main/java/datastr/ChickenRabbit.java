package datastr;
//设鸡有x只
//兔子有y只
//
public class ChickenRabbit {
    public static void main(String[] args) {
        int x,y;
        for( x=0;x<=35;x++){
            y=35-x;
            if(x*2+y*4==94){
                System.out.println("鸡"+x+"只"+" 兔子"+y+"只");
            }
        }
    }
}
