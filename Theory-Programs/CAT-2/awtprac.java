// awt practice

import java.awt.*;
import java.awt.event.*;

class awtprac implements ActionListener {

  Frame f;
  Label l1, l2, l3;
  Button b1, b2;
  TextField t1, t2;
  Panel p;
  Choice c;

  awtprac() {
    f = new Frame("Voting");
    l1 = new Label("Enter name");
    l2 = new Label("Enter age");
    l3 = new Label("Select gender");
    b1 = new Button("Check validity");
    b2 = new Button("Exit");
    t1 = new TextField(25);
    t2 = new TextField(25);
    c = new Choice();
    c.addItem("--- Gender ---");
    c.addItem("Male");
    c.addItem("Female");

    f.add(l1);
    f.add(t1);
    f.add(l2);
    f.add(t2);
    f.add(l3);
    f.add(c);
    f.add(b1);
    f.add(b2);

    f.setVisible(true);
    f.setSize(300, 500);
    f.setLayout(new FlowLayout());

    b1.addActionListener(this);
    b2.addActionListener(this);
    // c.addItemListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == b2) System.exit(0);

    if (e.getSource() == b1) {
      int a = Integer.parseInt(t2.getText());
      if (a < 18) {
        b2.setVisible(false);
      } else {
        b1.setBackground(Color.green);
      }
    }

    if (e.getSource() == c) {
      if (c.getSelectedItem() == "Male") {
        t1.setBackground(Color.red);
      }
      if (c.getSelectedItem() == "Female") {
        t1.setText("Yellow");
      }

    }
  }

  public static void main(String args[]) {
    new awtprac();
  }
}
