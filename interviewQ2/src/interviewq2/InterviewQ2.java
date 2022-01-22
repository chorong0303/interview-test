/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interviewq2;

/**
 *
 * @author iloveirene
 */
public class InterviewQ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String context = "人易科技:上 機 測 驗 - 演算法";
        String newString1 = context.replace(":", "：");
        System.out.println(newString1);

        String context1 = "人易科技:上 機 測 驗 - 演算法";
        String context2 = "";
        String[] newStr = context1.split(" ");
        for (int i = 0; i < newStr.length; i++) {
            context2 += newStr[i];
            if (i==3 || i ==4){
                context2 += " ";
            }
        }
        System.out.println(context2);

        String context3 = "人易科技:上 機 測 驗 - 演算法";
        String context4 = context1.substring(5,12);
        System.out.print(context4);
    }
    
}
