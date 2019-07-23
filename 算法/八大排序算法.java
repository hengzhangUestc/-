冒泡排序
for(int i = 0 ; i < b.length , i ++)  {
	for (int j = 0 ; j < b.length -1 -i ; j ++ ) {
		if(a[j] > a[j + 1]) {
			//  交换一下
		}
	}
}
选择排序
for(int  i = 0 ; i < b.length ; i ++) {
	for (int j = i ; j < b.legth ; j ++) {
		if(a[i] > a[j]) {
			//  交换一下
		}
	}
}
直接插入排序
for (int i = 1 ; i < b.length ; i ++) {
	int temp = a[i];
	int j = 0 ;
	for (int j = i - 1 ; j >= 0 && a[j] > temp; j --) {
		a[j+1] = a[j];
	}
	a[j+1] = a[j];
}
希尔排序
for(int gap = b.length / 2 ; gap > 0 ; gap /= 2) {   
	for(int i = gap ; i < b.length ; i ++) {  
		int temp = a[i];
		int j = 0 ;
		for(int j = i -1 ; j >= 0 && a[j] > temp ; j -=gap) {
			a[j+gap] = a[j];
		}
		a[j+gap] = a[j];
	}
}
快速排序
int i = low;
int j = hight;
while(i < j) {
	while(i < j && a[j] >= a[low]) {
		j--;
	}
	while(i < j && a[j] <= a[low]) {
		i++;
	}
	//    3 1 2 5 2 6 8 9 4 8  一直行走，直到两种情况相交
	if(i < j ) {
		// 交换一下 a[i] 和 a[j]
	}
}
int temp = a[i];
a[low] = a[i];
a[i] = temp;

quitSort(a,0 , i -1);
quitSort(a,i ,hight);
归并排序
public void merge (int [] a , int low , int hight) {
	int middle = (hight + low) / 2 ;
	
	while(hight > low) {
		merge(a , low ,middle);
		merge(a, middle + 1 , hight);
		mergeSort(a,low ,middle,hight);
	}
}
public void mergeSort (int [] a , int low , int middle,int hight) {
	int [] temp = new int [hight - low + 1];
	int start = low;    //   参数传进来了，新建一个变量接受
	int end = middle + 1;    
	int k = 0;
	while(start <= middle && end <= hight) {
		if(a[start] < a[end]) {
			temp[k++] = a[start++];
		}else {
			temp[k++] = a[end++];
		}
	}
	while(start <= middle) {
		temp[k++] = a[start++];
	}
	while(end <= hight) {
		temp[k++] = a[end++];
	}
	
	for(int i = 0 ; i < k; i ++) {
		a[low + i] = temp[i];
	}
}
堆排序
public static void heapSort(int [] a) {
	heap(a);
	int size = a.length;
	while(size > 1) {
		swap(a , 0, size -1);
		size--;
		heapify(a, 0 , size);  // size这个数组的长度，取不到
	}
}
public static void swap (int [] a , int i , int j ) {
	int temp  = a[i];
	a[i] = a[j];
	a[j] = temp;
}
public static void heap(int [] a) {
	for(int i = 0 ; i < b.length , i++){
		int current = i ;
		int father = (current - 1) / 2;
		while(a[father] < a[current]) {   // 大根堆，升序用大根堆，降序用小根堆
			swap(a,current,father);
			current = father;
			father = (current -1) / 2;
		}
	}
}
public static void heapify(int [] a,int index ,int size) {
	int left = (index * 2) + 1;
	int right = (index * 2) + 2;
	while(left < size) {
		int largest;
		if(left < right && a[right] > a[left]) {
			largest = right;
		}else {
			largest = left;
		}
		
		if(a[largest] < a[index]) {
			break;
		}
		swap(a,largest,index);
		index = largest;
		left = (index * 2) + 1;
		right = (index * 2) + 2;
	}
	
}
基数排序
int max = a[0];
for(int i = 1 ; i < b.length ; i++) {
	if(a[i] > max) {
		max = a[i];
	}
}

int time = 0 ;
while(max > 0) {
	max /= 10;
	time++;
}

ArrayList<ArrayList<Integer>>  lists = new ArrayList<>();
for(int i = 0 ; i < 10 ; i++ ) {
	ArrayList<Integer> list1 = new ArrayList<>();
	lists.add(list1);
}

for(int i = 0 ; i < time ; i++) {
	for(int j = 0 ; j < b.length ; j++) {
		int x = a[j] % (int)Math.pow(10 , i+1) / (int)Math.pow(10 , i);
		ArrayList<Ingeter> list2 = lists.get(x);
		list2.add(a[j]);
		// lists.set(x , list2); 更新
	}
}

int count = 0;
for(int i = 0 , i < 10 ; i ++) {
	while(lists.get(i).size > 0) {
		ArrayList<Ingeter> list3 = lists.get(i);
		a[conunt++] = list3.get(0);
		list3.remove(0);
	}
}











