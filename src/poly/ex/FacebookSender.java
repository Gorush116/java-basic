package poly.ex;

public class FacebookSender implements Sender {

    @Override
    public void sendMessage(String msg) {
        System.out.println("페이스북에 발송합니다 : " + msg);
    }
}
