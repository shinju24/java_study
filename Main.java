class Main {
  public static void main (String args[]) {
    Triangle triangle = new Triangle();
    StandardInput inputBase = new StandardInput();
    StandardInput inputHeight = new StandardInput();
    System.out.println(triangle.calc(inputBase.inputNum(),20));
    // StandardInput input = new StandardInput();
    // input.inputStr();
  }
}