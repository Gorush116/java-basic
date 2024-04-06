제네릭
- extends : 상한선 기준
예) <T extends B> // T의 범위는 B와 B를 상속받는 자식 클래스까지 제한됨
- super : 하한선 기준
예) <K super B> // K의 범위는 B와 B의 부모클래스 이상의 클래스로 제한됨
- 복합 예제
 예) SaltClass<E extends Comparable<? super E>> {...}
Comparable<? super E> // E 또는 E의 조상만 가능한  Comparable 객체
SaltClass<E extends Comparable // Comparable 또는 Comparable 을 상속받는 클래스 SaltClass 객체
즉 SaltClass<E extends Comparable<? super E>>의 허용 범위는 E 자기자신 및 조상타입과 비교할 수 있는 E까지(상한/하한선이 E로 제한됨)

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Stream : Java Collection을 똑같은 방식으로 다루기 위한 객체
얕은 복사(clone()) : 객체에 저장된 값을 그대로 복제, 객체를 복제하지 않음 > 원본 변경시 복사본도 영향을 받음
깊은 복사 : 객체를 복제 > 예) StringJoiner(JDK 1.8이상) sj = new StringJoiner(","(구분자), "["(시작), "]"(끝));
추상클래스는 객체를 직접 생성할 수 없음
Calendar cal = new Calendar(); // 에러(X)
Calendar cal = Calendar.getInstance(); // 작동(O)

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

java.time 패키지(JDK .18~)
Date  와 Calendar의 단점을 해소하기 위해 추가됨
패키지별 사용용도
java.time : 날짜와 시간을 다룸
java.time.chrono : 표준(ISO)이 아닌 달력시스템
java.time.format : 날짜와 시간의 필드와 단위(unit)을 위한 클래스
java.time.zone : 시간대(time-zone)과 관련
java.time 패키지의 핵심 클래스
LocaleTime : 시간 표현
LocaleDate : 날짜 표현
LocaleDateTime : 모두 표현
ZoneDateTime : 시간대(time-zone) 표현
ex1) LocaleDate date = LocaleDate.now(); // 현재시간
ex2) LocaleTime time = LocaleTime.of(23, 59, 59); // 23시 59분 59초
그 외 기능
truncatedTo(...) : 지정된 것보다 작은 단위의 필드를 0으로 만든다.
date1.CompareTo(date2) : date1보다 date2가 이후라면 1 / 이전이라면 -1 / 같으면 0
boolean isAfter() / boolean isBefore() / boolean isEqual()
