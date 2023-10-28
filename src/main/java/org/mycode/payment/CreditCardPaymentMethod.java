package org.mycode.payment;

import org.mycode.cinema.Cinema;
import org.mycode.cinema.IMAXCinema;
import org.mycode.cinema.SunCityCinema;

public class CreditCardPaymentMethod implements PaymentMethod {

    @Override
    public void visit(Cinema cinema) {
        System.out.println("Paying Using Credit Card For Cinema");
    }

    @Override
    public void visit(IMAXCinema cinema) {
        System.out.println("Paying Using Credit Card For IMAX Cinema");
    }

    @Override
    public void visit(SunCityCinema cinema) {
        System.out.println("Paying Using Credit Card For SunCity Cinema");
    }
}
