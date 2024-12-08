class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int countP = 0;
        int countY = 0;
        String[] a = s.split("");
        for(int i=0; i<a.length; i++) {
            if(a[i].equals("p") || a[i].equals("P")) {
                countP++;
            }
            else if(a[i].equals("y") || a[i].equals("Y")) {
                countY++;
            }
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return countP == countY;
    }
}