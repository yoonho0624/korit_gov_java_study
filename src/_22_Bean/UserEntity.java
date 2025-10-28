package _22_Bean;

import java.time.LocalDateTime;

/*
* Bean
* 필드 속성들을 프로퍼티라고 하며, 해당 프로퍼티들은 private로 캡슐화가 되어있어야 한다.
* 그리고 캡슐화된 프로퍼티들은 getter, setter로만 접근 가능하다.
* getter, setter들은 모두 다 public이어야 한다.
* 데이터를 표현하는 것을 목적
* */
public class UserEntity {
    private int a;
    private String b;
    private String c;
    private int userId;
    private String username;
    private int age;
    private String email;
    private LocalDateTime createDt;
    private LocalDateTime updateDt;
    private int statusCode;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public LocalDateTime getCreateDt() {
        return createDt;
    }

    public void setCreateDt(LocalDateTime createDt) {
        this.createDt = createDt;
    }

    public LocalDateTime getUpdateDt() {
        return updateDt;
    }

    public void setUpdateDt(LocalDateTime updateDt) {
        this.updateDt = updateDt;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserEntity(게시물 아이디 = " + a + ", 게시물 제목 = " + b + ", 게시물 내용 = " + c + ", 작성자 아이디 = " + userId + ", 작성자 닉네임 = " + username +
                ", 생성시각 = " + createDt + ", 수정시각 = " + updateDt + ")";
    }
}

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
// Entity
// 데이터베이스의 테이블과 1:1 매핑이 되는 클래스
// 자바 객체 <-> DB 테이블 간 데이터를 매핑하기 위해서 사용

// Entity는 왜 Bean?
// Bean은 일종의 가이드라인, 명세, 규칙

// 여기서 엔티티가 빈이 되려면 기본생성자를 사용
