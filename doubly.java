class node
{
	node pre,next;
	int data;
	node(int d)
	{
		data=d;
	}
}
class doub
{
	int count=0;
node head;
node tail;

void insertbeg(int data)
{node temp=new node(data);
	if(head==null)
	{
		head=temp;
		tail=temp;
	}


	else
	{
head.pre=temp;
temp.next=head;
head=temp;

	}
	count++; 
}

void inserti(int data,int i)
{
	node temp=new node(data);
if(count==0 || i<1 || i>count)
{
	System.out.println("try again");
}
else if(i==1)
{
	temp.next=head;
	head.pre=temp;
	head=temp;
}
else if(i==count)
{
	tail.next=temp;
	temp.pre=tail;
	tail=temp;
}
else
{
	node p=head;
	node ptr=head;
	for(int j=1;j<i;j++)
		{
			ptr=p;
	p=p.next;   
}

ptr.next=temp;
temp.next=p;
temp.pre=ptr;
p.pre=temp;
}
}


void deletei(int i)
{
	
if(count==0 || i<1 || i>count)
{
	System.out.println("try again");
}
else if(i==1)
{
	head=head.next;
	head.pre=null;
}
else if(i==count)
{
	tail.pre.next=null;
	tail.pre=null;
}
else
{
	node p=head;
	node ptr=head;
	for(int j=1;j<i;j++)
		{
			ptr=p;
	p=p.next;   
}

ptr.next=p.next;
p.next.pre=ptr;
p.next=null;
p.pre=null;
}
}


void display()
{
	node p=head;
	if(head==null)
	{
		System.out.println("empty");
	}
	else{
	while(p!=null)
	{
		System.out.println(p.data);
		p=p.next;
	}
}
}


}

public class doubly{
	public static void main(String args[])
	{
doub d=new doub();
int i;
for(i=0;i<5;i++)
{
d.insertbeg(i);
}


d.deletei(2);

d.display();
}
}