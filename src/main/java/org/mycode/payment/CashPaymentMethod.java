package org.mycode.payment;

import org.mycode.cinema.Cinema;
import org.mycode.cinema.IMAXCinema;
import org.mycode.cinema.SunCityCinema;

public class CashPaymentMethod implements PaymentMethod{

    @Override
    public void visit(Cinema cinema) {
        System.out.println("Paying Using Cash Money For Cinema");
    }

    @Override
    public void visit(IMAXCinema cinema) {
        System.out.println("Paying Using Cash Money For IMAX Cinema");
    }

    @Override
    public void visit(SunCityCinema cinema) {
        System.out.println("Paying Using Cash Money For SunCity Cinema");
    }
}
