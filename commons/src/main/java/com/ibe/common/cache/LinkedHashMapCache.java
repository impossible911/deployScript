package com.ibe.common.cache;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapCache<K, V> extends CacheTemplate<K, V> implements Serializable {

    static class LRUCache<K, V> extends LinkedHashMap<K, V> {

        private static final long serialVersionUID = -6810827693829374752L;

        private int initCacheSize;

        public LRUCache(int initSize) {
            super(initSize, 0.75F, true);
            this.initCacheSize = initSize;
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
            return size() > initCacheSize;
        }

    }

    private static final long serialVersionUID = -8859016953174125587L;

    private static final int noArgsSize = 32;

    public LinkedHashMapCache(int i) {
        super(new LRUCache<>(i));
    }

    public LinkedHashMapCache() {
        super(new LRUCache<>(noArgsSize));
    }
}
