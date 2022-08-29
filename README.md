# MyNumbers
유리수 계산기 


##TIL (22.08.29)
1. 상속
  1) abstract MyNumber(숫자) -> MyRationalNumber(유리수) -> MyInteger(정수) -> MyNaturalNumber(자연수) 순으로 상속
  2) MyRationalNumber 클래스에서 분모, 분자 값에 대한 처리를 생성자에서 다 해줌(최대 공약수를 통한 기약분수 만들기, 음 분수 만들기 등)
  3) 정수와 자연수 클래스는 유리수 클래스의 생성자 상속("super()")을 통해 다른 필드를 선언하지 않고도 사용 가능
  4) MyNumber로 부터 넘어온 abstract 메소드들(4칙 연산)을 사용시, 인자로 들어온 MyNumber 타입을 (각자의 타입)으로 캐스팅 하여 사용 가능했음
  
2. @NotNull
  1) 어노테이션 @NotNull을 통해 해당 메소드의 인자 값이 null이 되지 않도록 강제?적으로 막아줌
  
3. 자바 언어
  1) toString을 선언 할 때, 숫자를 표현할 때는 String.valueOf(숫자)를 사용하면 된다.
  2) 예외를 발생시키고자 할 때는 throw new ArithmeticException 와 같이 throw로 예외를 발생시키면 된다.
  3) 타입을 확인해야할 때는 [확인상대 instanceof 타입(클래스,인터페이스 등등)] 을 사용하면 확인이 가능하다.
