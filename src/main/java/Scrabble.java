import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class Scrabble {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/detector", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/detector.vtl");

      String inputWord = request.queryParams("word");
      Integer calculateScore = Scrabble.calculateScore(inputWord);

      model.put("calculateScore", calculateScore);

      return new ModelAndView(model, layout);

    }, new VelocityTemplateEngine());
  }

  public static Integer calculateScore(String input) {
    char[] inputToArray = input.toCharArray();

    Integer score = 0;

    HashMap<Character,Integer> alphabet = new HashMap<Character,Integer>();
      alphabet.put('a', 1);
      alphabet.put('b', 3);
      alphabet.put('c', 3);
      alphabet.put('d', 2);
      alphabet.put('e', 1);
      alphabet.put('f', 4);
      alphabet.put('g', 2);
      alphabet.put('h', 4);
      alphabet.put('i', 1);
      alphabet.put('j', 8);
      alphabet.put('k', 5);
      alphabet.put('l', 1);
      alphabet.put('m', 3);
      alphabet.put('n', 1);
      alphabet.put('o', 1);
      alphabet.put('p', 3);
      alphabet.put('q', 10);
      alphabet.put('r', 1);
      alphabet.put('s', 1);
      alphabet.put('t', 1);
      alphabet.put('u', 1);
      alphabet.put('v', 4);
      alphabet.put('w', 4);
      alphabet.put('x', 8);
      alphabet.put('y', 4);
      alphabet.put('z', 10);

      for (char letter : inputToArray){
        score += alphabet.get(letter);
      }

    return score;

  }
}
