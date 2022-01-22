/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interviewq3;

/**
 *
 * @author iloveirene
 */
import java.util.*;

public class InterviewQ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[] = new int[] {0,1,2,3,4,5,6,7,8,9};
        int arr1[] = new int[5];
        int arr2[] = new int[5];
        int num1=0;
        int sum1=0;
        int sum2=0;
        for(int i = 0 ; i < 10 ; i++){
        if(arr[i] % 2 != 0){
        arr1[num1]=arr[i];//存放奇數陣列
        sum1+=arr[i];
        num1+=1;
        }
        else {
        arr2[num1]=arr[i];//存放偶數陣列
        sum2+=arr[i];
        }
        }
        System.out.println(sum1-sum2);
    }
    
}
