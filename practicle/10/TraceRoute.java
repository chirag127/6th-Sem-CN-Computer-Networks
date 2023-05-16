import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TraceRoute {
    public static void runSystemCommand(String command) {
        try {
            Process p = Runtime.getRuntime().exec(command);
            BufferedReader inputStream = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String s = "";
            while ((s = inputStream.readLine()) != null)
                System.out.println(s);
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        String ip = "www.google.com";
        // System.out.println("Tracing route to " + ip + " over a maximum of 30 hops:");
        runSystemCommand("traceroute " + ip);
    }
}