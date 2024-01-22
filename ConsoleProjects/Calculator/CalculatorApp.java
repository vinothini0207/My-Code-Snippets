import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.FileHandler;    
import javax.print.attribute.standard.Severity;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.text.StyledEditorKit.BoldAction;
    
public class CalculatorApp implements ActionListener{
        JLabel displayLabel;
        JButton sevenButton;
        JButton eightButton;
        JButton nineButton;
        JButton divisionButton;
        JButton fourButton;
        JButton fiveButton;
        JButton sixButton;
        JButton multiplicationButton;
        JButton oneButton;
        JButton twoButton;
        JButton threeButton;
        JButton subtractionButton;
        JButton dotButton;
        JButton zeroButton;
        JButton equalButton;
        JButton additionButton;
        JButton clearButton;
        
        boolean isOperatorClicked=false;
        boolean isAddClicked=false;
        boolean isSubClicked=false;
        boolean isMulClicked=false;
        boolean isDivClicked=false;
        String oldValueString;
        
        public CalculatorApp() {
            JFrame frame=new JFrame("Calculator Application");
            frame.setSize(500,600);
            frame.setLayout(null);
            frame.setLocation(100, 100);;
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            displayLabel=new JLabel();
            displayLabel.setBounds(30, 50, 520, 40);
            displayLabel.setBackground(Color.gray);
            displayLabel.setOpaque(true);
            displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
            displayLabel.setForeground(Color.red);
            
            frame.add(displayLabel);
            
            sevenButton=new JButton("7");
            sevenButton.setBounds(30,130,80,80);
            sevenButton.addActionListener(this);
            frame.add(sevenButton);
            
            eightButton=new JButton("8");
            eightButton.setBounds(130,130,80,80);
            eightButton.addActionListener(this);
            frame.add(eightButton);
            
            nineButton=new JButton("9");
            nineButton.setBounds(230,130,80,80);
            nineButton.addActionListener(this);
            frame.add(nineButton);
            
           divisionButton=new JButton("/");
            divisionButton.setBounds(330,130,80,80);
            divisionButton.addActionListener(this);
            frame.add(divisionButton);
            
            fourButton=new JButton("4");
            fourButton.setBounds(30,230,80,80);
            fourButton.addActionListener(this);
            frame.add(fourButton);
            
            fiveButton=new JButton("5");
            fiveButton.setBounds(130,230,80,80);
            fiveButton.addActionListener(this);
            frame.add(fiveButton);
            
             sixButton=new JButton("6");
            sixButton.setBounds(230,230,80,80);
            sixButton.addActionListener(this);
            frame.add(sixButton);
            
             multiplicationButton=new JButton("X");
            multiplicationButton.setBounds(330,230,80,80);
            multiplicationButton.addActionListener(this);
            frame.add(multiplicationButton);
          
             oneButton=new JButton("1");
            oneButton.setBounds(30,330,80,80);
            oneButton.addActionListener(this);
            frame.add(oneButton);
            
             twoButton=new JButton("2");
            twoButton.setBounds(130,330,80,80);
            twoButton.addActionListener(this);
            frame.add(twoButton);
            
            threeButton=new JButton("3");
            threeButton.setBounds(230,330,80,80);
            threeButton.addActionListener(this);
            frame.add(threeButton);
            
             subtractionButton=new JButton("-");
           subtractionButton.setBounds(330,330,80,80);
          subtractionButton.addActionListener(this);
            frame.add(subtractionButton);
            
            
             dotButton=new JButton(".");
            dotButton.setBounds(30,430,80,80);
            dotButton.addActionListener(this);
            frame.add(dotButton);
            
             zeroButton=new JButton("0");
            zeroButton.setBounds(130,430,80,80);
            zeroButton.addActionListener(this);
            frame.add(zeroButton);
            
             equalButton=new JButton("=");
            equalButton.setBounds(230,430,80,80);
            equalButton.addActionListener(this);
            frame.add(equalButton);
            
             additionButton=new JButton("+");
            additionButton.setBounds(330,430,80,80);
            additionButton.addActionListener(this);
            frame.add(additionButton);
            
            clearButton=new JButton("Clear");
            clearButton.setBounds(30, 530, 80, 80);
            clearButton.addActionListener(this);
            frame.add(clearButton);
            
        }
        public static void main(String[] args) {
            new CalculatorApp();
            
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==oneButton) {
                 if(isOperatorClicked) {
                    displayLabel.setText("1");
                    isOperatorClicked=false;
                }else {
                displayLabel.setText(displayLabel.getText()+"1");
                   }
             }
            else if(e.getSource()==twoButton) {
                if(isOperatorClicked) {
                    displayLabel.setText("2");
                    isOperatorClicked=false;
                }else {
                displayLabel.setText(displayLabel.getText()+"2");
                 }
            }
            else if(e.getSource()==threeButton) {
                if(isOperatorClicked) {
                    displayLabel.setText("3");
                    isOperatorClicked=false;
                }else {
                displayLabel.setText(displayLabel.getText()+"3");
                    }
          }
            else if(e.getSource()==fourButton) {
                if(isOperatorClicked) {
                    displayLabel.setText("4");
                    isOperatorClicked=false;
                }else {
                displayLabel.setText(displayLabel.getText()+"4");
                 }
         }
            else if(e.getSource()==fiveButton) {
                if(isOperatorClicked) {
                    displayLabel.setText("5");
                    isOperatorClicked=false;
                }else {
                    displayLabel.setText(displayLabel.getText()+"5");
                }
                
            }
            else if(e.getSource()==sixButton) {
                if(isOperatorClicked) {
                    displayLabel.setText("6");
                    isOperatorClicked=false;
                }else {
                displayLabel.setText(displayLabel.getText()+"6");
                }
        }
            else if(e.getSource()==sevenButton) {
                if(isOperatorClicked) {
                    displayLabel.setText("7");
                    isOperatorClicked=false;
                }
                else{
                String labelText=displayLabel.getText();
                displayLabel.setText(labelText+"7");
                }
            }
        else if(e.getSource()==eightButton) {
            if(isOperatorClicked) {
                displayLabel.setText("8");
                isOperatorClicked=false;
            }else {
            displayLabel.setText(displayLabel.getText()+"8");
            }
            
        }
        else if(e.getSource()==nineButton) {
            if(isOperatorClicked) {
                displayLabel.setText("9");
                isOperatorClicked=false;
            }else {
            displayLabel.setText(displayLabel.getText()+"9");
             }
      }
        else if(e.getSource()==zeroButton) {
            
            displayLabel.setText(displayLabel.getText()+"0");
        }
       else if(e.getSource()==dotButton) {
                displayLabel.setText(displayLabel.getText()+".");
        }
        
        else if(e.getSource()==equalButton) {
            String newValue=displayLabel.getText();
            float oldValueF=Float.parseFloat(oldValueString);
            float newValueF=Float.parseFloat(newValue);
            float result = 0;
            if(isAddClicked) {
            result=oldValueF+newValueF;
            isAddClicked=false;
            }
            else if(isSubClicked) {
                result=oldValueF-newValueF;
                isSubClicked=false;
            }
            else if(isMulClicked) {
                result=oldValueF*newValueF;
                isMulClicked=false;
            }
            else if(isDivClicked) {
                result=oldValueF/newValueF;
                isDivClicked=false;
            }
            displayLabel.setText(result+" ");
        }
         else if(e.getSource()==additionButton) {
             isOperatorClicked=true;
              isAddClicked=true;
            oldValueString=displayLabel.getText();
            
        }
         else if(e.getSource()==subtractionButton) {
             isOperatorClicked=true;
             isSubClicked=true;
             oldValueString=displayLabel.getText();
         }
         else if(e.getSource()==multiplicationButton) {
             isOperatorClicked=true;
             isMulClicked=true;
             oldValueString=displayLabel.getText();
         }
         else if(e.getSource()==divisionButton) {
             isOperatorClicked=true;
             isDivClicked=true;
             oldValueString=displayLabel.getText();
         }
         else {
             displayLabel.setText("");
         }
    }
} 

