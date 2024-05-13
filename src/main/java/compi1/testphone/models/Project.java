/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compi1.testphone.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java_cup.runtime.Symbol;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author yenni
 */
@Getter @Setter
public class Project {
    private Symbol title, description, header, footer, backgroundColor, fontFamilyS, fontSizeS;
    private List<Symbol> keyWords;
    private List<Executable> data;
    private HashMap<String, Object> globalSymbolTable; 

    public Project() {
        keyWords = new ArrayList<>();
        data = new ArrayList<>();
    }
    
    
}
