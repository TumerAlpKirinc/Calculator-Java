import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class createCalculator {

    boolean IsContain = false;

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

        JButton n0 = createButton("0",100,350,cal);
        JButton n1 = createButton("1",25,125,cal);
        JButton n2 = createButton("2",100,125,cal);
        JButton n3 = createButton("3",175,125,cal);
        JButton n4 = createButton("4",25,200,cal);
        JButton n5 = createButton("5",100,200,cal);
        JButton n6 =  createButton("6",175,200,cal);
        JButton n7 = createButton("7",25,275,cal);
        JButton n8 = createButton("8",100,275,cal);
        JButton n9 = createButton("9",175,275,cal);
        JButton plus = createButton("+",250,125,cal);
        JButton minus = createButton("-",250,200,cal);
        JButton times = createButton("*",250,275,cal);
        JButton dot = createButton(".",175,350,cal);
        JButton clear = createButton("C",25,350,cal);
        JButton divide = createButton("÷",250,350,cal);
        JButton equal = createButton("=",325,350,cal);
        JButton power = createButton("^",325,275,cal);
        JButton cos = createButton("cos",325,200,cal);
        Font font = new Font("Arial",Font.BOLD,9);
        cos.setFont(font);
        JButton sin = createButton("sin",325,125,cal);
        sin.setFont(font);
        char[] symbols = {'+','-','*','÷','.','^'};
        n0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textField.getText().equals("0"))
                    textField.setText(textField.getText()+n0.getText());
                writehistory(history,"0");
            }
        });
        n1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textField.getText().equals("0"))
                    textField.setText(textField.getText()+n1.getText());
                else
                    textField.setText(n1.getText());
                writehistory(history,"1");
            }
        });
        n2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textField.getText().equals("0"))
                    textField.setText(textField.getText()+n2.getText());
                else
                    textField.setText(n2.getText());
                writehistory(history,"2");
            }
        });
        n3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textField.getText().equals("0"))
                    textField.setText(textField.getText()+n3.getText());
                else
                    textField.setText(n3.getText());
                writehistory(history,"3");
            }
        });
        n4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textField.getText().equals("0"))
                    textField.setText(textField.getText()+n4.getText());
                else
                    textField.setText(n4.getText());
                writehistory(history,"4");
            }
        });
        n5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textField.getText().equals("0"))
                    textField.setText(textField.getText()+n5.getText());
                else
                    textField.setText(n5.getText());
                writehistory(history,"5");
            }
        });
        n6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textField.getText().equals("0"))
                    textField.setText(textField.getText()+n6.getText());
                else
                    textField.setText(n6.getText());
                writehistory(history,"6");
            }
        });
        n7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textField.getText().equals("0"))
                    textField.setText(textField.getText()+n7.getText());
                else
                    textField.setText(n7.getText());
                writehistory(history,"7");
            }
        });
        n8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textField.getText().equals("0"))
                    textField.setText(textField.getText()+n8.getText());
                else
                    textField.setText(n8.getText());
                writehistory(history,"8");
            }
        });
        n9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textField.getText().equals("0"))
                    textField.setText(textField.getText()+n9.getText());
                else
                    textField.setText(n9.getText());
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
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = textField.getText();
                char a = str.charAt(str.length()-1);
                int n = str.length()-2;
                for (int i=0;i<symbols.length;i++){
                    if (symbols[i] == a) {
                        IsContain = true;
                        break;
                    }
                }
                if (IsContain) {
                    String newstring = str.substring(0,str.length()-1);
                    newstring = newstring+"+";

                    textField.setText(newstring);
                    changeHistoryOperator(history,"+");
                }
                else {
                    textField.setText(textField.getText() + plus.getText());
                    writehistory(history,"+");
                }
                IsContain =false;
                arrayList.add(str);
                operators.add("+");
                textField.setText(null);
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = textField.getText();
                char a = str.charAt(str.length()-1);
                for (int i=0;i<symbols.length;i++){
                    if (symbols[i] == a) {
                        IsContain = true;
                        break;
                    }
                }
                if (IsContain) {
                    String newstring = str.substring(0,str.length()-1);
                    newstring = newstring+"-";
                    textField.setText(newstring);
                    changeHistoryOperator(history,"-");

                }
                else {
                    textField.setText(textField.getText() + minus.getText());
                    writehistory(history,"-");
                }
                IsContain =false;
                arrayList.add(str);
                operators.add("-");
                textField.setText(null);
            }
        });
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = textField.getText();
                char a = str.charAt(str.length()-1);
                for (int i=0;i<symbols.length;i++){
                    if (symbols[i] == a) {
                        IsContain = true;
                        break;
                    }
                }
                if (IsContain) {
                    String newstring = str.substring(0,str.length()-1);
                    newstring = newstring+"÷";
                    textField.setText(newstring);
                    changeHistoryOperator(history,"÷");

                }
                else {
                    textField.setText(textField.getText() + divide.getText());
                    writehistory(history,"÷");
                }
                IsContain =false;
                arrayList.add(str);
                operators.add("/");
                textField.setText(null);
            }
        });
        times.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = textField.getText();
                char a = str.charAt(str.length()-1);
                for (int i=0;i<symbols.length;i++){
                    if (symbols[i] == a) {
                        IsContain = true;
                        break;
                    }
                }
                if (IsContain) {
                    String newstring = str.substring(0,str.length()-1);
                    newstring = newstring+"*";
                    textField.setText(newstring);
                    changeHistoryOperator(history,"*");
                }
                else {
                    textField.setText(textField.getText() + times.getText());
                    writehistory(history,"*");
                }
                IsContain =false;
                arrayList.add(str);
                operators.add("*");
                textField.setText(null);
            }
        });
        power.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = textField.getText();
                char a = str.charAt(str.length()-1);
                for (int i=0;i<symbols.length;i++){
                    if (symbols[i] == a) {
                        IsContain = true;
                        break;
                    }
                }
                if (IsContain) {
                    String newstring = str.substring(0,str.length()-1);
                    newstring = newstring+"^";
                    textField.setText(newstring);
                    changeHistoryOperator(history,"^");

                }
                else {
                    textField.setText(textField.getText() + power.getText());
                    writehistory(history,"^");
                }
                IsContain =false;
                arrayList.add(str);
                operators.add("^");
                textField.setText(null);

            }
        });
        dot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = textField.getText();
                char a = str.charAt(str.length()-1);
                for (int i=0;i<symbols.length;i++){
                    if (symbols[i] == a) {
                        IsContain = true;
                        break;
                    }
                }
                if (IsContain) {
                    String newstring = str.substring(0,str.length()-1);
                    newstring = newstring+".";
                    textField.setText(newstring);
                    changeHistoryOperator(history,".");

                }
                else {
                    textField.setText(textField.getText() + dot.getText());
                    writehistory(history,".");
                }
                IsContain =false;
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
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = textField.getText();
                arrayList.add(str);
                writehistory(history,"=");

                double num=0;

                for(int i=0;i<operators.size();i++){
                    if(operators.get(i)=="."){
                        double integerPart = Double.parseDouble(arrayList.get(i));
                        double decimalPart = Double.parseDouble(arrayList.get(i+1));
                        int bolum = arrayList.get(i+1).length();
                        int a=1;
                        for(int j=0;j<bolum;j++)
                            a *= 10;
                        decimalPart = decimalPart/a;
                        integerPart = integerPart + decimalPart;
                        arrayList.set(i,Double.toString(integerPart));
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
