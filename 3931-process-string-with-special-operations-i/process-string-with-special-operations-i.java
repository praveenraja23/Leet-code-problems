class Solution {
    public String processStr(String s) {
        StringBuilder answer = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                answer.append(c);
            } 
            else if (c == '#') {
                answer.append(answer);
            } 
            else if (c == '*') {
                if (answer.length() > 0) {
                    answer.deleteCharAt(answer.length() - 1);
                }
            } 
            else if (c == '%') {
                answer.reverse();
            }
        }
        return answer.toString();
    }
}