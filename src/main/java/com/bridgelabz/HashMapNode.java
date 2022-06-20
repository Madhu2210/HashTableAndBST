package com.bridgelabz;

public class HashMapNode<K,V> {
    K key;
    V value;
    HashMapNode<K, V> next;

    public HashMapNode(K key, V value) {
        this.key = key;
        this.value = value;
        next = null;
    }
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;

    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public HashMapNode<K, V> getNext() {
        return next;
    }

    public void setNext(HashMapNode<K, V> next) {
        this.next = (HashMapNode<K, V>) next;
    }

    @Override
    public String toString() {
        StringBuilder nodeString = new StringBuilder();
        nodeString.append("HashMapNode{" + " Key= ").append(key).append(" Value= ").append(value).append('}');
        if (next != null)
            nodeString.append("->").append(next);
        return nodeString.toString();
    }
}

