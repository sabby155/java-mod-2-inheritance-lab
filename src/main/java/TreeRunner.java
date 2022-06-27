public class TreeRunner {
    public static void main(String[] args) {
        // your code here
        System.out.println("Running my tree examples");

        Tree baseTree = new Tree();
        baseTree.produceOxygen();

        PineTree myPineTree = new PineTree();
        myPineTree.produceOxygen();
        System.out.println(myPineTree.hasRootSystems);
        myPineTree.produceScent();

        MapleTree myMapleTree = new MapleTree();
        myMapleTree.produceOxygen();
        System.out.println(myMapleTree.hasRootSystems);
        myMapleTree.produceMapleSyrup();

    }
}
