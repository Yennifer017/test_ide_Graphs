
package compi1.testphone.models;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author yenni
 */
@Getter @Setter
public class ChartBarras extends DataContainer{
    List<DataBarras> dataBarras = new ArrayList<>();
    public ChartBarras(){
        dataBarras = new ArrayList<>();
    }
}
