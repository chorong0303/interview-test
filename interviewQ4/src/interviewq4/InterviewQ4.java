/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interviewq4;

/**
 *
 * @author iloveirene
 */
public class InterviewQ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int test[]={77,5,5,22,13,55,97,4,796,1,0,9};

          for(int i=0;i<test.length;i++)
          {
            for(int j = 1;j < test.length-i;j++){
                if(test[j-1]>test[j])
                {
                 int temp=test[j-1];
                 test[j-1]=test[j];
                 test[j]=temp;
                }
            }           
          }

          for(int i=0;i<test.length;i++)
          {
           System.out.print(test[i]+" ");}
    }
    
}
