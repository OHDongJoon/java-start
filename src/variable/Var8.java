package variable;


/**
 * 변수타입 정리
 * 실무에서 사용 하지 않는 거

 * byte : 표현 길이가 너무 작다  또 자바는 기본으로 4byte(int) 를 효율적으로 계산하도록 설계되어 있다. int 를 사용하자
 (파일 전송할때는 사용함)

 * short : 표현 길이가 너무 적다 int 사용
 *
 * float : 표현 길이와 정밀도가 낮다. 실수 형은 double을 사용하자
 * char : 문자 하나를 표현하는 일은 거의 없다. 문자 하나를 표현할 때도 문자열을 사용할 수 있다
 * String a = "b" 와 같이 사용하면 된다.
 * 참고 : 메모리 용량은 매우 저렴하다. 따라서 메모리 용량을 약간 절약하기 보다는 개발 속도나 효율에
 * @author Dong-Joon Oh */
public class Var8 {
    public static void main(String[] args) {

        //정수
        byte b = 127; //-128 ~ 127

        short s = 32767; // -32,768 ~ 32,767

        int i = 2147483647; //-2,147,483,648 ~ 2,147,483,647 (약 20억)

        //-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
        long l = 9223372036854775807L;

        //실수
        float f = 10.0f;
        double d = 10.0;

    }
}