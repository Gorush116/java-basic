package access;

public class BankAccount {

    /**
     * 자바의 장점
     *  1. 다양한 분야에서 활발히 사용
     *  2. 20년 동안 프로그래밍 언어 상위권 위치
     *  3. 배우기 쉽고 풍부한 학습자료
     *  4. 모던 프로그래밍 언어(객체지향 + 함수형)
     *
     *
     * 자바의 특징
     *  - 배우기 쉬운 객체지향 언어 = 프로그래밍 언어 + 객체지향 개념(객체지향 언어로 c++, java, python, js 등이 있음)
     *  - 자동 메모리 관리(Garbage Collector, GC)
     *    => 실행순서 : 참조되지 않은 객체들을 탐색 후 삭제 → 삭제된 객체의 메모리 반환 → 힙 메모리 재사용
     *      (힙 : 런타임에 동적으로 할당되는 데이터가 저장되는 영역. 객체나 배열 생성이 여기에 해당함)
     *  - 멀티쓰레드 지원 => 하나의 프로그램에서 동시에 여러 작업을 가능하게 함
     *  - 풍부한 라이브러리로 쉽게 개발가능
     *  - *** 운영체제에 독립적 => JVM
     *
     * 자바 가상 머신(JVM)
     *  - 자바 프로그램이 실행되는 가상 컴퓨터(VM)
     *  - 자바 애플리케이션이 실행되기 위해서는 반드시 JVM이 필요
     *  - 위의 특성으로 OS에 따라 프로그램 변경 없이 실행 가능(단, JVM은 OS에 종속적이기 때무에 실행 가능한 JVM이 필요)
     */

    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    // public 메서드 : deposit
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    // public 메서드 : withdraw
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    // public 메서드 : getBalance
    public int getBalance() {
        return balance;
    }

    private boolean isAmountValid(int amount) {
        // 금액이 0보다 커야함
        return amount > 0;
    }

}
