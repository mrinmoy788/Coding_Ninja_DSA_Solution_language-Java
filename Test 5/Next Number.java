/*
Given a large number represented in the form of a linked list. Write code to increment the number by 1 in-place(i.e. without using extra space).
Note: You don't need to print the elements, just update the elements and return the head of updated LL.
Input Constraints:
1 <= Length of Linked List <=10^6.
Input format :
Line 1 : Linked list elements (separated by space and terminated by -1)
Output Format :
Line 1: Updated linked list elements 
Sample Input 1 :
3 9 2 5 -1
Sample Output 1 :
3 9 2 6
Sample Input 2 :
9 9 9 -1
Sample Output 1 :
1 0 0 0 
*/

/*************** 
 * Following is the Node class already written 
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
	}
}
 ***************/

public class Solution {


	public static LinkedListNode<Integer> addOneUtil(LinkedListNode<Integer> head) {
         LinkedListNode<Integer> res = head;
         LinkedListNode<Integer> temp = null, prev = null;
 
         int carry =1, sum;
 
         while(head != null)
         {
             sum = carry + head.data;
             carry = (sum>=10) ? 1:0;
 
             sum = sum%10;
 
             head.data = sum;
 
             temp = head ;
             head = head.next;
 
         }
 
         LinkedListNode<Integer>newNode = null;
         if(carry > 0)
             newNode =  new LinkedListNode<Integer>(carry);
         temp.next = newNode;
 
         return res;
 
     }
 
     public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){
         LinkedListNode<Integer> prev = null;
         LinkedListNode<Integer> current = head ;
         LinkedListNode<Integer> fwd= null;
         while(current != null){
             fwd = current.next;
             current.next = prev;
             prev = current;
             current = fwd;
         }
         return prev;
     }
     public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head){
         head = reverse(head);
         
         head = addOneUtil(head);
         
         return reverse(head);
     }


}
