package Basic.链式;

import java.util.Scanner;

/**
 * @Author dml
 * @Date 2020/2/28 20:05
 * @Description
 **/
class LNode{
    String id;
    String name;
    float price;
    LNode next;
}

public class Main {

    public LNode create(String book_str){
        LNode book = new LNode();
        String[] params = book_str.split(" ");
//        if(params[0].equals("0")&&params[1].equals("0")&&params[2].equals("0"))return null;
        book.id = params[0];
        book.name = params[1];
        book.price = Float.parseFloat(params[2]);
        return book;
    }

    public void print(LNode book,int books_len){
        System.out.println(books_len);
        while(book.next!=null){
            book = book.next;
            System.out.printf("%s %s %.2f\n",book.id,book.name,book.price);
        }
    }

    public int sort(LNode book){
        LNode head = book;
        while(head.next!=null){
            LNode max = head.next;LNode pre = head.next;LNode point = head.next;
            while(point.next!=null){
                if(point.next.price>max.price){
                    pre = point;
                    max = point.next;
                }
                point = point.next;
            }
            if(max!=head.next) {
                pre.next = max.next;
                max.next = head.next;
                head.next = max;
            }
            head = head.next;
        }
        return 0;
    }

    public float getAvgPrice(LNode book,int book_len){
        float avg = 0;
        while(book.next!=null){
            book = book.next;
            avg+=book.price;
        }
        return avg/book_len;
    }

    public void update(LNode book,int book_len){
        float avg = getAvgPrice(book,book_len);
        System.out.printf("%.2f\n",avg);
        while(book.next!=null){
            book = book.next;
            if(book.price >= avg) book.price *= 1.1;
            else book.price *= 1.2;
        }
    }

    public float getMaxPrice(LNode book){
        float max = 0;
        while(book.next!=null){
            book = book.next;
            if(book.price>max)max = book.price;
        }
        return max;
    }

    public int getMaxPriceNumber(LNode book,float max){
        int number = 0;
        while(book.next!=null){
            book = book.next;
            if(book.price==max)number++;
        }
        return number;
    }

    public void getEXP(LNode book){
        float max = getMaxPrice(book);
        int number = getMaxPriceNumber(book,max);
        System.out.println(number);
        for (int i = 0; i < number; ) {
            book = book.next;
            if(book.price==max){
                System.out.printf("%s %s %.2f\n",book.id,book.name,book.price);
                i++;
            }
        }
    }

    public void getFav(LNode book,int n,String[] params){
        for (int i = 0; i < n; i++) {
            int number = 0;
            LNode p = book;
            while(p.next!=null){
                p = p.next;
                if(p.name.equals(params[i])) number++;
            }
            if(number==0) System.out.println("Sorry，there is no your favourite!");
            else {
                System.out.println(number);
                LNode t = book;
                for (int j = 0; j < number;) {
                    t = t.next;
                    if(t.name.equals(params[i])){
                        System.out.printf("%s %s %.2f\n",t.id,t.name,t.price);
                        j++;
                    }
                }
            }
        }
    }

    public void getPosition(LNode book,int books_len,int n,int[] params){
        for (int i = 0; i < n; i++) {
            if(params[i]<=books_len&&params[i]>0){
                LNode p = book;
                for (int j = 0; j < params[i]; j++) { p = p.next; }
                System.out.printf("%s %s %.2f\n",p.id,p.name,p.price);
            }
            else System.out.println("Sorry，the book on the best position doesn't exist!");

        }
    }

    public void addBook(LNode book,int books_len,int n,LNode nBook){
        if(n<=books_len+1&&n>0){
            LNode point = book;
            for (int i = 1; i < n; i++) {point = point.next;}
            LNode pre = point;
            point = point.next;
            nBook.next = point;
            pre.next = nBook;
            print(book,books_len);
        }
        else System.out.println("Sorry，the position to be inserted is invalid!");
    }

    public void delBook(LNode book,int books_len,int n){
        if(n>0&&n<=books_len){
            LNode p = book;
            for (int i = 1; i < n; i++) {p = p.next;}
            p.next = p.next.next;
            print(book,books_len);
        }
        else System.out.println("Sorry，the position to be deleted is invalid!");
    }

    public int deduplicate(LNode book,int books_len){
        LNode p = book;
        while(p.next!=null){
            p = p.next;
            LNode q = p;
            while(q.next!=null){
                LNode pre = q;
                q = q.next;
                if(p.id.equals(q.id)){ pre.next = q.next; books_len--;}
            }
        }
        return books_len;
    }

    public static void main(String[] args){
        Main m = new Main();

        Scanner in = new Scanner(System.in);
        LNode head = new LNode();
        LNode p = head;
        int books_len=Integer.parseInt(in.nextLine());
        for (int i = 0; i < books_len; i++) {
            String book_str = in.nextLine();
            LNode book = m.create(book_str);
            if(book != null) {
//                if(p.next!=null) book.next = p.next;
                p.next = book;
                p = p.next;
            }
            else break;
        }

        books_len = m.deduplicate(head,books_len);
        m.print(head,books_len);
//        m.delBook(head,books_len,n);

//        m.addBook(head,books_len,n,nBook);

//        m.getPosition(head,books_len,n,params);
//        m.getFav(head,n,params);

//        m.sort(head);
//        m.update(head,books_len);
//        m.getEXP(head);
//        m.print(head,books_len);
    }
}
