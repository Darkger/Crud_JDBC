package com.eugene.crude.crude.practic.factory.FactoryImpl;


import com.eugene.crude.crude.practic.factory.RegionFactory;
import com.eugene.crude.crude.practic.model.Region;

public class RegionFactoryImpl implements RegionFactory {
    @Override
    public Region create() {
        return new Region() ;
    }
}
