package Problem2;

public class SingleLinkedList
{
    private ListNode head;
    private int size;

    public SingleLinkedList()
    {
        this.head = new ListNode();
    }

    // copy constructor
    public SingleLinkedList(SingleLinkedList list)
    {
        this.size = list.getSize();
        this.head = new ListNode();
        if(list.getSize() >= 1)
            this.head.val = list.head.val;

        ListNode thisTemp = this.head;
        ListNode thatTemp = list.head;
        for(int i = 0; i < list.getSize(); i++)
        {
            thisTemp.next = new ListNode(thatTemp.next.val);
            thisTemp = thisTemp.next;
            thatTemp = thatTemp.next;
        }
    }

    public int removeAll(int valueToRemove)
    {
        if(this.size == 0)
            return 0;
        int count = 0;
        ListNode temp = this.head;
        for(int i = 0; i < this.getSize(); i++)
        {
            if(temp.next.val == valueToRemove)
            {
                temp.next = temp.next.next;
                count++;
                this.size--;
                i--;
                continue;
            }
            temp = temp.next;
        }
        //if(this.head.next.val == valueToRemove)
        //    this.head.next = this.head.next.next;
        return count;
    }

    public void reverse()
    {
        if(this.size <= 1)
            return;

        ListNode curr = this.head.next.next;
        ListNode prev = this.head.next;
        this.head.next.next = null;

        for(int i = 0; i < this.size-2; i++)
        {
            ListNode nextCurr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextCurr;
        }
        this.head.next = curr;
        this.head.next.next = prev;
    }

    // do not change any function below

    public SingleLinkedList(int[] data) {
        this();
        if (data == null) {
            return;
        }
        ListNode ptr = head;
        for (int datum : data) {
            ptr.next = new ListNode(datum);
            ptr = ptr.next;
            size++;
        }
    }

    // Appends the specified element to the end of this list
    public void add(int val) {
        size++;
        ListNode ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = new ListNode(val);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        ListNode ptr = head.next;
        while (ptr != null) {
            builder.append(ptr.val).append(ptr.next == null ? " -> end " : " -> ");
            ptr = ptr.next;
        }
        return builder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof SingleLinkedList)) {
            return false;
        }

        SingleLinkedList otherList = (SingleLinkedList) obj;

        if (this.size != otherList.size) {
            return false;
        }
        ListNode n1 = head.next;
        ListNode n2 = otherList.head.next;
        while (n1 != null && n2 != null) {
            if (n1.val != n2.val) {
                return false;
            }
            n1 = n1.next;
            n2 = n2.next;
        }
        return (n1 == null && n2 == null);
    }

    public int getSize() {
        return size;
    }
}
