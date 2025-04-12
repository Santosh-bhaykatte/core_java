package core_Java.example;

/*
* Garbage Collection - process of automatically reclaiming memory by destroying objects that are no longer in use or unreachable. It is an important feature of Java's memory management system. It is designed to free developers from manually allocating & deallocationg memory which leads to memory leaks & dangling pointers

* Purpose - To free up memory occupied by unused objects, ensuring efficient memory utilization
* To prevent memory leaks

* //  How Garbage Collection Works:
* 1. Identifying unreachable objects: JVM identifies unreachable objects by traversing object graph from root references

* 2. Marking: - JVM marks all objects that are reachable. Unreachable objects are considered garbage.

* 3. Sweeping: - garbage collector deallocates (unreachable) objects from memory.

* 4. Compacting: - After sweeping, some garbage collectors compact the memory by moving live objects closer together to reduce fragmentation and improve memory allocation efficiency.

* //Generational Garbage Collection
* Java uses a generational garbage collection strategy, which divides the heap into different generations based on the object's lifetime:

* 1. young generation - newly created objects are allocated in young generation
*       1. eden space - where new objects are created
*       2. survivour space - objects that survive gabage collection in eden space are moved here
* garbage collection here called as Minor gc

* 2. old generation - long lived objects are promoted here
* Garbage collection in the Old Generation is called Major GC or Full GC.

* //Types of garbage collectors
* 1.  Serial GC:
Uses a single thread for garbage collection.
Suitable for single-threaded applications or small heaps.

* 2. Parallel GC (Throughput Collector):
Uses multiple threads for garbage collection.
Suitable for multi-threaded applications with medium to large heaps.

* 3. G1 GC (Garbage-First Collector):
Divides the heap into regions and prioritizes garbage collection in regions with the most garbage.
Suitable for applications with large heaps and low-latency requirements.

* 4.  ZGC (Z Garbage Collector)
Designed for very large heaps (multi-terabyte) with low-latency requirements.
Performs garbage collection concurrently with application threads.

* // Three ways to perform gc:
*
* 1. By nulling the reference
* 2. By assigning one reference to another reference
* 3. By creating anonymous Object
*
* */

class Demo {
    Demo() {
        System.out.println("object created!");
    }
    @Override
    protected void finalize() {
        System.out.println("object is being destroyed!");
    }
}

public class GarbageCollectionEx {
    public static void main(String[] args) {
        for (int i = 1; i <= 100000; ++i) {
            new Object();   //Create objects that become unreachable immediately
        }
        System.gc();    //suggest JVM to perform garbage collection

        Demo demo = new Demo();

        //1. By nulling reference
        demo = null;
        System.gc();    //suggest JVM to perform garbage collection

        Demo d1 = new Demo();
        Demo d2 = new Demo();
        //2. By assigning one ref to another
        d1 = d2;
        System.gc();    //suggest JVM to perform garbage collection

        //3. By creating anonymous object
        new Demo();
        System.gc();
    }
}
