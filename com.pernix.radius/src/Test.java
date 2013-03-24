import com.pernix.log.ConsoleLogging;
import com.pernix.log.ILog;
import com.pernix.radius.RadiusServer;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    ILog log = new ConsoleLogging();
	    RadiusServer server = new RadiusServer(log);
	    server.start(true, true);
	}

}
