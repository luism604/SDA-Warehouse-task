package com.company.oop.petrol;

public class FuelPump {
    private float gas = 0;
    private float amount = 0;

    private float gasIncrement = 5;
    private float literPrice = 1;

    private float payed = 0;

    public FuelPump() {
        super();
    }

    public float getGas() {
        return gas;
    }

    public void setGas(float gas) {
        this.gas = gas;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getGasIncrement() {
        return gasIncrement;
    }

    public void setGasIncrement(float gasIncrement) {
        this.gasIncrement = gasIncrement;
    }

    public float getLiterPrice() {
        return literPrice;
    }

    public void setLiterPrice(float literPrice) {
        this.literPrice = literPrice;
    }

    public float getPayed() {
        return payed;
    }

    public void setPayed(float payed) {
        this.payed = payed;
    }

    public void refuel() {
        gas += gasIncrement;
        updateAmount();
    }

    public void updateAmount() {
        float priceIncrement = gas * literPrice;
        amount += priceIncrement;
    }

    public float charge() {
        return gasIncrement * literPrice;
    }

    public float debt() {
        return amount - payed;
    }

    public float pay(float money){
        payed += money;

        return amount - payed;
    }

}
