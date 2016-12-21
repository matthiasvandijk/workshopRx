/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.reactivex.domain;

/**
 *
 * @author Matthias
 */
public class Passenger {
    private int id;
    private double balance;

    public Passenger(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }
    
    public void deposit(double amount) {
        this.balance += amount;
    }
    
    public void pay(double amount) {
        this.balance -= amount;
    }
    
    public boolean canAfford(double amount) {
        double check = this.balance;
        check -= amount;
        return check >= 0;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }
    
}
