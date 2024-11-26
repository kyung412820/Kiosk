<p align="center">
 <img width="100px" src="https://res.cloudinary.com/anuraghazra/image/upload/v1594908242/logo_ccswme.svg" align="center" alt="GitHub Readme Stats" />
    <h2 align="center"> Kiosk </h2>
</p>
<br/>

<h2>목차</h2>

- [📜 소개](#소개)
- [👨‍👧‍👦 팀원](#팀원)
- [⚙️ 개발 환경](#개발-환경)
- [🎲 기능 목록](#기능-목록)
- [🧩 핵심 기능](#핵심-기능)
- [✍ Trouble Shooting](https://kyunghun0515.tistory.com/30)
<br/>

<h2>소개</h2>

이 프로젝트는 간단한 키오스크 애플리케이션입니다. 장바구니를 생성하여 데이터를 저장하고, 관리합니다. 상황에 따라서 대응하기 위해 인원에 따른 할인율을 적용하여 좀 더 다양한 상황에 대응할 수 있도록 설계했습니다. 
<br/>

## 개발 환경
- JAVA
- GIT
<br/>

## 팀원

<table>
   <tr>
    <td align="center"><b><a href="https://github.com/kyung412820">이경훈</a></b></td>
  <tr>
    <td align="center"><a href="https://github.com/kyung412820"><img src="https://avatars.githubusercontent.com/u/71320521?v=4" width="100px" /></a></td>
  </tr>
  <tr>
    <td align="center"><b>프로젝트 총괄</b></td>
</table>
<br/>


## 기능 목록

- Main : 시작 지점이 되는 클래스, public static void main(String[] args)
- MenuItem: 세부 메뉴 속성 가지는 클래스
    - 햄버거의 이름, 가격설명
        - 예시: ShackBurger, 6.9, 토마토, 양상추, 쉑소스가 토핑된 치즈버거
        - `new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거")`
    - 햄버거의 이름, 가격설명
        - 예시: ShackBurger, 6.9, 토마토, 양상추, 쉑소스가 토핑된 치즈버거
        - `new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거")`토
- Kiosk: 프로그램 순서 및 흐름 제어를 담당하는 클래스
- Menu: MenuItem 클래스를 관리하는 클래스
    - 예시 : 버거 메뉴, 음료 메뉴 등 각 카테고리 내에 여러 `MenuItem`을 포함합니다.
 
- 메뉴의 출력
- 대상에 따른 할인 여부
- 메뉴 구매
- 추가 구매 여부
- 구매 완료시 계산
- 반복 구매 요청
- 장바구니 기능
- 장바구니 관리 기능

<br/>

## 핵심 기능

#### Lv 1: 기본적인 연산 수행 

 - Scanner: 사용자로부터 입력을 받기 위해 사용.

 - 조건문 (if, switch): 사칙연산 기호에 맞춰 조건을 처리.

 - 반복문 (while, for): 무한 반복 계산 기능을 구현.

기술 활용:

 - Scanner로 입력받아, 이를 조건문을 사용하여 연산 후 결과를 출력.

 - 연산 결과를 출력하고, "exit" 입력 시 반복문 종료.

------------------------------------------------------------------------

#### Lv 2: 클래스 적용한 Kiosk 만들기


 - 클래스: Kiosk 클래스를 사용하여 연산 수행 및 결과 저장.

 - 메서드: 연산을 수행하는 메서드 및 결과를 반환하는 메서드 작성.

 - 컬렉션: 연산 결과를 저장하는 컬렉션 필드 구현 (List, ArrayList 등).

 - 캡슐화: Kiosk 클래스의 연산 결과를 외부에서 직접 접근하지 않도록 Getter/Setter 메서드로 간접 접근.

기술 활용:

 - 연산을 수행하는 Kiosk 메서드를 Kiosk 클래스에 구현.

 - 연산 결과를 List 컬렉션에 저장하여, 결과를 관리.

 - Kiosk 클래스에서 Cart,Menu,CartItem,MenuItem 클래스를 활용하여 연산하고, 결과를 출력.

------------------------------------------------------------------------

#### 3. 도전 기능: Enum, 제네릭, 람다 & 스트림

 - Enum을 사용하여 연산자를 객체로 관리, Operation.ADD, Operation.SUBTRACT 등을 사용.

 - Stream과 Lambda를 사용하여 저장된 연산 결과 중 특정 조건을 만족하는 값만 조회.

------------------------------------------------------------------------

#### 4. 기타 기능

 - 예외 처리: 잘못된 입력에 대해 예외를 처리하여 사용자에게 명확한 오류 메시지 출력.

 - 정형 타입 매개변수: 제네릭을 활용하여 다양한 타입을 다룰 수 있는 메서드를 구현.

------------------------------------------------------------------------
<br/>

## Trouble Shooting

[https://kyunghun0515.tistory.com/47)
<br/>
<br/>
<br/>
<br/>
