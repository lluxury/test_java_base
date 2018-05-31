package multiplethread;
   
import java.util.concurrent.atomic.AtomicInteger;
   
public class TestThread {
   
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger atomicI =new AtomicInteger();
        int i = atomicI.decrementAndGet();
        int j = atomicI.incrementAndGet();
        int k = atomicI.addAndGet(3);
         
    }
   
}