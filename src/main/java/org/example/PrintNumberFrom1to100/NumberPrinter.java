package org.example.PrintNumberFrom1to100;

public class NumberPrinter implements Runnable {
    private int numbertoPrint;

    public NumberPrinter(int numbertoPrint){
        this.numbertoPrint = numbertoPrint;
    }

    @Override
    public void run() {
        System.out.println(numbertoPrint + " - Printed by " + Thread.currentThread().getName());
    }
}
