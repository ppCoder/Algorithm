package Basic.顺序;

import java.util.Scanner;

/**
 * @Author dml
 * @Date 2020/2/25 11:11
 * @Description
 **/
class SNode{
    String id;
    String name;
    float price;

    SNode(){ }
    SNode(String id,String name,float price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class Main {
    public  SNode createBook(String book_str){
        SNode book = new SNode();
        String[] book_params = book_str.split(" ");
        if(book_params[0].equals("0")&&book_params[1].equals("0")&&book_params[2].equals("0")) return null;
        book.id = book_params[0];
        book.name = book_params[1];
        book.price = Float.parseFloat(book_params[2]);
        return book;
    }

    public  void print(SNode[] books,int books_len){
//        System.out.println(books_len);
        for (int i = 0; i < books_len; i++){
            System.out.printf("%s %s %.2f\n",books[i].id,books[i].name,books[i].price);
        }
    }

    public int sortPrice(SNode[] books, int books_len){
        for (int i = 0; i < books_len; i++) {
            int max = i;
            for (int j = i+1; j < books_len; j++) {
                if(books[j].price>books[max].price) max = j;
            }
            SNode t = books[max];
            for (int j = max; j > i; j--) {
                books[j] = books[j-1];
            }
            books[i] = t;
        }
        return 0;
    }

    public static float computeAvgPrice(SNode[] books,int books_len){
        float avg = 0;
        for (int i = 0; i < books_len; i++) {
            avg += books[i].price;
        }
        return avg/books_len;
    }

    public int updateAutoPrice(SNode[] books,int books_len){
        float avg = computeAvgPrice(books,books_len);
        System.out.printf("%.2f\n",avg);
        for (int i = 0; i < books_len; i++) {
            if(books[i].price < avg)books[i].price *= 1.2;
            else books[i].price *= 1.1;
        }
        return 0;
    }

    public float getMaxPrice(SNode[] books,int books_len){
        float max = 0;
        for (int i = 0; i < books_len; i++) {
            if(books[i].price > max) max = books[i].price;
        }
        return max;
    }

    public int getMaxNumber(SNode[] books, int books_len,float max){
        int number = 0;
        for (int i = 0; i < books_len; i++) {
            if(books[i].price == max)number++;
        }
        return number;
    }

    public int getEXP(SNode[] books, int books_len){
        float max = getMaxPrice(books,books_len);
        System.out.println(getMaxNumber(books,books_len,max));
        for (int i = 0; i < books_len; i++) {
            if(books[i].price == max)System.out.printf("%s %s %.2f\n",books[i].id,books[i].name,books[i].price);
        }
        return 0;
    }

    public void filterFav(SNode[] books,int books_len,int n,String[] params){
        for (int i = 0; i < n; i++) {
            int number = 0;
            for (int j = 0; j < books_len; j++)
                if(books[j].name.equals(params[i])) number++;
            if(number==0)System.out.println("Sorry，there is no your favourite!");
            else {
                System.out.println(number);
                for (int j = 0; j < books_len; j++)
                    if(books[j].name.equals(params[i])) System.out.printf("%s %s %.2f\n",books[j].id,books[j].name,books[j].price);
            }
        }
    }

    public void getPosition(SNode[] books,int books_len,int n,int[] params){
        for (int i = 0; i < n; i++) {
            if(params[i]<books_len&&params[i]-1>=0&&books[params[i]-1]!=null)
                System.out.printf("%s %s %.2f\n",books[params[i]-1].id,books[params[i]-1].name,books[params[i]-1].price);
            else System.out.println("Sorry，the book on the best position doesn't exist!");
        }
    }

    public SNode[] insert(SNode[] books,int books_len,int n,SNode newBook){
        if(n>0&&n<=books_len){
            SNode[] newBooks = new SNode[books_len+1];
            for (int i = 0; i < books_len+1; i++) {
                if(i<n-1)newBooks[i] = books[i];
                if(i == n-1) newBooks[i] = newBook;
                if(i > n-1) newBooks[i] = books[i-1];
            }
            print(newBooks,books_len+1);
            return newBooks;
        }
        System.out.println("Sorry，the position to be inserted is invalid!");
        return books;
    }

    public SNode[] delete(SNode[] books,int books_len,int n){
        if(n>0&&n<=books_len){
            SNode[] newBooks = new SNode[books_len-1];
            for (int i = 0; i < books_len-1; i++) {
                if(i<n-1)newBooks[i] = books[i];
                else newBooks[i] = books[i+1];
            }
            print(newBooks,books_len-1);
            return newBooks;
        }
        System.out.println("Sorry，the position to be deleted is invalid!");
        return books;
    }

    public SNode[] deduplicate(SNode[] books,int books_len){
        SNode[] tl = new SNode[books_len];
        int l = 0;
        for (int i = 0; i < books_len; i++) {
            boolean del = false;
            for (int j = 0; j < l; j++) if(tl[j].id.equals(books[i].id)){ del = true;break; }
            if(!del) tl[l++]=books[i];
        }
        return tl;
    }

    public int getLength(SNode[] books){
        int len = 0;
        for (SNode book : books) {
            if (book != null) len++;
        }
        return len;
    }

    public static void main(String[] args){
        Main m = new Main();

        //Scanner operator
        Scanner in = new Scanner(System.in);
        SNode[] books = new SNode[100];
        int books_len=0;
        for (int i = 0; i < 100; i++) {
            String book_str = in.nextLine();
            books[i] = m.createBook(book_str);
            if(books[i]==null)break;
            else books_len = i+1;
        }

        //Scanner Convert
//        Scanner in = new Scanner(System.in);
//        int books_len=Integer.parseInt(in.nextLine());
//        SNode[] books = new SNode[books_len];
//        for (int i = 0; i < books_len; i++) {
//            String book_str = in.nextLine();
//            books[i] = m.createBook(book_str);
//        }
//        books = m.deduplicate(books,books_len);
//        books_len = m.getLength(books);
//        m.print(books,books_len);


//        int n = Integer.parseInt(in.nextLine());
//        m.delete(books,books_len,n);

//        SNode newBook = m.createBook(in.nextLine());
//        books = m.insert(books,books_len,n,newBook);

        m.sortPrice(books,books_len);
//        m.updateAutoPrice(books,books_len);
//        m.getEXP(books,books_len);
        m.print(books,books_len);
//        m.filterFav(books,books_len,n,params);
//        m.getPosition(books,books_len,n,params);
    }
}
