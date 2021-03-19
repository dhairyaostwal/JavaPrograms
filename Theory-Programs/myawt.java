import java.awt.*;
import java.awt.event.*;

class myawt implements ActionListener, ItemListener {

  Frame f;
  Label l1;
  Button b1, b2;
  TextField t1;
  Panel p;
  Choice c;

  myawt() {
    f = new Frame("My first frame");
    l1 = new Label("Write something");
    b1 = new Button("Click me");
    b2 = new Button("Exit");
    t1 = new TextField(25);
    p = new Panel();
    c = new Choice();
    c.addItem("Red");
    c.addItem("Yellow");
    c.addItem("Green");

    l = new List(3,true);


    f.add(p);
    f.add(l1);
    f.add(t1);
    f.add(b1);
    f.add(b2);
    f.add(c);
    f.setVisible(true);
    f.setSize(300, 300);
    f.setLayout(new FlowLayout());

    b1.addActionListener(this);
    b2.addActionListener(this);
    c.addItemListener(this);
  }

  public void itemStateChanged(ItemEvent e) {
    if (e.getSource() == c) {
      if (c.getSelectedItem() == "Red") {
        t1.setBackground(Color.red);
      }
      if (c.getSelectedItem() == "Yellow") {
        t1.setText("Yellow");
      }
      if (c.getSelectedItem() == "Green") {
        t1.setText("Green");
      }
    }
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == b2) System.exit(0);

    if (e.getSource() == b1) {
      t1.setText("AWT Programming!");
    }
  }

  public static void main(String art[]) {
    new myawt();
  }
}


/*

Ma'am's Code in Class

// simple AWT program - without using tools
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

class myawt implements ActionListener,ItemListener
{
Frame f;
Label l1;
Button b1, b2;
TextField t1;
Panel p;
Choice C;
List L;
myawt()
{
f = new Frame("My first frame");
p=new Panel();
l1 = new Label("Write something");
b1=new Button("click me");
b2=new Button("Exit");
t1=new TextField(25);
C = new Choice();
L=new List(3,true);
C.addItem("Red");
C.addItem("Yellow");
C.addItem("Black");
L.addItem("Apple");
L.addItem("Mang");
L.addItem("Orange");

f.add(l1);
f.add(t1);
f.add(b1);
f.add(b2);
f.add(C);
f.add(L);
//f.add(b2);
f.setVisible(true);
f.setSize(300,300);
f.setLayout(new FlowLayout());

b2.addActionListener(this);
b1.addActionListener(this);
C.addItemListener(this);
}

public void itemStateChanged(ItemEvent e)
{

if(C.getSelectedItem()=="Red")
{
t1.setBackground(Color.BLUE);
}
}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b2)
{
System.exit(0);
}

if(e.getSource()==b1)
{
t1.setText("Welcome to JAVA AWT programming");

}
}

public static void main(String art[])
{
new myawt();
}
}

*/