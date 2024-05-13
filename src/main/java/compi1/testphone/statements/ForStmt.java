
package compi1.testphone.statements;

import compi1.testphone.models.Executable;
import compi1.testphone.models.MutableValue;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author yenni
 */
@Getter @Setter
public class ForStmt extends Statement{
    private Asignation firstAsign;
    private Asignation increment;
    MutableValue condition;
    List<Executable> executables;
}
