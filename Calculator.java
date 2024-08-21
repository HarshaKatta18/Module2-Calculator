import java.awt.*;
import java.awt.event.*;
public class Calculator implements ActionListener {
 int c,n;
    Frame f;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
    Panel p;
    TextField tf;
    GridLayout g;
    String a,b;
    Calculator(){
        f=new Frame("Calculator");
       p=new Panel();
         f.setLayout(new FlowLayout());
        b1=new Button("0");
        b1.addActionListener(this);
         b2=new Button("1");
         b1.setBackground(Color.LIGHT_GRAY);
           b2.addActionListener(this);
           b2.setBackground(Color.LIGHT_GRAY);
       b3=new Button("2");
         b3.addActionListener(this);
         b3.setBackground(Color.LIGHT_GRAY);
         b4=new Button("3");
        b4.addActionListener(this);
        b4.setBackground(Color.LIGHT_GRAY);
          b5=new Button("4");
          b5.setBackground(Color.LIGHT_GRAY);
         b5.addActionListener(this);
       b6=new Button("5");
       b6.setBackground(Color.LIGHT_GRAY);
      b6.addActionListener(this);
          b7=new Button("6");
         b7.addActionListener(this);
         b7.setBackground(Color.LIGHT_GRAY);
          b8=new Button("7");
        b8.addActionListener(this);
        b8.setBackground(Color.LIGHT_GRAY);
         b9=new Button("8");
        b9.addActionListener(this);
        b9.setBackground(Color.LIGHT_GRAY);
         b10=new Button("9");
        b10.addActionListener(this);
        b10.setBackground(Color.LIGHT_GRAY);
          b11=new Button("+");
      b11.addActionListener(this);
        b11.setBackground(Color.LIGHT_GRAY);
      b12=new Button("-");
          b12.addActionListener(this);
       b13=new Button("*");
        b13.addActionListener(this);
        b13.setBackground(Color.LIGHT_GRAY);
         b14=new Button("/");
      b14.addActionListener(this);
          b15=new Button("C");
          b14.setBackground(Color.RED);
        b15.addActionListener(this);
          b16=new Button("=");
          b16.setBackground(Color.GREEN);
        b16.addActionListener(this);
      b17=new Button(".");
          b17.addActionListener(this);
        tf=new TextField(20);
        f.add(tf);
        g=new GridLayout(4, 4, 10, 20);
        p.setLayout(g);
         p.add(b1);
        p.add(b2);
         p.add(b3);
       p.add(b4);
        p.add(b5);
         p.add(b6);
         p.add(b7);
           p.add(b8);
        p.add(b9);
        p.add(b10);
          p.add(b11);
           p.add(b12);
         p.add(b13);
          p.add(b14);
        p.add(b15);
          p.add(b16);
        p.add(b17);
         f.add(p);
        f.setSize(300,300);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1) 
            tf.setText(tf.getText()+"0");
        if(e.getSource()==b2)
            tf.setText(tf.getText()+"1");
      if(e.getSource()==b3)
            tf.setText(tf.getText()+"2");
     if(e.getSource()==b4)
            tf.setText(tf.getText()+"3");
          if (e.getSource()==b5) 
            tf.setText(tf.getText()+"4");
      if(e.getSource()==b6)
            tf.setText(tf.getText()+"5");
      if(e.getSource()==b7) 
         tf.setText(tf.getText()+"6");
        if(e.getSource()==b8) 
           tf.setText(tf.getText()+"7");
        if(e.getSource()==b9) 
            tf.setText(tf.getText()+"8");
        if(e.getSource()==b10) 
            tf.setText(tf.getText()+"9");
        if(e.getSource()==b11){
            a=tf.getText();
            tf.setText("");
            c=1;}
        if(e.getSource()==b12){
            a=tf.getText();
            tf.setText("");
            c=2;}
        if(e.getSource()==b13){
            a=tf.getText();
            tf.setText("");
            c=3;}
        if(e.getSource()==b14){
            a=tf.getText();
            tf.setText("");
            c=4;}
        if(e.getSource()==b15) 
            tf.setText("");
        if(e.getSource()==b16) {
            b=tf.getText();
            if(c==1){
                n = Integer.parseInt(a)+Integer.parseInt(b);
                tf.setText(String.valueOf(n));
            }else if(c==2){
                n=Integer.parseInt(a)-Integer.parseInt(b);
                tf.setText(String.valueOf(n));
            }else if(c==3){
                n=Integer.parseInt(a)*Integer.parseInt(b);
                tf.setText(String.valueOf(n));
            }else if(c==4){
                try{
                    int p=Integer.parseInt(b);
                    if(p!=0){
                        n=Integer.parseInt(a)/Integer.parseInt(b);
                        tf.setText(String.valueOf(n));
                    }else
                        tf.setText("Error"); 
                }
                catch(Exception i){
                }
            }
        }
        if(e.getSource()==b17)
            tf.setText(tf.getText()+".");
    }
public static void main(String[] abc) {
     new Calculator();
    }
}