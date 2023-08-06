import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator  implements ActionListener
{
    JFrame JF;
    JTextField Jt;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    double a,b;
    int operator;
    double result=0;
    Calculator()
    {
        JF= new JFrame();
        JF.setSize(500,600);
        JF.setTitle("Calculator");
        JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Jt=new JTextField();
        Jt.setBounds(30,40,250,30);
        //Jt.setLayout(new FlowLayout());
        JF.add(Jt);
       

        b1=new JButton("1");b2=new JButton("2");b3=new JButton("3");b4=new JButton("4");
        b5=new JButton("5");b6=new JButton("6");b7=new JButton("7");b8=new JButton("8");
        b9=new JButton("9");b10=new JButton("0");b11=new JButton("+");b12=new JButton("-");
        b13=new JButton("*");b14=new JButton("/");b15=new JButton("=");b16=new JButton(".");
        b1.setBounds(40,100,50,40);b2.setBounds(110,100,50,40);b3.setBounds(180,100,50,40);b11.setBounds(250,100,50,40);
        b4.setBounds(40,170,50,40);b5.setBounds(110,170,50,40);b6.setBounds(180,170,50,40);b12.setBounds(250,170,50,40);
        b7.setBounds(40,240,50,40);b8.setBounds(110,240,50,40);b9.setBounds(180,240,50,40);b13.setBounds(250,240,50,40);
        b16.setBounds(40,310,50,40);b10.setBounds(110,310,50,40);b15.setBounds(180,310,50,40);b14.setBounds(250,310,50,40);

        JF.add(b1);JF.add(b2);JF.add(b3);JF.add(b4);JF.add(b5);JF.add(b6);JF.add(b7);JF.add(b8);JF.add(b9);
        JF.add(b10);JF.add(b11);JF.add(b12);JF.add(b13);JF.add(b14);JF.add(b15);JF.add(b16);
        

        b1.addActionListener(this);b2.addActionListener(this);
        b3.addActionListener(this);b4.addActionListener(this);
        b5.addActionListener(this);b6.addActionListener(this);b7.addActionListener(this);b8.addActionListener(this);
        b9.addActionListener(this);b10.addActionListener(this);b11.addActionListener(this);b12.addActionListener(this);
        b13.addActionListener(this);b14.addActionListener(this);b15.addActionListener(this);b16.addActionListener(this);
        
        JF.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
      
        
        if(e.getSource()==b1)
            Jt.setText(Jt.getText().concat("1"));
        if(e.getSource()==b2)
            Jt.setText(Jt.getText().concat("2"));
        if(e.getSource()==b3)
            Jt.setText(Jt.getText().concat("3"));
        if(e.getSource()==b4)
            Jt.setText(Jt.getText().concat("4"));
        if(e.getSource()==b5)
            Jt.setText(Jt.getText().concat("5"));
        if(e.getSource()==b6)
            Jt.setText(Jt.getText().concat("6"));
        if(e.getSource()==b7)
            Jt.setText(Jt.getText().concat("7"));
        if(e.getSource()==b8)
            Jt.setText(Jt.getText().concat("8"));
        if(e.getSource()==b9)
            Jt.setText(Jt.getText().concat("9"));
        if(e.getSource()==b10)
            Jt.setText(Jt.getText().concat("0"));
        if(e.getSource()==b16)
            Jt.setText(Jt.getText().concat("."));
        if(e.getSource()==b11)
        {
             a=Double.parseDouble(Jt.getText());
             operator=1;
            Jt.setText("");
        }
        if(e.getSource()==b12)
        {
            a=Double.parseDouble(Jt.getText());
            operator=2;
            Jt.setText("");
        }
        if(e.getSource()==b13)
        {
            a=Double.parseDouble(Jt.getText());
            operator=3;
            Jt.setText("");
        }
        if(e.getSource()==b14)
        {
             a=Double.parseDouble(Jt.getText());
             operator=4;
            Jt.setText("");
        }
        
        
       if(e.getSource()==b15)
        {
            
           b=Double.parseDouble(Jt.getText());
           switch(operator)
           {
            case 1: 
                    result=a+b;
                    break;
            case 2: 
                    result=a-b;
                    break;
            case 3: 
                    result=a*b;
                    break;
            case 4:
            try
                {
                    result=a/b;
                }
                catch(ArithmeticException ae)
                {
                    Jt.setText("invalid");
                }
                break;
            default:result=0; 
                   
           }
           Jt.setText(""+result);
        }
        
    }
    public static void main(String[] args)throws Exception {
        new Calculator();
    }
}