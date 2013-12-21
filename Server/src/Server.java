import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;



public class Server {
	
	static ServerSocket server;
	static Socket s;
	
	public static void main(String[] args) throws IOException {
		
		server = new ServerSocket(1237);

		
		while(true) {
		// Auf verbindung warten
		s = server.accept();
		// kommunikation an einen nebenläufigen Thread abgeben
		ServerThread t = new ServerThread(s);
		t.start();
		// und wieder auf neue Verbindungen warten
		}
		
	}



}
