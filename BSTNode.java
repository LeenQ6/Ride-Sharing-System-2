public class BSTNode<K extends Comparable <K>, T>{

public T data;
public K key;
public BSTNode<K, T> left, right;

public BSTNode (T d, K k){
data = d;
key = k;
left = right = null;
}
}
