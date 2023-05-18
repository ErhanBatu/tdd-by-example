package guru.springframework;

public class Money implements Expression {

    //This is my Base class including common properties in Franc and Dollar classes

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    protected String currency(){
        return currency;
    }

    public static Money dollar(int amount){
        return new Money(amount, "USD");
    }

    public static Money franc(int amount){
        return new Money(amount, "CHF");
    }

    public boolean equals(Object object){

        Money money = (Money) object;
        return amount == money.amount
                //if it comes from different classes then it won't be equal
                && this.currency == money.currency;
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }

    public Money times(int multiplier){

        return new Money(amount*multiplier, this.currency);
    }

    public Expression plus(Money added){
        return new Money(amount + added.amount, currency);
    }


}
