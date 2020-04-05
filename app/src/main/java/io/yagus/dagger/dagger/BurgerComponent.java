package io.yagus.dagger.dagger;

import dagger.Component;
import io.yagus.dagger.MainActivity;

// Component는 Module에서 제공받은 객체를 조합하여 필요한 곳에 주입하는 역할을 합니다.
@Component(modules = BurgerModule.class)
public interface BurgerComponent {

    void inject(MainActivity activity);

    @Component.Builder
    interface Builder{
        BurgerComponent build();
        Builder burgerModule(BurgerModule burgerModule);
    }
}
