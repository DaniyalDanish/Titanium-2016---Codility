import java.util.*;

public class Solution {
    public int solution(String S, int K) {
//        System.out.println(S);
//        System.out.println(K);
        int firstPosition;
        int lastPosition;
        int start;
        int end = K * 2;
        int maxLength;
        int currentLength;
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> openingBracket = new Stack<>();
        List<Integer> closingBracket = new ArrayList<>();
        List<Integer> total = new ArrayList<>();

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                stack.push(i);
            } else {
                if (stack.isEmpty()) {
                    closingBracket.add(i);
                } else {
                    stack.pop();
                }
            }
        }

        while (!stack.isEmpty()) {
            openingBracket.push(stack.pop());
        }

        for (int i = 0; i < closingBracket.size(); i++) {
            total.add(closingBracket.get(i));
        }
        while (!openingBracket.isEmpty()) {
            total.add(openingBracket.pop());
        }

        if (end > closingBracket.size() && ((end - closingBracket.size()) % 2 == 1) ) {
                end = end - 2;
        }

        if (end >= total.size()) {
            lastPosition = S.length();
        }
        else
        {
            lastPosition = total.get(end);
        }
        maxLength = lastPosition;


        for (int i = 0; i < total.size(); i++) {
            start = i;
            end = i + (K * 2);
            if (start < closingBracket.size()) {
                if (end > closingBracket.size() && ((end - closingBracket.size()) % 2 == 1)) {
                        end = end - 2;
                        if (end < closingBracket.size()) {
                            end++;
                        }
                }
            }

            if (end >= total.size()) {
                lastPosition = S.length()- 0 ;
            } else {
                lastPosition = total.get(end);
            }
            if (start > 0) {
                firstPosition = total.get(start - 1) + 1;
            } else {
                firstPosition = 0;
            }
            currentLength = lastPosition - firstPosition;
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }
        if (maxLength % 2 == 1)
            return maxLength - 1;
        return maxLength;

    }
}
