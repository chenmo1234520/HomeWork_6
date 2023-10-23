package pers.chenmo.myapp.Thirdly;

interface Happen {
  void happen(Person m);
}

class Person implements Happen {
  String identity;
  String name;

  public Person(String identity, String name) {
    this.identity = identity;
    this.name = name;
  }

  public Person() {

  }

  void feed(Person m) {
    System.out.println(this.name + this.identity + "喂狗");
    this.happen(m);
  }

  public void happen(Person m) {
    if (m instanceof Master) {
      System.out.println("金毛开心的欢跳，吃食物");
    } else if (m instanceof family) {
      System.out.println("金毛会很平常的吃东西~~");
    } else if (m instanceof stranger) {
      System.out.println("金毛会有警惕。。呜呜~~");
    }

  }

}

class Master extends Person {
  public Master(String identity, String name) {
    this.identity = identity;
    this.name = name;
  }

}

class family extends Person {
  public family(String identity, String name) {
    this.identity = identity;
    this.name = name;
  }

}

class stranger extends Person {
  public stranger(String identity, String name) {
    this.identity = identity;
    this.name = name;
  }

}

public class Thirdly {
  public static void main(String[] args) {
    Person m = new Master("小明", "主人");
    m.feed(m);
    Person f = new family("小华", "家人");
    f.feed(f);
    Person s = new stranger("陌生人", "不认识");
    s.feed(s);

  }
}
