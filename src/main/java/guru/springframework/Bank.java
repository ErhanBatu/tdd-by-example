package guru.springframework;

public class Bank {

    Money reduce(Expression source, String toCurency){
        return source.reduce(toCurency);
    }
}


