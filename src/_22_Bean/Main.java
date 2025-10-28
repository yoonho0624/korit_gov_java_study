package _22_Bean;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        /*UserEntity userEntity = new UserEntity();
        userEntity.setUserId(1);
        userEntity.setUsername("박윤호");
        userEntity.setAge(25);
        userEntity.setEmail("dbdgh0624@naver.com");
        System.out.println(userEntity);*/

        /*
        * 게시물 엔티티
        * 게시물 아이디
        * 게시물 제목
        * 게시물 내용
        * 작성자 아이디
        * 작성자 닉네임
        * 생성시각
        * 수정시각
        * */
        /*userEntity.setA(5);
        userEntity.setB("bbb");
        userEntity.setC("ccc");
        userEntity.setUserId(4);
        userEntity.setUsername("박윤호");
        userEntity.getCreateDt();
        userEntity.getUpdateDt();
        System.out.println(userEntity);*/

        UserEntityLombok userEntityLombok = new UserEntityLombok();
        userEntityLombok.setAge(4);
        userEntityLombok.setEmail("dbdgh0624@naver.com");
        userEntityLombok.setUserId(5);
        userEntityLombok.setUsername("박윤호");
        System.out.println(userEntityLombok);

        /*
        * Lombok
        * 자바의 반복적인 코드를 자동으로 생성해주는 라이브러리
        * 코드 다이어트를 위함
        * getter, setter, toString, 생성자, Builder
        *
        * 자바
        * .java 소스코드 => 컴파일(.class파일 형식으로 변환)
        * 바이트코드로 이루어짐 => JVM에 전달 => 실행
        * ====> 빌드
        * 빌드를 도와주는 빌더가 있는데 종류가 maven, gradle
        * 얘네는 빌드를 전체적으로 효율적이고 자동화 해주기 위한 외부 빌더 시스템
        * */
    }
}
