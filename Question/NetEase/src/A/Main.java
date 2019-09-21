package A;

import java.util.Scanner;

/**
 * @Title
 * @Description 70%,too lowly.
 * @Author ppgoder
 * @Date 2019-09-21 15:38
 * @Version V1.0
 **/
public class Main {
    static void search(int[] receipt_question,int[] receipt_answer,int[] question,int[] answer){
        for (int i = 0; i < question.length; i++) {
            for (int j = 0; j < receipt_question.length; j++) {
                if(receipt_question[j]==question[i]) {
                    answer[i] = receipt_answer[j];
                    break;
                }
                if(receipt_question[j]==0)break;
            }
        }
    }

    static void receipt(int[] money,int[] receipt_question,int[] receipt_answer){
        int len = money.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if(receipt_question[j]==0){
                    receipt_question[j] = money[i];
                    receipt_answer[j]++;
                    break;
                }
                else if(receipt_question[j]==money[i]){
                    receipt_answer[j]++;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] money = new int[n];
        for (int i = 0; i < n; i++) {
            money[i] = in.nextInt();
        }
        int[] question = new int[m];
        for (int i = 0; i < m; i++) {
            question[i] = in.nextInt();
        }

        int[] receipt_question = new int[n];
        int[] receipt_answer = new int[n];
        receipt(money,receipt_question,receipt_answer);

        int[] answer = new int[m];
        search(receipt_question,receipt_answer,question,answer);
        for (int i = 0; i < m; i++) {
            System.out.println(answer[i]);
        }
    }
}
