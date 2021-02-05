package day01;

public class Array {
    int[] arr={12,36,81,4,96,22};
    int maxArr=arr[0];
    int minArr=arr[0];
    public void getArr() {
        for(int i : arr ){
            System.out.println(i);
            if (i > maxArr) {
                maxArr = i;
            }
            if (i < minArr){
                minArr = i;
            }
        }
    }
    public void maxArr(){
        System.out.println(maxArr);
    }
    public void minArr(){
        System.out.println(minArr);
    }
}
