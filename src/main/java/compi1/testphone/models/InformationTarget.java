
package compi1.testphone.models;

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
    float value;
    private String label, description, icon, color, link;
}
