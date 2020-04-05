package io.yagus.dagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import io.yagus.dagger.dagger.BurgerComponent;
import io.yagus.dagger.dagger.BurgerModule;
import io.yagus.dagger.dagger.DaggerBurgerComponent;

public class MainActivity extends AppCompatActivity {

    @Inject
    Burger burger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 참고사이트: https://www.androidhuman.com/life/2016/06/06/dagger2_resources/

        BurgerComponent component = DaggerBurgerComponent.builder()
                .burgerModule(new BurgerModule())
                .build();

        component.inject(this);

        Log.d("Tag","burger bun: " + burger.bun.getBun()+", patty: " + burger.patty.getPatty());
    }
}
