package JZOffer;

import java.util.ArrayList;

public class PushAndPop {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA.length == 0||popA.length == 0)return false;

        ArrayList<Integer> arrayList = new ArrayList<>();
        int pushNumber = 0,popNumber = 0,position = 1;
        arrayList.add(pushA[pushNumber]);
        while(pushNumber <= pushA.length && position > 0) {
            if (arrayList.get(position-1) == popA[popNumber]) {
                arrayList.remove(--position);
                if(popNumber < popA.length-1){popNumber++;}
            } else {
                if (pushNumber == pushA.length) pushNumber++;
                else {
                    arrayList.add(++pushNumber);
                    position++;
                }
            }
        }
        return arrayList.isEmpty();
    }

    public static void main(String[] args) {
        int[] pushA = {1,2,3,4,5};
        int[] popA = {4,5,3,2,1};
        PushAndPop p = new PushAndPop();
        System.out.println(p.IsPopOrder(pushA,popA));
    }
}
