package org.example;

import java.util.HashMap;

public class problem_16_MaxCount_IP {

    public static void main(String[] args) {
        String[] str = {
                "10.0.0.1 bytes=32 time=50ms TTL=63",
                "10.0.0.2 bytes=32 time=50ms TTL=73",
                "10.0.0.4 bytes=32 time=50ms TTL=83",
                "10.0.0.2 bytes=32 time=50ms TTL=93",
        };

        String result = findMostFrequentIP(str);
        System.out.println(result);
    }

    public static String findMostFrequentIP(String[] logs) {
        HashMap<String, Integer> ipCount = new HashMap<>();

        for (String log : logs) {
            String ip = extractIPAddress(log);
            if (isValidIP(ip)) {
                ipCount.put(ip, ipCount.getOrDefault(ip, 0) + 1);
            }
        }

        String mostFrequentIP = null;
        int maxCount = 0;

        for (String ip : ipCount.keySet()) {
            int count = ipCount.get(ip);
            if (count > maxCount) {
                maxCount = count;
                mostFrequentIP = ip;
            }
        }

        return mostFrequentIP;
    }

    private static String extractIPAddress(String log) {
        String[] parts = log.split(" ");
        for (String part : parts) {
            if (isValidIP(part)) {
                return part;
            }
        }
        return ""; // Return empty if no valid IP is found
    }

    private static boolean isValidIP(String ip) {
        String[] segments = ip.split("\\.");
        if (segments.length != 4) return false;

        for (String segment : segments) {
            int num;
            try {
                num = Integer.parseInt(segment);
            } catch (NumberFormatException e) {
                return false; // Not a valid integer
            }
            if (num < 0 || num > 255) return false; // Invalid range
            if (segment.length() > 1 && segment.startsWith("0")) return false; // No leading zeros
        }

        return true;
    }

}
