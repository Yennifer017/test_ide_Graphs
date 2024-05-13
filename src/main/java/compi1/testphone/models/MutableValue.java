
package compi1.testphone.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import java_cup.runtime.*;

/**
 *
 * @author yenni
 */
@Getter @Setter
public class MutableValue {
    List<Symbol> symbols;
    public MutableValue(){
        symbols = new ArrayList<>();
    }
    public Object operate(HashMap<String, Object> globalSymbolTable){
        if(symbols.isEmpty()){
            return null;
        } else if(symbols.size() == 1){
            return symbols.get(0).value;
        } else {
            return null;
        }
    }
}
