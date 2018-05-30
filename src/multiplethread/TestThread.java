package multiplethread;

/**
 * @author yann
 *
 */
public class TestThread {
	public static void main(String[] args) {
		Thread t1 = new Thread(){
			@Override
			public void run() {
				int seconds =0;
				while(true){
					try{
						Thread.sleep(1000);
					} catch (InterruptedException e){
						e.printStackTrace();
					}
//					System.out.println("已经玩了LOL %d 秒%n", seconds++);
					System.out.printf("已经玩了LOL %d 秒%n", seconds++);
				}
			}
		};
		t1.start();
		
	}
}
