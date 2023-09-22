package Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MyDataStructure implements DataStructure{
    private List<Integer> numbers; // arrayList to hold the elements
    private HashMap<Integer,Integer> indexMap;
    private int size;
    // we can delete in O(1) time complexity by using a hashmap to store each element's index

    public MyDataStructure(){
        numbers = new ArrayList<>();
        indexMap = new HashMap<>();
        size = 0;
    }

    @Override
    public void insert(int elem){
        if(!indexMap.containsKey(elem)){
            numbers.add(elem);
            indexMap.put(elem, numbers.size() - 1); //add the element into the hashmap at the last index/
            this.size += 1;
        }
    }

    @Override
    public void remove(int elem){
        //the following hashmap operations all work in constant time
        if(indexMap.containsKey(elem)){
            int index = indexMap.get(elem);
            //if the element is at the last index, we can just remove it from the list and the hashmap
            if(index == numbers.size() - 1){
                numbers.remove(index);
                indexMap.remove(elem);
                this.size -= 1;
            }
            //otherwise we swap the element we want to remove with the last element in the array, remove it, and update the map
            else{
                int lastElem = numbers.get(numbers.size() - 1);
                numbers.set(index, lastElem);
                numbers.remove(numbers.size() - 1);
                indexMap.remove(elem);
                indexMap.put(lastElem, index);
                this.size -= 1;
            }
        }
    }

    //basic methods for tests below
    public int getSize(){
        return this.size;
    }
    public int getElem(int index){
        return numbers.get(index);
    }

    public int getElemIndex(int elem){
        return indexMap.get(elem);
    }
}
