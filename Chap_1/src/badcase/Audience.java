package badcase;

// 관람객의 개념을 가진 클래스
public class Audience {
    private Bag bag;

    public Audience(Bag bag){
        this.bag = bag;
    }

    public Bag getBag() {
        return bag;
    }
}
