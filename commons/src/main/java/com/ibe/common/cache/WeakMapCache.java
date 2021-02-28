package com.ibe.common.cache;

import java.io.Serializable;
import java.util.WeakHashMap;

/**
 * @author 92862
 */
public class WeakMapCache<K, V> extends CacheTemplate<K,V> implements Serializable {

    private static final long serialVersionUID = 5509526597742170163L;

    public WeakMapCache() {
        super(new WeakHashMap<K, V>(32, 0.75F));
    }
}
