import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Basic inner class/ regular inner class/ nested inner class

//class Outer{
//    int a=100;
//    public void outerClass(){
//        System.out.println("Outer Class int : " + a);
//        //System.out.println("Inner Class int : " + b);error
//    }
//
//    //inner class
//    class Inner{
//        int b=200;
//        public void innnerClass(){
//            System.out.println("Outer Class int : " + a);
//            System.out.println("Inner Class int : " + b);
//        }
//    }
//}
//
//public class Example {
//    public static void main(String[] args) {
//        Outer outer = new Outer();
//        outer.outerClass();
//
//        //inner class object
//        Outer.Inner inner = new Outer().new Inner()//correct
//        Outer.Inner inner = outer.new Inner();//correct
//        inner.innnerClass();
//
//
//    }
//}
//=============================================

//Method local inner class

//class MyFrame extends JFrame{
//    private JButton okButton;
//
//    MyFrame(){
//        setSize(200,200);
//        okButton = new JButton("Click me");
//        okButton.setFont(new Font("",2,20));
//        //-----------
//
//        //---Method local inner class
//        class Trigger implements ActionListener{
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Clicked");
//            }
//        }
//        //---Method local inner class
//        //-----------
//        okButton.addActionListener(new Trigger());
//        add(okButton);
//    }
//}
//
//class Example{
//    public static void main(String[] args) {
//        MyFrame frame = new MyFrame();
//        frame.setVisible(true);
//    }
//}

//=============================================

//Anonymous inner class

//class MyFrame extends JFrame{
//    private JButton okButton;
//
//    MyFrame(){
//        setSize(200,200);
//        okButton = new JButton("Click me");
//        okButton.setFont(new Font("",2,20));
//        //-----------
//
//        //---Anonymous inner class
//        ActionListener actionListener = new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Clicked");
//            }
//        };
//        //---Anonymous inner class
//        //-----------
//        okButton.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Clicked");
//            }
//        });//this way also called anonymous inner class
////        okButton.addActionListener(actionListener);
//        add(okButton);
//    }
//}
//
//class Example{
//    public static void main(String[] args) {
//        MyFrame frame = new MyFrame();
//        frame.setVisible(true);
//    }
//}

//=============================================

//Example for anonymous inner class with lamda
@FunctionalInterface//meta data -? compiler
interface Animal{//functional interface(only one method)
    void sound();
}

class Example{
    public static void main(String[] args) {
        Animal dog = ()->System.out.println("Baw...Baw...");//lamda expression

        Animal cat = new Animal(){//anonymous inner class without lamda expression
            public void sound(){
                System.out.println("Mew...Mew...");
            }
        };

        dog.sound();
        cat.sound();
    }
}

