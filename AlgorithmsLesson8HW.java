public class AlgorithmsLesson8HW {
    public static void main(String[] args) {
        ChainingHashST<Integer, String> chst = new ChainingHashST<>();

        chst.put(1, "1");
        chst.put(5, "5");
        chst.put(7, "7");
        chst.put(98, "98");
        chst.put(195, "195");
        chst.put(292, "292");
        chst.put(5, "5_2");
        System.out.println(chst.get(1));
        System.out.println(chst.get(195));
        System.out.println(chst.get(5));

        LinearProbingHashST lphst = new LinearProbingHashST();
        lphst.put(1, "1");
        lphst.put(5, "5");
        lphst.put(7, "7");
        lphst.put(98, "98");
        lphst.put(195, "195");
        lphst.put(292, "292");
        lphst.put(5, "5_2");
        System.out.println(lphst.get(1));
        System.out.println(lphst.get(195));
        System.out.println(lphst.get(5));

        SquareProbingHashST sphst = new SquareProbingHashST();
        sphst.put(1, "1");
        sphst.put(5, "5");
        sphst.put(7, "7");
        sphst.put(98, "98");
        sphst.put(195, "195");
        sphst.put(292, "292");
        sphst.put(5, "5_2");
        System.out.println(sphst.get(1));
        System.out.println(sphst.get(195));
        System.out.println(sphst.get(5));

        DoubleHashingHashST dhhst = new DoubleHashingHashST();
        dhhst.put(1, "1");
        dhhst.put(5, "5");
        dhhst.put(7, "7");
        dhhst.put(98, "98");
        dhhst.put(195, "195");
        dhhst.put(292, "292");
        dhhst.put(102, "102");
        dhhst.put(199, "199");
        dhhst.put(296, "296");
        dhhst.put(5, "5_2");
        System.out.println(dhhst.get(1));
        System.out.println(dhhst.get(195));
        System.out.println(dhhst.get(5));
    }
}
