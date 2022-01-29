package goodcase;

// 극장 클래스
public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience){
        ticketSeller.sellTo(audience);
    }
}
