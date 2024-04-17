import java.util.HashMap;

public class Web_0417 {
  public static void main(String[] args) {

    HashMap<String, String> map = new HashMap<>();

    // 값 추가 : map.put("key", "value");
    map.put("name", "asdf");

    // 값 읽기 : map.get("key");
    System.out.println(map.get("name"));

    // 값 수정 : map.put("key", "value");
    map.put("name", "gbsw");

    System.out.println(map.get("name"));

    // containsKey (존재여부를 boolean 타입으로 확인)
    System.out.println(map.containsKey("name"));

    // 값 삭제 : map.remove("key");
    map.remove("name");

    System.out.println(map.get("name"));

    System.out.println(map.containsKey("name"));
  }
}