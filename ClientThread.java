package ClientPackageHere;

public class ClientThread extends Thread {
	
    private boolean isRunning = false;

    public ClientThread() {
    }

    public void run() {
        this.isRunning = true;

        while(this.isRunning) {
        	
            System.gc();
            System.out.println("Running garbage collector.");
        	
            try {
                sleep(1500000L);
            } catch (InterruptedException var2) {
                var2.printStackTrace();
            }
        }

    }

    public void shutdown() {
        this.isRunning = false;
    }
    
}
