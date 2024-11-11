import java.util.TreeSet;
import java.util.*;

public class InsertPosition {

    /**
     * Find the position that a number should be inserted into in a sorted array.
     * For instance, in the array {2,4,6,8,10}, inserting 5 would belong at position 2, since the resulting array
     * would be {2,4,5,6,8,10}, where the index of 5 is 2 (remember zero-indexing.)
     * See the test cases for more examples.
     *
     * You may assume no duplicate values.
     *
     * @param nums an array of ints.
     * @param target the number that would hypothetically be inserted.
     * @return return the index that a number should be inserted into a sorted array.
     */
    public static void main(String[] args){


    }

    public int searchInsert(int[] nums, int target) {
        int i = 0;
        int k = nums.length;
        int location = 0;
       TreeSet<Integer> ts = new TreeSet<>();
        for (i=0;i<k;i++){
            ts.add(nums[i]);
    }
   // ts.headSet(30);
    
    if (k>1){
    location = ts.lower(target);
    }
    for (i=0; i<k;i++){
         if (nums[i]==location){
            break;
         }
    }
    int actualLocation = i + 1;

    
    if (k==1){
       actualLocation=0;

    }
    
    return actualLocation;
}
}
