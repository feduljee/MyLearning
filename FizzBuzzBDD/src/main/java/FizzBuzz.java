
public class FizzBuzz {
  private String ternaryConvertion(Integer inp) {
    return inp % 15 == 0 ? "FizzBuzz"
        : inp % 3 == 0 ? "Fizz"
        : inp % 5 == 0 ? "Buzz"
        : inp.toString();
  }

  public String convert(Integer inp) {
    //return ternaryConvertion(inp);

    StringBuilder retVal = new StringBuilder();

    for(Rules r : Rules.values()) {
        if (inp % r.value == 0) {
          retVal.append(r.output);
        }
    }

    if (retVal.length() == 0) {
      retVal.append(inp);
    }
    return retVal.toString();
  }

  private enum Rules {
    THREE ("Fizz",3),
    FIVE ("Buzz",5);

    public final String output;
    public final int value;

    Rules(String output,int value) {
      this.output = output;
      this.value = value;
    }
  }
}
