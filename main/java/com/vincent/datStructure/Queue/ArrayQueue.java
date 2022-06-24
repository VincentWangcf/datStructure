package com.vincent.datStructure.Queue;

import java.util.Scanner;

public class ArrayQueue {
    public static void main(String[] args) {

        ArrayQueue queue = new ArrayQueue(3);
        char key = ' ';
        Scanner scanner = new Scanner(System.in);
        boolean lop =true;
        while (lop){
            System.out.println("s(show):显示队列");
            System.out.println("e(exit):退出程序");
            System.out.println("a(add):添加数据到队列");
            System.out.println("g(get):从队列取数据 ");
            System.out.println("h(head):查看队列头数据 ");
             key = scanner.next().charAt(0); //接收字符
            switch (key){
                case 's':
                    queue.showqueue();
                    break;
                case 'a':
                    System.out.println("输入一个数");
                    int val = scanner.nextInt();
                    queue.addQueue(val);
                    break;
                case 'g':  //   取数据   demo
                    try{

                        int queue1 = queue.getQueue();
                        System.out.println("取出的数据是%d \n"+queue1);
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                    try{
                        int headQueue = queue.headQueue();
                        System.out.printf("队列的头数据是%d \n",headQueue);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    queue.showqueue();
                    break;
                case 'e':
                    scanner.close();
                    lop =false;
                    break;
            }
        }
        System.out.println("程序退出");
    }

    private int maxSize;
    private int front;  //队列头
    private int rear;  //队列尾
    private int[] arr;

    //创建队列构造
    public ArrayQueue(int size) {
        maxSize = size;
        arr = new int[maxSize];
        front = -1;
        rear = -1;

    }

    //判断队列是否满
    public boolean isfull() {
        return rear == maxSize - 1;
    }

    //判断队列是否是空
    public boolean isEmpty() {
        return rear == front;
    }

    //添加队列数据
    public void addQueue(int n) {
        if (isfull()) {
            System.out.println("queue is full !");
            return;
        }
        rear++;
        arr[rear] = n;
    }


    //获取队列数据
    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        front++;
        return arr[front];
    }

    public void showqueue() {
        if (isEmpty()) {
            System.out.println("is empty");
        }
        for (int i = 0; i < arr.length; i++) {
//        System.out.println("arr[%d]=%d\n",i,arr[i]);
            System.out.println("arr" + i + ",:" + arr[i] + "" + "/n");
        }


    }


        //  显示队列头信息
    public int headQueue() {showqueue();
        if (isEmpty()) {
            System.out.println("is empty");


        }
        return arr[front+1];
    }


}
