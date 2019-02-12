class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data=d;
	}
}
class LinkedList
{
	int count=0;
	Node head;

	public void insertend(int data)
	{
		Node temp =new Node(data);
if(head==null)
{

	head=temp;
	}
	else
	{
		Node current=head;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=temp;
	}
	count++;
}



public void display()
{Node p=head;
	if (head==null)
	{
		System.out.println("empty");}
		else
		{
			while(p!=null)
			{
					System.out.println(p.data);
				p=p.next;                                                       
			                                                        
		}                                                            
	}
}

public void deletei(int pos)
{

	if(pos<1 || pos>count || count==0)
	{
		System.out.println("Try again");
	}

	else if(pos==1)
	{
		head=head.next;
	}
	else if(pos==count)
	{
		Node p=head;
		Node ptr=head;
		while(p.next!=null)
		{
			ptr=p;
			p=p.next;
		}
		ptr.next=null;
	}
	else
	{Node pt=head;
		for(int i=1;i<pos-1;i++)
		{
pt=pt.next;
		}
		pt.next=pt.next.next;    
	}

}


void del()

{
Node p=head;
Node ptr=p.next;
int i,j;
int count1=0;
int count2=1;
for(i=1;i<count-1;i++)
{count1++;
	for(j=1;j<count-1;j++)
	{count2++;
		if(p.data+ptr.data==0)
		{
			deletei(count1++);
			deletei(count2++);
			break;
		}
		else
		{
		ptr=ptr.next;
		}



	}

	p=p.next;
	ptr=p.next;
}

}


}

public class numberalt{
	public static void main(String args[])
	{
int i;
Node h;
LinkedList l=new LinkedList();

l.insertend(1);
l.insertend(3);
l.insertend(-1);
l.insertend(5);
l.insertend(-1);
	

l.display();

l.del();
l.display();
}
}