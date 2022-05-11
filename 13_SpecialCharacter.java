// The sequence \"  inserts a double quote in a string
// The sequence \'  inserts a single quote in a string
// The sequence \\  inserts a single backslash in a string

public class 13_SpecialCharacter {
  public static void main(String[] args) {
    String txt1 = "We are the so-called \"Vikings\" from the north.";
    String txt2 = "We are the so-called \'Vikings\' from the north.";
    String txt3 = "We are the so-called \\ Vikings from the north.";
    System.out.println(txt1);
    System.out.println(txt2);
    System.out.println(txt3);
  }
}

/*
[New Line = \n]

public class Main {
  public static void main(String[] args) {
    String txt = "Hi\nHello\nWorld!";
    System.out.println(txt);
  }
}
// Output = Hi
            Hello
            World


[Carriage Return = \r]

public class Main {
  public static void main(String[] args) {
    String txt = "Hi\rHello\rWorld!";
    System.out.println(txt);
  }
}


public class Main {
  public static void main(String[] args) {
    String txt = "Hello\tWorld!";
    System.out.println(txt);
  }
}

