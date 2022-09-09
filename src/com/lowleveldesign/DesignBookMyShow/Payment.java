package com.lowleveldesign.DesignBookMyShow;

import com.lowleveldesign.DesignBookMyShow.enums.PaymentStatus;
import org.joda.time.DateTime;

public class Payment {
    private Long paymentId;
    private PaymentStatus paymentStatus;
    private DateTime transactionStartTime;
    private DateTime transactionEndTime;

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public DateTime getTransactionStartTime() {
        return transactionStartTime;
    }

    public void setTransactionStartTime(DateTime transactionStartTime) {
        this.transactionStartTime = transactionStartTime;
    }

    public DateTime getTransactionEndTime() {
        return transactionEndTime;
    }

    public void setTransactionEndTime(DateTime transactionEndTime) {
        this.transactionEndTime = transactionEndTime;
    }
}
