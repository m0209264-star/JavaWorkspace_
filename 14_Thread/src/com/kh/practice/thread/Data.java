package com.kh.practice.thread;

public class Data {
    private int value; //provider가 공급하고, customer가 소비/사용하는 데이터
    private boolean isEmpty = true;

    public Data() {}

    public synchronized void setValue(int value) {
 //	synchronized(this) {
 //		if(isEmpty) {
 // 			try {
 // 				wait();
 // 			}catch(InterruptedException e) {
 //				e.printStackTrace();
 //			}
 // 		}
 // 		isEmpty = false;
 // 		notify();
 // 		this.value = value;
 // 	}

        while (!isEmpty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 데이터 기록 처리
        this.value = value;
        System.out.println("값이 입력되었습니다.");
        System.out.println("put value : " + value);

        // 상태 변경 및 알림
        isEmpty = false;
        notifyAll(); 
    }

    public synchronized int getValue() {

        while (isEmpty) {
            try {
                try {
                    throw new EmptyException("현재 입력된 값이 없습니다. 기다리십시오...");
                } catch (EmptyException e) {
                    System.out.println(e.getMessage());
                }
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 데이터 꺼내기 처리
        int returnValue = this.value;
        System.out.println("get value : " + returnValue);
        System.out.println("값을 꺼냈습니다. value가 비었습니다.");

        // 상태 변경 및 알림
        isEmpty = true;
        notifyAll();

        return returnValue;
 //       synchronized (this) {
//		if(isEmpty) {
//			// value값이 비어있는 상태
//			try {
//				throw new EmptyException("현재 입력된 값이 없습니다. 기다리십시오...");
//			}catch(EmptyException e) {
//				String errMessage = e.getMessage();
//				System.out.println(errMessage);
//			}
//		}
//		}
    }
}