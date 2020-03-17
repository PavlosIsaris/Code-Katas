package test.java.com.paulisaris.codekatas;

import main.java.com.paulisaris.codekatas.BinaryTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    public void givenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements() {
        BinaryTree bt = createBinaryTree();

        assertTrue(bt.containsNode(6));
        assertTrue(bt.containsNode(4));

        assertFalse(bt.containsNode(1));
    }

    @Test
    public void givenABinaryTree_WhenAddingElements_FindSecondSmallestElement() {
        BinaryTree bt = createBinaryTree();

        assertEquals(4, bt.findSecondSmallestValue());
    }

    @Test
    public void givenABinaryTree_WhenAddingElements_FindSmallestElement() {
        BinaryTree bt = createBinaryTree();

        assertEquals(3, bt.findSmallestValue());
    }

    private BinaryTree createBinaryTree() {
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        return bt;
    }

}