

package compi1.testphone;

import java.io.StringReader;
import java.util.List;

/**
 *
 * @author yenni
 */
public class TestPhone {

    public static void main(String[] args) {
        String content = """
                          {
                            "data": [
                              {
                                "name": "Serie 1",
                                "points": [
                                  { "x": 1, "y": 10 },
                                  { "x": 2, "y": 20 },
                                  { "x": 3, "y": 15 },
                                  { "x": 4, "y": 25 },
                                  { "x": 5, "y": 30 }
                                ]
                              },
                              {
                                "name": "Serie 2",
                                "points": [
                                  { "x": 1, "y": 15 },
                                  { "x": 2, "y": 25 },
                                  { "x": 3, "y": 20 },
                                  { "x": 4, "y": 30 },
                                  { "x": 5, "y": 35 }
                                ]
                              }
                            ],
                            "chart": {
                              "title": "Gráfico de Líneas",
                              "xAxisLabel": "Eje X",
                              "yAxisLabel": "Eje Y"
                            }
                          }
                          
                          """;
        Lexer lexer = new Lexer(new StringReader(content));
        parser parser = new parser(lexer);
        try {
            parser.parse();
            if(lexer.getErrors().isEmpty() && parser.getSyntaxErrors().isEmpty() && parser.getSemanticErrors().isEmpty()){
                System.out.println("Se ha pasado la prueba");
            } else {
                String output = "ERORES LEXICOS";
                output += getErrors(lexer.getErrors());
                
                output += "\n\nERRORES SINTACTICOS\n";
                output += getErrors(parser.getSyntaxErrors());
                
                output += "\n\nERRORES SEMANTICOS\n";
                output += getErrors(parser.getSemanticErrors());
                System.out.println(output);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static String getErrors(List<String> errors){
        String code = "";
        for (int i = 0; i < errors.size(); i++) {
            code += errors.get(i) + "\n";
        }
        return code;
    }
    
}
