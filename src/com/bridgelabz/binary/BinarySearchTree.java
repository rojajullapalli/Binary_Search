package com.bridgelabz.binary;

public class BinarySearchTree<K extends  Comparable<K>> {
    private MyBinaryNode<K> root;

    public void add(K key) {
        this.root = this.addRecursively(root, key);
    }

    private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
        if (current == null)
            return new MyBinaryNode<>(key);
        int compareResult = key.compareTo(current.key);
        if (compareResult == 0)
            return current;
        if (compareResult < 0)
            current.left = addRecursively(current.left, key);
        else
            current.right = addRecursively(current.right, key);
        System.out.println(current);
        return current;
    }

    public int getSize(){
        //return  this.getSizeRecursive(root);
        int size = getSizeRecursive(root);
        if(size == 0)
            System.out.println("tree is empty");
        else
            System.out.println("Elements in tree = " + size);
        return size;
    }

    public int getSizeRecursive(MyBinaryNode<K> current) {
        int sizeValue;
        if(current == null)
            sizeValue=0;
        else
            sizeValue= 1+this.getSizeRecursive(current.left)+this.getSizeRecursive(current.right);
        return sizeValue;
    }

}
