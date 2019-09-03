package Collection;

/**
 * @Title 二进制中1的个数
 * @Description 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示
 * @Author dml
 * @Date 2019-08-19 14:41
 * @Version V1.0
 **/
public class NumberOf1 {

    /**
     * @Author dml
     * @Date 2019-08-19 16:30
     * @Description 1. int负数的存储形式是补码 2. int在java中长度为32位 3. '&'位运算符'且' 4. >>>无符号右移运算符
     * @param n
     * @return count
     */
    public int main(int n){
        int count=0;
        for (int i = 0; i < 32; i++) {
            if((n&1)==1) count++;
            n = n>>>1;
        }
        return count;
    }

    /**
     * @Author dml
     * @Date 2019-08-19 16:45
     * @Description (n-1)&n，每执行一次，消除一个1，当1全被消除，则=0
     * @param n
     * @return count
     */
    public int best(int n){
        int count=0;
        while(n!=0){
            count++;
            n= (n-1)&n;
        }
        return count;
    }
}
