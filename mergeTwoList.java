

public class mergeTwoList {
    public static void main(){

        
    }

    public  ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode LAST1  = null ;
        
        while(l1!= null){
            LAST1 = l1;
            l1 = l1.next;
        }   


        LAST1.next = l2;



        ListNode head = sortList(l1);



        return head ;
    }

    public ListNode sortList(ListNode head) {
        ListNode current = head;
        ListNode index = null ;
        ListNode min = null;
        while( current != null){

            index = current.next;
            min = current ;
            

            while(index != null){
                if(index.val < min.val){
                    min = index;
                }
                index = index.next;
            }

            int temp = current.val;
            current.val = min.val;
            min.val = temp;


            current = current.next;
        
        }   


        return head ;
    }
}
