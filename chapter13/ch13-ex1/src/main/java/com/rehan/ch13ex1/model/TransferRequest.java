package com.rehan.ch13ex1.model;

import java.math.BigDecimal;

public class TransferRequest {
    private long senderAccountid;
    private long receiverAccountid;
    private BigDecimal amount;

    public long getSenderAccountid() {
        return senderAccountid;
    }

    public void setSenderAccountid(long senderAccountid) {
        this.senderAccountid = senderAccountid;
    }

    public long getReceiverAccountid() {
        return receiverAccountid;
    }

    public void setReceiverAccountid(long receiverAccountid) {
        this.receiverAccountid = receiverAccountid;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
