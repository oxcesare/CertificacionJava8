/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.cuatro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author consultor006
 */
public class Names {

    private List<String> list;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void printNames() {
        System.out.println(getList());
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Bob Hope", "Bob Dole", "Bob Brown");
        Names n = new Names();
        n.setList(list.stream().collect(Collectors.toList()));
        n.getList().forEach(Names::printNames);
    }
}
