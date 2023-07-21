// Java implementation to delete all
// even nodes from the singly linked list
class LinkedList{
	
// head of list
Node head;

// Linked list Node
class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}

// Function to insert a node at
// the beginning of the singly
// Linked List
public void push(int new_data)
{
	Node new_node = new Node(new_data);
	new_node.next = head;
	head = new_node;
}

// Function to delete a node in a
// singly Linked List.
void deleteNode(int key)
{
	
	// Store head node
	Node temp = head, prev = null;

	// If head node itself holds the
	// key to be deleted
	if (temp != null && temp.data == key)
	{
		
		// Changed head
		head = temp.next;
		return;
	}

	// Search for the key to be deleted,
	// keep track of the previous node
	// as we need to change temp.next
	while (temp != null && temp.data != key)
	{
		prev = temp;
		temp = temp.next;
	}

	// If key was not present in linked list
	if (temp == null) return;

	// Unlink the node from linked list
	prev.next = temp.next;
}

// Function to delete all the nodes
// from linked list containing
// even numbers.
void deleteEvenNodes()
{
	Node ptr = head;

	// loop to iterate the linked list
	while(ptr != null)
	{

		// If containing element is even
		if(ptr.data % 2 == 0)
		{
			
			// Delete the node
			deleteNode(ptr.data);
		}
		ptr = ptr.next;
	}
}

// This function prints contents of linked
// list starting from the given node
public void printList()
{
	Node ptr = head;
	while (ptr != null)
	{
		System.out.print(ptr.data + "-> ");
		ptr = ptr.next;
	}
}

// Driver code
public static void main(String[] args)
{
	LinkedList head = new LinkedList();

	head.push(19);
	head.push(18);
	head.push(3);
	head.push(4);
	head.push(1);

	System.out.print("\nInitial List: ");
	head.printList();

	head.deleteEvenNodes();

	System.out.print("\nFinal List: ");
	head.printList();
}
}

// This code is contributed by Amit Mangal
