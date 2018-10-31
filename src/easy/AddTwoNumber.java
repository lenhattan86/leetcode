package easy;

public class AddTwoNumber {.
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

//	https://leetcode.com/articles/two-sum/
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean flag = true;
        ListNode result = null;
        ListNode previousDigit = null;
        ListNode currDigit1 = l1;
        ListNode currDigit2 = l2;
        int digit1 = 0, digit2=0;
        int carry = 0;
        while (flag){
            if (currDigit1 == null && currDigit2 == null && carry == 0){
                break;
            }               
            
            ListNode currDigit = new ListNode(0);
            
            digit1 = 0;
            digit2 = 0;
            if (currDigit1!=null){
                digit1 = currDigit1.val;
                currDigit1 = currDigit1.next;
            }             
            if (currDigit2!=null) {
                digit2 = currDigit2.val;
                currDigit2 = currDigit2.next;
            }            
            
            int sum = digit1 + digit2 + carry;
            currDigit.val = sum % 10;
            carry = sum/ 10;               
            
            if (result==null){
                result = currDigit;   
                previousDigit = currDigit;
                previousDigit.next = null;
            } else {                
                previousDigit.next = currDigit;  
                previousDigit = currDigit;
            } 
            
        }
        return result;
    }
	
	
	public static void main(String[] args) {
		int[] res = new TwoSum().twoSumV1(new int[]{2, 7, 11, 15}, 9);
		Utils.printArray(res);
	}
}
