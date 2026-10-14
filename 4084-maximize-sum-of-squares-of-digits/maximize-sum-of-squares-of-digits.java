class Solution {
    public String maxSumOfSquares(int num, int sum) {
        String shortest = "9".repeat(sum / 9) + (sum % 9 > 0 ? sum % 9 : "");  // the shortest number with this digit sum
        return shortest.length() <= num ? shortest + "0".repeat(num - shortest.length()) : "";
    }
}