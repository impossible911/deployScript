package com.ibe.common.cache;

import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

/**
 * 只提供简单存储查询功能
 * 不能保证存储一定成功
 * @param <K>
 * @param <V>
 */
public class CacheTemplate<K, V> implements Cache<K, V> {

    private final Map<K, V> cache;

    private final ReentrantReadWriteLock cacheLock = new ReentrantReadWriteLock();

    private final ReadLock readLock = cacheLock.readLock();

    private final WriteLock writeLock = cacheLock.writeLock();

    public CacheTemplate(Map<K, V> cache) {
        this.cache = cache;
    }

    @Override
    public V get(K k) {
        readLock.lock();
        V value;
        try {
            value = cache.get(k);
        } finally {
            readLock.unlock();
        }
        return value;
    }

    @Override
    public V put(K k, V v) {
        writeLock.lock();
        try {
            cache.put(k, v);
        } finally {
            writeLock.unlock();
        }
        return v;
    }

    @Override
    public V remove(K k) {
        writeLock.lock();
        V value;
        try {
            value = cache.remove(k);
        } finally {
            writeLock.unlock();
        }
        return value;
    }

    @Override
    public int size() {
        return cache.size();
    }

    @Override
    public void clear() {
        writeLock.lock();
        try {
            cache.clear();
        } finally {
            writeLock.unlock();
        }
    }
}
