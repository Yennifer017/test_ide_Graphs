
package compi1.testphone.models;

import java_cup.runtime.Symbol;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author yenni
 */
@Getter @Setter
public class InformationTarget extends Executable{
    int line;
    int column;
    private MutableValue value;
    private Symbol label, description, icon, color, link;
}
