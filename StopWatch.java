package stopWatch;

public class StopWatch {
	private long startTime;
	private long endTime;

	public StopWatch() {
		startTime = System.currentTimeMillis();
	}

	public long start() {
		return startTime = System.currentTimeMillis();
	}

	public long stop() {
		return endTime = System.currentTimeMillis();
	}

	public double getElapsedTime() {
		return (endTime - startTime);// ElapsedTime in
											// millionseconds
	}


}
