package badcase;

// 관람객의 소지품 클래스
public class Bag {
    private Long amount;
    private Invitaion invitaion;
    private Ticket ticket;

    public Boolean hasInvitaion(){
        return invitaion != null;
    }

    public Boolean hasTicket(){
        return ticket != null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void minusAmount(Long amount){
        this.amount -= amount;
    }
    public void plusAmount(Long amount){
        this.amount += amount;
    }


    public Bag(Long amount) {
        this(amount,null);
    }

    public Bag(Long amount, Invitaion invitaion) {
        this.amount = amount;
        this.invitaion = invitaion;
    }
}
