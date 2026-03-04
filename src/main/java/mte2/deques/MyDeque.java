// Question: Q2 (mte2, gcis124, 2255)
// Package name: deques
// File name: MyDeque.java

package mte2.deques;

import java.util.LinkedList;
import java.util.Iterator;

public class MyDeque {
public class MyDeque<E> implements Deque<E> {
    
    private final LinkedList<Integer> list;
    public MyDeque() {    list = new LinkedList<>();    }

    @Override
    public void enqueueFront(E element)
    {
        element.addFirst();
    }

    @Override
    public void enqueueBack(E element)
    {
        element.addLast();
    }

    @Override
    public E dequeueFront()
    {
        element.removeFirst();
    }

    @Override
    public E dequeueBack()
    {
        element.removeLast();
    }

    @Override
    public int size()
    {
        return element.size();
    }
    public E Iterator()
    {
        Iterator<E> it = list.Iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }


    public static void main(String[] args) 
    { 
        MyDeque md = new MyDeque();

        
    }
}
}