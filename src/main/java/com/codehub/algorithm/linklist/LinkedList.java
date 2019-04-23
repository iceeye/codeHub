package com.codehub.algorithm.linklist;

import com.kay.pro.alog.basic.Iterator;
import com.kay.pro.alog.basic.List;

public class LinkedList implements List {
	private int size = 0;
	private Node head;
	
	public void add(Object o){
		Node tmp = head;
		while(tmp.next != null) {
		    tmp = tmp.next;
		}
		Node newNode = new Node(o, null);
		tmp.next = newNode;
		
		size++;
	}
	public void add(int index , Object o){
		Node tmp = head;
		Node newNode = new Node(o, null);
		
		if(index == 0) {
		    newNode.next = head;
		    return;
		}
		
		for(int i = 0; i < index - 1; i++) {
		    tmp = tmp.next;
		}
		newNode.next = tmp.next;
		tmp.next = newNode;
		
		size++;
	}
	public Object get(int index){
		return null;
	}
	public Object remove(int index){
		return null;
	}
	
	public int size(){
		return size;
	}
	
	public void addFirst(Object o){
		
	}
	public void addLast(Object o){
		
	}
	public Object removeFirst(){
		return null;
	}
	public Object removeLast(){
		return null;
	}
	public Iterator iterator(){
		return null;
	}
	
	
	private static class Node{
		Object data;
		Node next;
		
		Node() {
		}
		Node(Object data, Node next) {
		    this.data = data;
		    this.next = next;
		}
	}
	
	/**
	 * 鎶婅閾捐〃閫嗙疆
	 * 渚嬪閾捐〃涓� 3->7->10 , 閫嗙疆鍚庡彉涓�  10->7->3
	 */
	public  void reverse(){		
		
	}
	
	/**
	 * 鍒犻櫎涓�涓崟閾捐〃鐨勫墠鍗婇儴鍒�
	 * 渚嬪锛歭ist = 2->5->7->8 , 鍒犻櫎浠ュ悗鐨勫�间负 7->8
	 * 濡傛灉list = 2->5->7->8->10 ,鍒犻櫎浠ュ悗鐨勫�间负7,8,10

	 */
	public  void removeFirstHalf(){
		
	}
	
	/**
	 * 浠庣i涓厓绱犲紑濮嬶紝 鍒犻櫎length 涓厓绱� 锛� 娉ㄦ剰i浠�0寮�濮�
	 * @param i
	 * @param length
	 */
	public  void remove(int i, int length){
		
	}
	/**
	 * 鍋囧畾褰撳墠閾捐〃鍜宭istB鍧囧寘鍚凡鍗囧簭鎺掑垪鐨勬暣鏁�
	 * 浠庡綋鍓嶉摼琛ㄤ腑鍙栧嚭閭ｄ簺listB鎵�鎸囧畾鐨勫厓绱�
	 * 渚嬪褰撳墠閾捐〃 = 11->101->201->301->401->501->601->701
	 * listB = 1->3->4->6
	 * 杩斿洖鐨勭粨鏋滃簲璇ユ槸[101,301,401,601]  
	 * @param list
	 */
	public  int[] getElements(LinkedList list){
		return null;
	}
	
	/**
	 * 宸茬煡閾捐〃涓殑鍏冪礌浠ュ�奸�掑鏈夊簭鎺掑垪锛屽苟浠ュ崟閾捐〃浣滃瓨鍌ㄧ粨鏋勩��
	 * 浠庡綋鍓嶉摼琛ㄤ腑涓垹闄ゅ湪listB涓嚭鐜扮殑鍏冪礌 

	 * @param list
	 */
	
	public  void subtract(LinkedList list){
		
	}
	
	/**
	 * 宸茬煡褰撳墠閾捐〃涓殑鍏冪礌浠ュ�奸�掑鏈夊簭鎺掑垪锛屽苟浠ュ崟閾捐〃浣滃瓨鍌ㄧ粨鏋勩��
	 * 鍒犻櫎琛ㄤ腑鎵�鏈夊�肩浉鍚岀殑澶氫綑鍏冪礌锛堜娇寰楁搷浣滃悗鐨勭嚎鎬ц〃涓墍鏈夊厓绱犵殑鍊煎潎涓嶇浉鍚岋級
	 */
	public  void removeDuplicateValues(){
		
	}
	
	/**
	 * 宸茬煡閾捐〃涓殑鍏冪礌浠ュ�奸�掑鏈夊簭鎺掑垪锛屽苟浠ュ崟閾捐〃浣滃瓨鍌ㄧ粨鏋勩��
	 * 璇曞啓涓�楂樻晥鐨勭畻娉曪紝鍒犻櫎琛ㄤ腑鎵�鏈夊�煎ぇ浜巑in涓斿皬浜巑ax鐨勫厓绱狅紙鑻ヨ〃涓瓨鍦ㄨ繖鏍风殑鍏冪礌锛�
	 * @param min
	 * @param max
	 */
	public  void removeRange(int min, int max){
		
	}
	
	/**
	 * 鍋囪褰撳墠閾捐〃鍜屽弬鏁發ist鎸囧畾鐨勯摼琛ㄥ潎浠ュ厓绱犱緷鍊奸�掑鏈夊簭鎺掑垪锛堝悓涓�琛ㄤ腑鐨勫厓绱犲�煎悇涓嶇浉鍚岋級
	 * 鐜拌姹傜敓鎴愭柊閾捐〃C锛屽叾鍏冪礌涓哄綋鍓嶉摼琛ㄥ拰list涓厓绱犵殑浜ら泦锛屼笖琛–涓殑鍏冪礌鏈変緷鍊奸�掑鏈夊簭鎺掑垪
	 * @param list
	 */
	public  LinkedList intersection( LinkedList list){
		return null;
	}
}
