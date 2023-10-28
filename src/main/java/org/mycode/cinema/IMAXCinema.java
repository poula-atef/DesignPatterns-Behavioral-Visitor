package org.mycode.cinema;

import org.mycode.payment.PaymentMethod;

public class IMAXCinema implements Cinema{
    @Override
    public void accept(PaymentMethod method) {
        // will call the method that takes parameter of type IMAXCinema
        method.visit(this);
    }
}
