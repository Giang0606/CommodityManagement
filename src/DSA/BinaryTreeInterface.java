package DSA;

public interface BinaryTreeInterface<T> {
	T root();
	int size(); // number of node
	boolean isEmpty();
	int numChildren(T p); // number of children of element p

	T parent(T p);
	T left(T p);
	T right(T p);
	T sibling(T p);
}
