package activities;

public class Activity2 {

    public static void main(String[] args){

        int sum = 0;
        int[] array = {10,77,10,54,-11,10};

        for(int i=0;i<array.length;i++){
            if(array[i]==10){
                sum=sum+array[i];
            }
        }

        System.out.println("Value of the Sum is : "+sum);

        if(sum==30){
            System.out.println("sum of all the 10's in the array is exactly 30");
        }
        else{
            System.out.println("sum of all the 10's in the array is NOT exactly 30");
        }
    }
}
