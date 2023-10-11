import java.util.List;

import java.util.stream.IntStream;

import java.util.stream.Stream;

public class StreamAPIdemo {

    public static void main(String[] args) {

        // TODO Auto-generated method stub

        int nums[] = { 9, 4, 6, 5, 7, 4 };

        // int min=nums[0];

        // for(int i=1;i<nums.length;i++)

        // if(nums[i]<min) min=nums[i];

        // System.out.println(min);

        // int minValue=IntStream.of(nums).min().getAsInt();

        // System.out.println( IntStream.of(nums).distinct().count());

        int[] newArray = IntStream.of(nums).distinct().toArray();

        for (int i : newArray)
            System.out.println(i);

        // System.out.println(minValue);

    }

}
