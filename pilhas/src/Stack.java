public class Stack {
    private Node refNodeInStack;

    public Stack() {
        this.refNodeInStack = null;
    }

    public Node top(){
        return refNodeInStack;
    }

    public void push(Node newNode){
        Node refAux = refNodeInStack;
        refNodeInStack = newNode;
        refNodeInStack.setReferenceNode(refAux);
    }

    public Node pop(){
        if(isEmpty()) return null;
        Node noToRemove = refNodeInStack;
        refNodeInStack = noToRemove.getReferenceNode();
        System.out.println("Node removed "+noToRemove.getData()+"\n");
        return refNodeInStack;
    }

    public boolean isEmpty(){
        return refNodeInStack == null;
    }

    @Override
    public String toString(){
        String finalString = "----------\n";
        finalString += "Stack\n";
        finalString += "----------\n";
        Node aux = refNodeInStack;
        while (true){
            if(aux == null) break;
            finalString += "{dado = "+aux.getData()+"}\n";
            aux = aux.getReferenceNode();
        }
        return finalString;
    }

}
