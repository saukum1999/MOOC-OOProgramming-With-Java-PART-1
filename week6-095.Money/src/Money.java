
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money added) {
        Money c = new Money(this.euros + added.euros, this.cents + added.cents);
        return c;
    }

    public boolean less(Money compared) {
        if (compared.euros > this.euros) {
            return true;
        } else if (compared.euros == this.euros && compared.cents > this.cents) {
            return true;
        } else {
            return false;
        }
    }

    public Money minus(Money decremented) {
        if ((this.euros - decremented.euros) >= 0) {
            if (this.cents < decremented.cents) {
                Money c = new Money(this.euros - decremented.euros - 1, this.cents + 100 - decremented.cents);
                return c;
            } else {
                Money c = new Money(this.euros - decremented.euros, this.cents - decremented.cents);
                return c;

            }
        }
        else {
            Money c = new Money(0,0);
            return c;
        }
            
        
    }

        @Override
        public String toString
        
        
        
            () {
        String zero = "";
            if (cents < 10) {
                zero = "0";
            }

            return euros + "." + zero + cents + "e";
        }

    }
