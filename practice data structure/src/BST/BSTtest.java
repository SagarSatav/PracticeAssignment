package BST;

public class BSTtest {

	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();
		bst.Addbydata(50);
		bst.Addbydata(30);
		bst.Addbydata(20);
		bst.Addbydata(40);
		bst.Addbydata(70);
	
		bst.preorder(bst.getRoot());
		System.out.println();
		bst.inorder(bst.getRoot());
		System.out.println();
		bst.postorder(bst.getRoot());
		System.out.println();
		
		bst.deleteBydata(30);
		bst.inorder(bst.getRoot());
		System.out.println();
		System.out.println("max :"+bst.getMax());
		System.out.println("min :"+bst.getMin());
}
}