package Main;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public static int singleNumber(int[] nums) throws Exception {
        List<Integer> list = new ArrayList<>();
        //add every element into the arraylist and remove it if we encounter it again, leaving only the single number
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i]))
                list.remove((Object) nums[i]);

            else list.add(nums[i]);
        }
        if (list.size() > 1) throw new Exception("Error: too many single numbers");
        if (list.size() == 0) throw new Exception("Error: no single number");
        return list.get(0);
    }

    public static int minSplit(int amount) throws Exception {
        if(amount < 0){ //amount can't be negative
            throw new Exception("Error: negative amount not allowed");
        }
        //subtract the biggest amount possible and count the number of subtractions until we reach 0
        int count = 0;
        while(amount > 0){
            if(amount >= 50)
                amount -= 50;
            else if(amount >= 20)
                amount -= 20;
            else if(amount >= 10)
                amount -= 10;
            else if(amount >= 5)
                amount -= 5;
            else
                amount -= 1;
            count++;
        }
        return count;
    }

    public static int notContains(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        //return the first positive whole number that's not in the list
        int n = 1;
        while (true) {
            if (list.contains(n))
                n += 1;
            else
                return n;
        }
    }

    public static String binaryString(String a, String b) {
        //Convert the strings to decimal numbers, add them and convert them back
        int first = Integer.parseInt(a, 2);
        int second = Integer.parseInt(b, 2);
        int sum = first + second;
        String result = Integer.toBinaryString(sum);

        //We could write our own logic or add without converting to decimals, but it is unnecessarily complex,
        //especially with negative numbers.

        //This is a simpler and more readable solution

        return result;
    }

    public static int countVariants(int stairsCount, int floors) throws Exception {
        if(floors <= 1){
            throw new Exception("Error: floors must be > 1");
        }
        int singleFloor = fibonacci(stairsCount); //if there are n stairs, we can climb a single floor fibonacci(n) different ways

        //total number of different ways to climb n floors is singleFloor to the power of n
        return (int) Math.pow(singleFloor, floors);
    }

    private static int fibonacci(int n) throws Exception {
        //recursive function that returns the nth member of the fibonacci sequence
        // starting from 1, 2, 3, 5, 8...
        if(n < 1){
            throw new Exception("Error: n must be >=1");
        }
        if(n == 1) return 1;
        if(n == 2) return 2;
        return fibonacci(n-2) + fibonacci(n-1);
    }

}


