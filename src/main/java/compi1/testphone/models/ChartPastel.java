
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
public class ChartPastel extends DataContainer {
    List<DataPastel> dataPastel;
    public ChartPastel(){
        dataPastel = new ArrayList<>();
    }
}
