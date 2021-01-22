package com.ibe.common.cache;

public interface Cache<K, V> {

    V get(K k);

    V put(K k, V v);

    void clear();

    V remove(K k);

    int size();
}
