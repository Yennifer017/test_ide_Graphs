/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compi1.testphone.models;

import java.util.ArrayList;
import java.util.List;
import java_cup.runtime.Symbol;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author yenni
 */
@Getter @Setter
public class DataLineas {
    private Symbol name;
    private Symbol color;
    private Symbol lineStyle;
    private List<Point> points;
    public DataLineas(){
        points = new ArrayList<>();
    }
}
