package de.cbw.scoutsfx.model;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author T.Lubowiecki
 */
public class Order  extends AbstractEntity implements Serializable {
    
    private Camp camp;
    private Scout scout;
    private LocalDate start;
    private LocalDate end;

    public Camp getCamp() {
        return camp;
    }

    public void setCamp(Camp camp) {
        this.camp = camp;
    }

    public Scout getScout() {
        return scout;
    }

    public void setScout(Scout scout) {
        this.scout = scout;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }
}
