/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compi1.testphone.models;

import java_cup.runtime.Symbol;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author yenni
 */
@Getter @Setter
public class Point {
    MutableValue xData;
    MutableValue yData;
    boolean saved;
    Symbol label;
    
}
