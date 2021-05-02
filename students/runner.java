/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students;


public class runner {
    public static void main(String[]arg){
        Students s = new PhdStudent();
        Students s1 = new GradStudent();
        s.takeExam();
        s1.takeExam();
    }
    
}

