package lessons.lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(6);
        nums.add(2);
        nums.add(7);
        nums.add(3);
        nums.add(4);
        nums.add(5);

//        System.out.println(nums);
//        Collections.sort(nums);
//        System.out.println(nums);



//        Iterator<Integer> iterator = nums.iterator();

//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        Worker worker1 = new Worker("Alex", 20);
        Worker worker2 = new Worker("Oleg", 18);
        Worker worker3 = new Worker("Ivan", 19);
//        Iterator<String> iteratorWorker = worker1;

//        while (iteratorWorker.hasNext()) {
//            System.out.println(worker1.next());
//        }

        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);

        System.out.println(workers);
        Collections.sort(workers);
        System.out.println(workers);

    }

}
