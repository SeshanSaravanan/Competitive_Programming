/* In computer science, a double-ended queue (dequeue, often abbreviated to deque, pronounced deck) is an abstract data type that generalizes a queue, for which elements can be added to or removed from either the front (head) or back (tail).

Deque interfaces can be implemented using various types of collections such as LinkedList or ArrayDeque classes. For example, deque can be declared as:

Deque deque = new LinkedList<>();
or
Deque deque = new ArrayDeque<>();
You can find more details about Deque here.

In this problem, you are given  integers. You need to find the maximum number of unique integers among all the possible contiguous subarrays of size .

Note: Time limit is  second for this problem.

Input Format

The first line of input contains two integers  and : representing the total number of integers and the size of the subarray, respectively. The next line contains  space separated integers.

Constraints




The numbers in the array will range between .

Output Format

Print the maximum number of unique integers among all possible contiguous subarrays of size .

Sample Input

6 3
5 3 5 2 3 2
Sample Output

3
Explanation

In the sample testcase, there are 4 subarrays of contiguous numbers.

 - Has  unique numbers.

 - Has  unique numbers.

 - Has  unique numbers.

 - Has  unique numbers.

In these subarrays, there are  unique numbers, respectively. The maximum amount of unique numbers among all possible contiguous subarrays is . */

    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    Deque<Integer> dq = new ArrayDeque<Integer>();
    HashSet<Integer> s = new HashSet<Integer>();
    int n = sc.nextInt();
    int m = sc.nextInt();
    int max = 0;
    for (int i = 0; i < n; i++) {
      int tmp = sc.nextInt();
      dq.add(tmp);
      s.add(tmp);

      if (dq.size() == m) {
        max = Math.max(s.size(), max);
        int item = dq.remove();
        if (!dq.contains(item)) {
          s.remove(item);
        }
      }
    }
    System.out.println(max);
    sc.close();
               
    }
}
