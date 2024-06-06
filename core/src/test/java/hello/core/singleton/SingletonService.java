package hello.core.singleton;

// 싱글톤 패턴
// : 특정 클래스의 인스턴스가 1개만 생성되는 것을 보장하는 디자인 패턴.
//   즉, 생성자를 통해서 여러 번 호출이 되더라도 인스턴스를 새로 생성하지 않고
//   최초 호출 시에 만들어두었던 인스턴스를 재활용하는 패턴
public class SingletonService {

    // 1. static 영역에 객체를 1개만 생성.
    private static final SingletonService instance = new SingletonService();

    // 2. public으로 열어서 객체 인스턴스가 필요하면 이 static 메서드를 통해서만 조회.
    public static SingletonService getInstance() {
        return instance;
    }

    // 3. 생성자를 private으로 선언해서 외부에서 new 키워드를 사용한 객체생성을 못하게 막음.
    private SingletonService() {

    }

    public void login() {
        System.out.println("싱글톤 객체 로직 호출");
    }

}
