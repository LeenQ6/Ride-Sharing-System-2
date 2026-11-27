public class BSTNode<K extends Comparable <K>, T>{

public T data;
public K key;
public BSTNode<K, T> left, right;

public BSTNode (K k,T d){
key = k;
data = d;
left = right = null;
}
}
