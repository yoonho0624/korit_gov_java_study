package _04_TypeCasting;

public class TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수에서 실수
        int scoreInt = 98;
        System.out.println(scoreInt);
        System.out.println((float) scoreInt);
        System.out.println((double) scoreInt);
//        float scoreFloat = (float) scoreInt;
//        System.out.println(scoreFloat);

        // 실수에서 정수
        float scoreFloat = 97.3F;
        System.out.println((int) scoreFloat);

        double scoreDouble = 88.4;
        System.out.println((int) scoreDouble);

//        double sum1 = 98 + 77.3;
        double sum1 = (double) 98 + 77.3;
        System.out.println(sum1);

        int sum2 = 98 + (int)77.3;

        float sum3 = 98 + 77.3F;

        double convertedScoreDouble = scoreInt;
        System.out.println(convertedScoreDouble);
        // int -> long -> float - > double (자동 형변환)

        int convertedScoreInt = (int) scoreDouble;
        // double -> float -> long -> int (수동 형변환)

        long scoreLong = 87L;
        convertedScoreInt = (int)scoreLong;

        float convertedScoreFloat = scoreInt;
        System.out.println(convertedScoreFloat);

        // 숫자를 문자열로
        int num1 = 55;
        String strNum1 = String.valueOf(num1); // 첫번째 방법
        strNum1 = Integer.toString(num1); // 두번째 방법

        double num2 = 55.55;
        String strNum2 = String.valueOf(num2);
        strNum2 = Double.toString(num2);

        float num3 = 56.34F;
        String strNum3 = String.valueOf(num3);
        strNum3 = Float.toString(num3);

        // 문자열을 숫자로
        int i = Integer.parseInt("34");
        double d = Double.parseDouble("34.44");
        float f = Float.parseFloat("34.1234F");
        System.out.println(f);

        float floatNumber = 3.141592F;
        //정수만 출력하시오
        System.out.println((int) floatNumber);
    }
}
