/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author Admin
 */
public interface Stacks {

    public boolean isEmpty();
    
    public  void clear();
    
    public void push(String str);

    public String pop();

    public String peek();
    
    public void contain(String number);

}
