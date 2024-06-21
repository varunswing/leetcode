# Thread in Java Cheat Sheet

## Extending the Thread class:

You can create a class that extends the Thread class and overrides the run() method.
Then, you can instantiate an object of that class and call its start() method to begin execution.

### CODE

```java
class Multi extends Thread{  
    public void run(){  
        System.out.println("thread is running...");  
    }  

    public static void main(String args[]){  
        Multi t1 = new Multi();  
        t1.start();  
    }  
}  
```

## Implementing the Runnable interface:

You can create a class that implements the Runnable interface, which requires you to implement the run() method.
Then, you can pass an instance of this class to a Thread object and start the thread.

### CODE

```java
class Multi3 implements Runnable{  
    public void run(){  
        System.out.println("thread is running...");  
    }  
    
    public static void main(String args[]){  
        Multi3 m1 = new Multi3();  
        Thread t1 = new Thread(m1);   // Using the constructor Thread(Runnable r)  
        t1.start();  
    }  
}  
```

// Creating a thread using Runnable
Thread thread = new Thread(new MyRunnable());
thread.start();


## Using the Thread Class: Thread(String Name):

We can directly use the Thread class to spawn new threads using the constructors defined above.

### CODE

```java
public class MyThread 
{  
    public static void main(String argvs[])  
    {  
        // creating an object of the Thread class using the constructor Thread(String name)   
        Thread t = new Thread("My first thread");  
        
        t.start();  
        // getting the thread name by invoking the getName() method  
        String str = t.getName();  
        System.out.println(str);  
    }  
}  
```


## Using the Thread Class: Thread(Runnable r, String name)
Observe the following program.

### CODE

```java
public class MyThread2 implements Runnable  
{    
    public void run()  
    {    
        System.out.println("Now the thread is running ...");    
    }    
        
    public static void main(String argvs[])  
        {   
        // creating an object of the class MyThread2  
        Runnable r1 = new MyThread2();   
        
        // creating an object of the class Thread using Thread(Runnable r, String name)  
        Thread th1 = new Thread(r1, "My new thread");    
        
        // the start() method moves the thread to the active state  
        th1.start();   
        
        // getting the thread name by invoking the getName() method  
        String str = th1.getName();  
        System.out.println(str);  
    }    
}   
``` 


## Using Lambda expressions (Java 8 and later):

With Java 8 lambda expressions, you can simplify the creation of threads, 
especially when using the Runnable interface.

### CODE

```java
// Creating a thread using Lambda expression
Thread thread = new Thread(() -> {
    // Thread logic goes here
});
thread.start();
```


## Using Executor Framework:

Java provides the Executor framework to manage threads more efficiently. 
You can use classes like ExecutorService and ThreadPoolExecutor to create and manage threads.

### CODE


```java
ExecutorService executor = Executors.newFixedThreadPool(5); // Creating a thread pool with 5 threads
executor.execute(() -> {
    // Thread logic goes here
});
executor.shutdown(); // Remember to shutdown the executor when done

```

These are some of the common ways to create threads in Java. 
The choice of method depends on the specific requirements and design of your application.



## MULTI THREADING

### CODE

```java
class First implements Runnable
{
    Thread t; String S;
    First(String Name){
        S=Name;
        t = new Thread(this,S);
        System.out.println("CHILD :" + t);
        t.start();
    }
    public void run( ) {
        try{ for(int i = 5; i>0, i- -) {
            System.out.println(S + " :" + i);
                Thread.sleep(1000); }
        } //END OF TRY BLOCK
        catch(InterruptedException e){ }
        System.out.println("EXITING " + S);
    } 
}

class Second
{
    public static void main(String [ ]args) throws IOException
    {
        new First("ONE");
        new First("TWO");
        new First("THREE");
        try{
            Thread.sleep(20000);
        } //END OF TRY BLOCK
        catch(InterruptedException e){ }
        System.out.println("EXITING MAIN");
    }
}
```

Output
```java
CHILD =THREAD [ONE, 5, main]
CHILD =THREAD [TWO, 5, main]
CHILD =THREAD [THREE, 5, main]
ONE : 5 ONE : 2
TWO : 5 TWO : 2
THREE : 5 THREE:2
ONE : 4 ONE : 1
TWO : 4 TWO : 1
THREE : 4 THREE : 1
ONE : 3 EXITING ONE
TWO : 3 EXITINGTWO
THREE : 3 EXITINGTHREE
EXITING MAIN
```

In the code above, we have implemented multi-threading by using the run method### .
Then we have initiated a thread by using the constructor, since the thread is created from it.
Then we can start by calling the start() method. Run the code in your editor to see how it works.### 
