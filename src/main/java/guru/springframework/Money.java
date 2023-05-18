package guru.springframework;

public abstract class Money {

    //This is my Base class including common properties in Franc and Dollar classes

    protected int amount;

    public abstract Money times (int multiplier);

    public static Money dollar(int amount){
        return new Dollar(amount);
    }

    public static Money franc(int amount){
        return new Franc(amount);
    }

    public boolean equals(Object object){

        Money money = (Money) object;
        return amount == money.amount
                //if it comes from different classes then it won't be equal
                && this.getClass().equals(object.getClass());
    }

}
