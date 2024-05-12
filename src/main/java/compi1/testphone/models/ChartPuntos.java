
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
public class ChartPuntos {
    List<DataPuntos> dataPuntos;
    public ChartPuntos(){
        dataPuntos= new ArrayList<>();
    }
}
