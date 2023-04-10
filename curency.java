import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JMenu;

class notselectedex  extends Exception
{}
class inputex  extends Exception
{}

class check
{
	public static void checkselectedornot(JComboBox b1,JComboBox b2) throws notselectedex
	{
		if(b1.getSelectedIndex()==-1||b1.getSelectedIndex()==0)
		{
			throw new notselectedex();
		}
		else if(b2.getSelectedIndex()==-1||b2.getSelectedIndex()==0)
		{
			throw new notselectedex();
		}
	}
	public static void checkimput(JTextField tf) throws inputex
	{
		String t=tf.getText();
		if(t.length()==0) {
			throw new inputex();
		}
		else
		{
			for(int i=0;i<t.length();i++)
			{
				if(!((t.charAt(i)>='0'&&t.charAt(i)<='9')||(t.charAt(i)=='.')))
				{
					throw new inputex();
				}
			}
		}
		
	}
	
}

class Converter extends JFrame implements ActionListener{
     JLabel heading;
     JPanel panel;
     JLabel label1;
     JTextField tfrom;
     JLabel from;
     JLabel to;
     String list[] = {"select","US dollar (USD)","Euro (EUR)","Australian dollar (AUD)","Canadian dollar (CAD)",
     "Indian Rupee(INR)","Kuwaiti Dinar","Swiss Franc(CHF)","Pound Sterling(GBP)","BitCoin(BTC)","Singapore Dollar(SGD)"};
     JComboBox cbfrom;
     JComboBox cbto;
     JButton convert;
     JLabel result;
     JTextField tresult;
     JMenu menu;
     JMenuBar menubar;
     JMenuItem dark;
     JMenuItem copy;
     JButton reset;
     
     
     double usd=74.41;
     double eur=83.69;
     double aud=53.73;
     double cad=58.71;
     double inr=1;
     double din=245.70;
     double chf=79.74;
     double gbp=99.51;
     double bit=4204105.54;
     double sgd=54.49;
     double temp;
 
    boolean f1;
    Converter(){
        this.setLayout(null);
        this.setTitle("CURRENCY CONVERTOR");
        this.setBounds(700,300,600,450);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JMenuBar menubar=new JMenuBar();
        menu=new JMenu("MENU");
        dark=new JMenuItem("DARK MODE");
        copy=new JMenuItem("COPY");
        menu.add(dark);
        menu.add(copy);
        menubar.add(menu);
        this.setJMenuBar(menubar);

        dark.addActionListener(this);
        f1=false;
        copy.addActionListener(this);


        heading=new JLabel("CURRENCY CONVERTOR");
        heading.setBounds(0,0,600,30);
        this.add(heading);
        heading.setFont(new Font(null,Font.BOLD,25));
        heading.setHorizontalAlignment(JLabel.CENTER);
        heading.setBackground(new Color(120,100,50));
        heading.setOpaque(true);

        panel=new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(100,100,200));
        this.add(panel);
        panel.setBounds(0,30,600,420);

        label1=new JLabel("AMOUNT TO BE CONVERTED");
        panel.add(label1);
        label1.setBounds(20,50,300,30);
        label1.setFont(new Font(null,Font.PLAIN,20));
        label1.setVerticalAlignment(JLabel.CENTER);

        tfrom=new JTextField();
        panel.add(tfrom);
        tfrom.setBounds(350,50,190,30);
        tfrom.setFont(new Font(null,Font.PLAIN,20));

        from=new JLabel("FROM");
        panel.add(from);
        from.setBounds(20,100,300,30);
        from.setHorizontalAlignment(JLabel.CENTER);
        from.setFont(new Font(null,Font.PLAIN,20));

        to=new JLabel("TO");
        panel.add(to);
        to.setBounds(300,100,280,30);
        to.setHorizontalAlignment(JLabel.CENTER);
        to.setFont(new Font(null,Font.PLAIN,20));

        cbfrom= new JComboBox(list);
        cbfrom.setBounds(70,150,210,30);
        cbfrom.setFont(new Font(null,Font.PLAIN,20));
        panel.add(cbfrom);

        cbto=new JComboBox(list);
        cbto.setBounds(340,150,210,30);
        cbto.setFont(new Font(null,Font.PLAIN,20));
        panel.add(cbto);

        convert=new JButton("CONVERT");
        panel.add(convert);
        convert.setBounds(230,220,150,30);
        convert.setFont(new Font(null,Font.BOLD,20));
        convert.setBackground(new Color(120,180,120));
        convert.setFocusable(false);
        convert.addActionListener(this);

        result=new JLabel("RESULT");
        panel.add(result);
        result.setBounds(110,280,80,50);
        result.setVerticalAlignment(JLabel.CENTER);
        result.setFont(new Font(null,Font.PLAIN,20));

        tresult=new JTextField();
//        panel.add(tresult);
//        tresult.setBounds(150,280,190,30);
        tresult.setFont(new Font(null,Font.PLAIN,20));
        tresult.setEditable(false);
        JScrollPane scroll = new JScrollPane(tresult);
        scroll.setBounds(210,280,190,50);
        panel.add(scroll);
        
        reset = new JButton("reset");
        reset.setBackground(new Color(200,200,0));
        reset.setFocusable(false);
        reset.setFont(new Font(null,Font.PLAIN,13));
        reset.setBounds(430,295,80,18);
        reset.addActionListener(this);
        panel.add(reset);
        
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==convert)
        {
            
            check c=new check();
            try {
				c.checkimput(tfrom);
				try {
					c.checkselectedornot(cbfrom,cbto);
					switch (cbfrom.getSelectedIndex())
		            {
		            case 1:
		            	temp=Double.parseDouble(tfrom.getText());
		            	temp=temp*usd;
		            	break;
		            case 2:
		            	temp=Double.parseDouble(tfrom.getText());
		            	temp=temp*eur;
		            	break;
		            case 3:
		            	temp=Double.parseDouble(tfrom.getText());
		            	temp=temp*aud;
		            	break;
		            case 4:
		            	temp=Double.parseDouble(tfrom.getText());
		            	temp=temp*cad;
		            	break;
		            case 5:
		            	temp=Double.parseDouble(tfrom.getText());
		            	temp=temp*inr;
		            	break;	
		            case 6:
		            	temp=Double.parseDouble(tfrom.getText());
		            	temp=temp*din;
		            	break;	
		            case 7:
		            	temp=Double.parseDouble(tfrom.getText());
		            	temp=temp*chf;
		            	break;
		            case 8:
		            	temp=Double.parseDouble(tfrom.getText());
		            	temp=temp*gbp;
		            	break;
		            case 9:
		            	temp=Double.parseDouble(tfrom.getText());
		            	temp=temp*bit;
		            	break;
		            case 10:
		            	temp=Double.parseDouble(tfrom.getText());
		            	temp=temp*sgd;
		            	break;
		            
		            default:
		            	break;
		            	
		            }
		            switch (cbto.getSelectedIndex())
		            {
		            case 1:
		            	temp=temp/usd;
		            	break;
		            case 2:
		            	temp=temp/eur;
		            	break;
		            case 3:
		            	temp=temp/aud;
		            	break;
		            case 4:
		            	temp=temp/cad;
		            	break;	
		            case 5:
		            	temp=temp/inr;
		            	break;
		            case 6:
		            	temp=temp/din;
		            	break;
		            case 7:
		            	temp=temp/chf;
		            	break;
		            case 8:
		            	temp=temp/gbp;
		            	break;
		            case 9:
		            	temp=temp/bit;
		            	break;
		            case 10:
		            	temp=temp/sgd;
		            	break;
		            default:
		            	break;	
		            }
		            tresult.setText(String.format("%.16f", temp));
		            temp=0;
				} catch (notselectedex e1) {
					tresult.setText(null);
					new JOptionPane().showMessageDialog(null,"INVALID SELECTION!!!!!","ERROR",JOptionPane.WARNING_MESSAGE);
				}
			} catch (inputex e2) {
				tresult.setText(null);
				new JOptionPane().showMessageDialog(null,"INVALID INPUT!!!!!","ERROR",JOptionPane.WARNING_MESSAGE);
			} 	
        }
        if(e.getSource()==dark)
        {
            if(!f1)
            {
               panel.setBackground(new Color(60,60,60));
               label1.setForeground(new Color(255,255,255));
               from.setForeground(new Color(255,255,255));
               to.setForeground(new Color(255,255,255));
               result.setForeground(new Color(255,255,255));
               dark.setLabel("LIGHT MODE");
               f1=true;
            }
            else
            {
                panel.setBackground(new Color(100,100,200));
                label1.setForeground(new Color(0,0,0));
                from.setForeground(new Color(0,0,0));
                to.setForeground(new Color(0,0,0));
                result.setForeground(new Color(0,0,0));
                dark.setLabel("DARK MODE");
                f1=false;
            }

        }
        if(e.getSource()==copy)
        {
            tresult.copy();
        }
        if(e.getSource()==reset)
        {
        	tresult.setText(null);
        	tfrom.setText(null);
        	cbfrom.setSelectedIndex(0);
        	cbto.setSelectedIndex(0);
        }
    }
        
    }
public class curency{
    public static void main(String[] args){
        new Converter();
    } 
}