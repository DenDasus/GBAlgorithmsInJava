import java.util.Random;

public class AlgorithmsLesson6HW {
    final static int countST = 50000;
    final static int countElements = 64;

    public static void main(String[] args) {
        Random rand = new Random();

        BST<Integer, Integer>[] st = new BST[countST];

        //глубина сбалансированного дерева log2(N)
        int balancedDepth = (int) (Math.log10(countElements) / Math.log10(2));
        int countBalanced = 0;

        for (int i = 0; i < countST; i++) {
            st[i] = new BST<>();
            while (st[i].size() < countElements) {
                st[i].put(rand.nextInt(200) - 100, 0);
            }
            if (st[i].depth() == balancedDepth) countBalanced++;
            System.out.println("BST " + i + ": Depth = " + st[i].depth() + ", Size = " + st[i].size());
        }
        System.out.println("Сбалансированных деревьев: " + countBalanced + " из " + countST);
    }
}
