

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
                          "title": "Mi Página Web",
                           "description": "Una página web de ejemplo",
                           "keywords": ["página web", "ejemplo", "JSON"],
                           "header": { "title": "Bienvenido a mi sitio web" },
                           "footer": { "copyright": "© 2024" },
                           "backgroundColor": "#f0f0f0",
                           "fontFamily": "Arial, sans-serif",
                           "fontSize": "16px"
                          id = 10;
                          {
                            "data": [
                              { "category": "A", "value": id+10, "color": "#ff5733" },
                              { "category": "B", "value": 50, "color": "#33ff57" },
                              { "category": "C", "value": 20, "color": "#5733ff" },
                              { "category": "D", "value": 45, "color": "#ffff33" },
                              { "category": "E", "value": 60, "color": "#33ffff" }
                            ],
                            "chart": {
                              "title": "Gráfica de Barras",
                              "xAxisLabel": "Categorías",
                              "yAxisLabel": "Valores"
                            }
                          }
                          {
                            "data": {
                              "value": 75,
                              "label": "Porcentaje completado",
                              "description": "Este es el porcentaje de completado de la tarea actual."
                            }
                          }
                          {
                            "data": [
                              { "category": "A", "value": 30 },
                              { "category": "B", "value": 50 },
                              { "category": "C", "value": 20 },
                              { "category": "D", "value": 45 },
                              { "category": "E", "value": 60 }
                            ]
                          }
                          {
                            "data": [
                              { "label": "A", "value": 30, "color": "#ff5733" },
                              { "label": "B", "value": 50, "color": "#33ff57" },
                              { "label": "C", "value": 20, "color": "#5733ff" }
                            ],
                            "chart": {
                              "title": "Gráfica de Pastel",
                              "legendPosition": "bottom"
                            }
                          }
                          {
                            "data": [
                              { "label": "A", "value": 30 },
                              { "label": "B", "value": 50 },
                              { "label": "C", "value": 20 }
                            ]
                          }
                          {
                            "data": [
                              { "x": 10, "y": 20 },
                              { "x": 30, "y": 40 },
                              { "x": 50, "y": 60 },
                              { "x": 70, "y": 80 },
                              { "x": 90, "y": 100 }
                            ]
                          }
                          {
                            "data": [
                              { "x": 10, "y": 20, "size": 5, "color": "#ff5733" },
                              { "x": 30, "y": 40, "size": 8, "color": "#33ff57" },
                              { "x": 50, "y": 60, "size": 10, "color": "#5733ff" },
                              { "x": 70, "y": 80, "size": 6, "color": "#ffff33" },
                              { "x": 90, "y": 100, "size": 7, "color": "#33ffff" }
                            ],
                            "chart": {
                              "title": "Gráfico de Puntos",
                              "xAxisLabel": "Eje X",
                              "yAxisLabel": "Eje Y"
                            }
                          }
                          {
                            "data": [
                              { "x": 10, "y": 20, "size": 5 },
                              { "x": 30, "y": 40 },
                              { "x": 50, "y": 60, "size": 10, "color": "#5733ff" },
                              { "x": 70, "y": 80, "size": 6, "color": "#ffff33" },
                              { "x": 90, "y": 100, "color": "#33ffff" }
                            ],
                            "chart": {
                              "title": "Gráfico de Puntos",
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
