package lintcode;

import java.util.ArrayList;
import java.util.List;

public class Train82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
	
}
