// [Logical AND]
public class LogicalOperator {
  public static void main(String[] args) {
    int x = 5;
    System.out.println(x > 3 && x < 10); // returns 'true' because 5 is greater than 3 AND 5 is less than 10
  }
}

/*
[Logical OR]
public class Main {
  public static void main(String[] args) {
    int x = 5;
    System.out.println(x > 3 || x < 4); // returns true because one of the conditions are true (5 is greater than 3, but 5 is not less than 4)
  }
}

[Logical NOT]
public class Main {
  public static void main(String[] args) {
    int x = 5;
    System.out.println(!(x > 3 && x < 10)); // returns false because ! (not) is used to reverse the result
  }
}



