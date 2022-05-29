package DSA;

public class LinkedBinaryTree<E, T> implements BinaryTreeInterface<T> {

    protected static class Node<E> {

        private E element; // an element stored at this node
        private Node<E> parent; // a reference to the parent node (if any)
        Node<E> left; // a reference to the left child
        Node<E> right; // a reference to the right child

        // Constructs a node with the given element and neighbors
        public Node(E e, Node<E> above, Node<E> leftChild, Node<E> rightChild) {
            this.element = e;
            this.parent = above;
            this.left = leftChild;
            this.right = rightChild;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getParent() {
            return parent;
        }

        public void setParent(Node<E> parent) {
            this.parent = parent;
        }

        public Node<E> getLeft() {
            return left;
        }

        public void setLeft(Node<E> left) {
            this.left = left;
        }

        public Node<E> getRight() {
            return right;
        }

        public void setRight(Node<E> right) {
            this.right = right;
        }
    }

    protected Node<E> root = null; // root of the tree
    int n = 0; // number of nodes
    static final int count = 10;

    /*
	public Node<E> delete(E element, Node<E> root) {
		if (element instanceof Integer) {
			int e = (int) element;
			if (root.left == null && root.right == null) {
				if (root.element.equals(element)) {
					root = null;
				}
				return root;
			}

			 if (root.left != null && root.right == null) {
				if (root.element.equals(element))
					return root.left;
				else
					root.left = delete(element, root.left);
				return root;
			}

			else if (root.left == null && root.right != null) {
				if (root.element.equals(element))
					return root.right;
				else
					root.right = delete(element, root.right);
				return root;
			}

			else if (root.left != null && root.right != null) {
				if (root.element.equals(element)) {
					root.element = findMin(root.right).element;					
					root.right = delete(root.element, root.right);
				} else if (e < (int) root.element)
					root.left = delete(element, root.left);
				else
					root.right = delete(element, root.right);
				return root;
			}
		}
		return root;
	}

	public void del(E element) {
		root = delete(element, root);
		n--;
	}

	public void set(Node p, E element) {
		// set element to node p
		p.element = element;
	}
     */
    
    public void join(Node<E> a, Node<E> b) {
        a.left = b;
        b.right = a;
    }

    public Node<E> append(Node<E> a, Node<E> b) {
        // if either is null, return the other
        if (a == null) {
            return (b);
        }
        if (b == null) {
            return (a);
        }

        // find the last node in each using the .previous pointer
        Node aLast = a.left;
        Node bLast = b.left;

        // join the two together to make it connected and circular
        join(aLast, b);
        join(bLast, a);

        return (a);
    }
    
    public Node<E> treeToList(Node<E> root) {
        // base case: empty tree -> empty list
        if (root==null) return(null);
        
        // Recursively do the subtrees (leap of faith!)
        Node aList = treeToList(root.left);
        Node bList = treeToList(root.right);
        
        // Make the single root node into a list length-1
        // in preparation for the appending
        root.left = root;
        root.right = root;
        
        // At this point we have three lists, and it's
        // just a matter of appending them together
        // in the right order (aList, root, bList)
        aList = append(aList, root);
        aList = append(aList, bList);
        
        return(aList);
    }
    
    public void printList(Node<E> head) {
        Node<E> current = head;
        
        while (current != null) {
            System.out.print(current.element.toString());
            current = current.right;
            if (current == head) break;
        }
        
        System.out.println();
    }
    
    @Override
    public T root() {
        // return the node of root
        if (isEmpty()) {
            return null;
        }
        return (T) root.getElement();
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public int numChildren(T p) {
        // number of children of p
        int num = 0; // number of children
        if (p instanceof Node) {
            Node<E> parent = (Node<E>) p;
            if (parent.element != null) {
                if (parent.left != null) { // the left child
                    num++;
                }
                if (parent.right != null) { // the right child
                    num++;
                }
            }
            return num;
        }
        return 0;
    }

    @Override
    public T parent(T p) {
        // check p is a node
        // root has no parent
        if (p instanceof Node) {
            Node<E> child = (Node<E>) p;
            if (child.getElement() != null && child.getElement() != root) {
                if (child.getParent() != null) {
                    return (T) child.getParent();
                }
            }
        }
        return null;
    }

    @Override
    public T left(T p) {
        // check p is a node
        if (p instanceof Node) {
            Node<E> parent = (Node<E>) p;
            if (parent.getElement() != null && parent.getLeft() != null) {
                return (T) parent.getLeft();
            }
        }
        return null;
    }

    @Override
    public T right(T p) {
        // check p is a node
        if (p instanceof Node) {
            Node<E> parent = (Node<E>) p;
            if (parent.getElement() != null && parent.getRight() != null) {
                return (T) parent.getRight();
            }
        }
        return null;
    }

    @Override
    public T sibling(T p) {
        // check p is a node
        // root has no sibling
        if (p instanceof Node) {
            Node<E> node = (Node<E>) p;
            Node<E> parent = node.getParent();
            if (parent != null && node != null && node != root) {
                if (node == parent.getLeft() && parent.getRight() != null) {
                    return (T) parent.getRight();
                } else if (parent.getLeft() != null) {
                    // node == parent.getRight()
                    return (T) parent.getLeft();
                }
            }
        }
        return null;
    }

    public void print(Node<E> r, int space) {
        if (r == null) {
            return;
        }
        space += count; // increase distance between levels
        print(r.getRight(), space); // process right child first
        System.out.println();
        for (int i = count; i < space; i++) {
            System.out.print(" ");
        }
        System.out.println(r.getElement());
        print(r.getLeft(), space); // process left child
    }

    public void output(Node r) {
        print(r, 0);
    }

}
