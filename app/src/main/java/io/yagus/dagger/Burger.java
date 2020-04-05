package io.yagus.dagger;

public class Burger {
    public WheatBun bun;
    public BeefPatty patty;

    public Burger(WheatBun bun, BeefPatty patty) {
        this.bun = bun;
        this.patty = patty;
    }
}
