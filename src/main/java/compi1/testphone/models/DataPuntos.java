/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compi1.testphone.models;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author yenni
 */
@Getter @Setter
public class DataPuntos {
    private float xData, yData;
    private int size;
    private String color;
    
    public DataPuntos(){
        xData = -1;
        yData = -1;
    }
    
}
