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


public void inserti(int data,int i)
{
	Node temp=new Node(data);
	if(i>count || i<1 ||count==0)
	{
		System.out.println("try again");
	}

	
	else if(i==1)
	{
		temp.next=head;
		head=temp;
	}
	else if(i==count)
	{
Node p=head;

while(p.next!=null)
{
	p=p.next;
	}

	p.next=temp;
	temp.next=null;
}

else 
{Node ptr=head;
for(int j=1;j<i;j++)
{
	ptr=ptr.next;
}

temp.next=ptr.next;
ptr.next=temp;

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


}

public class link{
	public static void main(String args[])
	{
int i;
Node h;
LinkedList l=new LinkedList();
for(i=0;i<5;i++)
{
l.insertend(i);
	}
l.inserti(10,5);
l.deletei(0);
l.display();
}
}