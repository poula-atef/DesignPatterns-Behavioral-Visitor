package org.mycode;

import org.mycode.cinema.Cinema;
import org.mycode.cinema.SunCityCinema;
import org.mycode.payment.CreditCardPaymentMethod;
import org.mycode.payment.PaymentMethod;

public class Main {
    public static void main(String[] args) {
        PaymentMethod method = new CreditCardPaymentMethod();
        Cinema cinema = new SunCityCinema();

        // based on Double Dispatch compiler will always choose the method with parameter of parent type (Cinema)
        // because this is the only choice that will prevent any ambiguity
        method.visit(cinema);

        // applying visitor design pattern
        cinema.accept(method);
    }
}