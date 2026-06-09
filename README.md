# Spring CRUD 게시판 정리

# 패키지 구조 역할

## Controller
- 브라우저의 요청을 받아서 처리
- Service를 호출하고 결과를 JSP에 전달
- URL 매핑 담당

## Service
- 비즈니스 로직 처리
- Controller와 DAO 사이에서 데이터 처리
- 트랜잭션 처리 담당

## DTO/VO (Data Transfer Object / Value Object)
- DB에 직접 접근해서 쿼리 실행
- MyBatis Mapper 인터페이스로 구현
- CRUD 쿼리 담당

## VO (Value Object)
- DB테이블과 1:1 매핑되는 데이터 객체
- private 변수 + Getter/Setter로 구성
- 데이터를 담는 그릇 역할

===================================================================

# Spring 어노테이션 정리

## @Controller
- 요청/응답 처리하는 컨트롤러 클래스에 사용
- 브라우저 요청을 받아서 처리

## @Service
- 비즈니스 로직 처리하는 클래스에 사용
- Controller와 DAO 사이에서 처리

## @Mapper
- MyBatis mapper 인터페이스에 사용
- SQL 쿼리 실행 담당

## @Repository
- DB 접근하는 DAO 클래스에 사용

## @Autowired
- 객체를 자동으로 주입해줌
- new 키워드 없이 객체 사용 가능

## @RequestMapping
- 브라우저에서 특정 URL로 접속했을 때 어떤 메서드를 실행할지 연결해주는 어노테이션
=============================================================================
## MyBatis 연결 흐름

### 전체 흐름
pom.xml                  → Maven으로 라이브러리 다운로드
database.properties      → DB 접속 정보 저장 (url, id, pw)
dispatcher-servlet.xml   → MyBatis와 DB 연결 설정
mappers/*.xml            → SQL 쿼리 작성
Mapper 인터페이스         → Java에서 SQL 호출

### Mapper XML 속성
- `id` : Java 인터페이스의 메서드 이름과 반드시 일치
- `parameterType` : Java에서 SQL로 넘겨주는 값의 타입 (입력)
- `resultType` : SQL 결과를 담을 Java 클래스 (출력)
