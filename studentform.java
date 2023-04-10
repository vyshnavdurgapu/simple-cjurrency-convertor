import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class form extends JFrame implements ActionListener
{
	JPanel panel;
	
	JLabel title;
	
	JLabel regno;
	JTextField tregno;
	
	JLabel name;
	JTextField tname;
	
	JLabel gender;
	JRadioButton male;
	JRadioButton female;
	
	JLabel degree;
	JComboBox cbdegree;
	
	JLabel branch;
	JComboBox cbbranch;
	
	JLabel yos;
	JComboBox cbyos;
	
	JLabel dob;
	JComboBox cbdob1;
	JComboBox cbdob2;
	JComboBox cbdob3;
	
	JLabel ad;
	JTextArea tad;
	
	JLabel em;
	JTextField tem;
	
	JLabel hobby;
	JCheckBox vg;
	JCheckBox books;
	JCheckBox cook;
	
	JLabel exa;
	JList lexa;
	
	JButton submit;
	
	JTextArea out;
	form()
	{
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.PINK);
		panel.setBounds(0,30,695,450);

		this.setTitle("response form");
		this.setLayout(null);
		this.setVisible(true);
		this.setBounds(700,120,695,450);
		this.getContentPane().setBackground(new Color(200,100,90));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(panel);
		
		title=new JLabel();
		title.setBounds(0,0,695,30);
		title.setText("STUDENT RESPONSE FORM");
		title.setVerticalAlignment(JLabel.CENTER);
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setFont(new Font(null,Font.PLAIN,25));
		this.add(title);
		
		regno=new JLabel("register no.");
		regno.setBounds(15,20,80,20);
		regno.setVerticalAlignment(JLabel.CENTER);
		regno.setHorizontalAlignment(JLabel.CENTER);
		regno.setFont(new Font(null,Font.PLAIN,15));
		panel.add(regno);

		tregno=new JTextField();
		tregno.setBounds(120,20,130,20);
		panel.add(tregno);
		
		name=new JLabel("name");
		name.setBounds(15,50,80,20);
		name.setFont(new Font(null,Font.PLAIN,15));
		panel.add(name);

		
		tname=new JTextField();
		tname.setBounds(120,50,130,20);
		panel.add(tname);
		
		gender=new JLabel("Gender");
		gender.setBounds(15,80,80,20);
		gender.setFont(new Font(null,Font.PLAIN,15));
		panel.add(gender);
		
		male=new JRadioButton("MALE");
		male.setBounds(120,80,65,20);
		male.setFont(new Font(null,Font.PLAIN,8));
		male.setFocusable(false);
		panel.add(male);
		
		female=new JRadioButton("FEMALE");		
		female.setBounds(185,80,65,20);
		female.setFont(new Font(null,Font.PLAIN,8));
		female.setFocusable(false);
		panel.add(female);
		
		ButtonGroup group=new ButtonGroup();
		group.add(male);;
		group.add(female);
		
		degree=new JLabel("Degree");
		degree.setBounds(15,120,80,20);
		degree.setFont(new Font(null,Font.PLAIN,15));
		panel.add(degree);
		
		String degreel[] = {"Btech","PG","law"};
		cbdegree = new JComboBox(degreel);
		cbdegree.setBounds(120,120,70,20);
		panel.add(cbdegree);
		
		branch=new JLabel("Branch");
		branch.setBounds(15,150,80,20);
		branch.setFont(new Font(null,Font.PLAIN,15));
		panel.add(branch);
		
		String branchl[] = {"CSE","ECE","EEE","MECH","LAW","BIOTECH"};
		cbbranch = new JComboBox(branchl);
		cbbranch.setBounds(120,150,80,20);
		panel.add(cbbranch);
		
		yos=new JLabel("yearofstudy");
		yos.setBounds(15,180,80,20);
		yos.setFont(new Font(null,Font.PLAIN,15));
		panel.add(yos);
		
		String yosl[] = {"|","||","|||","|V","V"};
		cbyos = new JComboBox(yosl);
		cbyos.setBounds(120,180,40,20);
		panel.add(cbyos);
		
		dob=new JLabel("DOB(d/m/y)");
		dob.setBounds(15,210,80,20);
		dob.setFont(new Font(null,Font.PLAIN,15));
		panel.add(dob);
		
		Integer dobl1[] = new Integer[31];
		for(int i=1;i<32;i++)
		{
			dobl1[i-1]=new Integer(i);
		}
		cbdob1 = new JComboBox(dobl1);
		cbdob1.setBounds(120,210,35,20);
		panel.add(cbdob1);
		Integer dobl2[] = new Integer[12];
		for(int i=1;i<13;i++)
		{
			dobl2[i-1]=new Integer(i);
		}
		cbdob2 = new JComboBox(dobl2);
		cbdob2.setBounds(155,210,40,20);
		panel.add(cbdob2);
		Integer dobl3[] = new Integer[9];
		for(int i=1996;i<2005;i++)
		{
			dobl3[i-1996]=new Integer(i);
		}
		cbdob3 = new JComboBox(dobl3);
		cbdob3.setBounds(195,210,51,20);
		panel.add(cbdob3);
		
		ad=new JLabel("Address");
		ad.setBounds(15,240,60,20);
		ad.setFont(new Font(null,Font.PLAIN,15));
		panel.add(ad);
		
		tad=new JTextArea();
		tad.setBounds(80,240,165,80);
		tad.setFont(new Font(null,Font.PLAIN,11));
		JScrollPane scroll1 = new JScrollPane(tad);
		scroll1.setBounds(80,240,165,80);
		panel.add(scroll1);
		
		em=new JLabel("E Mail");
		em.setBounds(15,330,60,20);
		em.setFont(new Font(null,Font.PLAIN,15));
		panel.add(em);
		
		tem=new JTextField();
		tem.setBounds(80,330,165,20);
		panel.add(tem);
		
		hobby=new JLabel("hobbies");
		hobby.setBounds(280,20,60,20);
		hobby.setFont(new Font(null,Font.PLAIN,15));
		panel.add(hobby);
		
		vg=new JCheckBox(" playing videogames");
		vg.setBounds(280,50,163,20);
		vg.setFont(new Font(null,Font.PLAIN,15));
		vg.setFocusable(false);
		panel.add(vg);
		
		books=new JCheckBox(" reading books");
		books.setBounds(450,50,130,20);
		books.setFont(new Font(null,Font.PLAIN,15));
		books.setFocusable(false);
		panel.add(books);
		
		cook=new JCheckBox(" cooking");
		cook.setBounds(585,50,85,20);
		cook.setFont(new Font(null,Font.PLAIN,15));
		cook.setFocusable(false);
		panel.add(cook);
		
		exa=new JLabel("extra curricular activities");
		exa.setBounds(280,80,160,20);
		exa.setFont(new Font(null,Font.PLAIN,15));
		panel.add(exa);
		
		String[] exal= {"tennis","cricket","football"};
		lexa=new JList(exal);
		lexa.setBounds(460,80,60,65);
		lexa.setFont(new Font(null,Font.PLAIN,15));
		panel.add(lexa);
		
		submit =new JButton("SUBMIT");
		submit.setBounds(415,160,120,35);
		submit.setBackground(new Color(170,170,255));
		submit.setFont(new Font(null,Font.BOLD,20));
		submit.setFocusable(false);
		submit.addActionListener(this);
		panel.add(submit);
		
		out=new JTextArea();
		out.setEditable(false);
		out.setBounds(300,200,150,150);
		out.setFont(new Font(null,Font.PLAIN,11));
		JScrollPane scroll2 = new JScrollPane(out);
		scroll2.setBounds(300,200,350,150);
//		panel.add(out);
		panel.add(scroll2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String result="";
		String hs = "";
		String hs1 = "";
		if(male.isSelected())
		{
			hs="He ";
			hs1="His ";
		}
		if(female.isSelected())
		{
			hs="She";
			hs1="Her ";
		}
		result = result +tname.getText()+"'s register no. is "+tregno.getText()+"\n";
		result = result +hs+"is currently studying "+(cbyos.getSelectedIndex()+1) +" year of "+(String)cbdegree.getSelectedItem()+" "+(String)cbbranch.getSelectedItem()+"\n";
		result+=hs+"is born on "+cbdob1.getSelectedItem()+"-"+cbdob2.getSelectedItem()+"-"+cbdob3.getSelectedItem()+"\n";
		result+=hs+"is residing at "+tad.getText()+"\n";
		result+=hs1+"email address is "+tem.getText()+"\n";
		String hob="";
		Boolean f=false;
		if(vg.isSelected())
		{
			hob+="playing video games";
			f=true;
		}
		if(books.isSelected())
		{
			if(f)
				hob+=",";
			hob+="reading books";
			f=true;
		}
		if(cook.isSelected())
		{
			if(f)
				hob+=" and ";
			hob+="cooking";
			f=true;
		}
		if(f)
			result+=hs+"is intrested in "+hob+"\n";
		result+=hs+" plays "+lexa.getSelectedValue()+"\n";
		out.setText(result);
	}
}

public class studentform {

	public static void main(String[] args) {
		new form();
	}

}
