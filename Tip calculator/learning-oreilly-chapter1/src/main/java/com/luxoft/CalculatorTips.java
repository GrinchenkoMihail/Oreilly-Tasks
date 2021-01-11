package com.luxoft;

public class CalculatorTips {

    private double billAmount;

    private double tipRate;

    public CalculatorTips(double billAmount, double tipRate) {
        this.billAmount = billAmount;
        this.tipRate = tipRate;
    }

    private double calculateTipAmount() {
        return billAmount * (tipRate / 100);
    }

    private double calculateTotalAmount() {
        return billAmount + calculateTipAmount();
    }

    public String dataAboutTipAndTotalAmounts() {
        String tipAmount = String.format("%.2f", calculateTipAmount());
        String totalAmount = String.format("%.2f", calculateTotalAmount());
        return tipAmount + " " + totalAmount;
    }

}
