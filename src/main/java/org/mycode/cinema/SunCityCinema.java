package org.mycode.cinema;

import org.mycode.payment.PaymentMethod;

public class SunCityCinema implements Cinema {
    @Override
    public void accept(PaymentMethod method) {
        // will call the method that takes parameter of type SunCityCinema
        method.visit(this);
    }
}
