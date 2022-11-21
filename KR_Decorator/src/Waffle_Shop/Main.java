package Waffle_Shop;
import Waffle_Shop.waffle_decorator.chocolate.*;
import Waffle_Shop.waffle_decorator.fruits.*;
import Waffle_Shop.waffle_decorator.nuts.*;
import Waffle_Shop.waffle_dough.*;

public class Main {


    public static void main(String[] args) {

        // Create first waffle

        BaseWaffle waffle1 = new WrapWaffle();
        System.out.println( waffle1.getDescription() + " $ " + waffle1.getPrice());

        waffle1 = new Strawberry(waffle1);
        System.out.println( waffle1.getDescription() + " $ " + waffle1.getPrice());

        waffle1 = new Banana(waffle1);
        System.out.println( waffle1.getDescription() + " $ " + waffle1.getPrice());

        waffle1 = new Almond(waffle1);
        System.out.println( waffle1.getDescription() + " $ " + waffle1.getPrice());

        // create second waffle

        BaseWaffle waffle2 = new FreeGlutenWaffle();
        System.out.println( waffle2.getDescription() + " $ " + waffle2.getPrice());

        waffle2 = new DarkChocolate(waffle2);
        System.out.println( waffle2.getDescription() + " $ " + waffle2.getPrice());

        waffle2 = new Strawberry(waffle2);
        System.out.println( waffle2.getDescription() + " $ " + waffle2.getPrice());

        waffle2 = new Pineapple(waffle2);
        System.out.println( waffle2.getDescription() + " $ " + waffle2.getPrice());

        waffle2 = new Coconut(waffle2);
        System.out.println( waffle2.getDescription() + " $ " + waffle2.getPrice());


    }
}