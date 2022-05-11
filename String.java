public class String {
  public static void main(String[] args) {
    String greeting = "Hello";
    System.out.println(greeting);
  }
}

/*

[String Length]
public class Main {
  public static void main(String[] args) {
    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    System.out.println("The length of the txt string is: " + txt.length());
  }
}
// Output = The length of the txt string is: 25

[toUpperCase() and toLowerCase()]
public class Main {
  public static void main(String[] args) {
    String txt = "Hello World";
    System.out.println(txt.toUpperCase());
    System.out.println(txt.toLowerCase());
  }
}
// Output = HELLO WORLD
            hello world

[The indexOf()]
public class Main {
  public static void main(String[] args) {
    String txt = "Please locate where 'locate' occurs!";
    System.out.println(txt.indexOf("locate"));
  }
}
// Output = 7
