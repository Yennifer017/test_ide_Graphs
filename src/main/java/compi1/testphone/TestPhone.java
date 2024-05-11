

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
                            "title": "Mi Página Web",
                            "description": "Una página web de ejemplo",
                            "keywords": ["página web", "ejemplo", "JSON"],
                            "header": { "title": "Bienvenido a mi sitio web" },
                            "footer": { "copyright": "© 2024" },
                            "backgroundColor": "#f0f0f0",
                            "fontFamily": "Arial, sans-serif",
                            "fontSize": "16px"
                          
                          
                          {
                            "data": [
                              { "category": "A", "value": 30 },
                              { "category": "B", "value": 50 },
                              { "category": "C", "value": 20 },
                              { "category": "D", "value": 45 },
                              { "category": "E", "value": 60 }
                            ]
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
