package goodcase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 티켓 매표소 클래스
public class TicketOffice {
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket... tickets){
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }


    private Ticket getTickets() {
        return tickets.remove(0);
    }

    public void minusAmount(Long amount){
        this.amount -= amount;
    }
    public void plusAmount(Long amount){
        this.amount += amount;
    }

    public void sellTicketTo(Audience audience){
        plusAmount(audience.buy(getTickets()));
    }

}
