## Урок 3. Структуры данных. Связный список.
Реализация выполнена в IDE Eclipse. Проект состоит из двух классов: RedBlackTree (основной класс ) и TestRedBlackTree.java. 

Код реализации левостороннего красно-черного дерева

```
package gb.algoritms.lesson4;

public class RedBlackTree<Integereger extends Comparable<Integereger>> {

    private static final boolean RED = true;
    private static final boolean BLACK = false;

    private Node<Integer> root;

    private static class Node<Integer> {
        Integer value;
        Node<Integer> left;
        Node<Integer> right;
        boolean color;

        Node(Integer value, boolean color) {
            this.value = value;
            this.color = color;
        }
    }

    public void insert(Integer value) {
        root = insert(root, value);
        root.color = BLACK;
    }

    private Node<Integer> insert(Node<Integer> node, Integer value) {
        if (node == null) {
            return new Node<>(value, RED);
        }

        if (value.compareTo(node.value) < 0) {
            node.left = insert(node.left, value);
        } else if (value.compareTo(node.value) > 0) {
            node.right = insert(node.right, value);
        } else {
            return node;
        }

        if (isRed(node.right) && !isRed(node.left)) {
            node = rotateLeft(node);
        }
        if (isRed(node.left) && isRed(node.left.left)) {
            node = rotateRight(node);
        }
        if (isRed(node.left) && isRed(node.right)) {
            flipColors(node);
        }

        return node;
    }

    private boolean isRed(Node<Integer> node) {
        if (node == null) {
            return false;
        }
        return node.color == RED;
    }

    //левый малый поворот
    private Node<Integer> rotateLeft(Node<Integer> node) {
        Node<Integer> x = node.right;
        node.right = x.left;
        x.left = node;
        x.color = node.color;
        node.color = RED;
        return x;
    }
    //правый малый поворот
    private Node<Integer> rotateRight(Node<Integer> node) {
        Node<Integer> x = node.left;
        node.left = x.right;
        x.right = node;
        x.color = node.color;
        node.color = RED;
        return x;
    }

    //смена цвета
    private void flipColors(Node<Integer> node) {
        node.color = RED;
        node.left.color = BLACK;
        node.right.color = BLACK;
    }

    public boolean contains(Integer value) {
        return contains(root, value);
    }

    private boolean contains(Node<Integer> node, Integer value) {
        if (node == null) {
            return false;
        }

        if (value.compareTo(node.value) < 0) {
            return contains(node.left, value);
        } else if (value.compareTo(node.value) > 0) {
            return contains(node.right, value);
        } else {
            return true;
        }
    }
}
```

![image](images\pic1.png)