# kotlin-minesweeper

## 🚀 지뢰 찾기

### 기능 요구사항

지뢰 찾기를 변형한 프로그램을 구현한다.

- 높이와 너비, 지뢰 개수를 입력받을 수 있다.
- 지뢰는 눈에 잘 띄는 것으로 표기한다.
- 지뢰는 가급적 랜덤에 가깝게 배치한다.
- 각 사각형에 표시될 숫자는 자신을 제외한 주변 8개 사각형에 포함된 지뢰의 개수다.

### 프로그램 요구 사항

1. 객체지향 생활 체조 원칙을 지키면서 프로그래밍한다.

    - 한 메서드에 오직 한 단계의 들여쓰기만 한다.
    - else 예약어를 쓰지 않는다.
    - 모든 원시 값과 문자열을 포장한다.
    - 한 줄에 점을 하나만 찍는다.
    - 줄여 쓰지 않는다(축약 금지).
    - 모든 엔티티를 작게 유지한다.
    - 3개 이상의 인스턴스 변수를 가진 클래스를 쓰지 않는다.
    - 일급 컬렉션을 쓴다.
    - getter/setter/프로퍼티를 쓰지 않는다.

1. 객체 지향 5원칙을 지키면서 프로그래밍한다.

- **객체지향 5원칙(SOLID)**
    - SRP (단일책임의 원칙: Single Responsibility Principle): 작성된 클래스는 하나의 기능만 가지며 클래스가 제공하는 모든 서비스는 그 하나의 책임(변화의 축: axis of
      change)을
      수행하는 데 집중되어 있어야 한다
    - OCP (개방폐쇄의 원칙: Open Close Principle): 소프트웨어의 구성요소(컴포넌트, 클래스, 모듈, 함수)는 확장에는 열려있고, 변경에는 닫혀있어야 한다.
    - LSP (리스코브 치환의 원칙: The Liskov Substitution Principle): 서브 타입은 언제나 기반 타입으로 교체할 수 있어야 한다. 즉, 서브 타입은 언제나 기반 타입과 호환될 수
      있어야
      한다.
    - ISP (인터페이스 분리의 원칙: Interface Segregation Principle): 한 클래스는 자신이 사용하지 않는 인터페이스는 구현하지 말아야 한다.
    - DIP (의존성역전의 원칙: Dependency Inversion Principle): 구조적 디자인에서 발생하던 하위 레벨 모듈의 변경이 상위 레벨 모듈의 변경을 요구하는 위계관계를 끊는 의미의 역전
      원칙이다.

### 구현 항목

- 직사각형
    - [X] `prop` 높이, 너비
    - [X] 양수가 아니면 예외 발생
    - [X] 직사각형 사이즈로 전체 위치값들을 생성한다.
- 필드
    - [X] `prop` 직사각형
    - [X] `prop` 블록 리스트
- 위치
    - [X] `prop` x, y 좌표
- 블록
    - [X] `prop` 위치
    - [X] `prop` 자신을 제외한 주변 8개 사각형에 포함된 지뢰의 개수
    - [X] 지뢰 유무를 반환한다.
- 지뢰 블록
    - [X] `implement` 블록
    - [X] 지뢰 유무 값 `true`를 반환한다.
- 일반 블록
    - [X] `implement` 블록
    - [X] 지뢰 유무 값 `false`를 반환한다.
- 지뢰 필드 생성기
    - [X] 직사각형 사이즈에 지뢰 수만큼 지뢰를 포함한 필드를 생성한다.
- 입력
    - [X] 높이, 너비를 입력 -> 직사각형
    - [X] 지뢰 개수를 입력
- 출력
    - [X] 필드 결과값을 출력
