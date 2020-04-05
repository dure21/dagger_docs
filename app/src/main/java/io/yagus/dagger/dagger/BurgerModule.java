package io.yagus.dagger.dagger;

import dagger.Module;
import dagger.Provides;
import io.yagus.dagger.BeefPatty;
import io.yagus.dagger.Burger;
import io.yagus.dagger.WheatBun;

// Module에서 객체를 생성합니다.
@Module
public class BurgerModule {

    @Provides
    Burger provideBurger(WheatBun bun, BeefPatty patty) {
        return new Burger(bun,patty);
    }

    @Provides
    WheatBun provideBun() {
        return new WheatBun();
    }

    @Provides
    BeefPatty providePatty() {
        return new BeefPatty();
    }
}
