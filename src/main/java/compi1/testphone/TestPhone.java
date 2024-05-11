

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
                          id = 15.25;
                          """;
        Lexer lexer = new Lexer(new StringReader(content));
        parser parser = new parser(lexer);
        try {
            parser.parse();
            if(lexer.getErrors().isEmpty() && parser.getErrors().isEmpty()){
                System.out.println("Se ha pasado la prueba");
            } else {
                String output = "ERORES LEXICOS";
                output += getErrors(lexer.getErrors());
                
                output += "\n\nERRORES SINTACTICOS\n";
                output += getErrors(parser.getErrors());
                System.out.println(output);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static String getErrors(List<String> errors){
        String code = "";
        for (int i = 0; i < errors.size(); i++) {
            code += errors.get(i);
        }
        return code;
    }
    
}
