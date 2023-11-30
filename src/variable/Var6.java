package variable;


/**
 * 변수를 초기화 하지 않으면
 * java: variable a might not have been initialized 오류 발생
 * 변수를 선언하면 메모리상의 어떤 공간을 차지하고 사용한다 그런데
 * 그 공간에 기존에 어떤 값이 있었는지 아무도 모른다 따라서 초기화 하지 않으면 이상한 값이 출력될 수 있다.
 * @author Dong-Joon Oh
 */
public class Var6 {

    public static void main(String[] args) {
        int a;
        //System.out.println(a);
    }
}
