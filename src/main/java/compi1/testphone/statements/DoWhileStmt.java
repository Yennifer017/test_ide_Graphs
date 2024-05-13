/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compi1.testphone.statements;

import compi1.testphone.models.Executable;
import compi1.testphone.models.MutableValue;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author yenni
 */
@Getter @Setter
public class DoWhileStmt extends Statement{
    MutableValue condition;
    List<Executable> executables;

    public DoWhileStmt() {
        executables = new ArrayList<>();
    }
}
