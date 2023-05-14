/*
Given a Linked List, which has nodes in alternating ascending and descending orders. Sort the list efficiently and space complexity should be O(1).
You just need to return the head of sorted linked list, don't print the elements.
Input format :
Line 1 : Linked list elements of length L (separated by space and terminated by -1)
Line 2 : Integer n
Output format :
Updated list elements (separated by space)
Sample Input 1 :
10 40 53 30 67 12 89 -1
Sample Output 1 :
10 12 30 40 53 67 89
*/


public class Solution {

	public static LinkedListNode<Integer> sort(LinkedListNode<Integer> head) {
		//Your code goes here
        for(LinkedListNode<Integer> temp1=head;temp1!=null;temp1=temp1.next)
         {
           for(LinkedListNode<Integer> temp2=head;temp2.next!=null;temp2=temp2.next) 
               if(temp2.data>temp2.next.data){
                   LinkedListNode<Integer> temp=new LinkedListNode<Integer>(0);
                   temp.data=temp2.data;
                   temp2.data=temp2.next.data;
                   temp2.next.data=temp.data;
               }
         }
         return head;
	}

}
