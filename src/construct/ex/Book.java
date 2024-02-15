package construct.ex;

public class Book {

    String title;
    String author;
    int page;

    Book() {
        this("", "", 0);
    }
    Book(String title, String author) {
//        System.out.println("생성자 호출. title = " + title + ", author = " + author);
        this(title, author, 0); // this를 사용하여 중복 방지 -> 맨 아래 생성자를 사용해서 인스턴스 생성
//        this.title = title;
//        this.author = author;
    }
    Book(String title, String author, int page) {
//        System.out.println("생성자 호출. title = " + title + ", author = " + author + ", page = " + page);
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo() {
        System.out.println("책정보 호출. title = " + title + ", author = " + author + ", page = " + page);
    }

}
