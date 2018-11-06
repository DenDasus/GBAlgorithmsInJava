public class lesson6 {
    public static void main(String[] args) {
        BST<String, Integer> st = new BST<>();
        st.put("E", 2);
        st.put("A", 7);
        st.put("C", 4);
        st.put("S", 3);
        st.put("I", 5);
        st.put("H", 0);
        st.put("R", 10);
        st.put("N", 8);

        System.out.println(st.depth());

        System.out.println(st.contains("H"));
        System.out.println(st.get("R"));
        System.out.println(st.get("B"));
        System.out.println(st.size());
        st.delete("I");
        System.out.println(st.contains("I"));
        System.out.println(st.size());
        System.out.println(st.depth());
    }
}
