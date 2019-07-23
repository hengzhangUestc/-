前序遍历
根左右
Stack<TreeNode> st = new Stack<>();
while(root != null || !st.isEmpty()) {
	while(root != null) {
		System.out.print(root.val + "->");
		st.push(root);
		root = roo.left;
	}
	if(!st.isEmpty()) {
		TreeNode node = st.pop();
		root = node.right;
	}
}
中序遍历
左根右
Stack<TreeNode> st = new Stack<>();
while(root != null || !st.isEmpty()) {
	while(root != null) {
		st.push(root);
		root = roo.left;
	}
	if(!st.isEmpty()) {
		TreeNode node = st.pop();
		System.out.print(node.val + "->");
		root = node.right;
	}
}
后序遍历
左右根
Stack<TreeNode> st1 = new Stack<>();
Stack<TreeNode> st2 = new Stack<>();
int left = 1; 
int right = 2;
while(root != null || !st.isEmpty()) {
	while(root != null){
		st1.push(root);
		st2.push(left);
		root = roo.left;
	}
	
    if( !st1.isEmpty() && st2.peek() == right) {
		st2.pop();
		System.out.print(st1.pop().val + "->");
	}
	
	if(!st1.isEmpty() && st2.peek() == left) {
		st2.pop();
		st2.push(right);
		root = st1.peek().right;
	}
}
层序遍历   //  用一个队列实现
Queue<TeeNode>  qu = new Queue<>();
qu.add(a[0]);
TreeNode currentNode;
while(! qu.isEmpty()) {
	currentNode  = qu.poll();  //  获取并移除此列表的头
	if(currentNode.left != null) {
		qu.add(currentNode.left);
	}
	if(currentNode.right != null) {
		qu.add(currentNode.right);
	}
	
}








