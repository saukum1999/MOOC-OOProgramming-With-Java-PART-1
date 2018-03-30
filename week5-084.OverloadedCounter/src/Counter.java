/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author COMPUTER
 */
public class Counter {

    private int count;
    boolean flag = false;

    public void check() {
        if (count < 0) {
            count = 0;
        }
    }

    public Counter(int startingValue, boolean check) {
        this.count = startingValue;
        if (check) {
            flag = true;
        }
    }

    public Counter(int startingValue) {
        this.count = startingValue;

    }

    public Counter(boolean check) {
        this.count = 0;
        if (check) {
            flag = true;
        }
    }

    public Counter() {
        this.count = 0;
    }

    public int value() {
        return this.count;
    }
    public void increase() {
        this.count++;
        this.check();
    }

    public void increase(int amount) {
        if (amount >= 0) {
            this.count += amount;
            this.check();
        }
    }

    public void decrease() {
        this.count--;
        if (flag)
            this.check();
        
        //this.check();
    }

    public void decrease(int amount) {
        if ((amount) > 0) {
            this.count -= amount;
            if (flag)
                this.check();
        }
    }

}
