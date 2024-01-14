//package barkingdog.L0x07deque;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class BJ10866 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(reader.readLine());
//        MyDeque myDeque = new MyDeque(10001);
//        for (int i = 0; i < n; i++) {
//            String[] cmds = reader.readLine().split(" ");
//            if (cmds[0].startsWith("push_front")) {
//                myDeque.pushFront(Integer.parseInt(cmds[1]));
//            } else if (cmds[0].startsWith("push_back")) {
//                myDeque.pushBack(Integer.parseInt(cmds[1]));
//            } else if (cmds[0].equals("pop_front")) {
//                int a = myDeque.popFront();
//            } else if (cmds[0].equals("pop_back")) {
//                int a = myDeque.popBack();
//            } else if (cmds[0].equals("size")) {
//                int a = myDeque.size();
//            } else if (cmds[0].equals("empty")) {
//                int a = myDeque.empty();
//            } else if (cmds[0].equals("front")) {
//                int a = myDeque.front();
//            } else if (cmds[0].equals("back")) {
//                int a = myDeque.back();
//            }
//        }
//
//    }
//}
//
//class MyDeque {
//    private int array[];
//    private int head;
//    private int tail;
//
//    public MyDeque(int size) {
//        array = new int[size];
//        head = size / 2;
//        tail = size + 1;
//    }
//
//    public void pushFront(int toPush) {
//        array[head] = toPush;
//        if (head == 0) {
//            head = array.length-1;
//        } else {
//            head--;
//        }
//    }
//
//    public void pushBack(int toPush) {
//        array[tail-1] = toPush;
//        if (tail == array.length) {
//            tail = 1;
//        } else {
//            tail++;
//        }
//    }
//
//    public int popFront() {
//        if(empty){
//            return -1;
//        }
//        int result;
//        if (head == 0) {
//            result = array[array.length-1];
//        }else {
//            result = array[head-1];
//        }
//
//        if (head == array.length - 1) {
//            head =0;
//        }else {
//            head++;
//        }
//        return result;
//    }
//
//    public int popBack() {
//        if(empty){
//            return -1;
//        }
//        int result;
//        if (tail < 2) {
//            result = array[array.length-tail];
//            //1 48 2 49
//        }else {
//            result = array[tail-2];
//        }
//
//        if (tail == 0) {
//            tail = array.length - 1;
//        }else {
//            tail--;
//        }
//        return result;
//    }
//
//    public int size() {
//        if (head <= tail) {
//            return tail - head - 1;
//        } else {
////            return tail - 1 + array. - head;
//                    //작업 후 인덱스로 다시 설계
//             }
//        return 0;
//    }
//}
//
//
//
//
//
//
//
//
//
