import java.util.*;
class Queue
{
    private static int front,rear,capacity;
    private static int queue[];
    Queue(int c)
    {
        front=rear=0;
        capacity=c;
        queue=new int[capacity];
    }
    void Enqueue(int data)
    {
        if(data==rear)
        {
            System.out.println("Queue is Full");
        }
        else{
            queue[rear]=data;
            rear++;
            
        }
        return;
    }
    void Dequeue()
    {
        if(front==rear)
        {
             System.out.println("Queue is Empty");
        }
        else
        {
            for (int i = 0; i < rear - 1; i++) { 
                queue[i] = queue[i + 1]; 
            } 
  
            if (rear < capacity) 
                queue[rear] = 0; 
  
            rear--; 
        }
        return;
    }
    static void queueDisplay() 
    { 
        int i; 
        if (front == rear) { 
            System.out.printf("\nQueue is Empty\n"); 
            return; 
        } 
  

        for (i = front; i < rear; i++) { 
            System.out.printf(" %d <-- ", queue[i]); 
        } 
        return; 
    } 
  

    static void queueFront() 
    { 
        if (front == rear) { 
            System.out.printf("\nQueue is Empty\n"); 
            return; 
        } 
        System.out.printf("\nFront Element is: %d", queue[front]); 
        return; 
    } 
}
public class Main
{
   
    public static void main(String[] args) 
	{
	    Queue q = new Queue(4); 
  

        q.queueDisplay(); 
  

        q.Enqueue(20); 
        q.Enqueue(30); 
        q.Enqueue(40); 
        q.Enqueue(50); 

        q.queueDisplay(); 
 
  

  
        q.Dequeue(); 
        q.Dequeue(); 
        System.out.printf("\n\nafter two node deletion\n\n"); 
 
        q.queueDisplay(); 
  
        q.queueFront(); 
	    
	}
}
