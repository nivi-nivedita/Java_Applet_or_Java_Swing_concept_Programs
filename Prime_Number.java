import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="prime" width=500 height=500>
</applet>
*/
public class prime extends JApplet 
{	

	private static final long serialVersionUID = 1L;
	
	JTextField jt;
	JButton b;
	JLabel jb,jb1,jb2;
	public void init()
	{
	try
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				makeGUI();
			}
		});
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
public void makeGUI()
{
	setLayout(new FlowLayout());
	jb=new JLabel("Enter The number:");
	add(jb);
	jt=new JTextField(15);
	add(jt);
 	b=new JButton("Result");
	add(b);
	jb2=new JLabel(" ");
	add(jb2);
	b.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
			int n=Integer.parseInt(jt.getText());
			
					
			jb2.setText("THE Prime numbers are:  ");
				
    int i=2, c=0;

    for(int count = 2; count <= n+1; i++)  
    {
	   

       
        for(c = 2; c <i; c++)
        {
            if(i%c == 0)
                break;
        }

        if(c == i)  
        {
                jb1=new jlabel(" ");
                 add(jb1) ;
                
		jb1.setText(i+" ");
            count++;    
        }
		
    }
 
	

}	

});
	
}
}
