## String클래스

>일반적으로 문자열 데이터에 사용하는 String은 원래 클래스라고 한다 아래의 예시로 동작을 알아보자.
```java
String str = "JAVA";
System.out.println("str : " + str);
str = str + "_8";
System.out.println("str : " + str);
```
>결과도 함께 출력해서 알아보자.
```
str : JAVA
str : JAVA_8
```
- 처음의 str이 가리키는 객체의 JAVA 문자열에 _8을 추가하여 출력한 문장이다. 중요한건 여기서 JAVA가 어떻게 JAVA_8이 되었는지가 중요하다.
String 클래스를 이용하여 문자열을 변경하면 기존에 JAVA가 존재하던 객체를 소멸시키고 새로운 메모리상공간에 JAVA_8이 들어가는 객체를 생성하게 된다.
이 과정은 사람이 느낄만큼은 아니지만 다량의 데이터를 다룬다면 매우 비효율적이며 **주소값도 바뀌게 된다.**

위의 코드에 
```java
System.out.println("str : " + str.hashCode());
```
코드를 앞뒤로 추가해보면 눈에보이게 알 수 있을것이다.

## StringBuffer와 StringBuillder

>이러한 Stirng클래스의 단점을 보완한 것이 바로 StringBuffer와 StringBuillder라고 한다. 이 둘의 차이점은 나중에 설명하도록 한다.

```java
StringBuffer sf = new StringBuffer("Python");
System.out.println("sf : " + sf);
sf.append("_8");
System.out.println("sf : " + sf);
System.out.println("sf.length() : " + sf.length());
sf.insert(sf.length(), "!!!!!");
System.out.println("sf : " + sf);
```
>역시 콘솔창 결과도 같이보도록 하자.
```
sf : Python
sf : Python_8
sf.length() : 8
sf : Python_8!!!!!
```
- StringBuffer로 선언한 부분이 다소 어색해 보일 수 있으나 Stirng클래스도 원래는 저런식으로 선언했다고 한다. (현재도 가능) 그렇다면
StringBuillder는 Stirng과 어떤부분이 다르다는 것인가. 이미 눈치챗을지도 모르지만 가장 큰 차이점은 Python 스트링이 저장되어있는 객체를
소멸시키지 않고도 문자열을 추가할 수 있다는 점이다. 

잘 모르겠다면 이역시도
```java
System.out.println("sf : " + sf.hashCode());
```
코드를 추가해보면 알 수 있다. sf.append()와 sf.insert()로 추가하고도 같은 주소값을 유지한다.

##

**그렇다면 StringBuffer와 StringBuillder의 차이점은?**

- 일단 기능상의 차이점은 크게 없다고봐도 무방하다. 다만 StirngBuffer방식의 경우 메모리관리를 **싱크로나이즈**방식으로 한다.
이 방법을 이용하면 데이터 변경시 안정성을 보장할 수 있다고 한다.
반대로 StringBuillder 방법은 이 방법을 사용하지 않는다. 대신 속도면에서는 더 빠르다고 한다 (요즘은 StinrgBuillder를 더 선호한다고 함)

## 결론

문자열을 다루는 클래스들을 알아보았다 String클래스보다 더 좋은 방식들이 존재하는것을 알았다. 그러나 이러한 방식들은 데이터들을 초대량으로 관리하는
것이 아니라면 사람은 큰 차이를 느끼지 못한다고 한다. 그러므로 Stirng클래스를 이용한 방식의 동작을 조금 더 깊게 이해하는데에 초점을 맞추도록 하고
다른 클래스들의 존재와 의미파악만 간단히 하고 넘어가자.
