public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Solution S = new Solution();
        int k =S.solution(")))()()()(()))(((()((()(()((",3);

        System.out.println(k);



    }
}

// Test cases

/*
S = (, K= 0
S = (, K= 1
S = (), K= 1
S = )(, K= 1
S = )(, K= 2
S = )), K= 1
S = (((()), K= 1
S = (()))), K= 1
S = )())())(, K= 8
S = (((, K= 1
S = ((()(((, K= 3
S = )))((()(((, K= 3
S = )))()()()(()))(((()((()(()((, K= 3
S = ())())())())())(()(()(()(()((), K= 2
S = ())())())())())(()(()(()(()((), K= 3
S = ())())())())())(()(()(()(()((), K= 4
S = ()))(()(())))((())))))((((()((()))))(((())((()))))(((((((((())((((())()), K= 1
S = ()))(()(())))((())))))((((()((()))))(((())((()))))(((((((((())((((())()), K= 2
S = ()))(()(())))((())))))((((()((()))))(((())((()))))(((((((((())((((())()), K= 3
S = (()))))(()((())), K= 1
S = (()))))(()((())), K= 2
S = (()))))(()((())), K= 3
S = (()()()))))(()((())), K= 1
S = (()()()))))(()((())), K= 2
S = (()()()))))(()((())), K= 3
S = ()))(()))(((()((()(()((, K= 2
S = (((((())(((())))))(((((((((()))((()))((()))((()))(((), K= 0
S = (((((())(((())))))(((((((((()))((()))((()))((()))(((), K= 1
S = (((((())(((())))))(((((((((()))((()))((()))((()))(((), K= 2
S = (((((())(((())))))(((((((((()))((()))((()))((()))(((), K= 5
S = ()))((()))((()))((()))((())))))))))(((((())))(()))))), K= 2
S = (()(()(()(())))))))((((()(()(()((), K= 1
S = (()(()(()(())))))))((((()(()(()((), K= 3
S = (()(()(()(())))))))((((()(()(()((), K= 8
S = ((()((()((()((())))))))))))))))()(((((((((((((((()))()))()))())), K= 1
S = ((()((()((()((())))))))))))))))()(((((((((((((((()))()))()))())), K= 4
S = ((()((()((()((())))))))))))))))()(((((((((((((((()))()))()))())), K= 8
S = (())))((, K= 3
S = ))()))())(()()(()(((, K= 3
S = (()((((()((((((((((((((((((())((()((((((((((())((((())()())((()(((()()(()(((()(((((()((((((((()(((((, K= 5
S = (())(((((())((((((((())))))((((((((()))))))))((((((()))(()))))))))((((((((())))))((((((((())))))(((, K= 22
S = ((((())))))))))(((((((((())))), K= 7
S = (((((((((((((())))))))))))))))))))))))))))(((((((((((((((((((((((((((()))))))))))))), K= 14
S = ))(()))()(()())()))(()())))())())()((()))(()(()()()))(((()((())((())())(()(()(()(()((()())))(()())())((()))(()(()()()())))(()))(()))(()()))()())()))))))(((()()())()))()())()(()()(())))()())((())((()(((()())))(((()()()((()()((()))())((()(())(((())(()()(((((((()((((()())((()((()))(())(((())())(()(()))()()((((()(())((((())()(((())))(((())((()))(()())))))()((()(((()(()())(())))))((((()())())())())(()()()(()()()(()()()((()((()())()()()(((()(())())(())()))))(())())(()()(()()((())))()())())))))(())()()(((()(()((((((())())()(())(((((())()(((()((((())((())))())))())((((())())))(())())))))((())()()))())((()(((((()))()())(()((()()))(())(()))()((()((())(()()((()))(()()((()))(()(())(()(((()(((())())()(()()()()(())()((((((()(()()((((()())()()((((()()())(())))()(())()((()()))(())(()))))))()()())((((()()))(()()()))))))()((()((((()(((())(()(())(())))))()((()())(((())(())())())()(()(()()()()))(((()()(()))(((()))()(()())))((())((((()()()(())((((()()()((())(()))())()))()(()(((((())()))((()))())()(())())((, K= 10
S = ()))(())()()())))())()))()())())()())))(())()))()(()))))))((())))))(()))))))()))))(()))()())(())(())))))()))))))())))))())()))))((()(())()())))))()))))))))()())))(())))()()))))))())))))()()))(())()()))))))())())))))))))))()(()(()))))(())))))))))())))))))))))))())))))(()))))))()())())())())))))))(())))()(()()())))())()()))()))()))))(())))))(((()())(((()(())))))))))))))())(()))()))))))))(())))))((())))()))()()))))))))()))))())()())(())(())()()())))))))())))((()))))))))))))))))()))())())))))()))))))))())()))))))(()))))())))())))()((())))))(()))))))))())()())(())))())))))()))))))((()()(()))()()))()))))))))))())()))()))((()()))())))()))))))())))))))))))()())()))))))())))())))())))))))()))))()))())()))())))))())))))(()(()()())())))))()())))))))))))))))(()))()())))))))()))))))))))))((())))())())))))))()())()))()))()))))())))())()))))())))))()())))))()))())))(()())(())))()))))((()))((()))))()(())(()))))))))))()())()())))))))))))())))))()))))))(())))))))))))))()))))()))))(()))())))))())())()))(, K= 1000
 */