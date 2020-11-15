/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan48;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Program ini berisi program kalkulator2
 * (OBJECT ORIENTED)
 * 
 */
public class Program {
    public static void main(String[] args) {
        Kalkulator kalk = new Kalkulator();
        kalk.setValue1(7.0);
        System.out.println("VALUE 1 = ".
                concat(Double.toString(kalk.getValue1())));
        kalk.setValue2(5.0);
        System.out.println("VALUE 2 = ".
                concat(Double.toString(kalk.getValue2())));
        kalk.setNameProject();
        kalk.setNoteProject("This project shown you how to manage method in java");
        System.out.println("Result Add is = ".
                concat(Double.toString(
                        kalk.add(kalk.getValue1(), kalk.getValue2()))));
        System.out.println("Result Minus is = ".
                concat(Double.toString(
                        kalk.minus(kalk.getValue1(), kalk.getValue2()))));
        System.out.println("Result Multiple is = ".
                concat(Double.toString(
                        kalk.multiplication(kalk.getValue1(), kalk.getValue2()))));
        System.out.println("Result Division is = ".
                concat(Double.toString(
                        kalk.division(kalk.getValue1(), kalk.getValue2()))));
    }
}
