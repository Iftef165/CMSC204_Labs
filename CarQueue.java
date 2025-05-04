import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class CarQueue {

	Queue<Integer> queue;

	public CarQueue() {
		queue = new LinkedList<>();
		Random ran = new Random();

		int count = 50;

		while (count >= 0) {
			Integer randomNum = ran.nextInt(4);
			queue.add(randomNum);
			count--;
		}
	}

	public void addToQueue() {

		class InnerClass implements Runnable {

			@Override
			public void run() {
				Random ran = new Random();
				Integer randomNum = ran.nextInt(4);
				queue.add(randomNum);

			}

		}
	}

	public Integer deleteQueue() {
		return queue.poll();
	}

}
