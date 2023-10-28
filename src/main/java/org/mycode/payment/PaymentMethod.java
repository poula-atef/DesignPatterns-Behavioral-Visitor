package org.mycode.payment;

import org.mycode.cinema.Cinema;
import org.mycode.cinema.IMAXCinema;
import org.mycode.cinema.SunCityCinema;

public interface PaymentMethod {
    void visit(Cinema cinema);
    void visit(IMAXCinema cinema);
    void visit(SunCityCinema cinema);
}
