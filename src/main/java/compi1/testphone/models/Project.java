/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
public class Project {
    private String title, description, header, footer, backgroundColor, fontFamilyS, fontSizeS;
    private List<String> keyWords;
    private List<Executable> data;

    public Project() {
        keyWords = new ArrayList<>();
        data = new ArrayList<>();
    }
    
    
}
