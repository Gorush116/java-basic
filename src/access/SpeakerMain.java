package access;

public class SpeakerMain {
    // private : 클래스 내부
    // default : 패키지 내부
    // protected :  상속
    // public : 접근 제한 없음

    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.volumeDown();

        //필드에 직접 접근
        System.out.println("volume 필드 직접 접근 수정");
//        speaker.volume = 200; // private 접근 불가
        speaker.showVolume();
    }
}
