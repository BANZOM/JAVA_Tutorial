package Generics.GenericClass;

public class CardBoardBox<T extends Boxable> extends Box<T> {

    @Override
    public double getTotalWeight() {
        return super.getTotalWeight() + 0.1;
    }
    
    
}
