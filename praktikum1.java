/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarlinkedlist;

/**
 *
 * @author USER
 */
public class praktikum1 {
    public praktikum1 head =  null;
    public praktikum1 tail = null;
    
    public int data;
    public praktikum1 next;
    
    
   public praktikum1 (int a){
       this.data = a;
       this.next = null;
   } 
   
   public void pertama (int namanya){
       praktikum1 newnode = new praktikum1 (namanya);
       
       if (head == null){
       head = newnode;
       tail = newnode;
   } else {
           praktikum1 isinya = head;
           head = newnode;
           head.next = isinya;
       }
   
   }
   public void terakhir (int namanya){
        praktikum1 newnode = new praktikum1 (namanya);
       
       if (head == null){
       head = newnode;
       tail = newnode;
       }else{
           tail.next = newnode;
           tail = newnode;
       }
       
            
   }
   public void hapus (int post){
       if (post == 0){
           head = head.getnext();
           return;
       } 
       praktikum1 current= head;
       int count = 0;
       while (count < post-1){
           current = current.getnext();
           if (current == null ){
               throw new IndexOutOfBoundsException("eh kok ngga ada");
           }
           count++;
       }if (current.getnext()== null){
           throw new IndexOutOfBoundsException("eh kok ilaang");
       }
       current.setnext(current.getnext().getnext());
   }
   
   public praktikum1 (){
       this.getClass();
       
   }
   public String txt(){
      String output ="";
      praktikum1 current = head;
      while (current != null) {
          output += current.getdata()+","; 
          
          current = current.getnext();
                 
      }
      return output;
   }
   public int getdata(){return data;}
   public praktikum1 getnext(){return next;}
   
   public void setdata(int a){data = a;}
   public void setnext (praktikum1 b){next = b;}
   
   
    public static void main(String[] args) {
        praktikum1 masuk = new praktikum1();
        masuk.pertama(7);
        masuk.pertama(1);
        masuk.pertama(5);
        masuk.pertama(3);
        masuk.terakhir(9);
        masuk.terakhir(12);
        System.out.println(masuk.txt());
    }

    
}
