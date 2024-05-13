
package compi1.testphone.statements;

import compi1.testphone.models.MutableValue;
import java_cup.runtime.Symbol;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author yenni
 */
@Getter @Setter
public class Asignation extends Statement{
    MutableValue value;
    Symbol variable;
    
}
