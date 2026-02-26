
// Question 1:Given an integer array nums, return true if any value appears at 
// least twice in the array, and return false if every element is distinct

import java.util.*;
public class one {
    public static boolean containsDuplicate(int [] nums){
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
  
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER SIZE OF AN ARRAY");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        boolean result=containsDuplicate(nums);
        System.out.println("contains duplicate:" + result);
        sc.close();
    }
}
