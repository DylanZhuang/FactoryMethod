package com.dylan.factorymethod;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/10/19-下午9:35
 */

public class CookStewFishFactory implements CookFishFactory {
    @Override
    public Fish getFish() {
        return new StewFish();
    }
}
