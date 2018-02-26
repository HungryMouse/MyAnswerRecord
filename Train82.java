package lintcode;

import java.util.ArrayList;
import java.util.List;

public class Train82 {

	public static void main(String[] args) {
		System.out.println(singleNumberII(new int[]{1,1,2,3,3,3,2,2,4,1}));		
	}

	public int singleNumber(int[] A) {
        List<Integer> list = new ArrayList<>();
        for(int i : A){
            if(list.contains(i)){
            	list.remove(list.indexOf(i));
            }else {
				list.add(i);
			}
        }
        
        return list.get(0);
    }
	
	public static int singleNumberII(int[] A) {
        if (A == null || A.length == 0) {
            return -1;
        }
        int result=0;
        int[] bits=new int[32];
        for (int i = 0; i < 32; i++) {//计算二进制上的第i位
            for(int j = 0; j < A.length; j++) {//计算每一个数
                bits[i] += A[j] >> i & 1;//>>计算二进制上第i位的数，&判断第i位上是否有数
                bits[i] %= 3;//将第i位上的数除3次数
            }
            result |= (bits[i] << i);//<<恢复二进制第i位上的数大小，|将二进数进行相加
        }
        return result;
    }
	
}
