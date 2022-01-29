package goodcase;

// 티켓 판매원 클래스
public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience){
       ticketOffice.sellTicketTo(audience);
    }


}
