package com.ibe.common;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {

    private int cacheSize;

    private boolean accessOrder;

    public LRUCache(int cacheSize) {
        super(16,0.75f, true);
        this.cacheSize = cacheSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() >= cacheSize;
    }

}
