package mlti_thread;

public class Calculator {
	private int memory;
	
	public int getMemory() { 
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2 * 1000);
		} catch(Exception e) {}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
}
