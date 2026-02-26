import java.util.*;
public class Majority_elements{
    public static int majorityelements(int [] nums){
        int n=nums.length;
        int majority=-1;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count >n/2){
                return nums[i];
            }
        }
        return majority;
        
        

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("enter size of an array");
        int n=sc.nextInt();
        System.err.println("enter the elements");
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=majorityelements(arr);
        System.err.println("majority elements:"+ result);
        sc.close();
    }
}
