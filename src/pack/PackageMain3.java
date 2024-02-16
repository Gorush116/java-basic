package pack;

import pack.a.User;

public class PackageMain3 {

    public static void main(String[] args) {
        User userA = new User();
        // 다른 패키지의 클래스명이 같은 것을 동시에 사용할 때 나머지는 패키지 경로를 명시해야 함
        pack.b.User userB = new pack.b.User();
    }
}
