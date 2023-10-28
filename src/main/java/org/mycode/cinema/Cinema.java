package org.mycode.cinema;

import org.mycode.payment.PaymentMethod;

public interface Cinema {
    void accept(PaymentMethod method);
}
