package Operations;

public class MyArray implements ADT {

    private int[] arr;
    private int end;
    private int start;

    public MyArray(int size) {
        arr = new int [size];
        start=-1;
        end=-1;
    }
    // method to check queue empty or not
    public boolean isEmpty(){
        return start == -1 || end == arr.length;
        }

    // method to check queue full or not
        public boolean isFull(){
            return end == arr.length-1;
        }

        // method to insert a element in queue
        public void enqueue(int data) {
            if (isEmpty()) {
                start = 0;
                end = start;
                arr[end] = data;
            }
            else if (isFull()) {
                System.out.println("overFlow");
            }
            else{
                    end++;
                    arr[end] = data;
                }
            }

        //method to delete element from begining
        public void dequeue() {
            if (isEmpty()) {
                System.out.println("UnderFlow");
            } else {
                System.out.println("Deleted element is: " + arr[start]);
                arr[start] = 0;
                start++;
                if (start > end) {
                    end = start = -1;
                }
            }
        }

        //method to print a element from begignig
        public void peekIn(){
            if(isEmpty()){
                System.out.println("UnderFlow");
            }
            else{
                System.out.println("peek  "  + arr[start]);
            }
        }

        //method to print whole queue
        public void printQueue(){
            if(isEmpty()){
                System.out.println("underFlow");
            }
            else{
                for (int i =start;i<=end; i++){
                    System.out.println(arr[i] + " ");
                }
            }
        }

        //method to delete queue
        public void deleteQueue(){
            arr = null;
            end = -1;
            start = -1;
        }
    }