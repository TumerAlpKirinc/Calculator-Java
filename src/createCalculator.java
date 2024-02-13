import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class createCalculator {

    boolean iceriyorMu = false;

    public static void main(String[] args) {
        createCalculator c = new createCalculator();
        c.CreateCalculator();
    }
    public void CreateCalculator(){

        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> operators = new ArrayList<>();
        JFrame cal = new JFrame();
        cal.setSize(450,450);
        cal.getContentPane().setBackground(Color.black);
        cal.setDefaultCloseOperation(3);
        cal.setLayout(null);

        JTextField textField = new JTextField("0");
        JTextField history = new JTextField(null);

        textField.setBounds(25, 50, 350, 50);
        textField.setBackground(Color.gray);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);
        history.setBounds(25,30,350,20);
        history.setBackground(Color.gray);
        history.setFont(textField.getFont());
        history.setEditable(false);
        cal.add(textField);
        cal.add(history);

        JButton r0 = createButton("0",100,350,cal);
        JButton r1 = createButton("1",25,125,cal);
        JButton r2 = createButton("2",100,125,cal);
        JButton r3 = createButton("3",175,125,cal);
        JButton r4 = createButton("4",25,200,cal);
        JButton r5 = createButton("5",100,200,cal);
        JButton r6 =  createButton("6",175,200,cal);
        JButton r7 = createButton("7",25,275,cal);
        JButton r8 = createButton("8",100,275,cal);
        JButton r9 = createButton("9",175,275,cal);
        JButton arti = createButton("+",250,125,cal);
        JButton eksi = createButton("-",250,200,cal);
        JButton carpi = createButton("*",250,275,cal);
        JButton nokta = createButton(".",175,350,cal);
        JButton clear = createButton("C",25,350,cal);
        JButton bolu = createButton("÷",250,350,cal);
        JButton esittir = createButton("=",325,350,cal);
        JButton us = createButton("^",325,275,cal);
        JButton cos = createButton("cos",325,200,cal);
        Font font = new Font("Arial",Font.BOLD,9);
        cos.setFont(font);
        JButton sin = createButton("sin",325,125,cal);
        sin.setFont(font);
        char[] isaretler = {'+','-','*','÷','.','^'};
        r0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textField.getText().equals("0"))
                    textField.setText(textField.getText()+r0.getText());
                writehistory(history,"0");
            }
        });
        r1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textField.getText().equals("0"))
                    textField.setText(textField.getText()+r1.getText());
                else
                    textField.setText(r1.getText());
                writehistory(history,"1");
            }
        });
        r2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textField.getText().equals("0"))
                    textField.setText(textField.getText()+r2.getText());
                else
                    textField.setText(r2.getText());
                writehistory(history,"2");
            }
        });
        r3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textField.getText().equals("0"))
                    textField.setText(textField.getText()+r3.getText());
                else
                    textField.setText(r3.getText());
                writehistory(history,"3");
            }
        });
        r4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textField.getText().equals("0"))
                    textField.setText(textField.getText()+r4.getText());
                else
                    textField.setText(r4.getText());
                writehistory(history,"4");
            }
        });
        r5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textField.getText().equals("0"))
                    textField.setText(textField.getText()+r5.getText());
                else
                    textField.setText(r5.getText());
                writehistory(history,"5");
            }
        });
        r6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textField.getText().equals("0"))
                    textField.setText(textField.getText()+r6.getText());
                else
                    textField.setText(r6.getText());
                writehistory(history,"6");
            }
        });
        r7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textField.getText().equals("0"))
                    textField.setText(textField.getText()+r7.getText());
                else
                    textField.setText(r7.getText());
                writehistory(history,"7");
            }
        });
        r8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textField.getText().equals("0"))
                    textField.setText(textField.getText()+r8.getText());
                else
                    textField.setText(r8.getText());
                writehistory(history,"8");
            }
        });
        r9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textField.getText().equals("0"))
                    textField.setText(textField.getText()+r9.getText());
                else
                    textField.setText(r9.getText());
                writehistory(history,"9");
            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("0");
                history.setText(null);
            }
        });
        arti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = textField.getText();
                char a = str.charAt(str.length()-1);
                int n = str.length()-2;
                for (int i=0;i<isaretler.length;i++){
                    if (isaretler[i] == a) {
                        iceriyorMu = true;
                        break;
                    }
                }
                if (iceriyorMu) {
                    String yeni = str.substring(0,str.length()-1);
                    yeni = yeni+"+";

                    textField.setText(yeni);
                    changeHistoryOperator(history,"+");
                }
                else {
                    textField.setText(textField.getText() + arti.getText());
                    writehistory(history,"+");
                }
                iceriyorMu=false;
                arrayList.add(str);
                operators.add("+");
                textField.setText(null);
            }
        });
        eksi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = textField.getText();
                char a = str.charAt(str.length()-1);
                for (int i=0;i<isaretler.length;i++){
                    if (isaretler[i] == a) {
                        iceriyorMu = true;
                        break;
                    }
                }
                if (iceriyorMu) {
                    String yeni = str.substring(0,str.length()-1);
                    yeni = yeni+"-";
                    textField.setText(yeni);
                    changeHistoryOperator(history,"-");

                }
                else {
                    textField.setText(textField.getText() + eksi.getText());
                    writehistory(history,"-");
                }
                iceriyorMu=false;
                arrayList.add(str);
                operators.add("-");
                textField.setText(null);
            }
        });
        bolu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = textField.getText();
                char a = str.charAt(str.length()-1);
                for (int i=0;i<isaretler.length;i++){
                    if (isaretler[i] == a) {
                        iceriyorMu = true;
                        break;
                    }
                }
                if (iceriyorMu) {
                    String yeni = str.substring(0,str.length()-1);
                    yeni = yeni+"÷";
                    textField.setText(yeni);
                    changeHistoryOperator(history,"÷");

                }
                else {
                    textField.setText(textField.getText() + bolu.getText());
                    writehistory(history,"÷");
                }
                iceriyorMu=false;
                arrayList.add(str);
                operators.add("/");
                textField.setText(null);
            }
        });
        carpi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = textField.getText();
                char a = str.charAt(str.length()-1);
                for (int i=0;i<isaretler.length;i++){
                    if (isaretler[i] == a) {
                        iceriyorMu = true;
                        break;
                    }
                }
                if (iceriyorMu) {
                    String yeni = str.substring(0,str.length()-1);
                    yeni = yeni+"*";
                    textField.setText(yeni);
                    changeHistoryOperator(history,"*");
                }
                else {
                    textField.setText(textField.getText() + carpi.getText());
                    writehistory(history,"*");
                }
                iceriyorMu=false;
                arrayList.add(str);
                operators.add("*");
                textField.setText(null);
            }
        });
        us.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = textField.getText();
                char a = str.charAt(str.length()-1);
                for (int i=0;i<isaretler.length;i++){
                    if (isaretler[i] == a) {
                        iceriyorMu = true;
                        break;
                    }
                }
                if (iceriyorMu) {
                    String yeni = str.substring(0,str.length()-1);
                    yeni = yeni+"^";
                    textField.setText(yeni);
                    changeHistoryOperator(history,"^");

                }
                else {
                    textField.setText(textField.getText() + us.getText());
                    writehistory(history,"^");
                }
                iceriyorMu=false;
                arrayList.add(str);
                operators.add("^");
                textField.setText(null);

            }
        });
        nokta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = textField.getText();
                char a = str.charAt(str.length()-1);
                for (int i=0;i<isaretler.length;i++){
                    if (isaretler[i] == a) {
                        iceriyorMu = true;
                        break;
                    }
                }
                if (iceriyorMu) {
                    String yeni = str.substring(0,str.length()-1);
                    yeni = yeni+".";
                    textField.setText(yeni);
                    changeHistoryOperator(history,".");

                }
                else {
                    textField.setText(textField.getText() + nokta.getText());
                    writehistory(history,".");
                }
                iceriyorMu=false;
                arrayList.add(str);
                operators.add(".");
                textField.setText(null);
            }
        });
        sin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = textField.getText();
                double num = Double.parseDouble(str);
                textField.setText(String.valueOf(Math.sin(num)));
            }
        });
        cos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = textField.getText();
                double num = Double.parseDouble(str);
                textField.setText(String.valueOf(Math.cos(num)));
            }
        });
        esittir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = textField.getText();
                arrayList.add(str);
                writehistory(history,"=");

                double num=0;

                for(int i=0;i<operators.size();i++){
                    if(operators.get(i)=="."){
                        double ana = Double.parseDouble(arrayList.get(i));
                        double kusurat = Double.parseDouble(arrayList.get(i+1));
                        int bolum = arrayList.get(i+1).length();
                        int a=1;
                        for(int j=0;j<bolum;j++)
                            a *= 10;
                        kusurat = kusurat/a;
                        ana = ana + kusurat;
                        arrayList.set(i,Double.toString(ana));
                        arrayList.remove(i+1);
                        operators.remove(i);
                    }
                }
                for(int i=0;i<operators.size();i++){
                    if(operators.get(i)=="^"){
                        arrayList.set(i,Double.toString(calculate(arrayList.get(i),'^',arrayList.get(i+1)))) ;
                        arrayList.remove(i+1);
                        operators.remove(i);
                    }
                }
                for(int i=0;i<operators.size();i++){
                    if(operators.get(i)=="*"){
                        arrayList.set(i,Double.toString(calculate(arrayList.get(i),'*',arrayList.get(i+1)))) ;
                        arrayList.remove(i+1);
                        operators.remove(i);
                    }
                }

                for(int i=0;i<operators.size();i++){
                    if(operators.get(i)=="/"){
                        arrayList.set(i,Double.toString(calculate(arrayList.get(i),'/',arrayList.get(i+1)))) ;
                        arrayList.remove(i+1);
                        operators.remove(i);
                    }
                }


                for(int i=0;i<operators.size();i++){
                    if(operators.get(i)=="-"){
                        arrayList.set(i,Double.toString(calculate(arrayList.get(i),'-',arrayList.get(i+1)))) ;
                        arrayList.remove(i+1);
                        operators.remove(i);
                    }
                }

                for(int i=0;i<operators.size();i++){
                    if(operators.get(i)=="+"){
                        arrayList.set(i,Double.toString(calculate(arrayList.get(i),'+',arrayList.get(i+1)))) ;
                        arrayList.remove(i+1);
                        operators.remove(i);
                    }
                }


                textField.setText(arrayList.get(0));
                writehistory(history,arrayList.get(0));
                arrayList.clear();
                operators.clear();




            }
        });








        cal.setVisible(true);





    }
    private JButton createButton(String symbol,int x,int y,JFrame jFrame){
        JButton button = new JButton(symbol);
        button.setBounds(x,y,50,50);
        Font font = new Font("Arial",Font.BOLD,14);
        button.setBackground(Color.black);
        button.setForeground(Color.gray);
        button.setFont(font);
        button.setVisible(true);
        jFrame.add(button);
        return button;



    }
    private void writehistory(JTextField history,String str){
        if(history.getText() != null){
            history.setText(history.getText()+str);
        }
        else
            history.setText(str);


    }
    private void changeHistoryOperator(JTextField history,String yeni){
        String a = history.getText();
        a.substring(0,a.length()-1);
        history.setText(a+yeni);
    }
    private double calculate(String num1,char operator,String num2){
        double num = Double.parseDouble(num1);
        double nums = Double.parseDouble(num2);
        switch (operator){
            case '+' :
                return num+nums;
            case '-' :
                    return num-nums;
            case '/' :
                return num/nums;
            case '*' :
                return num*nums;
            case '^' :
                return Math.pow(num,nums);
            default:
                return -1;
        }
    }



}
