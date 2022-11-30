public class Node {
    private  int data;
    private Node referenceNode = null;

    public Node(){

    }

    public Node(int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public Node getReferenceNode() {
        return referenceNode;
    }

    public void setReferenceNode(Node reference) {
        this.referenceNode = reference;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public String toString(){
        return  "No{"+
                "dado="+this.data+
                "}";
    }
}
