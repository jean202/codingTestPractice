package com.company;

public class Main {

    public static void main(String[] args) {
        int n = 25;
        System.out.println(factorialTail(n));
    }
    /*
    팩토리얼 꼬리 문제
    팩토리얼은 자연수 n에 대해 1부터 n까지 모든 숫자를 곱하는 것을 의미하며 n팩토리얼은 n!라고 표기합니다. 예를 들어 3!은 1 x 2 x 3 = ㅅ6입니다.
    그리고 n!을 계산했을 때 가장 낮은 자리부터 연속되어 나타나는 0의 개수를 팩토리얼 꼬리의 길이라고 합니다.
    예를 들어 n = 10인 경우 10!은 3628800이며 가장 낮은 자리부터 연속해서 2개의 0이 있으므로 팩토리얼 꼬리의 길이는 2입니다.
    입력으로 n이 주어질 때 팩토리얼 꼬리의 길이를 반환하는 함수를 완성해 주세요.

    제한사항
    n은 2의 31제곱 -1 이하의 자연수 입니다.

    입출력 예
    n   result
    5   1
    10  2
    */

    // while문
//    public static int factorialTail(int n) {
//        int countZero = 0;
//        int i = 1;
//        while(n > i) {
//            i *= 5;
//            countZero += (int) (n / i);
//        }
//        return countZero;
//    }

    // for문
    // 안되었던 이유 : 5로 나누고, 25로 나누고 해줘야 하는데 i < n 이었을때는 n이 5나 25일 경우 해당 값으로 나눠주지 못했어서
    public static int factorialTail(int n) {
        int countZero = 0;
        for(int i = 5; i <= n; i *= 5) {
            countZero += (int)(n / i);
        }
        return countZero;
    }

    /*
    최대 이윤 구하기
     금 한 돈의 값은 매일 변합니다. 금값이 낮을 때 금을 사고, 높을 때 팔면 이익을 낼 수 있습니다. 다음 규칙에 맞게 금을 사고팔아 이익을 남기려고 합니다.
    - 금은 여러 번 사고팔 수 있습니다.
    - 금을 살 때는 한 돈만 살 수 있으며 팔 때도 한 돈만 팔 수 있습니다.
    - 금은 최대 한돈까지만 가지고 있을 수 있습니다.(즉, 현재 가지고 있는 금을 팔기 전까지는 금을 살 수 없습니다.)
    - 금을 판 날과 다음 날에는 금을 사지 않습니다.
    - 이익이 발생하지 않는다면 금을 사고 팔지 않아도 됩니다.

    i번째 요소가 i번째 일의 금 한 돈 값인 배열 gold_prices가 매개변수로 주어질 때, 금을 사고 팔아 얻을 수 있는 최대 solution 함수를 완성해 주세요.

    제한사항
    - 배열 gold_prices의 크기 : 100,000 이하의 자연수
    - 금값 (배열의 원소) : 10,000 이하의 자연수

    입출력 예
    gold_prices 		result
    [2,5,1,3,4]			4
    [7,2,5,6,1,4,2,8]	10

    입출력 예 설명
    입출력 예 #1
    금 한 돈의 시세가 [2, 5, 1, 3, 4] 일 때 첫날 금을 사서 둘째 날 금을 팔고, 하루를 쉰 다음 넷째 날 금을 사서 다섯째 날 금을 팔면 총 4의 이익이 생깁니다.

    입출력 예 #2
    다음과 같이 금을 사고팔면 10의 이익을 남길 수 있습니다.
    - [-, buy, sell, x, -, buy, sell]
    즉, 둘째 날에 2에 금을 사고 넷짜 날에 6에 팝니다. 다섯째 날은 금을 살 수 없고, 일곱째 날에 금을 2에 사서 마지막 날에 8에 팔면 총 10의 이익이 생깁니다.

    또는 다음과 같은 방법도 가능합니다.
    - [-, buy, sell, x, buy, -, -, sell]
    즉, 둘째 날에 2에 금을 사서 셋째 날에 5에 팝니다. 넷째 날은 금을 살 수 없고, 다섯째 날에 1에 금을 사서 마지막 날에 8에 팔면 총 10의 이익이 생깁니다.
    금을 사고 팔 수 있는 다양한 방법들이 있지만 10보다 큰 이익을 내래 방법은 없으므로 최대 이윤인 10보다 큰 이익을 낼 방법은 없으므로 최대 이윤인 10을 return합니다.
    */
    public int bestBenefit() {

        return 0;
    }

}
