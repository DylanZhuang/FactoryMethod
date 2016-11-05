package com.dylan.factorymethod;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/10/19-下午9:34
 */

public class CookSteamFishFactory implements CookFishFactory {
    @Override
    public Fish getFish() {
        return new SteamFish();
    }
}
