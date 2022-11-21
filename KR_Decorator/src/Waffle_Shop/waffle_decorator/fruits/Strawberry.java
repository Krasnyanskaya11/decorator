package Waffle_Shop.waffle_decorator.fruits;

import Waffle_Shop.waffle_dough.BaseWaffle;

public class Strawberry extends BaseFruit {

    public Strawberry(BaseWaffle waffleToDecorate) {
        super(waffleToDecorate);
        this.price = 0.5;
    }

    public String getDescription() {
        return baseWaffle.getDescription() + " , Strawberry ";
    }

}