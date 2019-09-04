package A;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * @Author dml
 * @Date 2019/9/4 19:31
 * @Description 给定一个单向链表和一个整数m，将链表中小于等于m的节点移到大于m的节点之前，要求两部分中的节点各自保持原有的先后顺序
 **/
public class Main {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /*请完成下面这个函数，实现题目要求的功能
     ******************************开始写代码******************************/

    /**
     * @author: dml
     * @date: 2019/9/4 19:33
     * @param head 单向链表
     * @param m 整数m
     * @return
     */
    /**14**/
    static ListNode partition(ListNode head,int m) {
        if(head==null)return null;
        ListNode med = head;
        ListNode low = null;
        ListNode high = null;
        while (med != null){
            if(med.val < m){
                if(low == null) low = med;
                else {
                    low.next = med;
                    med = med.next;
                    low = low.next;
                    low.next = null;
                }
            }
            else {
                if(high == null) high = med;
                else {
                    high.next = med;
                    med = med.next;
                    high = high.next;
                    high.next = null;
                }
            }
            med = med.next;
        }
        low.next = high;
        return head;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ListNode head=null;
        ListNode node=null;
        int m=in.nextInt();
        while(in.hasNextInt()){
            int v=in.nextInt();
            if(head==null){
                node=new ListNode(v);
                head=node;
            }else{
                node.next=new ListNode(v);
                node=node.next;
            }
        }
        head= partition(head,m);
        if(head!=null){
            System.out.print(head.val);
            head=head.next;
            while(head!=null){
                System.out.print(",");
                System.out.print(head.val);
                head=head.next;
            }
        }
        System.out.println();
    }
}