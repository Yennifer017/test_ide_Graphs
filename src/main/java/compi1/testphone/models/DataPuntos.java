
package compi1.testphone.models;

import java_cup.runtime.Symbol;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author yenni
 */
@Getter @Setter
public class DataPuntos {
    private MutableValue xData, yData;
    private MutableValue size;
    private Symbol color;
    private boolean saved;
    
}
