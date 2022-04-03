package java_Assignment.Assignment3;

import java.net.InetAddress;
import java.util.*;


public class ping {
    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);
        String ip2 = "www.github.com";
        CalculateTimeToPing(ip2);
    }

    public static void CalculateTimeToPing(String ip){
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            try {
                InetAddress geek = InetAddress.getByName(ip);
                System.out.println("Sending Ping Request to " + ip);
                long start = new GregorianCalendar().getTimeInMillis();
                long finish ;
                if (geek.isReachable(5000)) {
                    finish = new GregorianCalendar().getTimeInMillis();
                    System.out.println("Ping RTT: " + (finish - start + "ms"));
                    ar.add((int) (finish-start));
                } else {
                    System.out.println(ip + " Not Reachable.");
                }
            }
            catch(Exception e){
                System.out.println("Exception:" + e.getMessage());
            }
        }

        Collections.sort(ar);
        System.out.println(ar);
        System.out.println("Median is: "+findMedian(ar));
    }

    private static int findMedian(ArrayList<Integer> ar) {
        int n = ar.size();
        //Collections.sort(ar);
        return ar.get((n-1)/2);
    }
}