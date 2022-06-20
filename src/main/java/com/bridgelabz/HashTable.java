package com.bridgelabz;

public class HashTable<K,V>{
    HashMapNode head;
    HashMapNode tail;

    public V get(K word) {
        HashMapNode<K, V> myNode = searchNode(word);
        return (myNode == null) ? null : myNode.getValue();
    }

    public HashMapNode<K, V> searchNode(K word) {
        HashMapNode<K, V> currentNode = head;
        int position = 0;
        while (currentNode != null) {
            position++;
            if (currentNode.getKey().equals(word)) {
                return currentNode;
            }
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    public void add(K key, V value) {
        HashMapNode<K, V> myNode = searchNode(key);
        if (myNode == null) {
            myNode = new HashMapNode<>(key, value);
            this.append(myNode);
        } else
            myNode.setValue(value);

    }
    private void append(HashMapNode<K, V> myNode) {
        if (this.head == null)
            this.head = myNode;
        if (this.tail == null)
            this.tail = myNode;
        else {
            this.tail.setNext(myNode);
            this.tail = myNode;
        }
    }

    @Override
    public String toString() {
        return "MyLinkedListNodes{" + head + '}';
    }

    public void printNodes() {
        System.out.println("My nodes: " + head);
    }
}

