package BST;

public class BinarySearchTree {
	private Node root;

	public BinarySearchTree() {
		root=null;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	public boolean Addbydata(int data) {
		Node newNode=new Node(data);
		if(newNode==null) {
			return false;
		}
		if(root==null) {
			root=newNode;
			return true;
		}
		 Node temp=root;
		while(true) {
			if(data==temp.getData()) {
				return false;
			}
			if(data<temp.getData()) {
				if(temp.getLeft()==null) {
					temp.setLeft(newNode);
					return true;
				}
				temp=temp.getLeft();
			}
			
			else {
				if(temp.getRight()==null) {
					temp.setRight(newNode);
					return true;
				}
				temp.getRight();
			}
			
		}
	}
	
	
	public void preorder(Node root) {
		if(root==null) {
			return;
			}
		
			System.out.print(root.getData()+" ");
			preorder(root.getLeft());
			preorder(root.getRight());
		
	}
	
	public Integer getMax() {
		if(root==null) {
			return null;
		}
		Node temp=root;
		while(temp.getRight()!=null) {
			temp=temp.getRight();
		}
		return temp.getData();
	}
	
	public Integer getMin() {
		if(root==null) {
			return null;
		}
		Node temp=root;
		while(temp.getLeft()!=null) {
			temp=temp.getLeft();
		}
		return temp.getData();
	}
	
	public boolean deleteBydata(int data) {
		if(root==null) {
			return false;
		}
		//locate
		Node parent=root, del=root;
		while(del.getData()!=data) {
			parent=del;
					
			if(data<del.getData()) {
				del=del.getLeft();
			}
			else {
				del=del.getRight();
			}
			if(del==null) {
				return false;
			}
		}
		
		while(true) {
			//terminal node
			if(del.getLeft()==null && del.getRight()==null) {
			if(del==root) {
				root=null;
				return true;
			}
			if(del==parent.getLeft()) {
				parent.setLeft(null);
			}
			else {
				parent.setRight(null);
			}
			return true;
			}
			
			//non terminal
			if(del.getLeft()!=null) {
				Node max=del.getLeft();
				parent=del;
			
				while(max.getRight()!=null) {
					parent=max;
					max=max.getRight();
				}
				int temp=del.getData();
				del.setData(max.getData());
				max.setData(temp);
				del=max;
				
			}
			else {
				Node min=del.getLeft();
				parent=del;
				
				while(min.getLeft()!=null) {
					parent=min;
					min=min.getLeft();
				}
				int temp=min.getData();
				min.setData(del.getData());
				del.setData(temp);
				del=min;
				
			}
		}
		
	}

	public void inorder(Node root) {
		if(root==null) {
			return;
			}
		inorder(root.getLeft());
			System.out.print(root.getData()+" ");
			
			inorder(root.getRight());
		
	}
	
	public void postorder(Node root) {
		if(root==null) {
			return;
			}
		postorder(root.getLeft());
			
			
			postorder(root.getRight());
			System.out.print(root.getData()+" ");
	}
	
	
	
	
	
	
	
	
	
}
