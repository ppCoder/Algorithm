package JZOffer;

public class OverrideTriangle {
    public int RectCover(int target) {
        int first = 0;
        int second = 1;
        if (target <= 0) {
            return first;
        }
        if (target == 1) {
            return second;
        }
        for (int i = 0; i < target; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }

    public static void main(String[] args) {
        OverrideTriangle o = new OverrideTriangle();
        System.out.println(o.RectCover(0));
    }
}
