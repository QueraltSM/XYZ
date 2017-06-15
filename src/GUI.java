import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    private JFrame f = new JFrame();
    private JList<PersonalSalarioFijo> personalSalarioFijoList = new JList<PersonalSalarioFijo>();
    private JList<PersonalComision> personalComisionList = new JList<PersonalComision>();

    private JPanel panel = new JPanel();
    private JPanel panelAux = new JPanel();

    private DefaultListModel d1 = new DefaultListModel();
    private DefaultListModel d2 = new DefaultListModel();

    private JRadioButton rb1 = new JRadioButton("Ordenar por orden alfabético");
    private JRadioButton rb2 = new JRadioButton("Ordenar por sueldo mayor");

    private ButtonGroup bg = new ButtonGroup();
    private JPanel radio = new JPanel();

    private JScrollPane sp = new JScrollPane(personalComisionList, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS); // barra lateral derecha

    private JScrollPane sp2 = new JScrollPane(personalSalarioFijoList, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);


    public GUI() {
        init();
        Dimension tableSize = new Dimension(100, 100);
        sp.setPreferredSize(tableSize);

        Dimension tableSize2 = new Dimension(100, 100);
        sp2.setPreferredSize(tableSize2);

        rb1.setSelected(true);
        bg.add(rb1);
        bg.add(rb2);




        rb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.getGestora().setOrden(0);
                d2.removeAllElements();
                personalSalarioFijoList.removeAll();

                personalComisionList.removeAll();
                d1.removeAllElements();

                for (PersonalComision i : Main.getGestora().getPersonalComision() ) {
                    d1.addElement(i.imprimir());
                }


                for (PersonalSalarioFijo j : Main.getGestora().getPersonalSalarioFijo()) {
                    d2.addElement(j.imprimir());
                }

            }
        });


        rb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.getGestora().setOrden(1);
                d2.removeAllElements();
                personalSalarioFijoList.removeAll();

                personalComisionList.removeAll();
                d1.removeAllElements();

                for (PersonalComision i : Main.getGestora().getPersonalComision() ) {
                    d1.addElement(i.imprimir());
                }

                for (PersonalSalarioFijo j : Main.getGestora().getPersonalSalarioFijo()) {
                    d2.addElement(j.imprimir());
                }

            }
        });



        radio.setLayout(new GridLayout(2,1));
        JPanel a1 = new JPanel();
        a1.add(rb1, BorderLayout.CENTER);
        JPanel a2 = new JPanel();
        a2.add(rb2, BorderLayout.CENTER);
        radio.add(a1);
        radio.add(a2);

        personalComisionList.setModel(d1);
        JPanel a3 = new JPanel();
        a3.setLayout(new GridLayout(2,1));
        a3.add(new JLabel("Personal por comisión"));
        a3.add(sp);


        personalSalarioFijoList.setModel(d2);
        JPanel a4 = new JPanel();
        a4.setLayout(new GridLayout(2,1));
        a4.add(new JLabel("Personal con salario fijo"));
        a4.add(sp2);


        panelAux.add(a3, BorderLayout.WEST);
        panelAux.add(a4, BorderLayout.EAST);

        panel.setLayout(new GridLayout(2, 1));
        panel.add(panelAux);
        panel.add(radio);
        f.add(panel, BorderLayout.NORTH);

        f.setVisible(true);
        f.setSize(500, 500);
        f.setResizable(false);
        f.setTitle("XYZ");
        f.setLocationRelativeTo(null);
    }

    public void init() {
        for (PersonalComision i : Main.getGestora().getPersonalComision() ) {
            d1.addElement(i.imprimir());
        }

        for (PersonalSalarioFijo j : Main.getGestora().getPersonalSalarioFijo()) {
            d2.addElement(j.imprimir());
        }

    }
}
