package com.dylan.factorymethod;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/10/19-下午9:35
 */

public class CookFryFishFactory implements CookFishFactory {
    @Override
    public Fish getFish() {
        return new FryFish();
    }
}
