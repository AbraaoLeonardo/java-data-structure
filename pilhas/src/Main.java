public class Main {
    public static void main(String[] args) {
        Stack test = new Stack();
        test.push(new Node(1));
        test.push(new Node(5));
        test.push(new Node(9));
        test.push(new Node(4));
        test.push(new Node(21));
        test.push(new Node(7));
        System.out.println(test);
        test.pop();
        test.push(new Node(77));
        System.out.println(test);
    }
}