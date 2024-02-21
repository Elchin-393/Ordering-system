package McDonaldsMenu;

import java.awt.EventQueue;

import javax.swing.*;

import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.text.BadLocationException;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;

public class McDonaldsOrderingSystem extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
	
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					McDonaldsOrderingSystem frame = new McDonaldsOrderingSystem();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public McDonaldsOrderingSystem() {
		super("McDonald's Ordering System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 957, 1000);
		
		
		JScrollPane scrollPane = new JScrollPane();
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.getVerticalScrollBar().setUI(new BasicScrollBarUI());
        scrollPane.getViewport().setBackground(Color.WHITE);

       	contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		
		contentPane.setLayout(null);
		
		contentPane.setPreferredSize(new Dimension(900, 860));
		scrollPane.setViewportView(contentPane);
		setContentPane(scrollPane);
		
		JLabel label = new JLabel();
		label.setBounds(0, 11, 924, 107);
		contentPane.add(label);
		
		
		ImageIcon mc = new ImageIcon("C:/Users/User/Desktop/Icons\\Mc.png");
		label.setIcon(mc);
		
		
		Burgers burgers = new Burgers();
		Snacks snacks = new Snacks();
		Beverages beverages = new Beverages();
		Sauces sauces = new Sauces();
		MilkShakesAndIceCreams  IceCreams = new MilkShakesAndIceCreams();
		HotDrinks hotDrinks = new HotDrinks();
		Desserts desserts = new Desserts();
		HappyMeal happyMeal = new HappyMeal();
		
		
		 JTextArea textArea = new JTextArea();
			textArea.setBounds(10, 50, 615, 440);
			textArea.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
			textArea.setEditable(false);
		
		JButton Burgers = new JButton("Burgers");
		Burgers.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		Burgers.setBounds(17, 129, 102, 70);
		Burgers.setBackground(new Color(204, 0, 0));
		Burgers.setForeground(Color.WHITE);	
		contentPane.add(Burgers);
		
		
		JButton Snacks = new JButton("Snacks");
		Snacks.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 17));
		Snacks.setForeground(Color.WHITE);
		Snacks.setBackground(new Color(204, 0, 0));
		Snacks.setBounds(129, 129, 102, 70);
		contentPane.add(Snacks);
		
		
		JButton Beverages = new JButton("Beverages");
		Beverages.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Beverages.png"));		
		Beverages.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 12));
		Beverages.setBackground(new Color(204, 0, 0));
		Beverages.setBounds(241, 129, 102, 70);
		contentPane.add(Beverages);
		
		JButton Sauces = new JButton("Sauces");
		Sauces.setForeground(Color.WHITE);
		Sauces.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 17));
		Sauces.setBackground(new Color(204, 0, 0));
		Sauces.setBounds(353, 129, 102, 70);
		contentPane.add(Sauces);
		
		
		JButton CreamsAndShakes = new JButton("Ice Creams and Milkshakes");
		CreamsAndShakes.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Ice Creams and Milk Shakes.png"));
		CreamsAndShakes.setForeground(Color.WHITE);
		CreamsAndShakes.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 7));
		CreamsAndShakes.setBackground(new Color(204, 0, 0));
		CreamsAndShakes.setBounds(465, 129, 102, 70);
		contentPane.add(CreamsAndShakes);
		
		
		JButton HotDrinks = new JButton("Hot Drinks");
		HotDrinks.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hot Drinks.png"));
		HotDrinks.setForeground(Color.WHITE);
		HotDrinks.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 12));
		HotDrinks.setBackground(new Color(204, 0, 0));
		HotDrinks.setBounds(577, 129, 102, 70);
		contentPane.add(HotDrinks);
		
		JButton Desserts = new JButton("Desserts");
		Desserts.setForeground(Color.WHITE);
		Desserts.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		Desserts.setBackground(new Color(204, 0, 0));
		Desserts.setBounds(689, 129, 102, 70);
		contentPane.add(Desserts);
		
		JButton HappyMeal = new JButton("HappyMeal");
		HappyMeal.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\HappyMeal.png"));
		HappyMeal.setForeground(Color.WHITE);
		HappyMeal.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 11));
		HappyMeal.setBackground(new Color(204, 0, 0));
		HappyMeal.setBounds(801, 129, 102, 70);
		contentPane.add(HappyMeal);
		
		JLabel Hamburger = new JLabel("");
		Hamburger.setHorizontalAlignment(SwingConstants.CENTER);
		Hamburger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Burgers\\Hamburgers.png"));
		Hamburger.setBackground(Color.WHITE);
		Hamburger.setBounds(14, 222, 162, 116);
		contentPane.add(Hamburger);
		
		JLabel Cheeseburger = new JLabel("");
		Cheeseburger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Burgers\\Cheeseburgers.png"));
		Cheeseburger.setBackground(Color.WHITE);
		Cheeseburger.setBounds(195, 222, 162, 116);
		contentPane.add(Cheeseburger);
		
		JLabel McChicken = new JLabel("");
		McChicken.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Burgers\\Mc Chicken.png"));
		McChicken.setBackground(Color.WHITE);
		McChicken.setBounds(376, 222, 162, 116);
		contentPane.add(McChicken);
		
		JLabel BigMac = new JLabel("");
		BigMac.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Burgers\\BigMac.png"));
		BigMac.setBackground(Color.WHITE);
		BigMac.setBounds(557, 222, 162, 116);
		contentPane.add(BigMac);
		
		JLabel RoyalCheeseBurger = new JLabel("");
		RoyalCheeseBurger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Burgers\\Royal CheeseBurger.png"));
		RoyalCheeseBurger.setBackground(Color.WHITE);
		RoyalCheeseBurger.setBounds(738, 222, 162, 116);
		contentPane.add(RoyalCheeseBurger);
		
		JLabel HamburgerName = new JLabel("Hamburger");
		HamburgerName.setHorizontalAlignment(SwingConstants.CENTER);
		HamburgerName.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		HamburgerName.setBounds(14, 349, 162, 20);
		contentPane.add(HamburgerName);
		
		JLabel CheeseBurgerName = new JLabel("Cheeseburger");
		CheeseBurgerName.setHorizontalAlignment(SwingConstants.CENTER);
		CheeseBurgerName.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		CheeseBurgerName.setBounds(195, 349, 162, 20);
		contentPane.add(CheeseBurgerName);
		
		JLabel McChickenName = new JLabel("McChicken");
		McChickenName.setHorizontalAlignment(SwingConstants.CENTER);
		McChickenName.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		McChickenName.setBounds(376, 349, 162, 20);
		contentPane.add(McChickenName);
		
		JLabel BigMacName = new JLabel("BigMac");
		BigMacName.setHorizontalAlignment(SwingConstants.CENTER);
		BigMacName.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		BigMacName.setBounds(557, 349, 162, 20);
		contentPane.add(BigMacName);
		
		JLabel RoyalCheeseburgerName = new JLabel("Royal Cheeseburger");
		RoyalCheeseburgerName.setHorizontalAlignment(SwingConstants.CENTER);
		RoyalCheeseburgerName.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		RoyalCheeseburgerName.setBounds(738, 349, 162, 20);
		contentPane.add(RoyalCheeseburgerName);
		
		JComboBox CheeseburgerSize = new JComboBox(new Object[]{});
		CheeseburgerSize.setModel(new DefaultComboBoxModel(new String[] {"Normal", "Double", "Triple"}));
		CheeseburgerSize.setFont(new Font("Century", Font.PLAIN, 13));
		CheeseburgerSize.setBounds(236, 380, 83, 20);
		contentPane.add(CheeseburgerSize);
		
		JLabel CheeseBurgerPriceSt = new JLabel(String.format("%.2f $",burgers.getCheeseBurgerPrice()));
		CheeseBurgerPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		CheeseBurgerPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		CheeseBurgerPriceSt.setBounds(255, 411, 46, 14);
		contentPane.add(CheeseBurgerPriceSt);
		
		  CheeseburgerSize.addActionListener(new ActionListener() {
              double result2 = 1; 
			@Override
			public void actionPerformed(ActionEvent e) {
				String selectedValueCheeseburger = (String) CheeseburgerSize.getSelectedItem();
		        
		        if ("Normal".equals(selectedValueCheeseburger)) {
		        	CheeseBurgerPriceSt.setText(String.format("%.2f $", burgers.getCheeseBurgerPrice()));
		        } else if ("Double".equals(selectedValueCheeseburger)) {
		        	result2= burgers.getCheeseBurgerPrice()*2;
		        	CheeseBurgerPriceSt.setText(String.format("%.2f $", result2));
		        } else {
		        	result2= burgers.getCheeseBurgerPrice()*3;
		        	CheeseBurgerPriceSt.setText(String.format("%.2f $", result2));
		        }
		    }
			
		});
		
		
		JComboBox McChickenSize = new JComboBox(new Object[]{});
		McChickenSize.setModel(new DefaultComboBoxModel(new String[] {"Normal", "Double"}));
		McChickenSize.setFont(new Font("Century", Font.PLAIN, 13));
		McChickenSize.setBounds(417, 380, 83, 20);
		contentPane.add(McChickenSize);
		
		JLabel McChickenPriceSt = new JLabel(String.format("%.2f $",burgers.getMcChickenPrice()));
		McChickenPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		McChickenPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		McChickenPriceSt.setBounds(436, 411, 46, 14);
		contentPane.add(McChickenPriceSt);
		
		McChickenSize.addActionListener(new ActionListener() {
            double result3 = 1; 
			@Override
			public void actionPerformed(ActionEvent e) {
				String selectedValueMcChicken = (String) McChickenSize.getSelectedItem();
		        
		        if ("Normal".equals(selectedValueMcChicken)) {
		        	McChickenPriceSt.setText(String.format("%.2f $", burgers.getMcChickenPrice()));
		        } else {
		        	result3= burgers.getMcChickenPrice()*2;
		        	McChickenPriceSt.setText(String.format("%.2f $", result3));
		        	
		        } 
		    }
			
		});
		
		JComboBox BigMacSize = new JComboBox(new Object[]{});
		BigMacSize.setModel(new DefaultComboBoxModel(new String[] {"Normal", "Double"}));
		BigMacSize.setFont(new Font("Century", Font.PLAIN, 13));
		BigMacSize.setBounds(598, 380, 83, 20);
		contentPane.add(BigMacSize);
		
		JLabel BigMacPriceSt = new JLabel(String.format("%.2f $",burgers.getBigMacPrice()));
		BigMacPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		BigMacPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		BigMacPriceSt.setBounds(617, 411, 46, 14);
		contentPane.add(BigMacPriceSt);
		
		BigMacSize.addActionListener(new ActionListener() {
            double result4 = 1; 
			@Override
			public void actionPerformed(ActionEvent e) {
				String selectedValueBigMac = (String) BigMacSize.getSelectedItem();
		        
		        if ("Normal".equals(selectedValueBigMac)) {
		        	BigMacPriceSt.setText(String.format("%.2f $", burgers.getBigMacPrice()));
		        } else {
		        	result4= burgers.getBigMacPrice()*2;
		        	BigMacPriceSt.setText(String.format("%.2f $", result4));
		        	
		        } 
		    }
			
		});
		
		JComboBox RoyalCheeseBurgerSize = new JComboBox(new Object[]{});
		RoyalCheeseBurgerSize.setModel(new DefaultComboBoxModel(new String[] {"Normal", "Double"}));
		RoyalCheeseBurgerSize.setFont(new Font("Century", Font.PLAIN, 13));
		RoyalCheeseBurgerSize.setBounds(779, 380, 83, 20);
		contentPane.add(RoyalCheeseBurgerSize);
		
		JLabel RoyalCheeseburgerPriceSt = new JLabel(String.format("%.2f $",burgers.getRoyalCheeseBurgerPrice()));
		RoyalCheeseburgerPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		RoyalCheeseburgerPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		RoyalCheeseburgerPriceSt.setBounds(798, 411, 46, 14);
		contentPane.add(RoyalCheeseburgerPriceSt);
		
		RoyalCheeseBurgerSize.addActionListener(new ActionListener() {
            double result5 = 1; 
			@Override
			public void actionPerformed(ActionEvent e) {
				String selectedValueRoyalCheeseburger = (String) RoyalCheeseBurgerSize.getSelectedItem();
		        
		        if ("Normal".equals(selectedValueRoyalCheeseburger)) {
		        	RoyalCheeseburgerPriceSt.setText(String.format("%.2f $", burgers.getRoyalCheeseBurgerPrice()));
		        } else {
		        	result5= burgers.getRoyalCheeseBurgerPrice()*2;
		        	RoyalCheeseburgerPriceSt.setText(String.format("%.2f $", result5));
		        	
		        } 
		    }
			
		});
		
		JLabel HamburgerPriceSt = new JLabel(String.format("%.2f $", burgers.getHamburgerPrice()));
		HamburgerPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		HamburgerPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		HamburgerPriceSt.setBounds(74, 411, 46, 14);
		contentPane.add(HamburgerPriceSt);
		
		
		
		String[] BurgersSize = {"Normal","Double","Triple"};
		JComboBox HamburgerSize = new JComboBox(BurgersSize);
		HamburgerSize.setFont(new Font("Century", Font.PLAIN, 13));
		HamburgerSize.setBounds(55, 380, 83, 20);
		contentPane.add(HamburgerSize);
		
		 
	    HamburgerSize.addActionListener(new ActionListener() {
              double result1 = 1; 
			@Override
			public void actionPerformed(ActionEvent e) {
				String selectedValueHamburger = (String) HamburgerSize.getSelectedItem();
		        
				// Hamburger 
		       
				if ("Normal".equals(selectedValueHamburger)) {
		        	HamburgerPriceSt.setText(String.format("%.2f $", burgers.getHamburgerPrice()));
		        } else if ("Double".equals(selectedValueHamburger)) {
		        	result1= burgers.getHamburgerPrice()*2;
		        	HamburgerPriceSt.setText(String.format("%.2f $", result1));
		        } else if("Triple".equals(selectedValueHamburger)){
		        	result1= burgers.getHamburgerPrice()*3;
		        	HamburgerPriceSt.setText(String.format("%.2f $", result1));
		        }
			
		        
		    }
			
		});
	    
	    
		
		
		JButton HamburgerAdd = new JButton("Add");
		HamburgerAdd.setForeground(new Color(255, 255, 255));
		HamburgerAdd.setBackground(new Color(204, 0, 0));
		HamburgerAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		HamburgerAdd.setBounds(47, 436, 97, 28);
		contentPane.add(HamburgerAdd);
		
		JButton HamburgerIncrease = new JButton("");
		HamburgerIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
		HamburgerIncrease.setForeground(new Color(255, 255, 255));
		HamburgerIncrease.setBackground(new Color(255, 255, 255));
		HamburgerIncrease.setBounds(148, 436, 28, 28);
		contentPane.add(HamburgerIncrease);

		JButton HamburgerReduce = new JButton("");
		HamburgerReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
		HamburgerReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		HamburgerReduce.setForeground(new Color(255, 255, 255));
		HamburgerReduce.setBackground(new Color(255, 255, 255));
		HamburgerReduce.setBounds(14, 436, 28, 28);
		contentPane.add(HamburgerReduce);

		
		final int[] amount1 = {0};
		final BigDecimal[] totalPrice = {BigDecimal.ZERO};
		
		HamburgerIncrease.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	
		    	
		        amount1[0]++;
		        HamburgerAdd.setText("Add: " + amount1[0]);
		       
		    }
		});
		
		HamburgerAdd.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        String selectedValueHamburger = (String) HamburgerSize.getSelectedItem();
		        double FinalResultHamburger = 0;
		        
		        boolean itemAlreadyAdded = false;
		        

		       
		        for (int i = 0; i < textArea.getLineCount(); i++) {
		            try {
		                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
		                if (line.contains("Hamburger") && line.contains(selectedValueHamburger)) {
		                    itemAlreadyAdded = true;
		                    break;
		                }
		            } catch (BadLocationException ex) {
		                ex.printStackTrace();
		            }
		        }
		        
		        
		        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
		            textArea.append("\n\n");
		        }
		        
		        if (!itemAlreadyAdded) {
		        if ("Normal".equals(selectedValueHamburger)) {
		            FinalResultHamburger = burgers.getHamburgerPrice() * amount1[0];
		            FinalResultHamburger = Math.round(FinalResultHamburger * 100.0) / 100.0;
		            String formattedPrice = String.format("%.2f", FinalResultHamburger);
		            textArea.append("      "+ "Hamburger"+"                                         "                                          
		                    + selectedValueHamburger 
		                    + "                                                   "  + amount1[0] + "                                                  "
		                    + formattedPrice + " $\n");
		        } else if ("Double".equals(selectedValueHamburger)) {
		            FinalResultHamburger = 3.60 * amount1[0];
		            FinalResultHamburger = Math.round(FinalResultHamburger * 100.0) / 100.0;
		            String formattedPrice = String.format("%.2f", FinalResultHamburger);
		            textArea.append("      "+ "Hamburger"+"                                         "                                          
		                    + selectedValueHamburger 
		                    + "                                                    "  + amount1[0] + "                                                  "
		                    + formattedPrice + " $\n");
		        } else if ("Triple".equals(selectedValueHamburger)) {
		            FinalResultHamburger = 5.40 * amount1[0];
		            FinalResultHamburger = Math.round(FinalResultHamburger * 100.0) / 100.0;
		            String formattedPrice = String.format("%.2f", FinalResultHamburger);
		            textArea.append("      "+ "Hamburger"+"                                         "                                          
		                    + selectedValueHamburger 
		                    + "                                                       "  + amount1[0] + "                                                  "
		                    + formattedPrice + " $\n");
		       
		        }
		        
		        
		        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultHamburger)
                        .setScale(2, RoundingMode.HALF_UP);
		        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
                
		        }
		    }
		    
		});


		HamburgerReduce.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	
		    	String selectedValueHamburger = (String) HamburgerSize.getSelectedItem();
		    	double FinalResultHamburger = 0;
		    	
		    	if (amount1[0] > 1) {
		            if ("Normal".equals(selectedValueHamburger)) {
		                FinalResultHamburger = burgers.getHamburgerPrice() * amount1[0];
		            } else if ("Double".equals(selectedValueHamburger)) {
		                FinalResultHamburger = 3.60 * amount1[0];
		            } else if ("Triple".equals(selectedValueHamburger)) {
		                FinalResultHamburger = 5.40 * amount1[0];
		            }

		        }

		        if (amount1[0] > 1) {
		            amount1[0]--;
		            HamburgerAdd.setText("Add: " + amount1[0]);
		        } else {
		            HamburgerAdd.setText("Add");
		        }
		    }
		});

		
		
		

		
		
		
		JButton CheeseburgerAdd = new JButton("Add");
		CheeseburgerAdd.setForeground(Color.WHITE);
		CheeseburgerAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		CheeseburgerAdd.setBackground(new Color(204, 0, 0));
		CheeseburgerAdd.setBounds(228, 436, 97, 28);
		contentPane.add(CheeseburgerAdd);
		
		JButton CheeseburgerIncrease = new JButton("");
		CheeseburgerIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
		CheeseburgerIncrease.setForeground(Color.WHITE);
		CheeseburgerIncrease.setBackground(Color.WHITE);
		CheeseburgerIncrease.setBounds(329, 436, 28, 28);
		contentPane.add(CheeseburgerIncrease);
		
		JButton CheeseburgerReduce = new JButton("");
		CheeseburgerReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
		CheeseburgerReduce.setForeground(Color.WHITE);
		CheeseburgerReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		CheeseburgerReduce.setBackground(Color.WHITE);
		CheeseburgerReduce.setBounds(195, 436, 28, 28);
		contentPane.add(CheeseburgerReduce);
		
		final int[] amount2 = {0};
		
		CheeseburgerIncrease.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				amount2[0]++;
				CheeseburgerAdd.setText("Add: "+amount2[0]);
				
			}
			
		});
		
		
		
		CheeseburgerAdd.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        String selectedValueCheeseburger = (String) CheeseburgerSize.getSelectedItem();
		        double FinalResultCheeseburger = 0;
		        
		        boolean itemAlreadyAdded = false;
		        

		       
		        for (int i = 0; i < textArea.getLineCount(); i++) {
		            try {
		                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
		                if (line.contains("Cheeseburger") && line.contains(selectedValueCheeseburger)) {
		                    itemAlreadyAdded = true;
		                    break;
		                }
		            } catch (BadLocationException ex) {
		                ex.printStackTrace();
		            }
		        }
		        
		        
		        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
		            textArea.append("\n\n");
		        }
		        
		        if (!itemAlreadyAdded) {
		        if ("Normal".equals(selectedValueCheeseburger)) {
		            FinalResultCheeseburger = burgers.getCheeseBurgerPrice() * amount2[0];
		            FinalResultCheeseburger = Math.round(FinalResultCheeseburger * 100.0) / 100.0;
		            String formattedPrice = String.format("%.2f", FinalResultCheeseburger);
		            textArea.append("      "+ "Cheeseburger"+"                                   "                                          
		                    + selectedValueCheeseburger 
		                    + "                                                    "  + amount2[0] + "                                                  "
		                    + formattedPrice + " $\n");
		        } else if ("Double".equals(selectedValueCheeseburger)) {
		            FinalResultCheeseburger = 4.00 * amount2[0];
		            FinalResultCheeseburger = Math.round(FinalResultCheeseburger * 100.0) / 100.0;
		            String formattedPrice = String.format("%.2f", FinalResultCheeseburger);
		            textArea.append("      "+ "Cheeseburger"+"                                   "                                          
		                    + selectedValueCheeseburger 
		                    + "                                                    "  + amount2[0] + "                                                  "
		                    + formattedPrice + " $\n");
		        } else if ("Triple".equals(selectedValueCheeseburger)) {
		            FinalResultCheeseburger = 6.00 * amount2[0];
		            FinalResultCheeseburger = Math.round(FinalResultCheeseburger * 100.0) / 100.0;
		            String formattedPrice = String.format("%.2f", FinalResultCheeseburger);
		            textArea.append("      "+ "Cheeseburger"+"                                   "                                          
		                    + selectedValueCheeseburger 
		                    + "                                                       "  + amount2[0] + "                                                  "
		                    + formattedPrice + " $\n");
		       
		        }
		        
		        
		        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultCheeseburger)
                        .setScale(2, RoundingMode.HALF_UP);
		        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
		        }
		    }
		    
		});
		
		
		
		CheeseburgerReduce.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String selectedValueCheeseburger = (String) CheeseburgerSize.getSelectedItem();
                 double FinalResultCheeseburger = 0;
		    	
		    	if (amount2[0] > 1) {
		            if ("Normal".equals(selectedValueCheeseburger)) {
		                FinalResultCheeseburger = burgers.getCheeseBurgerPrice() * amount2[0];
		            } else if ("Double".equals(selectedValueCheeseburger)) {
		                FinalResultCheeseburger = 2.00 * amount2[0];
		            } else if ("Triple".equals(selectedValueCheeseburger)) {
		                FinalResultCheeseburger = 4.00 * amount2[0];
		            }

		        }
				
				if(amount2[0]>1) {
				amount2[0]--;
				CheeseburgerAdd.setText("Add: "+amount2[0]);
				}else {
					CheeseburgerAdd.setText("Add");
				}
			}
			
		});
		
		JButton McChickenAdd = new JButton("Add");
		McChickenAdd.setForeground(Color.WHITE);
		McChickenAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		McChickenAdd.setBackground(new Color(204, 0, 0));
		McChickenAdd.setBounds(409, 436, 97, 28);
		contentPane.add(McChickenAdd);
		
		JButton McChickenIncrease = new JButton("");
		McChickenIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
		McChickenIncrease.setForeground(Color.WHITE);
		McChickenIncrease.setBackground(Color.WHITE);
		McChickenIncrease.setBounds(510, 436, 28, 28);
		contentPane.add(McChickenIncrease);
		
		JButton McChickenReduce = new JButton("");
		McChickenReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
		McChickenReduce.setForeground(Color.WHITE);
		McChickenReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		McChickenReduce.setBackground(Color.WHITE);
		McChickenReduce.setBounds(376, 436, 28, 28);
		contentPane.add(McChickenReduce);
		
		final int amount3[] = {0};
		
		McChickenIncrease.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				amount3[0]++;
				McChickenAdd.setText("Add: " + amount3[0]);
				
			}
			
		});
		
		McChickenAdd.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        String selectedValueMcChicken = (String) McChickenSize.getSelectedItem();
		        double FinalResultMcChicken = 0;
		        
		        boolean itemAlreadyAdded = false;
		        

		       
		        for (int i = 0; i < textArea.getLineCount(); i++) {
		            try {
		                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
		                if (line.contains("McChicken") && line.contains(selectedValueMcChicken)) {
		                    itemAlreadyAdded = true;
		                    break;
		                }
		            } catch (BadLocationException ex) {
		                ex.printStackTrace();
		            }
		        }
		        
		        
		        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
		            textArea.append("\n\n");
		        }
		        
		        if (!itemAlreadyAdded) {
		        if ("Normal".equals(selectedValueMcChicken)) {
		            FinalResultMcChicken = burgers.getMcChickenPrice() * amount3[0];
		            FinalResultMcChicken = Math.round(FinalResultMcChicken * 100.0) / 100.0;
		            String formattedPrice = String.format("%.2f", FinalResultMcChicken);
		            textArea.append("      "+ "McChicken"+"                                          "                                          
		                    + selectedValueMcChicken 
		                    + "                                                   "  + amount3[0] + "                                                  "
		                    + formattedPrice + " $\n");
		        } else if ("Double".equals(selectedValueMcChicken)) {
		            FinalResultMcChicken = 7.40 * amount3[0];
		            FinalResultMcChicken = Math.round(FinalResultMcChicken * 100.0) / 100.0;
		            String formattedPrice = String.format("%.2f", FinalResultMcChicken);
		            textArea.append("      "+ "McChicken"+"                                          "                                          
		                    + selectedValueMcChicken 
		                    + "                                                   "  + amount3[0] + "                                                   "
		                    + formattedPrice + " $\n");
		        } 
		        
		        
		        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultMcChicken)
                        .setScale(2, RoundingMode.HALF_UP);
		        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
                
		        }
		    }
		    
		});


		McChickenReduce.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	
		    	String selectedValueMcChicken = (String) McChickenSize.getSelectedItem();
		    	double FinalResultMcChicken = 0;
		    	
		    	if (amount3[0] > 1) {
		            if ("Normal".equals(selectedValueMcChicken)) {
		                FinalResultMcChicken = burgers.getMcChickenPrice() * amount3[0];
		            } else if ("Double".equals(selectedValueMcChicken)) {
		                FinalResultMcChicken = 7.40 * amount3[0];
		            } 

		        }

		        if (amount3[0] > 1) {
		            amount3[0]--;
		            McChickenAdd.setText("Add: " + amount3[0]);
		        } else {
		        	McChickenAdd.setText("Add");
		        }
		    }
		});
		
		
		
		JButton BigMacAdd = new JButton("Add");
		BigMacAdd.setForeground(Color.WHITE);
		BigMacAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		BigMacAdd.setBackground(new Color(204, 0, 0));
		BigMacAdd.setBounds(590, 436, 97, 28);
		contentPane.add(BigMacAdd);
		
		JButton BigMacIncrease = new JButton("");
		BigMacIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
		BigMacIncrease.setForeground(Color.WHITE);
		BigMacIncrease.setBackground(Color.WHITE);
		BigMacIncrease.setBounds(691, 436, 28, 28);
		contentPane.add(BigMacIncrease);
		
		JButton BigMacReduce = new JButton("");
		BigMacReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
		BigMacReduce.setForeground(Color.WHITE);
		BigMacReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		BigMacReduce.setBackground(Color.WHITE);
		BigMacReduce.setBounds(557, 436, 28, 28);
		contentPane.add(BigMacReduce);
		
           final int amount4[] = {0};
		
           BigMacIncrease.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				amount4[0]++;
				BigMacAdd.setText("Add: " + amount4[0]);
				
			}
			
		});
		
           BigMacAdd.addActionListener(new ActionListener() {
   		    @Override
   		    public void actionPerformed(ActionEvent e) {
   		        String selectedValueBigMac = (String) BigMacSize.getSelectedItem();
   		        double FinalResultBigMac = 0;
   		        
   		        boolean itemAlreadyAdded = false;
   		        

   		       
   		        for (int i = 0; i < textArea.getLineCount(); i++) {
   		            try {
   		                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
   		                if (line.contains("BigMac") && line.contains(selectedValueBigMac)) {
   		                    itemAlreadyAdded = true;
   		                    break;
   		                }
   		            } catch (BadLocationException ex) {
   		                ex.printStackTrace();
   		            }
   		        }
   		        
   		        
   		        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
   		            textArea.append("\n\n");
   		        }
   		        
   		        if (!itemAlreadyAdded) {
   		        if ("Normal".equals(selectedValueBigMac)) {
   		            FinalResultBigMac = burgers.getBigMacPrice() * amount4[0];
   		            FinalResultBigMac = Math.round(FinalResultBigMac * 100.0) / 100.0;
   		            String formattedPrice = String.format("%.2f", FinalResultBigMac);
   		            textArea.append("      "+ "BigMac"+"                                                 "                                          
   		                    + selectedValueBigMac 
   		                    + "                                                   "  + amount4[0] + "                                                  "
   		                    + formattedPrice + " $\n");
   		        } else if ("Double".equals(selectedValueBigMac)) {
   		            FinalResultBigMac = 9.00 * amount4[0];
   		            FinalResultBigMac = Math.round(FinalResultBigMac * 100.0) / 100.0;
   		            String formattedPrice = String.format("%.2f", FinalResultBigMac);
   		            textArea.append("      "+ "BigMac"+"                                                 "                                          
   		                    + selectedValueBigMac 
   		                    + "                                                   "  + amount4[0] + "                                                  "
   		                    + formattedPrice + " $\n");
   		        } 
   		        
   		        
   		        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultBigMac)
                           .setScale(2, RoundingMode.HALF_UP);
   		        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
                   
   		        }
   		    }
   		    
   		});


           BigMacReduce.addActionListener(new ActionListener() {
   		    @Override
   		    public void actionPerformed(ActionEvent e) {
   		    	
   		    	String selectedValueBigMac = (String) BigMacSize.getSelectedItem();
   		    	double FinalResultBigMac = 0;
   		    	
   		    	if (amount4[0] > 1) {
   		            if ("Normal".equals(selectedValueBigMac)) {
   		                FinalResultBigMac = burgers.getBigMacPrice() * amount4[0];
   		            } else if ("Double".equals(selectedValueBigMac)) {
   		                FinalResultBigMac = 9.00 * amount4[0];
   		            } 

   		        }

   		        if (amount4[0] > 1) {
   		        	amount4[0]--;
   		        	BigMacAdd.setText("Add: " + amount4[0]);
   		        } else {
   		        	BigMacAdd.setText("Add");
   		        }
   		    }
   		});
		
		JButton RoyalCheeseburgerAdd = new JButton("Add");
		RoyalCheeseburgerAdd.setForeground(Color.WHITE);
		RoyalCheeseburgerAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		RoyalCheeseburgerAdd.setBackground(new Color(204, 0, 0));
		RoyalCheeseburgerAdd.setBounds(771, 436, 97, 28);
		contentPane.add(RoyalCheeseburgerAdd);
		
		JButton RoyalCheeseburgerIncrease = new JButton("");
		RoyalCheeseburgerIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
		RoyalCheeseburgerIncrease.setForeground(Color.WHITE);
		RoyalCheeseburgerIncrease.setBackground(Color.WHITE);
		RoyalCheeseburgerIncrease.setBounds(872, 436, 28, 28);
		contentPane.add(RoyalCheeseburgerIncrease);
		
		JButton RoyalCheeseburgerReduce = new JButton("");
		RoyalCheeseburgerReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
		RoyalCheeseburgerReduce.setForeground(Color.WHITE);
		RoyalCheeseburgerReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		RoyalCheeseburgerReduce.setBackground(Color.WHITE);
		RoyalCheeseburgerReduce.setBounds(738, 436, 28, 28);
		contentPane.add(RoyalCheeseburgerReduce);
		
		final int amount5[] = {0};
		
		RoyalCheeseburgerIncrease.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				amount5[0]++;
				RoyalCheeseburgerAdd.setText("Add: " + amount5[0]);
				
			}
			
		});
		
		RoyalCheeseburgerAdd.addActionListener(new ActionListener() {
	   		    @Override
	   		    public void actionPerformed(ActionEvent e) {
	   		        String selectedValueRoyalCheeseburger = (String) RoyalCheeseBurgerSize.getSelectedItem();
	   		        double FinalResultRoyalCheeseburger = 0;
	   		        
	   		        boolean itemAlreadyAdded = false;
	   		        

	   		       
	   		        for (int i = 0; i < textArea.getLineCount(); i++) {
	   		            try {
	   		                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
	   		                if (line.contains("RoyalCheeseburger") && line.contains(selectedValueRoyalCheeseburger)) {
	   		                    itemAlreadyAdded = true;
	   		                    break;
	   		                }
	   		            } catch (BadLocationException ex) {
	   		                ex.printStackTrace();
	   		            }
	   		        }
	   		        
	   		        
	   		        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
	   		            textArea.append("\n\n");
	   		        }
	   		        
	   		        if (!itemAlreadyAdded) {
	   		        if ("Normal".equals(selectedValueRoyalCheeseburger)) {
	   		            FinalResultRoyalCheeseburger = burgers.getRoyalCheeseBurgerPrice() * amount5[0];
	   		            FinalResultRoyalCheeseburger = Math.round(FinalResultRoyalCheeseburger * 100.0) / 100.0;
	   		            String formattedPrice = String.format("%.2f", FinalResultRoyalCheeseburger);
	   		            textArea.append("      "+ "RoyalCheeseburger"+"                         "                                          
	   		                    + selectedValueRoyalCheeseburger 
	   		                    + "                                                   "  + amount5[0] + "                                                  "
	   		                    + formattedPrice + " $\n");
	   		        } else if ("Double".equals(selectedValueRoyalCheeseburger)) {
	   		            FinalResultRoyalCheeseburger = 9.80 * amount5[0];
	   		            FinalResultRoyalCheeseburger = Math.round(FinalResultRoyalCheeseburger * 100.0) / 100.0;
	   		            String formattedPrice = String.format("%.2f", FinalResultRoyalCheeseburger);
	   		            textArea.append("      "+ "RoyalCheeseburger"+"                         "                                          
	   		                    + selectedValueRoyalCheeseburger 
	   		                    + "                                                   "  + amount5[0] + "                                                  "
	   		                    + formattedPrice + " $\n");
	   		        } 
	   		        
	   		        
	   		        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultRoyalCheeseburger)
	                           .setScale(2, RoundingMode.HALF_UP);
	   		        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
	                   
	   		        }
	   		    }
	   		    
	   		});


		RoyalCheeseburgerReduce.addActionListener(new ActionListener() {
	   		    @Override
	   		    public void actionPerformed(ActionEvent e) {
	   		    	
	   		    	String selectedValueRoyalCheeseburger = (String) RoyalCheeseBurgerSize.getSelectedItem();
	   		    	double FinalResultRoyalCheeseburger = 0;
	   		    	
	   		    	if (amount5[0] > 1) {
	   		            if ("Normal".equals(selectedValueRoyalCheeseburger)) {
	   		                FinalResultRoyalCheeseburger = burgers.getRoyalCheeseBurgerPrice() * amount5[0];
	   		            } else if ("Double".equals(selectedValueRoyalCheeseburger)) {
	   		                FinalResultRoyalCheeseburger = 9.80 * amount5[0];
	   		            } 

	   		        }

	   		        if (amount5[0] > 1) {
	   		        	amount5[0]--;
	   		        	RoyalCheeseburgerAdd.setText("Add: " + amount5[0]);
	   		        } else {
	   		        	RoyalCheeseburgerAdd.setText("Add");
	   		        }
	   		    }
	   		});
		
		JLabel ChickenBurger = new JLabel("");
		ChickenBurger.setVerticalAlignment(SwingConstants.TOP);
		ChickenBurger.setHorizontalAlignment(SwingConstants.LEFT);
		ChickenBurger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Burgers\\Chicken Burger.png"));
		ChickenBurger.setBackground(Color.WHITE);
		ChickenBurger.setBounds(14, 512, 162, 116);
		contentPane.add(ChickenBurger);
		
		JLabel MaestroBurger = new JLabel("");
		MaestroBurger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Burgers\\Maestro Burger.png"));
		MaestroBurger.setHorizontalAlignment(SwingConstants.CENTER);
		MaestroBurger.setBackground(Color.WHITE);
		MaestroBurger.setBounds(195, 512, 162, 116);
		contentPane.add(MaestroBurger);
		
		JLabel BigTasty = new JLabel("");
		BigTasty.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Burgers\\Big Tasty.png"));
		BigTasty.setHorizontalAlignment(SwingConstants.CENTER);
		BigTasty.setBackground(Color.WHITE);
		BigTasty.setBounds(376, 512, 162, 116);
		contentPane.add(BigTasty);
		
		JLabel CesarRoll = new JLabel("");
		CesarRoll.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Burgers\\Cesar Roll.png"));
		CesarRoll.setHorizontalAlignment(SwingConstants.CENTER);
		CesarRoll.setBackground(Color.WHITE);
		CesarRoll.setBounds(557, 512, 162, 116);
		contentPane.add(CesarRoll);
		
		JLabel FiletOFish = new JLabel("");
		FiletOFish.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Burgers\\Filet-O-Fish.png"));
		FiletOFish.setVerticalAlignment(SwingConstants.TOP);
		FiletOFish.setHorizontalAlignment(SwingConstants.CENTER);
		FiletOFish.setBackground(Color.WHITE);
		FiletOFish.setBounds(738, 512, 162, 116);
		contentPane.add(FiletOFish);
		
		JLabel ChickenBurgerName = new JLabel("Chickenburger ");
		ChickenBurgerName.setHorizontalAlignment(SwingConstants.CENTER);
		ChickenBurgerName.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		ChickenBurgerName.setBounds(14, 639, 162, 20);
		contentPane.add(ChickenBurgerName);
		
		JLabel MaestroBurgerName = new JLabel("Maestro Burger");
		MaestroBurgerName.setHorizontalAlignment(SwingConstants.CENTER);
		MaestroBurgerName.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		MaestroBurgerName.setBounds(195, 640, 162, 20);
		contentPane.add(MaestroBurgerName);
		
		JLabel BigTastyName = new JLabel("Big Tasty");
		BigTastyName.setHorizontalAlignment(SwingConstants.CENTER);
		BigTastyName.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		BigTastyName.setBounds(376, 640, 162, 20);
		contentPane.add(BigTastyName);
		
		JLabel CesarRollName = new JLabel("Cesar Roll");
		CesarRollName.setHorizontalAlignment(SwingConstants.CENTER);
		CesarRollName.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		CesarRollName.setBounds(557, 640, 162, 20);
		contentPane.add(CesarRollName);
		
		JLabel FiletOFishName = new JLabel("Filet-O-Fish");
		FiletOFishName.setHorizontalAlignment(SwingConstants.CENTER);
		FiletOFishName.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		FiletOFishName.setBounds(738, 640, 162, 20);
		contentPane.add(FiletOFishName);
		
		JComboBox ChickenBurgerSize = new JComboBox(new Object[]{});
		ChickenBurgerSize.setModel(new DefaultComboBoxModel(new String[] {"Normal", "Double"}));
		ChickenBurgerSize.setFont(new Font("Century", Font.PLAIN, 13));
		ChickenBurgerSize.setBounds(55, 670, 83, 20);
		contentPane.add(ChickenBurgerSize);
		
		JLabel ChickenBurgerPriceSt = new JLabel(String.format("%.2f $",burgers.getChickenBurgerPrice()));
		ChickenBurgerPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		ChickenBurgerPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		ChickenBurgerPriceSt.setBounds(74, 701, 46, 14);
		contentPane.add(ChickenBurgerPriceSt);
		
		ChickenBurgerSize.addActionListener(new ActionListener() {
            double result6 = 1; 
			@Override
			public void actionPerformed(ActionEvent e) {
				String selectedValueChickenBurger = (String) ChickenBurgerSize.getSelectedItem();
		        
		        if ("Normal".equals(selectedValueChickenBurger)) {
		        	ChickenBurgerPriceSt.setText(String.format("%.2f $", burgers.getChickenBurgerPrice()));
		        } else {
		        	result6= burgers.getChickenBurgerPrice()*2;
		        	ChickenBurgerPriceSt.setText(String.format("%.2f $", result6));
		        	
		        } 
		    }
			
		});
		
		JComboBox MaestroBurgerSize = new JComboBox(new Object[]{});
		MaestroBurgerSize.setModel(new DefaultComboBoxModel(new String[] {"Normal", "Double"}));
		MaestroBurgerSize.setFont(new Font("Century", Font.PLAIN, 13));
		MaestroBurgerSize.setBounds(236, 670, 83, 20);
		contentPane.add(MaestroBurgerSize);
		
		JLabel MaestroBurgerPriceSt = new JLabel(String.format("%.2f $",burgers.getMaestroBurgerPrice()));
		MaestroBurgerPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		MaestroBurgerPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		MaestroBurgerPriceSt.setBounds(255, 701, 51, 14);
		contentPane.add(MaestroBurgerPriceSt);
		
		MaestroBurgerSize.addActionListener(new ActionListener() {
            double result7 = 1; 
			@Override
			public void actionPerformed(ActionEvent e) {
				String selectedValueMaestroBurger = (String) MaestroBurgerSize.getSelectedItem();
		        
		        if ("Normal".equals(selectedValueMaestroBurger)) {
		        	MaestroBurgerPriceSt.setText(String.format("%.2f $", burgers.getMaestroBurgerPrice()));
		        } else {
		        	result7= burgers.getMaestroBurgerPrice()*2;
		        	MaestroBurgerPriceSt.setText(String.format("%.2f $", result7));
		        	
		        } 
		    }
			
		});
		
		JComboBox BigTastySize = new JComboBox(new Object[]{});
		BigTastySize.setModel(new DefaultComboBoxModel(new String[] {"Normal", "Double"}));
		BigTastySize.setFont(new Font("Century", Font.PLAIN, 13));
		BigTastySize.setBounds(417, 670, 83, 20);
		contentPane.add(BigTastySize);
		
		JLabel BigTastyPriceSt = new JLabel(String.format("%.2f $",burgers.getBigTastyPrice()));
		BigTastyPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		BigTastyPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		BigTastyPriceSt.setBounds(436, 701, 51, 14);
		contentPane.add(BigTastyPriceSt);
		
		BigTastySize.addActionListener(new ActionListener() {
            double result8 = 1; 
			@Override
			public void actionPerformed(ActionEvent e) {
				String selectedValueBigTasty = (String) BigTastySize.getSelectedItem();
		        
		        if ("Normal".equals(selectedValueBigTasty)) {
		        	BigTastyPriceSt.setText(String.format("%.2f $", burgers.getBigTastyPrice()));
		        } else {
		        	result8= burgers.getBigTastyPrice()*2;
		        	BigTastyPriceSt.setText(String.format("%.2f $", result8));
		        	
		        } 
		    }
			
		});
		
		
		
		
		JComboBox FiletOFishSize = new JComboBox(new Object[]{});
		FiletOFishSize.setModel(new DefaultComboBoxModel(new String[] {"Normal", "Double"}));
		FiletOFishSize.setFont(new Font("Century", Font.PLAIN, 13));
		FiletOFishSize.setBounds(779, 670, 83, 20);
		contentPane.add(FiletOFishSize);
		
		JLabel FiletOFishPriceSt = new JLabel(String.format("%.2f $",burgers.getFiletOfishPrice()));
		FiletOFishPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		FiletOFishPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		FiletOFishPriceSt.setBounds(802, 701, 46, 14);
		contentPane.add(FiletOFishPriceSt);
		
		FiletOFishSize.addActionListener(new ActionListener() {
            double result9 = 1; 
			@Override
			public void actionPerformed(ActionEvent e) {
				String selectedValueFiletOFish = (String) FiletOFishSize.getSelectedItem();
		        
		        if ("Normal".equals(selectedValueFiletOFish)) {
		        	FiletOFishPriceSt.setText(String.format("%.2f $", burgers.getFiletOfishPrice()));
		        } else {
		        	result9= burgers.getFiletOfishPrice()*2;
		        	FiletOFishPriceSt.setText(String.format("%.2f $", result9));
		        	
		        } 
		    }
			
		});
		
		
		JLabel CesarRollPriceSt = new JLabel(String.format("%.2f $",burgers.getCesarRollPrice()));
		CesarRollPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		CesarRollPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		CesarRollPriceSt.setBounds(617, 701, 46, 14);
		contentPane.add(CesarRollPriceSt);
		
		
		JButton ChickenBurgerAdd = new JButton("Add");
		ChickenBurgerAdd.setForeground(Color.WHITE);
		ChickenBurgerAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		ChickenBurgerAdd.setBackground(new Color(204, 0, 0));
		ChickenBurgerAdd.setBounds(47, 726, 97, 28);
		contentPane.add(ChickenBurgerAdd);
		
		JButton ChickenBurgerIncrease = new JButton("");
		ChickenBurgerIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
		ChickenBurgerIncrease.setForeground(Color.WHITE);
		ChickenBurgerIncrease.setBackground(Color.WHITE);
		ChickenBurgerIncrease.setBounds(148, 726, 28, 28);
		contentPane.add(ChickenBurgerIncrease);
		
		JButton ChickenBurgerReduce = new JButton("");
		ChickenBurgerReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
		ChickenBurgerReduce.setForeground(Color.WHITE);
		ChickenBurgerReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		ChickenBurgerReduce.setBackground(Color.WHITE);
		ChickenBurgerReduce.setBounds(14, 726, 28, 28);
		contentPane.add(ChickenBurgerReduce);
		
            final int amount6[] = {0};
		
            ChickenBurgerIncrease.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				amount6[0]++;
				ChickenBurgerAdd.setText("Add: " + amount6[0]);
				
			}
			
		});
		
            ChickenBurgerAdd.addActionListener(new ActionListener() {
	   		    @Override
	   		    public void actionPerformed(ActionEvent e) {
	   		        String selectedValueChickenBurger = (String) ChickenBurgerSize.getSelectedItem();
	   		        double FinalResultChickenBurger = 0;
	   		        
	   		        boolean itemAlreadyAdded = false;
	   		        

	   		       
	   		        for (int i = 0; i < textArea.getLineCount(); i++) {
	   		            try {
	   		                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
	   		                if (line.contains("Chickenburger") && line.contains(selectedValueChickenBurger)) {
	   		                    itemAlreadyAdded = true;
	   		                    break;
	   		                }
	   		            } catch (BadLocationException ex) {
	   		                ex.printStackTrace();
	   		            }
	   		        }
	   		        
	   		        
	   		        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
	   		            textArea.append("\n\n");
	   		        }
	   		        
	   		        if (!itemAlreadyAdded) {
	   		        if ("Normal".equals(selectedValueChickenBurger)) {
	   		            FinalResultChickenBurger = burgers.getChickenBurgerPrice() * amount6[0];
	   		            FinalResultChickenBurger = Math.round(FinalResultChickenBurger * 100.0) / 100.0;
	   		            String formattedPrice = String.format("%.2f", FinalResultChickenBurger);
	   		         textArea.append("      "+ "Chickenburger"+"                                   "                                          
			                    + selectedValueChickenBurger 
			                    + "                                                   "  + amount6[0] + "                                                  "
			                    + formattedPrice + " $\n");
	   		        } else if ("Double".equals(selectedValueChickenBurger)) {
	   		            FinalResultChickenBurger = 5.00 * amount6[0];
	   		            FinalResultChickenBurger = Math.round(FinalResultChickenBurger * 100.0) / 100.0;
	   		         String formattedPrice = String.format("%.2f", FinalResultChickenBurger);
	   		         textArea.append("      "+ "Chickenburger"+"                                   "                                          
			                    + selectedValueChickenBurger 
			                    + "                                                   "  + amount6[0] + "                                                  "
			                    + formattedPrice + " $\n");
	   		        } 
	   		        
	   		        
	   		        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultChickenBurger)
	                           .setScale(2, RoundingMode.HALF_UP);
	   		        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
	                   
	   		        }
	   		    }
	   		    
	   		});


            ChickenBurgerReduce.addActionListener(new ActionListener() {
	   		    @Override
	   		    public void actionPerformed(ActionEvent e) {
	   		    	
	   		    	String selectedValueChickenBurger = (String) ChickenBurgerSize.getSelectedItem();
	   		    	double FinalResultChickenBurger = 0;
	   		    	
	   		    	if (amount6[0] > 1) {
	   		            if ("Normal".equals(selectedValueChickenBurger)) {
	   		                FinalResultChickenBurger = burgers.getChickenBurgerPrice() * amount6[0];
	   		            } else if ("Double".equals(selectedValueChickenBurger)) {
	   		                FinalResultChickenBurger = 5.00 * amount6[0];
	   		            } 

	   		        }

	   		        if (amount6[0] > 1) {
	   		        	amount6[0]--;
	   		        	ChickenBurgerAdd.setText("Add: " + amount6[0]);
	   		        } else {
	   		        	ChickenBurgerAdd.setText("Add");
	   		        }
	   		    }
	   		});
		
		
		JButton MaestroBurgerAdd = new JButton("Add");
		MaestroBurgerAdd.setForeground(Color.WHITE);
		MaestroBurgerAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		MaestroBurgerAdd.setBackground(new Color(204, 0, 0));
		MaestroBurgerAdd.setBounds(228, 726, 97, 28);
		contentPane.add(MaestroBurgerAdd);
		
		JButton MaestroBurgerIncrease = new JButton("");
		MaestroBurgerIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
		MaestroBurgerIncrease.setForeground(Color.WHITE);
		MaestroBurgerIncrease.setBackground(Color.WHITE);
		MaestroBurgerIncrease.setBounds(329, 726, 28, 28);
		contentPane.add(MaestroBurgerIncrease);
		
		JButton MaestroBurgerReduce = new JButton("");
		MaestroBurgerReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
		MaestroBurgerReduce.setForeground(Color.WHITE);
		MaestroBurgerReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		MaestroBurgerReduce.setBackground(Color.WHITE);
		MaestroBurgerReduce.setBounds(195, 726, 28, 28);
		contentPane.add(MaestroBurgerReduce);
		
		
		final int amount7[] = {0};
		
		MaestroBurgerIncrease.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			amount7[0]++;
			MaestroBurgerAdd.setText("Add: " + amount7[0]);
			
		}
		
	});
	
		MaestroBurgerAdd.addActionListener(new ActionListener() {
   		    @Override
   		    public void actionPerformed(ActionEvent e) {
   		        String selectedValueMaestroBurger = (String) MaestroBurgerSize.getSelectedItem();
   		        double FinalResultMaestroBurger = 0;
   		        
   		        boolean itemAlreadyAdded = false;
   		        

   		       
   		        for (int i = 0; i < textArea.getLineCount(); i++) {
   		            try {
   		                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
   		                if (line.contains("Maestro Burger") && line.contains(selectedValueMaestroBurger)) {
   		                    itemAlreadyAdded = true;
   		                    break;
   		                }
   		            } catch (BadLocationException ex) {
   		                ex.printStackTrace();
   		            }
   		        }
   		        
   		        
   		        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
   		            textArea.append("\n\n");
   		        }
   		        
   		        if (!itemAlreadyAdded) {
   		        if ("Normal".equals(selectedValueMaestroBurger)) {
   		            FinalResultMaestroBurger = burgers.getMaestroBurgerPrice() * amount7[0];
   		            FinalResultMaestroBurger = Math.round(FinalResultMaestroBurger * 100.0) / 100.0;
   		         String formattedPrice = String.format("%.2f", FinalResultMaestroBurger);
   		         textArea.append("      "+ "Maestro Burger"+"                                  "                                          
		                    + selectedValueMaestroBurger 
		                    + "                                                   "  + amount7[0] + "                                                  "
		                    + formattedPrice + " $\n");
   		        } else if ("Double".equals(selectedValueMaestroBurger)) {
   		            FinalResultMaestroBurger = 11.00 * amount7[0];
   		            FinalResultMaestroBurger = Math.round(FinalResultMaestroBurger * 100.0) / 100.0;
   		         String formattedPrice = String.format("%.2f", FinalResultMaestroBurger);
   		         textArea.append("      "+ "Maestro Burger"+"                                  "                                          
		                    + selectedValueMaestroBurger 
		                    + "                                                   "  + amount7[0] + "                                                  "
		                    + formattedPrice + " $\n");
   		        } 
   		        
   		        
   		        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultMaestroBurger)
                           .setScale(2, RoundingMode.HALF_UP);
   		        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
                   
   		        }
   		    }
   		    
   		});


		MaestroBurgerReduce.addActionListener(new ActionListener() {
   		    @Override
   		    public void actionPerformed(ActionEvent e) {
   		    	
   		    	String selectedValueMaestroBurger = (String) MaestroBurgerSize.getSelectedItem();
   		    	double FinalResultMaestroBurger = 0;
   		    	
   		    	if (amount7[0] > 1) {
   		            if ("Normal".equals(selectedValueMaestroBurger)) {
   		                FinalResultMaestroBurger = burgers.getMaestroBurgerPrice() * amount7[0];
   		            } else if ("Double".equals(selectedValueMaestroBurger)) {
   		                FinalResultMaestroBurger = 11.00 * amount7[0];
   		            } 

   		        }

   		        if (amount7[0] > 1) {
   		        	amount7[0]--;
   		        	MaestroBurgerAdd.setText("Add: " + amount7[0]);
   		        } else {
   		        	MaestroBurgerAdd.setText("Add");
   		        }
   		    }
   		});
		
		
		
		JButton BigTastyAdd = new JButton("Add");
		BigTastyAdd.setForeground(Color.WHITE);
		BigTastyAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		BigTastyAdd.setBackground(new Color(204, 0, 0));
		BigTastyAdd.setBounds(409, 726, 97, 28);
		contentPane.add(BigTastyAdd);
		
		JButton BigTastyIncrease = new JButton("");
		BigTastyIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
		BigTastyIncrease.setForeground(Color.WHITE);
		BigTastyIncrease.setBackground(Color.WHITE);
		BigTastyIncrease.setBounds(510, 726, 28, 28);
		contentPane.add(BigTastyIncrease);
		
		JButton BigTastyReduce = new JButton("");
		BigTastyReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
		BigTastyReduce.setForeground(Color.WHITE);
		BigTastyReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		BigTastyReduce.setBackground(Color.WHITE);
		BigTastyReduce.setBounds(376, 726, 28, 28);
		contentPane.add(BigTastyReduce);
		
         final int amount8[] = {0};
		
         BigTastyIncrease.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			amount8[0]++;
			BigTastyAdd.setText("Add: " + amount8[0]);
			
		}
		
	});
	
         BigTastyAdd.addActionListener(new ActionListener() {
 		    @Override
 		    public void actionPerformed(ActionEvent e) {
 		        String selectedValueBigTasty = (String) BigTastySize.getSelectedItem();
 		        double FinalResultBigTasty = 0;
 		        
 		        boolean itemAlreadyAdded = false;
 		        

 		       
 		        for (int i = 0; i < textArea.getLineCount(); i++) {
 		            try {
 		                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
 		                if (line.contains("Big Tasty") && line.contains(selectedValueBigTasty)) {
 		                    itemAlreadyAdded = true;
 		                    break;
 		                }
 		            } catch (BadLocationException ex) {
 		                ex.printStackTrace();
 		            }
 		        }
 		        
 		        
 		        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
 		            textArea.append("\n\n");
 		        }
 		        
 		        if (!itemAlreadyAdded) {
 		        if ("Normal".equals(selectedValueBigTasty)) {
 		            FinalResultBigTasty = burgers.getBigTastyPrice() * amount8[0];
 		            FinalResultBigTasty = Math.round(FinalResultBigTasty * 100.0) / 100.0;
 		           String formattedPrice = String.format("%.2f", FinalResultBigTasty);
 		            textArea.append("      "+ "Big Tasty"+"                                             "                                          
 		                    + selectedValueBigTasty 
 		                    + "                                                   "  + amount8[0] + "                                                  "
 		                    + formattedPrice + " $\n");
 		        } else if ("Double".equals(selectedValueBigTasty)) {
 		            FinalResultBigTasty = 14.00 * amount8[0];
 		            FinalResultBigTasty = Math.round(FinalResultBigTasty * 100.0) / 100.0;
 		           String formattedPrice = String.format("%.2f", FinalResultBigTasty);
 		            textArea.append("      "+ "Big Tasty"+"                                             "                                          
 		                    + selectedValueBigTasty 
 		                    + "                                                    "  + amount8[0] + "                                                  "
 		                    + formattedPrice + " $\n");
 		        } 
 		        
 		        
 		        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultBigTasty)
                         .setScale(2, RoundingMode.HALF_UP);
 		        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
                 
 		        }
 		    }
 		    
 		});


         BigTastyReduce.addActionListener(new ActionListener() {
 		    @Override
 		    public void actionPerformed(ActionEvent e) {
 		    	
 		    	String selectedValueBigTasty = (String) McChickenSize.getSelectedItem();
 		    	double FinalResultBigTasty = 0;
 		    	
 		    	if (amount8[0] > 1) {
 		            if ("Normal".equals(selectedValueBigTasty)) {
 		                FinalResultBigTasty = burgers.getBigTastyPrice() * amount8[0];
 		            } else if ("Double".equals(selectedValueBigTasty)) {
 		                FinalResultBigTasty = 14.00 * amount8[0];
 		            } 

 		        }

 		        if (amount8[0] > 1) {
 		            amount8[0]--;
 		           BigTastyAdd.setText("Add: " + amount8[0]);
 		        } else {
 		        	BigTastyAdd.setText("Add");
 		        }
 		    }
 		});
		
		
		
		JButton CesarRollAdd = new JButton("Add");
		CesarRollAdd.setForeground(Color.WHITE);
		CesarRollAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		CesarRollAdd.setBackground(new Color(204, 0, 0));
		CesarRollAdd.setBounds(590, 726, 97, 28);
		contentPane.add(CesarRollAdd);
		
		JButton CesarRollIncrease = new JButton("");
		CesarRollIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
		CesarRollIncrease.setForeground(Color.WHITE);
		CesarRollIncrease.setBackground(Color.WHITE);
		CesarRollIncrease.setBounds(691, 726, 28, 28);
		contentPane.add(CesarRollIncrease);
		
		JButton CesarRollReduce = new JButton("");
		CesarRollReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
		CesarRollReduce.setForeground(Color.WHITE);
		CesarRollReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		CesarRollReduce.setBackground(Color.WHITE);
		CesarRollReduce.setBounds(557, 726, 28, 28);
		contentPane.add(CesarRollReduce);
		
		final int amount9[] = {0};
		
		CesarRollIncrease.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			amount9[0]++;
			CesarRollAdd.setText("Add: " + amount9[0]);
			
		}
		
	});
	
		CesarRollAdd.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		       
		    	double FinalResultCesarRoll = 0;
		        
		        boolean itemAlreadyAdded = false;
		        

		       
		        for (int i = 0; i < textArea.getLineCount(); i++) {
		            try {
		                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
		                if (line.contains("Cesar Roll")) {
		                    itemAlreadyAdded = true;
		                    break;
		                }
		            } catch (BadLocationException ex) {
		                ex.printStackTrace();
		            }
		        }
		        
		        if(!itemAlreadyAdded) {
		        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
		            textArea.append("\n\n");
		        }
		        
		       
		        
		            FinalResultCesarRoll = burgers.getCesarRollPrice() * amount9[0];
		            FinalResultCesarRoll = Math.round(FinalResultCesarRoll * 100.0) / 100.0;
		            String formattedPrice = String.format("%.2f", FinalResultCesarRoll);
		            textArea.append("      "+ "Cesar Roll"+"                                         "                                          
		                    + "                                                                 "  + amount9[0] 
		                    + "                                                   "
		                    + formattedPrice + " $\n");
		       
		        
		        
		        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultCesarRoll)
                        .setScale(2, RoundingMode.HALF_UP);
		        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
                
		        }
		    }
		    
		});


		CesarRollReduce.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	
		    	double FinalResultCesarRoll = 0;
		    	
		    	
		                FinalResultCesarRoll = burgers.getCesarRollPrice() * amount9[0];
		            

		        

		        if (amount9[0] > 1) {
		        	amount9[0]--;
		            CesarRollAdd.setText("Add: " + amount9[0]);
		        } else {
		        	CesarRollAdd.setText("Add");
		        }
		    }
		});
		
		
		
		JButton FiletOFishAdd = new JButton("Add");
		FiletOFishAdd.setForeground(Color.WHITE);
		FiletOFishAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		FiletOFishAdd.setBackground(new Color(204, 0, 0));
		FiletOFishAdd.setBounds(771, 726, 97, 28);
		contentPane.add(FiletOFishAdd);
		
		JButton FiletOFishIncrease = new JButton("");
		FiletOFishIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
		FiletOFishIncrease.setForeground(Color.WHITE);
		FiletOFishIncrease.setBackground(Color.WHITE);
		FiletOFishIncrease.setBounds(872, 726, 28, 28);
		contentPane.add(FiletOFishIncrease);
		
		JButton FiletOFishReduce = new JButton("");
		FiletOFishReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
		FiletOFishReduce.setForeground(Color.WHITE);
		FiletOFishReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		FiletOFishReduce.setBackground(Color.WHITE);
		FiletOFishReduce.setBounds(738, 726, 28, 28);
		contentPane.add(FiletOFishReduce);
		
          final int amount10[] = {0};
		
          FiletOFishIncrease.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			amount10[0]++;
			FiletOFishAdd.setText("Add: " + amount10[0]);
			
		}
		
	});
	
          FiletOFishAdd.addActionListener(new ActionListener() {
	   		    @Override
	   		    public void actionPerformed(ActionEvent e) {
	   		        String selectedValueFiletOFish = (String) FiletOFishSize.getSelectedItem();
	   		        double FinalResultFiletOFish = 0;
	   		        
	   		        boolean itemAlreadyAdded = false;
	   		        

	   		       
	   		        for (int i = 0; i < textArea.getLineCount(); i++) {
	   		            try {
	   		                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
	   		                if (line.contains("Filet-O-Fish") && line.contains(selectedValueFiletOFish)) {
	   		                    itemAlreadyAdded = true;
	   		                    break;
	   		                }
	   		            } catch (BadLocationException ex) {
	   		                ex.printStackTrace();
	   		            }
	   		        }
	   		        
	   		        
	   		        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
	   		            textArea.append("\n\n");
	   		        }
	   		        
	   		        if (!itemAlreadyAdded) {
	   		        if ("Normal".equals(selectedValueFiletOFish)) {
	   		            FinalResultFiletOFish = burgers.getFiletOfishPrice() * amount10[0];
	   		            FinalResultFiletOFish = Math.round(FinalResultFiletOFish * 100.0) / 100.0;
	   		         String formattedPrice = String.format("%.2f", FinalResultFiletOFish);
	   		         textArea.append("      "+ "Filet-O-Fish"+"                                        "                                          
			                    + selectedValueFiletOFish 
			                    + "                                                   "  + amount10[0] + "                                                   "
			                    + formattedPrice + " $\n");
	   		        } else if ("Double".equals(selectedValueFiletOFish)) {
	   		            FinalResultFiletOFish = 7.40 * amount10[0];
	   		            FinalResultFiletOFish = Math.round(FinalResultFiletOFish * 100.0) / 100.0;
	   		         String formattedPrice = String.format("%.2f", FinalResultFiletOFish);
	   		         textArea.append("      "+ "Filet-O-Fish"+"                                        "                                          
			                    + selectedValueFiletOFish 
			                    + "                                                   "  + amount10[0] + "                                                   "
			                    + formattedPrice + " $\n");
	   		        } 
	   		        
	   		        
	   		        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultFiletOFish)
	                           .setScale(2, RoundingMode.HALF_UP);
	   		        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
	                   
	   		        }
	   		    }
	   		    
	   		});


          FiletOFishReduce.addActionListener(new ActionListener() {
	   		    @Override
	   		    public void actionPerformed(ActionEvent e) {
	   		    	
	   		    	String selectedValueFiletOFish = (String) FiletOFishSize.getSelectedItem();
	   		    	double FinalResultFiletOFish = 0;
	   		    	
	   		    	if (amount10[0] > 1) {
	   		            if ("Normal".equals(selectedValueFiletOFish)) {
	   		                FinalResultFiletOFish = burgers.getFiletOfishPrice() * amount10[0];
	   		            } else if ("Double".equals(selectedValueFiletOFish)) {
	   		                FinalResultFiletOFish = 7.40 * amount10[0];
	   		            } 

	   		        }

	   		        if (amount10[0] > 1) {
	   		        	amount10[0]--;
	   		        	FiletOFishAdd.setText("Add: " + amount10[0]);
	   		        } else {
	   		        	FiletOFishAdd.setText("Add");
	   		        }
	   		    }
	   		});
		
          //Snacks
 		 String[] FrenchFriesSizes = {"Small", "Medium", "Large", "Extra"};
 		 String[] WedgesSizes = {"Medium", "Large", "Extra"};
 		 String[] McNuggetsSizes = {" 4 pieces", " 6 pieces", " 9 pieces", " 20 pieces"};
 		 String[] WingsSizes = {" 3 pieces", " 5 pieces", " 8 pieces"};
 		 String[] OnionRingsSizes = {" 5 pieces", " 10 pieces"};
 		 String[] ShrimpsSizes = {" 4 pieces", " 6 pieces"};
 		 
 		 //Beverages
 		 String[] FantaSizes = {"Small", "Medium", "Large", "Extra"};
 		 String[] CocaColaSizes = {"Small", "Medium", "Large", "Extra"};
 		 String[] SpriteSizes = {"Small", "Medium", "Large", "Extra"};
 		 String[] CocaColaZeroSizes = {"Small", "Medium", "Large", "Extra"};
 		 String[] OrangeJuiceSizes = {"Small", "Medium", "Large"};
 		 String[] CappySizes = {"Small", "Medium"};
 		 
 		 //Ice Creams and Milk Shakes
 		 String[] McSundaeTypes = {"Chocolate", "Caramel", "Strawberry", "Cherry"};
 		 String[] McFlurryTypes = {"Kit-Kat", "Cherry Kit-Kat", "Strawberry Kit-Kat", "Caramel Kit-Kat"};
 		 String[] ChocolateShakeSizes = {"Small", "Medium", "Large"};
 		 String[] VanillaShakeSizes = {"Small", "Medium", "Large"};
 		 String[] StrawberryShakeSizes = {"Small", "Medium", "Large"};
 		 String[] BananaShakeSizes = {"Small", "Medium", "Large"};
 		 
 		 //Hot Drinks
 		 String[] TeaSizes = {"0.3L", "0.4L"};
 		 String[] CoffeeSizes = {"Small", "Large"};
 		 String[] LatteSizes = {"Small", "Large"};
 		 String[] CappuccinoSizes = {"Small", "Large"};
 		 String[] HotChocolateSizes = {"Small", "Large"};
          
        //Snacks
 		 JComboBox<String> FrenchFriesSize = new JComboBox<>(FrenchFriesSizes);
 		 JComboBox<String> WedgesSize = new JComboBox<>(WedgesSizes);
 		 JComboBox<String> McNuggetsSize = new JComboBox<>(McNuggetsSizes);
 		 JComboBox<String> WingsSize = new JComboBox<>(WingsSizes);
 		 JComboBox<String> OnionRingsSize = new JComboBox<>(OnionRingsSizes);
 		 JComboBox<String> ShrimpsSize = new JComboBox<>(ShrimpsSizes);
 	 
 		 //Beverages
 		 JComboBox<String> FantaSize = new JComboBox<>(FantaSizes);
 		 JComboBox<String> CocaColaSize = new JComboBox<>(CocaColaSizes);
 		 JComboBox<String> SpriteSize = new JComboBox<>(SpriteSizes);
 		 JComboBox<String> CocaColaZeroSize = new JComboBox<>(CocaColaSizes);
 		 JComboBox<String> OrangeJuiceSize = new JComboBox<>(OrangeJuiceSizes);
 		 JComboBox<String> CappySize = new JComboBox<>(CappySizes);
 		 
 		 //Ice Creams and Milk Shakes
 		 JComboBox<String> McSundaeType = new JComboBox<>(McSundaeTypes);
 		 JComboBox<String> McFlurryType = new JComboBox<>(McFlurryTypes);
 		 JComboBox<String> ChocolateShakeSize = new JComboBox<>(ChocolateShakeSizes);
 		 JComboBox<String> VanillaShakeSize = new JComboBox<>(VanillaShakeSizes);
 		 JComboBox<String> StrawberryShakeSize = new JComboBox<>(StrawberryShakeSizes);
 		 JComboBox<String> BananaShakeSize = new JComboBox<>(BananaShakeSizes);
 		
 		 //Tea
 		 JComboBox<String> TeaSize = new JComboBox<>(TeaSizes);
 		 JComboBox<String> CoffeeSize = new JComboBox<>(CoffeeSizes);
 		 JComboBox<String> LatteSize = new JComboBox<>(LatteSizes);
 		 JComboBox<String> CappucinoSize = new JComboBox<>(CappuccinoSizes);
 		 JComboBox<String> HotChocolateSize = new JComboBox<>(HotChocolateSizes);
		
		//Add Increase Reduce
		//Snacks
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		JButton FrenchFriesAdd = new JButton("Add");
		FrenchFriesAdd.setForeground(new Color(255, 255, 255));
		FrenchFriesAdd.setBackground(new Color(204, 0, 0));
		FrenchFriesAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		FrenchFriesAdd.setBounds(47, 436, 97, 28);
		
		JButton FrenchFriesIncrease = new JButton("");
		FrenchFriesIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
		FrenchFriesIncrease.setForeground(new Color(255, 255, 255));
		FrenchFriesIncrease.setBackground(new Color(255, 255, 255));
		FrenchFriesIncrease.setBounds(148, 436, 28, 28);
		
		JButton FrenchFriesReduce = new JButton("");
		FrenchFriesReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
		FrenchFriesReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		FrenchFriesReduce.setForeground(new Color(255, 255, 255));
		FrenchFriesReduce.setBackground(new Color(255, 255, 255));
		FrenchFriesReduce.setBounds(14, 436, 28, 28);
		
		final int resultFrenchFries[] = {0};
		
		FrenchFriesIncrease.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				resultFrenchFries[0]++;
				FrenchFriesAdd.setText("Add: " + resultFrenchFries[0]);
			}
			
		});
		
		FrenchFriesAdd.addActionListener(new ActionListener() {
 		    @Override
 		    public void actionPerformed(ActionEvent e) {
 		        String selectedValueFrenchFries = (String) FrenchFriesSize.getSelectedItem();
 		        double FinalResultFrenchFries = 0;
 		        
 		        boolean itemAlreadyAdded = false;
 		        

 		       
 		        for (int i = 0; i < textArea.getLineCount(); i++) {
 		            try {
 		                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
 		                if (line.contains("French Fries") && line.contains(selectedValueFrenchFries)) {
 		                    itemAlreadyAdded = true;
 		                    break;
 		                }
 		            } catch (BadLocationException ex) {
 		                ex.printStackTrace();
 		            }
 		        }
 		        
 		        
 		        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
 		            textArea.append("\n\n");
 		        }
 		        
 		        if (!itemAlreadyAdded) {
 		        if ("Small".equals(selectedValueFrenchFries)) {
 		            FinalResultFrenchFries = snacks.getFrenchFriesPrice() * resultFrenchFries[0];
 		            FinalResultFrenchFries = Math.round(FinalResultFrenchFries * 100.0) / 100.0;
 		            String formattedPrice = String.format("%.2f", FinalResultFrenchFries);
 		            textArea.append("      "+ "French Fries"+"                                       "                                          
 		                    + selectedValueFrenchFries 
 		                    + "                                                       "  + resultFrenchFries[0] + "                                                 "
 		                    + formattedPrice + " $\n");
 		        } else if ("Medium".equals(selectedValueFrenchFries)) {
 		            FinalResultFrenchFries = 2.55 * resultFrenchFries[0];
 		            FinalResultFrenchFries = Math.round(FinalResultFrenchFries * 100.0) / 100.0;
 		            String formattedPrice = String.format("%.2f", FinalResultFrenchFries);
 		            textArea.append("      "+ "French Fries"+"                                       "                                          
 		                    + selectedValueFrenchFries 
 		                    + "                                                   "  + resultFrenchFries[0] + "                                                 "
 		                    + formattedPrice + " $\n");
 		        } else if ("Large".equals(selectedValueFrenchFries)) {
 		           FinalResultFrenchFries = 3.40 * resultFrenchFries[0];
 		           FinalResultFrenchFries = Math.round(FinalResultFrenchFries * 100.0) / 100.0;
 		           String formattedPrice = String.format("%.2f", FinalResultFrenchFries);
 		           textArea.append("      "+ "French Fries"+"                                       "                                          
 		                  + selectedValueFrenchFries 
 		                  + "                                                       "  + resultFrenchFries[0] + "                                                 "
 		                  + formattedPrice + " $\n");
 		        } else if ("Extra".equals(selectedValueFrenchFries)) {
 		            FinalResultFrenchFries = 4.25 * resultFrenchFries[0];
 		            FinalResultFrenchFries = Math.round(FinalResultFrenchFries * 100.0) / 100.0;
 		            String formattedPrice = String.format("%.2f", FinalResultFrenchFries);
 		            textArea.append("      "+ "French Fries"+"                                       "                                          
 		                    + selectedValueFrenchFries 
 		                    + "                                                         "  + resultFrenchFries[0] + "                                                 "
 		                    + formattedPrice + " $\n");
 		        } 
 		        
 		        
 		        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultFrenchFries)
                         .setScale(2, RoundingMode.HALF_UP);
 		        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
                 
 		        }
 		    }
 		    
 		});


		FrenchFriesReduce.addActionListener(new ActionListener() {
 		    @Override
 		    public void actionPerformed(ActionEvent e) {
 		    	
 		    	String selectedValueFrenchFries = (String) FrenchFriesSize.getSelectedItem();
 		    	double FinalResultFrenchFries = 0;
 		    	
 		    	if (resultFrenchFries[0] > 1) {
 		            if ("Small".equals(selectedValueFrenchFries)) {
 		                FinalResultFrenchFries = snacks.getFrenchFriesPrice() * resultFrenchFries[0];
 		            } else if ("Medium".equals(selectedValueFrenchFries)) {
 		                FinalResultFrenchFries = 2.55 * resultFrenchFries[0];
 		            } else if ("Large".equals(selectedValueFrenchFries)) {
 		                FinalResultFrenchFries = 3.40 * resultFrenchFries[0];
 		            } else if ("Extra".equals(selectedValueFrenchFries)) {
 		                FinalResultFrenchFries = 4.25 * resultFrenchFries[0];
 		            } 

 		        }

 		        if (resultFrenchFries[0] > 1) {
 		        	resultFrenchFries[0]--;
 		        	FrenchFriesAdd.setText("Add: " + resultFrenchFries[0]);
 		        } else {
 		        	FrenchFriesAdd.setText("Add");
 		        }
 		    }
 		});
		
		JButton WedgesAdd = new JButton("Add");
		WedgesAdd.setForeground(Color.WHITE);
		WedgesAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		WedgesAdd.setBackground(new Color(204, 0, 0));
		WedgesAdd.setBounds(228, 436, 97, 28);
		
		JButton WedgesIncrease = new JButton("");
		WedgesIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
		WedgesIncrease.setForeground(Color.WHITE);
		WedgesIncrease.setBackground(Color.WHITE);
		WedgesIncrease.setBounds(329, 436, 28, 28);
		
		JButton WedgesReduce = new JButton("");
		WedgesReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
		WedgesReduce.setForeground(Color.WHITE);
		WedgesReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		WedgesReduce.setBackground(Color.WHITE);
		WedgesReduce.setBounds(195, 436, 28, 28);
		
		final int resultWedges[] = {0};
		
		WedgesIncrease.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
                 resultWedges[0]++;
                 WedgesAdd.setText("Add: " +  resultWedges[0]);

			}
			
		});
		
		WedgesAdd.addActionListener(new ActionListener() {
 		    @Override
 		    public void actionPerformed(ActionEvent e) {
 		        String selectedValueWedges = (String) WedgesSize.getSelectedItem();
 		        double FinalResultWedges = 0;
 		        
 		        boolean itemAlreadyAdded = false;
 		        

 		       
 		        for (int i = 0; i < textArea.getLineCount(); i++) {
 		            try {
 		                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
 		                if (line.contains("Wedges") && line.contains(selectedValueWedges)) {
 		                    itemAlreadyAdded = true;
 		                    break;
 		                }
 		            } catch (BadLocationException ex) {
 		                ex.printStackTrace();
 		            }
 		        }
 		        
 		        
 		        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
 		            textArea.append("\n\n");
 		        }
 		        
 		        if (!itemAlreadyAdded) {
 		        if ("Medium".equals(selectedValueWedges)) {
 		            FinalResultWedges = snacks.getWedgesPrice() * resultWedges[0];
 		            FinalResultWedges = Math.round(FinalResultWedges * 100.0) / 100.0;
 		           String formattedPrice = String.format("%.2f", FinalResultWedges);
 		            textArea.append("      "+ "Wedges"+"                                               "                                          
 		                    + selectedValueWedges 
 		                    + "                                                   "  + resultWedges[0] + "                                                 "
 		                    + formattedPrice + " $\n");
 		        }  else if ("Large".equals(selectedValueWedges)) {
 		            FinalResultWedges = 3.75 * resultWedges[0];
 		            FinalResultWedges = Math.round(FinalResultWedges * 100.0) / 100.0;
 		           String formattedPrice = String.format("%.2f", FinalResultWedges);
 		            textArea.append("      "+ "Wedges"+"                                               "                                          
 		                    + selectedValueWedges 
 		                    + "                                                       "  + resultWedges[0] + "                                                 "
 		                    + formattedPrice + " $\n");
 		        } else if ("Extra".equals(selectedValueWedges)) {
 		            FinalResultWedges = 5.00 * resultWedges[0];
 		            FinalResultWedges = Math.round(FinalResultWedges * 100.0) / 100.0;
 		           String formattedPrice = String.format("%.2f", FinalResultWedges);
 		            textArea.append("      "+ "Wedges"+"                                               "                                          
 		                    + selectedValueWedges 
 		                    + "                                                         "  + resultWedges[0] + "                                                 "
 		                    + formattedPrice + " $\n");
 		        } 
 		        
 		        
 		        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultWedges)
                         .setScale(2, RoundingMode.HALF_UP);
 		        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
                 
 		        }
 		    }
 		    
 		});


		WedgesReduce.addActionListener(new ActionListener() {
 		    @Override
 		    public void actionPerformed(ActionEvent e) {
 		    	
 		    	String selectedValueWedges = (String) WedgesSize.getSelectedItem();
 		    	double FinalResultWedges = 0;
 		    	
 		    	if (resultWedges[0] > 1) {
 		            if ("Medium".equals(selectedValueWedges)) {
 		                FinalResultWedges = snacks.getWedgesPrice() * resultWedges[0];
 		            } else if ("Large".equals(selectedValueWedges)) {
 		                FinalResultWedges = 3.75 * resultWedges[0];
 		            } else if ("Extra".equals(selectedValueWedges)) {
 		                FinalResultWedges = 5.00 * resultWedges[0];
 		            } 

 		        }

 		        if (resultWedges[0] > 1) {
 		        	resultWedges[0]--;
 		        	WedgesAdd.setText("Add: " + resultWedges[0]);
 		        } else {
 		        	WedgesAdd.setText("Add");
 		        }
 		    }
 		});
		
		
		JButton McNuggetsAdd = new JButton("Add");
		McNuggetsAdd.setForeground(Color.WHITE);
		McNuggetsAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		McNuggetsAdd.setBackground(new Color(204, 0, 0));
		McNuggetsAdd.setBounds(409, 436, 97, 28);
		
		JButton McNuggetsIncrease = new JButton("");
		McNuggetsIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
		McNuggetsIncrease.setForeground(Color.WHITE);
		McNuggetsIncrease.setBackground(Color.WHITE);
		McNuggetsIncrease.setBounds(510, 436, 28, 28);
		
		JButton McNuggetsReduce = new JButton("");
		McNuggetsReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
		McNuggetsReduce.setForeground(Color.WHITE);
		McNuggetsReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		McNuggetsReduce.setBackground(Color.WHITE);
		McNuggetsReduce.setBounds(376, 436, 28, 28);
		
final int resultMcNuggets[] = {0};
		
		McNuggetsIncrease.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				resultMcNuggets[0]++;
				McNuggetsAdd.setText("Add: " +  resultMcNuggets[0]);

			}
			
		});
		
		McNuggetsAdd.addActionListener(new ActionListener() {
 		    @Override
 		    public void actionPerformed(ActionEvent e) {
 		        String selectedValueMcNuggets = (String) McNuggetsSize.getSelectedItem();
 		        double FinalResultMcNuggets = 0;
 		        
 		        boolean itemAlreadyAdded = false;
 		        

 		       
 		        for (int i = 0; i < textArea.getLineCount(); i++) {
 		            try {
 		                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
 		                if (line.contains("Chicken McNuggets") && line.contains(selectedValueMcNuggets)) {
 		                    itemAlreadyAdded = true;
 		                    break;
 		                }
 		            } catch (BadLocationException ex) {
 		                ex.printStackTrace();
 		            }
 		        }
 		        
 		        
 		        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
 		            textArea.append("\n\n");
 		        }
 		        
 		        if (!itemAlreadyAdded) {
 		        if (" 4 pieces".equals(selectedValueMcNuggets)) {
 		            FinalResultMcNuggets = snacks.getChickenMcNuggetsPrice() * resultMcNuggets[0];
 		            FinalResultMcNuggets = Math.round(FinalResultMcNuggets * 100.0) / 100.0;
 		           String formattedPrice = String.format("%.2f", FinalResultMcNuggets);
 		            textArea.append("      "+ "Chicken McNuggets"+"                         "                                          
 		                    + selectedValueMcNuggets 
 		                    + "                                                  "  + resultMcNuggets[0] + "                                                 "
 		                    + formattedPrice + " $\n");
 		        } else if (" 6 pieces".equals(selectedValueMcNuggets)) {
 		            FinalResultMcNuggets = 5.25 * resultMcNuggets[0];
 		            FinalResultMcNuggets = Math.round(FinalResultMcNuggets * 100.0) / 100.0;
 		           String formattedPrice = String.format("%.2f", FinalResultMcNuggets);
 		            textArea.append("      "+ "Chicken McNuggets"+"                         "                                          
 		                    + selectedValueMcNuggets 
 		                    + "                                                  "  + resultMcNuggets[0] + "                                                 "
 		                    + formattedPrice + " $\n");
 		        } else if (" 9 pieces".equals(selectedValueMcNuggets)) {
 		            FinalResultMcNuggets = 8.75 * resultMcNuggets[0];
 		            FinalResultMcNuggets = Math.round(FinalResultMcNuggets * 100.0) / 100.0;
 		           String formattedPrice = String.format("%.2f", FinalResultMcNuggets);
 		            textArea.append("      "+ "Chicken McNuggets"+"                         "                                          
 		                    + selectedValueMcNuggets 
 		                    + "                                                  "  + resultMcNuggets[0] + "                                                 "
 		                    + formattedPrice + " $\n");
 		        } else if (" 20 pieces".equals(selectedValueMcNuggets)) {
 		            FinalResultMcNuggets = 9.80 * resultMcNuggets[0];
 		            FinalResultMcNuggets = Math.round(FinalResultMcNuggets * 100.0) / 100.0;
 		           String formattedPrice = String.format("%.2f", FinalResultMcNuggets);
 		            textArea.append("      "+ "Chicken McNuggets"+"                         "                                          
 		                    + selectedValueMcNuggets 
 		                    + "                                                "  + resultMcNuggets[0] + "                                                 "
 		                    + formattedPrice + " $\n");
 		        } 
 		        
 		        
 		        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultMcNuggets)
                         .setScale(2, RoundingMode.HALF_UP);
 		        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
                 
 		        }
 		    }
 		    
 		});


		McNuggetsReduce.addActionListener(new ActionListener() {
 		    @Override
 		    public void actionPerformed(ActionEvent e) {
 		    	
 		    	String selectedValueMcNuggets = (String) McNuggetsSize.getSelectedItem();
 		    	double FinalResultMcNuggets = 0;
 		    	
 		    	if (resultMcNuggets[0] > 1) {
 		            if ("4 pieces".equals(selectedValueMcNuggets)) {
 		                FinalResultMcNuggets = snacks.getChickenMcNuggetsPrice() * resultMcNuggets[0];
 		            } else if ("6 pieces".equals(selectedValueMcNuggets)) {
 		                FinalResultMcNuggets = 5.25 * resultMcNuggets[0];
 		            } else if ("9 pieces".equals(selectedValueMcNuggets)) {
 		                FinalResultMcNuggets = 8.75 * resultMcNuggets[0];
 		            } else if ("20 pieces".equals(selectedValueMcNuggets)) {
 		                FinalResultMcNuggets = 9.80 * resultMcNuggets[0];
 		            } 

 		        }

 		        if (resultMcNuggets[0] > 1) {
 		        	resultMcNuggets[0]--;
 		        	McNuggetsAdd.setText("Add: " + resultMcNuggets[0]);
 		        } else {
 		        	McNuggetsAdd.setText("Add");
 		        }
 		    }
 		});
		
		JButton WingsAdd = new JButton("Add");
		WingsAdd.setForeground(Color.WHITE);
		WingsAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		WingsAdd.setBackground(new Color(204, 0, 0));
		WingsAdd.setBounds(590, 436, 97, 28);
		
		JButton WingsIncrease = new JButton("");
		WingsIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
		WingsIncrease.setForeground(Color.WHITE);
		WingsIncrease.setBackground(Color.WHITE);
		WingsIncrease.setBounds(691, 436, 28, 28);
		
		JButton WingsReduce = new JButton("");
		WingsReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
		WingsReduce.setForeground(Color.WHITE);
		WingsReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		WingsReduce.setBackground(Color.WHITE);
		WingsReduce.setBounds(557, 436, 28, 28);
		
final int resultWings[] = {0};
		
        WingsIncrease.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				resultWings[0]++;
				WingsAdd.setText("Add: " +  resultWings[0]);

			}
			
		});
		
        WingsAdd.addActionListener(new ActionListener() {
 		    @Override
 		    public void actionPerformed(ActionEvent e) {
 		        String selectedValueWings = (String) WingsSize.getSelectedItem();
 		        double FinalResultWings = 0;
 		        
 		        boolean itemAlreadyAdded = false;
 		        

 		       
 		        for (int i = 0; i < textArea.getLineCount(); i++) {
 		            try {
 		                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
 		                if (line.contains("Wings") && line.contains(selectedValueWings)) {
 		                    itemAlreadyAdded = true;
 		                    break;
 		                }
 		            } catch (BadLocationException ex) {
 		                ex.printStackTrace();
 		            }
 		        }
 		        
 		        
 		        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
 		            textArea.append("\n\n");
 		        }
 		        
 		        if (!itemAlreadyAdded) {
 		        if (" 3 pieces".equals(selectedValueWings)) {
 		            FinalResultWings = snacks.getChickenWingsPrice() * resultWings[0];
 		            FinalResultWings = Math.round(FinalResultWings * 100.0) / 100.0;
 		           String formattedPrice = String.format("%.2f", FinalResultWings);
 		            textArea.append("      "+ "Wings"+"                                                  "                                          
 		                    + selectedValueWings 
 		                    + "                                                  "  + resultWings[0] + "                                                 "
 		                    + formattedPrice + " $\n");
 		        } else if (" 5 pieces".equals(selectedValueWings)) {
 		            FinalResultWings = 3.60 * resultWings[0];
 		            FinalResultWings = Math.round(FinalResultWings * 100.0) / 100.0;
 		           String formattedPrice = String.format("%.2f", FinalResultWings);
 		            textArea.append("      "+ "Wings"+"                                                  "                                          
 		                    + selectedValueWings 
 		                    + "                                                  "  + resultWings[0] + "                                                 "
 		                    + formattedPrice + " $\n");
 		        } else if (" 8 pieces".equals(selectedValueWings)) {
 		            FinalResultWings = 4.80 * resultWings[0];
 		            FinalResultWings = Math.round(FinalResultWings * 100.0) / 100.0;
 		           String formattedPrice = String.format("%.2f", FinalResultWings);
 		            textArea.append("      "+ "Wings"+"                                                  "                                          
 		                    + selectedValueWings 
 		                    + "                                                  "  + resultWings[0] + "                                                 "
 		                    + formattedPrice + " $\n");
 		        } 
 		        
 		        
 		        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultWings)
                         .setScale(2, RoundingMode.HALF_UP);
 		        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
                 
 		        }
 		    }
 		    
 		});


        WingsReduce.addActionListener(new ActionListener() {
 		    @Override
 		    public void actionPerformed(ActionEvent e) {
 		    	
 		    	String selectedValueWings = (String) WingsSize.getSelectedItem();
 		    	double FinalResultWings = 0;
 		    	
 		    	if (resultWings[0] > 1) {
 		            if ("3 pieces".equals(selectedValueWings)) {
 		                FinalResultWings = snacks.getChickenWingsPrice() * resultWings[0];
 		            } else if ("5 pieces".equals(selectedValueWings)) {
 		                FinalResultWings = 3.60 * resultWings[0];
 		            } else if ("8 pieces".equals(selectedValueWings)) {
 		                FinalResultWings = 4.80 * resultWings[0];
 		            } 

 		        }

 		        if (resultWings[0] > 1) {
 		        	resultWings[0]--;
 		        	WingsAdd.setText("Add: " + resultWings[0]);
 		        } else {
 		        	WingsAdd.setText("Add");
 		        }
 		    }
 		});
		
		JButton OnionRingsAdd = new JButton("Add");
		OnionRingsAdd.setForeground(Color.WHITE);
		OnionRingsAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		OnionRingsAdd.setBackground(new Color(204, 0, 0));
		OnionRingsAdd.setBounds(771, 436, 97, 28);
		
		JButton OnionRingsIncrease = new JButton("");
		OnionRingsIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
		OnionRingsIncrease.setForeground(Color.WHITE);
		OnionRingsIncrease.setBackground(Color.WHITE);
		OnionRingsIncrease.setBounds(872, 436, 28, 28);
		
		JButton OnionRingsReduce = new JButton("");
		OnionRingsReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
		OnionRingsReduce.setForeground(Color.WHITE);
		OnionRingsReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		OnionRingsReduce.setBackground(Color.WHITE);
		OnionRingsReduce.setBounds(738, 436, 28, 28);
		
final int resultOnionRings[] = {0};
		
           OnionRingsIncrease.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				resultOnionRings[0]++;
				OnionRingsAdd.setText("Add: " +  resultOnionRings[0]);

			}
			
		});
		
           OnionRingsAdd.addActionListener(new ActionListener() {
    		    @Override
    		    public void actionPerformed(ActionEvent e) {
    		        String selectedValueOnionRings = (String) OnionRingsSize.getSelectedItem();
    		        double FinalResultOnionRings = 0;
    		        
    		        boolean itemAlreadyAdded = false;
    		        

    		       
    		        for (int i = 0; i < textArea.getLineCount(); i++) {
    		            try {
    		                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
    		                if (line.contains("Onion Rings") && line.contains(selectedValueOnionRings)) {
    		                    itemAlreadyAdded = true;
    		                    break;
    		                }
    		            } catch (BadLocationException ex) {
    		                ex.printStackTrace();
    		            }
    		        }
    		        
    		        
    		        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
    		            textArea.append("\n\n");
    		        }
    		        
    		        if (!itemAlreadyAdded) {
    		        if (" 5 pieces".equals(selectedValueOnionRings)) {
    		            FinalResultOnionRings = snacks.getOnionRingsPrice() * resultOnionRings[0];
    		            FinalResultOnionRings = Math.round(FinalResultOnionRings * 100.0) / 100.0;
    		            String formattedPrice = String.format("%.2f", FinalResultOnionRings);
    		            textArea.append("      "+ "Onion Rings"+"                                       "                                          
    		                    + selectedValueOnionRings 
    		                    + "                                                  "  + resultOnionRings[0] + "                                                 "
    		                    + formattedPrice + " $\n");
    		        } else if (" 10 pieces".equals(selectedValueOnionRings)) {
    		            FinalResultOnionRings = 2.70 * resultOnionRings[0];
    		            FinalResultOnionRings = Math.round(FinalResultOnionRings * 100.0) / 100.0;
    		            String formattedPrice = String.format("%.2f", FinalResultOnionRings);
    		            textArea.append("      "+ "Onion Rings"+"                                      "                                          
    		                    + selectedValueOnionRings 
    		                    + "                                                 "  + resultOnionRings[0] + "                                                 "
    		                    + formattedPrice + " $\n");
    		        }
    		        
    		        
    		        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultOnionRings)
                            .setScale(2, RoundingMode.HALF_UP);
    		        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
                    
    		        }
    		    }
    		    
    		});


           OnionRingsReduce.addActionListener(new ActionListener() {
    		    @Override
    		    public void actionPerformed(ActionEvent e) {
    		    	
    		    	String selectedValueOnionRings = (String) OnionRingsSize.getSelectedItem();
    		    	double FinalResultOnionRings = 0;
    		    	
    		    	if (resultOnionRings[0] > 1) {
    		            if ("5 pieces".equals(selectedValueOnionRings)) {
    		                FinalResultOnionRings = snacks.getOnionRingsPrice() * resultOnionRings[0];
    		            } else if ("10 pieces".equals(selectedValueOnionRings)) {
    		                FinalResultOnionRings = 2.70 * resultOnionRings[0];
    		            }  

    		        }

    		        if (resultOnionRings[0] > 1) {
    		        	resultOnionRings[0]--;
    		        	OnionRingsAdd.setText("Add: " + resultOnionRings[0]);
    		        } else {
    		        	OnionRingsAdd.setText("Add");
    		        }
    		    }
    		});
		
		JButton ShrimpsAdd = new JButton("Add");
		ShrimpsAdd.setForeground(Color.WHITE);
		ShrimpsAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		ShrimpsAdd.setBackground(new Color(204, 0, 0));
		ShrimpsAdd.setBounds(47, 726, 97, 28);
		
		JButton ShrimpsIncrease = new JButton("");
		ShrimpsIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
		ShrimpsIncrease.setForeground(Color.WHITE);
		ShrimpsIncrease.setBackground(Color.WHITE);
		ShrimpsIncrease.setBounds(148, 726, 28, 28);
		
		JButton ShrimpsReduce = new JButton("");
		ShrimpsReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
		ShrimpsReduce.setForeground(Color.WHITE);
		ShrimpsReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		ShrimpsReduce.setBackground(Color.WHITE);
		ShrimpsReduce.setBounds(14, 726, 28, 28);
		
final int resultShrimps[] = {0};
		
		ShrimpsIncrease.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				resultShrimps[0]++;
				ShrimpsAdd.setText("Add: " +  resultShrimps[0]);

			}
			
		});
		
		ShrimpsAdd.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        String selectedValueShrimps = (String) ShrimpsSize.getSelectedItem();
		        double FinalResultShrimps = 0;
		        
		        boolean itemAlreadyAdded = false;
		        

		       
		        for (int i = 0; i < textArea.getLineCount(); i++) {
		            try {
		                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
		                if (line.contains("Shrimps") && line.contains(selectedValueShrimps)) {
		                    itemAlreadyAdded = true;
		                    break;
		                }
		            } catch (BadLocationException ex) {
		                ex.printStackTrace();
		            }
		        }
		        
		        
		        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
		            textArea.append("\n\n");
		        }
		        
		        if (!itemAlreadyAdded) {
		        if (" 4 pieces".equals(selectedValueShrimps)) {
		            FinalResultShrimps = snacks.getShrimpsPrice() * resultShrimps[0];
		            FinalResultShrimps = Math.round(FinalResultShrimps * 100.0) / 100.0;
		            String formattedPrice = String.format("%.2f", FinalResultShrimps);
		            textArea.append("      "+ "Shrimps"+"                                              "                                          
		                    + selectedValueShrimps 
		                    + "                                                  "  + resultShrimps[0] + "                                                  "
		                    + formattedPrice + " $\n");
		        } else if (" 6 pieces".equals(selectedValueShrimps)) {
		            FinalResultShrimps = 6.00 * resultShrimps[0];
		            FinalResultShrimps = Math.round(FinalResultShrimps * 100.0) / 100.0;
		            String formattedPrice = String.format("%.2f", FinalResultShrimps);
		            textArea.append("      "+ "Shrimps"+"                                              "                                          
		                    + selectedValueShrimps 
		                    + "                                                  "  + resultShrimps[0] + "                                                  "
		                    + formattedPrice + " $\n");
		        }
		        
		        
		        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultShrimps)
                        .setScale(2, RoundingMode.HALF_UP);
		        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
                
		        }
		    }
		    
		});


		ShrimpsReduce.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	
		    	String selectedValueShrimps = (String) ShrimpsSize.getSelectedItem();
		    	double FinalResultShrimps = 0;
		    	
		    	if (resultShrimps[0] > 1) {
		            if ("4 pieces".equals(selectedValueShrimps)) {
		                FinalResultShrimps = snacks.getShrimpsPrice() * resultShrimps[0];
		            } else if ("6 pieces".equals(selectedValueShrimps)) {
		                FinalResultShrimps = 6.00 * resultShrimps[0];
		            }  

		        }

		        if (resultShrimps[0] > 1) {
		        	resultShrimps[0]--;
		        	ShrimpsAdd.setText("Add: " + resultShrimps[0]);
		        } else {
		        	ShrimpsAdd.setText("Add");
		        }
		    }
		});
		
		JButton ChickenBoxAdd = new JButton("Add");
		ChickenBoxAdd.setForeground(Color.WHITE);
		ChickenBoxAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		ChickenBoxAdd.setBackground(new Color(204, 0, 0));
		ChickenBoxAdd.setBounds(228, 726, 97, 28);
		
		JButton ChickenBoxIncrease = new JButton("");
		ChickenBoxIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
		ChickenBoxIncrease.setForeground(Color.WHITE);
		ChickenBoxIncrease.setBackground(Color.WHITE);
		ChickenBoxIncrease.setBounds(329, 726, 28, 28);
		
		JButton ChickenBoxReduce = new JButton("");
		ChickenBoxReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
		ChickenBoxReduce.setForeground(Color.WHITE);
		ChickenBoxReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		ChickenBoxReduce.setBackground(Color.WHITE);
		ChickenBoxReduce.setBounds(195, 726, 28, 28);
		
final int resultChickenBox[] = {0};
		
ChickenBoxIncrease.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				resultChickenBox[0]++;
				ChickenBoxAdd.setText("Add: " +  resultChickenBox[0]);

			}
			
		});
		
ChickenBoxAdd.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
       
    	double FinalResultChickenBox = 0;
        
        boolean itemAlreadyAdded = false;
        

       
        for (int i = 0; i < textArea.getLineCount(); i++) {
            try {
                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
                if (line.contains("Chicken Box")) {
                    itemAlreadyAdded = true;
                    break;
                }
            } catch (BadLocationException ex) {
                ex.printStackTrace();
            }
        }
        
        if(!itemAlreadyAdded) {
        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
            textArea.append("\n\n");
        }
        
       
        
            FinalResultChickenBox = snacks.getChickenBoxPrice() * resultChickenBox[0];
            FinalResultChickenBox = Math.round(FinalResultChickenBox * 100.0) / 100.0;
            String formattedPrice = String.format("%.2f", FinalResultChickenBox);
            textArea.append("      "+ "Chicken Box"+"                                        "                                          
                    + "                                                                  "  + resultChickenBox[0] 
                    + "                                                  "
                    + formattedPrice + " $\n");
       
        
        
        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultChickenBox)
                .setScale(2, RoundingMode.HALF_UP);
        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
        
        }
    }
    
});


ChickenBoxReduce.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
    	
    	double FinalResultChickenBox = 0;
    	
                FinalResultChickenBox = snacks.getChickenBoxPrice() * resultChickenBox[0];
         
        if (resultChickenBox[0] > 1) {
        	resultChickenBox[0]--;
        	ChickenBoxAdd.setText("Add: " + resultChickenBox[0]);
        } else {
        	ChickenBoxAdd.setText("Add");
        }
    }
});
		
		//Beverages
	//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		JButton FantaAdd = new JButton("Add");
		FantaAdd.setForeground(new Color(255, 255, 255));
		FantaAdd.setBackground(new Color(204, 0, 0));
		FantaAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		FantaAdd.setBounds(47, 436, 97, 28);
		
		JButton FantaIncrease = new JButton("");
		FantaIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
		FantaIncrease.setForeground(new Color(255, 255, 255));
		FantaIncrease.setBackground(new Color(255, 255, 255));
		FantaIncrease.setBounds(148, 436, 28, 28);
		
		JButton FantaReduce = new JButton("");
		FantaReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
		FantaReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		FantaReduce.setForeground(new Color(255, 255, 255));
		FantaReduce.setBackground(new Color(255, 255, 255));
		FantaReduce.setBounds(14, 436, 28, 28);
		
final int resultFanta[] = {0};
		
		FantaIncrease.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						resultFanta[0]++;
						FantaAdd.setText("Add: " +  resultFanta[0]);

					}
					
				});
				
		FantaAdd.addActionListener(new ActionListener() {
 		    @Override
 		    public void actionPerformed(ActionEvent e) {
 		        String selectedValueFanta = (String) FantaSize.getSelectedItem();
 		        double FinalResultFanta = 0;
 		        
 		        boolean itemAlreadyAdded = false;
 		        

 		       
 		        for (int i = 0; i < textArea.getLineCount(); i++) {
 		            try {
 		                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
 		                if (line.contains("Fanta") && line.contains(selectedValueFanta)) {
 		                    itemAlreadyAdded = true;
 		                    break;
 		                }
 		            } catch (BadLocationException ex) {
 		                ex.printStackTrace();
 		            }
 		        }
 		        
 		        
 		        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
 		            textArea.append("\n\n");
 		        }
 		        
 		        if (!itemAlreadyAdded) {
 		        if ("Small".equals(selectedValueFanta)) {
 		            FinalResultFanta = beverages.getFantaPrice() * resultFanta[0];
 		            FinalResultFanta = Math.round(FinalResultFanta * 100.0) / 100.0;
 		            String formattedPrice = String.format("%.2f", FinalResultFanta);
 		            textArea.append("      "+ "Fanta"+"                                                    "                                          
 		                    + selectedValueFanta 
 		                    + "                                                       "  + resultFanta[0] + "                                                 "
 		                    + formattedPrice + " $\n");
 		        } else if ("Medium".equals(selectedValueFanta)) {
 		            FinalResultFanta = 2.25 * resultFanta[0];
 		            FinalResultFanta = Math.round(FinalResultFanta * 100.0) / 100.0;
 		            String formattedPrice = String.format("%.2f", FinalResultFanta);
 		            textArea.append("      "+ "Fanta"+"                                                    "                                          
 		                    + selectedValueFanta 
 		                    + "                                                   "  + resultFanta[0] + "                                                 "
 		                    + formattedPrice + " $\n");
 		        } else if ("Large".equals(selectedValueFanta)) {
 		           FinalResultFanta = 3.00 * resultFanta[0];
 		           FinalResultFanta = Math.round(FinalResultFanta * 100.0) / 100.0;
 		           String formattedPrice = String.format("%.2f", FinalResultFanta);
 		           textArea.append("      "+ "Fanta"+"                                                    "                                          
 		                  + selectedValueFanta 
 		                  + "                                                       "  + resultFanta[0] + "                                                 "
 		                  + formattedPrice + " $\n");
 		        } else if ("Extra".equals(selectedValueFanta)) {
 		            FinalResultFanta = 3.75 * resultFanta[0];
 		            FinalResultFanta = Math.round(FinalResultFanta * 100.0) / 100.0;
 		            String formattedPrice = String.format("%.2f", FinalResultFanta);
 		            textArea.append("      "+ "Fanta"+"                                                    "                                          
 		                    + selectedValueFanta 
 		                    + "                                                         "  + resultFanta[0] + "                                                 "
 		                    + formattedPrice + " $\n");
 		        } 
 		        
 		        
 		        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultFanta)
                         .setScale(2, RoundingMode.HALF_UP);
 		        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
                 
 		        }
 		    }
 		    
 		});


		FantaReduce.addActionListener(new ActionListener() {
 		    @Override
 		    public void actionPerformed(ActionEvent e) {
 		    	
 		    	String selectedValueFanta = (String) FantaSize.getSelectedItem();
 		    	double FinalResultFanta = 0;
 		    	
 		    	if (resultFanta[0] > 1) {
 		    		if ("Small".equals(selectedValueFanta)) {
 		                FinalResultFanta = beverages.getFantaPrice() * resultFanta[0];
 		            } else if ("Medium".equals(selectedValueFanta)) {
 		                FinalResultFanta = 2.25 * resultFanta[0];
 		            } else if ("Large".equals(selectedValueFanta)) {
 		                FinalResultFanta = 3.00 * resultFanta[0];
 		            } else if ("Extra".equals(selectedValueFanta)) {
 		                FinalResultFanta = 3.75 * resultFanta[0];
 		            } 

 		        }

 		        if (resultFanta[0] > 1) {
 		        	resultFanta[0]--;
 		        	FantaAdd.setText("Add: " + resultFanta[0]);
 		        } else {
 		        	FantaAdd.setText("Add");
 		        }
 		    }
 		});
		
		JButton CocaColaAdd = new JButton("Add");
		CocaColaAdd.setForeground(Color.WHITE);
		CocaColaAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		CocaColaAdd.setBackground(new Color(204, 0, 0));
		CocaColaAdd.setBounds(228, 436, 97, 28);
		
		JButton CocaColaIncrease = new JButton("");
		CocaColaIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
		CocaColaIncrease.setForeground(Color.WHITE);
		CocaColaIncrease.setBackground(Color.WHITE);
		CocaColaIncrease.setBounds(329, 436, 28, 28);
		
		JButton CocaColaReduce = new JButton("");
		CocaColaReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
		CocaColaReduce.setForeground(Color.WHITE);
		CocaColaReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		CocaColaReduce.setBackground(Color.WHITE);
		CocaColaReduce.setBounds(195, 436, 28, 28);
		
final int resultCocaCola[] = {0};
		
        CocaColaIncrease.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						resultCocaCola[0]++;
						CocaColaAdd.setText("Add: " +  resultCocaCola[0]);

					}
					
				});
				
        CocaColaAdd.addActionListener(new ActionListener() {
 		    @Override
 		    public void actionPerformed(ActionEvent e) {
 		        String selectedValueCocaCola = (String) CocaColaSize.getSelectedItem();
 		        double FinalResultCocaCola = 0;
 		        
 		        boolean itemAlreadyAdded = false;
 		        

 		       
 		        for (int i = 0; i < textArea.getLineCount(); i++) {
 		            try {
 		                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
 		                if (line.contains("CocaCola") && line.contains(selectedValueCocaCola)) {
 		                    itemAlreadyAdded = true;
 		                    break;
 		                }
 		            } catch (BadLocationException ex) {
 		                ex.printStackTrace();
 		            }
 		        }
 		        
 		        
 		        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
 		            textArea.append("\n\n");
 		        }
 		        
 		        if (!itemAlreadyAdded) {
 		        if ("Small".equals(selectedValueCocaCola)) {
 		            FinalResultCocaCola = beverages.getCocaColaPrice() * resultCocaCola[0];
 		            FinalResultCocaCola = Math.round(FinalResultCocaCola * 100.0) / 100.0;
 		            String formattedPrice = String.format("%.2f", FinalResultCocaCola);
 		            textArea.append("      "+ "CocaCola"+"                                            "                                          
 		                    + selectedValueCocaCola 
 		                    + "                                                       "  + resultCocaCola[0] + "                                                 "
 		                    + formattedPrice + " $\n");
 		        } else if ("Medium".equals(selectedValueCocaCola)) {
 		            FinalResultCocaCola = 2.25 * resultCocaCola[0];
 		            FinalResultCocaCola = Math.round(FinalResultCocaCola * 100.0) / 100.0;
 		            String formattedPrice = String.format("%.2f", FinalResultCocaCola);
 		            textArea.append("      "+ "CocaCola"+"                                            "                                          
 		                    + selectedValueCocaCola 
 		                    + "                                                   "  + resultCocaCola[0] + "                                                 "
 		                    + formattedPrice + " $\n");
 		        } else if ("Large".equals(selectedValueCocaCola)) {
 		           FinalResultCocaCola = 3.00 * resultCocaCola[0];
 		           FinalResultCocaCola = Math.round(FinalResultCocaCola * 100.0) / 100.0;
 		           String formattedPrice = String.format("%.2f", FinalResultCocaCola);
 		           textArea.append("      "+ "CocaCola"+"                                            "                                          
 		                  + selectedValueCocaCola 
 		                  + "                                                       "  + resultCocaCola[0] + "                                                 "
 		                  + formattedPrice + " $\n");
 		        } else if ("Extra".equals(selectedValueCocaCola)) {
 		            FinalResultCocaCola = 3.75 * resultCocaCola[0];
 		            FinalResultCocaCola = Math.round(FinalResultCocaCola * 100.0) / 100.0;
 		            String formattedPrice = String.format("%.2f", FinalResultCocaCola);
 		            textArea.append("      "+ "CocaCola"+"                                            "                                          
 		                    + selectedValueCocaCola 
 		                    + "                                                         "  + resultCocaCola[0] + "                                                 "
 		                    + formattedPrice + " $\n");
 		        } 
 		        
 		        
 		        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultCocaCola)
                         .setScale(2, RoundingMode.HALF_UP);
 		        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
                 
 		        }
 		    }
 		    
 		});


        CocaColaReduce.addActionListener(new ActionListener() {
 		    @Override
 		    public void actionPerformed(ActionEvent e) {
 		    	
 		    	String selectedValueCocaCola = (String) CocaColaSize.getSelectedItem();
 		    	double FinalResultCocaCola = 0;
 		    	
 		    	if (resultCocaCola[0] > 1) {
 		    		if ("Small".equals(selectedValueCocaCola)) {
 		                FinalResultCocaCola = beverages.getCocaColaPrice() * resultCocaCola[0];
 		            } else if ("Medium".equals(selectedValueCocaCola)) {
 		                FinalResultCocaCola = 2.25 * resultCocaCola[0];
 		            } else if ("Large".equals(selectedValueCocaCola)) {
 		                FinalResultCocaCola = 3.00 * resultCocaCola[0];
 		            } else if ("Extra".equals(selectedValueCocaCola)) {
 		                FinalResultCocaCola = 3.75 * resultCocaCola[0];
 		            } 

 		        }

 		        if (resultCocaCola[0] > 1) {
 		        	resultCocaCola[0]--;
 		        	CocaColaAdd.setText("Add: " + resultCocaCola[0]);
 		        } else {
 		        	CocaColaAdd.setText("Add");
 		        }
 		    }
 		});
		
		JButton SpriteAdd = new JButton("Add");
		SpriteAdd.setForeground(Color.WHITE);
		SpriteAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		SpriteAdd.setBackground(new Color(204, 0, 0));
		SpriteAdd.setBounds(409, 436, 97, 28);
		
		JButton SpriteIncrease = new JButton("");
		SpriteIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
		SpriteIncrease.setForeground(Color.WHITE);
		SpriteIncrease.setBackground(Color.WHITE);
		SpriteIncrease.setBounds(510, 436, 28, 28);
		
		JButton SpriteReduce = new JButton("");
		SpriteReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
		SpriteReduce.setForeground(Color.WHITE);
		SpriteReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		SpriteReduce.setBackground(Color.WHITE);
		SpriteReduce.setBounds(376, 436, 28, 28);
		
final int resultSprite[] = {0};
		
         SpriteIncrease.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						resultSprite[0]++;
						SpriteAdd.setText("Add: " +  resultSprite[0]);

					}
					
				});
				
         SpriteAdd.addActionListener(new ActionListener() {
  		    @Override
  		    public void actionPerformed(ActionEvent e) {
  		        String selectedValueSprite = (String) SpriteSize.getSelectedItem();
  		        double FinalResultSprite = 0;
  		        
  		        boolean itemAlreadyAdded = false;
  		        

  		       
  		        for (int i = 0; i < textArea.getLineCount(); i++) {
  		            try {
  		                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
  		                if (line.contains("Sprite") && line.contains(selectedValueSprite)) {
  		                    itemAlreadyAdded = true;
  		                    break;
  		                }
  		            } catch (BadLocationException ex) {
  		                ex.printStackTrace();
  		            }
  		        }
  		        
  		        
  		        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
  		            textArea.append("\n\n");
  		        }
  		        
  		        if (!itemAlreadyAdded) {
  		        if ("Small".equals(selectedValueSprite)) {
  		            FinalResultSprite = beverages.getSpritePrice() * resultSprite[0];
  		            FinalResultSprite = Math.round(FinalResultSprite * 100.0) / 100.0;
  		            String formattedPrice = String.format("%.2f", FinalResultSprite);
  		            textArea.append("      "+ "Sprite"+"                                                    "                                          
  		                    + selectedValueSprite 
  		                    + "                                                       "  + resultSprite[0] + "                                                 "
  		                    + formattedPrice + " $\n");
  		        } else if ("Medium".equals(selectedValueSprite)) {
  		            FinalResultSprite = 2.25 * resultSprite[0];
  		            FinalResultSprite = Math.round(FinalResultSprite * 100.0) / 100.0;
  		            String formattedPrice = String.format("%.2f", FinalResultSprite);
  		            textArea.append("      "+ "Sprite"+"                                                    "                                          
  		                    + selectedValueSprite 
  		                    + "                                                   "  + resultSprite[0] + "                                                 "
  		                    + formattedPrice + " $\n");
  		        } else if ("Large".equals(selectedValueSprite)) {
  		           FinalResultSprite = 3.00 * resultSprite[0];
  		           FinalResultSprite = Math.round(FinalResultSprite * 100.0) / 100.0;
  		           String formattedPrice = String.format("%.2f", FinalResultSprite);
  		           textArea.append("      "+ "Sprite"+"                                                    "                                          
  		                  + selectedValueSprite 
  		                  + "                                                       "  + resultSprite[0] + "                                                 "
  		                  + formattedPrice + " $\n");
  		        } else if ("Extra".equals(selectedValueSprite)) {
  		            FinalResultSprite = 3.75 * resultSprite[0];
  		            FinalResultSprite = Math.round(FinalResultSprite * 100.0) / 100.0;
  		            String formattedPrice = String.format("%.2f", FinalResultSprite);
  		            textArea.append("      "+ "Sprite"+"                                                    "                                          
  		                    + selectedValueSprite 
  		                    + "                                                         "  + resultSprite[0] + "                                                 "
  		                    + formattedPrice + " $\n");
  		        } 
  		        
  		        
  		        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultSprite)
                          .setScale(2, RoundingMode.HALF_UP);
  		        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
                  
  		        }
  		    }
  		    
  		});


         SpriteReduce.addActionListener(new ActionListener() {
  		    @Override
  		    public void actionPerformed(ActionEvent e) {
  		    	
  		    	String selectedValueSprite = (String) SpriteSize.getSelectedItem();
  		    	double FinalResultSprite = 0;
  		    	
  		    	if (resultSprite[0] > 1) {
  		    		if ("Small".equals(selectedValueSprite)) {
  		                FinalResultSprite = beverages.getSpritePrice() * resultSprite[0];
  		            } else if ("Medium".equals(selectedValueSprite)) {
  		                FinalResultSprite = 2.25 * resultSprite[0];
  		            } else if ("Large".equals(selectedValueSprite)) {
  		                FinalResultSprite = 3.00 * resultSprite[0];
  		            } else if ("Extra".equals(selectedValueSprite)) {
  		                FinalResultSprite = 3.75 * resultSprite[0];
  		            } 

  		        }

  		        if (resultSprite[0] > 1) {
  		        	resultSprite[0]--;
  		        	SpriteAdd.setText("Add: " + resultSprite[0]);
  		        } else {
  		        	SpriteAdd.setText("Add");
  		        }
  		    }
  		});	
		
		JButton CocaColaZeroAdd = new JButton("Add");
		CocaColaZeroAdd.setForeground(Color.WHITE);
		CocaColaZeroAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		CocaColaZeroAdd.setBackground(new Color(204, 0, 0));
		CocaColaZeroAdd.setBounds(590, 436, 97, 28);
		
		JButton CocaColaZeroIncrease = new JButton("");
		CocaColaZeroIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
		CocaColaZeroIncrease.setForeground(Color.WHITE);
		CocaColaZeroIncrease.setBackground(Color.WHITE);
		CocaColaZeroIncrease.setBounds(691, 436, 28, 28);
		
		JButton CocaColaZeroReduce = new JButton("");
		CocaColaZeroReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
		CocaColaZeroReduce.setForeground(Color.WHITE);
		CocaColaZeroReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		CocaColaZeroReduce.setBackground(Color.WHITE);
		CocaColaZeroReduce.setBounds(557, 436, 28, 28);
		
final int resultCocaColaZero[] = {0};
		
		CocaColaZeroIncrease.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						resultCocaColaZero[0]++;
						CocaColaZeroAdd.setText("Add: " +  resultCocaColaZero[0]);

					}
					
				});
				
		CocaColaZeroAdd.addActionListener(new ActionListener() {
  		    @Override
  		    public void actionPerformed(ActionEvent e) {
  		        String selectedValueCocaColaZero = (String) CocaColaZeroSize.getSelectedItem();
  		        double FinalResultCocaColaZero = 0;
  		        
  		        boolean itemAlreadyAdded = false;
  		        

  		       
  		        for (int i = 0; i < textArea.getLineCount(); i++) {
  		            try {
  		                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
  		                if (line.contains("CocaColaZero") && line.contains(selectedValueCocaColaZero)) {
  		                    itemAlreadyAdded = true;
  		                    break;
  		                }
  		            } catch (BadLocationException ex) {
  		                ex.printStackTrace();
  		            }
  		        }
  		        
  		        
  		        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
  		            textArea.append("\n\n");
  		        }
  		        
  		        if (!itemAlreadyAdded) {
  		        if ("Small".equals(selectedValueCocaColaZero)) {
  		            FinalResultCocaColaZero = beverages.getCocaColaZeroPrice() * resultCocaColaZero[0];
  		            FinalResultCocaColaZero = Math.round(FinalResultCocaColaZero * 100.0) / 100.0;
  		            String formattedPrice = String.format("%.2f", FinalResultCocaColaZero);
  		            textArea.append("      "+ "CocaColaZero"+"                                    "                                          
  		                    + selectedValueCocaColaZero 
  		                    + "                                                       "  + resultCocaColaZero[0] + "                                                 "
  		                    + formattedPrice + " $\n");
  		        } else if ("Medium".equals(selectedValueCocaColaZero)) {
  		            FinalResultCocaColaZero = 2.25 * resultCocaColaZero[0];
  		            FinalResultCocaColaZero = Math.round(FinalResultCocaColaZero * 100.0) / 100.0;
  		            String formattedPrice = String.format("%.2f", FinalResultCocaColaZero);
  		            textArea.append("      "+ "CocaColaZero"+"                                    "                                          
  		                    + selectedValueCocaColaZero 
  		                    + "                                                   "  + resultCocaColaZero[0] + "                                                 "
  		                    + formattedPrice + " $\n");
  		        } else if ("Large".equals(selectedValueCocaColaZero)) {
  		           FinalResultCocaColaZero = 3.00 * resultCocaColaZero[0];
  		           FinalResultCocaColaZero = Math.round(FinalResultCocaColaZero * 100.0) / 100.0;
  		           String formattedPrice = String.format("%.2f", FinalResultCocaColaZero);
  		           textArea.append("      "+ "CocaColaZero"+"                                    "                                          
  		                  + selectedValueCocaColaZero 
  		                  + "                                                       "  + resultCocaColaZero[0] + "                                                 "
  		                  + formattedPrice + " $\n");
  		        } else if ("Extra".equals(selectedValueCocaColaZero)) {
  		            FinalResultCocaColaZero = 3.75 * resultCocaColaZero[0];
  		            FinalResultCocaColaZero = Math.round(FinalResultCocaColaZero * 100.0) / 100.0;
  		            String formattedPrice = String.format("%.2f", FinalResultCocaColaZero);
  		            textArea.append("      "+ "CocaColaZero"+"                                    "                                          
  		                    + selectedValueCocaColaZero 
  		                    + "                                                         "  + resultCocaColaZero[0] + "                                                 "
  		                    + formattedPrice + " $\n");
  		        } 
  		        
  		        
  		        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultCocaColaZero)
                          .setScale(2, RoundingMode.HALF_UP);
  		        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
                  
  		        }
  		    }
  		    
  		});


		CocaColaZeroReduce.addActionListener(new ActionListener() {
  		    @Override
  		    public void actionPerformed(ActionEvent e) {
  		    	
  		    	String selectedValueCocaColaZero = (String) SpriteSize.getSelectedItem();
  		    	double FinalResultCocaColaZero = 0;
  		    	
  		    	if (resultCocaColaZero[0] > 1) {
  		    		if ("Small".equals(selectedValueCocaColaZero)) {
  		                FinalResultCocaColaZero = beverages.getCocaColaZeroPrice() * resultCocaColaZero[0];
  		            } else if ("Medium".equals(selectedValueCocaColaZero)) {
  		                FinalResultCocaColaZero = 2.25 * resultCocaColaZero[0];
  		            } else if ("Large".equals(selectedValueCocaColaZero)) {
  		                FinalResultCocaColaZero = 3.00 * resultCocaColaZero[0];
  		            } else if ("Extra".equals(selectedValueCocaColaZero)) {
  		                FinalResultCocaColaZero = 3.75 * resultCocaColaZero[0];
  		            } 

  		        }

  		        if (resultCocaColaZero[0] > 1) {
  		        	resultCocaColaZero[0]--;
  		        	CocaColaZeroAdd.setText("Add: " + resultCocaColaZero[0]);
  		        } else {
  		        	CocaColaZeroAdd.setText("Add");
  		        }
  		    }
  		});			
		
		JButton LemonadeGrapefruitAdd = new JButton("Add");
		LemonadeGrapefruitAdd.setForeground(Color.WHITE);
		LemonadeGrapefruitAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		LemonadeGrapefruitAdd.setBackground(new Color(204, 0, 0));
		LemonadeGrapefruitAdd.setBounds(771, 436, 97, 28);
		
		JButton LemonadeGrapefruitIncrease = new JButton("");
		LemonadeGrapefruitIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
		LemonadeGrapefruitIncrease.setForeground(Color.WHITE);
		LemonadeGrapefruitIncrease.setBackground(Color.WHITE);
		LemonadeGrapefruitIncrease.setBounds(872, 436, 28, 28);
		
		JButton LemonadeGrapefruitReduce = new JButton("");
		LemonadeGrapefruitReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
		LemonadeGrapefruitReduce.setForeground(Color.WHITE);
		LemonadeGrapefruitReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		LemonadeGrapefruitReduce.setBackground(Color.WHITE);
		LemonadeGrapefruitReduce.setBounds(738, 436, 28, 28);
		
final int resultLemonadeGrapefruit[] = {0};
		
LemonadeGrapefruitIncrease.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						resultLemonadeGrapefruit[0]++;
						LemonadeGrapefruitAdd.setText("Add: " +  resultLemonadeGrapefruit[0]);

					}
					
				});
				
LemonadeGrapefruitAdd.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
       
    	double FinalResultLemonadeGrapefruit = 0;
        
        boolean itemAlreadyAdded = false;
        

       
        for (int i = 0; i < textArea.getLineCount(); i++) {
            try {
                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
                if (line.contains("Lemonade Grapefruit")) {
                    itemAlreadyAdded = true;
                    break;
                }
            } catch (BadLocationException ex) {
                ex.printStackTrace();
            }
        }
        
        if(!itemAlreadyAdded) {
        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
            textArea.append("\n\n");
        }
        
        
            FinalResultLemonadeGrapefruit = beverages.getLemonadeGrapefruitPrice() * resultLemonadeGrapefruit[0];
            FinalResultLemonadeGrapefruit = Math.round(FinalResultLemonadeGrapefruit * 100.0) / 100.0;
            String formattedPrice = String.format("%.2f", FinalResultLemonadeGrapefruit);
            textArea.append("      "+ "Lemonade Grapefruit"+"                        "                                          
                    + "                                                                 "  + resultLemonadeGrapefruit[0] 
                    + "                                                 "
                    + formattedPrice + " $\n");
       
        
        
        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultLemonadeGrapefruit)
                .setScale(2, RoundingMode.HALF_UP);
        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
        
        }
    }
    
});


LemonadeGrapefruitReduce.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
    	
    	double FinalResultLemonadeGrapefruit = 0;
    	
                FinalResultLemonadeGrapefruit = beverages.getLemonadeGrapefruitPrice() * resultLemonadeGrapefruit[0];
            
        if (resultLemonadeGrapefruit[0] > 1) {
        	resultLemonadeGrapefruit[0]--;
        	LemonadeGrapefruitAdd.setText("Add: " + resultLemonadeGrapefruit[0]);
        } else {
        	LemonadeGrapefruitAdd.setText("Add");
        }
    }
});			
		
		JButton LemonadeStrawberryAdd = new JButton("Add");
		LemonadeStrawberryAdd.setForeground(Color.WHITE);
		LemonadeStrawberryAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		LemonadeStrawberryAdd.setBackground(new Color(204, 0, 0));
		LemonadeStrawberryAdd.setBounds(47, 726, 97, 28);
		
		JButton LemonadeStrawberryIncrease = new JButton("");
		LemonadeStrawberryIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
		LemonadeStrawberryIncrease.setForeground(Color.WHITE);
		LemonadeStrawberryIncrease.setBackground(Color.WHITE);
		LemonadeStrawberryIncrease.setBounds(148, 726, 28, 28);
		
		JButton LemonadeStrawberryReduce = new JButton("");
		LemonadeStrawberryReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
		LemonadeStrawberryReduce.setForeground(Color.WHITE);
		LemonadeStrawberryReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		LemonadeStrawberryReduce.setBackground(Color.WHITE);
		LemonadeStrawberryReduce.setBounds(14, 726, 28, 28);
		
	
  final int resultLemonadeStrawberry[] = {0};
		
  LemonadeStrawberryIncrease.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								resultLemonadeStrawberry[0]++;
								LemonadeStrawberryAdd.setText("Add: " +  resultLemonadeStrawberry[0]);

							}
							
						});
						
  LemonadeStrawberryAdd.addActionListener(new ActionListener() {
	    @Override
	    public void actionPerformed(ActionEvent e) {
	       
	    	double FinalResultLemonadeStrawberry = 0;
	        
	        boolean itemAlreadyAdded = false;
	        

	       
	        for (int i = 0; i < textArea.getLineCount(); i++) {
	            try {
	                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
	                if (line.contains("Lemonade Strawberry")) {
	                    itemAlreadyAdded = true;
	                    break;
	                }
	            } catch (BadLocationException ex) {
	                ex.printStackTrace();
	            }
	        }
	        
	        if(!itemAlreadyAdded) {
	        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
	            textArea.append("\n\n");
	        }
	        
	        
	            FinalResultLemonadeStrawberry = beverages.getLemonadeStrawberryPrice() * resultLemonadeStrawberry[0];
	            FinalResultLemonadeStrawberry = Math.round(FinalResultLemonadeStrawberry * 100.0) / 100.0;
	            String formattedPrice = String.format("%.2f", FinalResultLemonadeStrawberry);
	            textArea.append("      "+ "Lemonade Strawberry"+"                       "                                          
	                    + "                                                                 "  + resultLemonadeStrawberry[0] 
	                    + "                                                 "
	                    + formattedPrice + " $\n");
	       
	        
	        
	        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultLemonadeStrawberry)
	                .setScale(2, RoundingMode.HALF_UP);
	        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
	        
	        }
	    }
	    
	});


  LemonadeStrawberryReduce.addActionListener(new ActionListener() {
	    @Override
	    public void actionPerformed(ActionEvent e) {
	    	
	    	double FinalResultLemonadeStrawberry = 0;
	    	
	                FinalResultLemonadeStrawberry = beverages.getLemonadeStrawberryPrice() * resultLemonadeStrawberry[0];
	            
	        if (resultLemonadeStrawberry[0] > 1) {
	        	resultLemonadeStrawberry[0]--;
	        	LemonadeStrawberryAdd.setText("Add: " + resultLemonadeStrawberry[0]);
	        } else {
	        	LemonadeStrawberryAdd.setText("Add");
	        }
	    }
	});		
		
		JButton OrangeJuiceAdd = new JButton("Add");
		OrangeJuiceAdd.setForeground(Color.WHITE);
		OrangeJuiceAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		OrangeJuiceAdd.setBackground(new Color(204, 0, 0));
		OrangeJuiceAdd.setBounds(228, 726, 97, 28);
		
		JButton OrangeJuiceIncrease = new JButton("");
		OrangeJuiceIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
		OrangeJuiceIncrease.setForeground(Color.WHITE);
		OrangeJuiceIncrease.setBackground(Color.WHITE);
		OrangeJuiceIncrease.setBounds(329, 726, 28, 28);
		
		JButton OrangeJuiceReduce = new JButton("");
		OrangeJuiceReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
		OrangeJuiceReduce.setForeground(Color.WHITE);
		OrangeJuiceReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		OrangeJuiceReduce.setBackground(Color.WHITE);
		OrangeJuiceReduce.setBounds(195, 726, 28, 28);
		
		 final int resultOrangeJuice[] = {0};
			
		 OrangeJuiceIncrease.addActionListener(new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent e) {
										resultOrangeJuice[0]++;
										OrangeJuiceAdd.setText("Add: " +  resultOrangeJuice[0]);

									}
									
								});
								
		 OrangeJuiceAdd.addActionListener(new ActionListener() {
	 		    @Override
	 		    public void actionPerformed(ActionEvent e) {
	 		        String selectedValueOrangeJuice = (String) OrangeJuiceSize.getSelectedItem();
	 		        double FinalResultOrangeJuice = 0;
	 		        
	 		        boolean itemAlreadyAdded = false;
	 		        

	 		       
	 		        for (int i = 0; i < textArea.getLineCount(); i++) {
	 		            try {
	 		                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
	 		                if (line.contains("Orange Juice") && line.contains(selectedValueOrangeJuice)) {
	 		                    itemAlreadyAdded = true;
	 		                    break;
	 		                }
	 		            } catch (BadLocationException ex) {
	 		                ex.printStackTrace();
	 		            }
	 		        }
	 		        
	 		        
	 		        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
	 		            textArea.append("\n\n");
	 		        }
	 		        
	 		        if (!itemAlreadyAdded) {
	 		        if ("Small".equals(selectedValueOrangeJuice)) {
	 		            FinalResultOrangeJuice = beverages.getOrangeJuicePrice() * resultOrangeJuice[0];
	 		            FinalResultOrangeJuice = Math.round(FinalResultOrangeJuice * 100.0) / 100.0;
	 		            String formattedPrice = String.format("%.2f", FinalResultOrangeJuice);
	 		            textArea.append("      "+ "Orange Juice"+"                                      "                                          
	 		                    + selectedValueOrangeJuice 
	 		                    + "                                                       "  + resultOrangeJuice[0] + "                                                 "
	 		                    + formattedPrice + " $\n");
	 		        } else if ("Medium".equals(selectedValueOrangeJuice)) {
	 		            FinalResultOrangeJuice = 2.70 * resultOrangeJuice[0];
	 		            FinalResultOrangeJuice = Math.round(FinalResultOrangeJuice * 100.0) / 100.0;
	 		            String formattedPrice = String.format("%.2f", FinalResultOrangeJuice);
	 		            textArea.append("      "+ "Orange Juice"+"                                      "                                          
	 		                    + selectedValueOrangeJuice 
	 		                    + "                                                   "  + resultOrangeJuice[0] + "                                                 "
	 		                    + formattedPrice + " $\n");
	 		        } else if ("Large".equals(selectedValueOrangeJuice)) {
	 		           FinalResultOrangeJuice = 3.60 * resultOrangeJuice[0];
	 		           FinalResultOrangeJuice = Math.round(FinalResultOrangeJuice * 100.0) / 100.0;
	 		           String formattedPrice = String.format("%.2f", FinalResultOrangeJuice);
	 		           textArea.append("      "+ "Orange Juice"+"                                      "                                          
	 		                  + selectedValueOrangeJuice 
	 		                  + "                                                       "  + resultOrangeJuice[0] + "                                                 "
	 		                  + formattedPrice + " $\n");
	 		        } 
	 		        
	 		        
	 		        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultOrangeJuice)
	                         .setScale(2, RoundingMode.HALF_UP);
	 		        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
	                 
	 		        }
	 		    }
	 		    
	 		});


		 OrangeJuiceReduce.addActionListener(new ActionListener() {
	 		    @Override
	 		    public void actionPerformed(ActionEvent e) {
	 		    	
	 		    	String selectedValueOrangeJuice = (String) OrangeJuiceSize.getSelectedItem();
	 		    	double FinalResultOrangeJuice = 0;
	 		    	
	 		    	if (resultCocaCola[0] > 1) {
	 		    		if ("Small".equals(selectedValueOrangeJuice)) {
	 		                FinalResultOrangeJuice = beverages.getOrangeJuicePrice() * resultOrangeJuice[0];
	 		            } else if ("Medium".equals(selectedValueOrangeJuice)) {
	 		                FinalResultOrangeJuice = 2.70 * resultOrangeJuice[0];
	 		            } else if ("Large".equals(selectedValueOrangeJuice)) {
	 		                FinalResultOrangeJuice = 3.60 * resultOrangeJuice[0];
	 		            } 

	 		        }

	 		        if (resultOrangeJuice[0] > 1) {
	 		        	resultOrangeJuice[0]--;
	 		        	OrangeJuiceAdd.setText("Add: " + resultOrangeJuice[0]);
	 		        } else {
	 		        	OrangeJuiceAdd.setText("Add");
	 		        }
	 		    }
	 		});		
				
		
		JButton CappyAdd = new JButton("Add");
		CappyAdd.setForeground(Color.WHITE);
		CappyAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		CappyAdd.setBackground(new Color(204, 0, 0));
		CappyAdd.setBounds(409, 726, 97, 28);
		
		JButton CappyIncrease = new JButton("");
		CappyIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
		CappyIncrease.setForeground(Color.WHITE);
		CappyIncrease.setBackground(Color.WHITE);
		CappyIncrease.setBounds(510, 726, 28, 28);
		
		JButton CappyReduce = new JButton("");
		CappyReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
		CappyReduce.setForeground(Color.WHITE);
		CappyReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		CappyReduce.setBackground(Color.WHITE);
		CappyReduce.setBounds(376, 726, 28, 28);
		
		final int resultCappy[] = {0};
		
		CappyIncrease.addActionListener(new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent e) {
										resultCappy[0]++;
										CappyAdd.setText("Add: " +  resultCappy[0]);

									}
									
								});
								
		CappyAdd.addActionListener(new ActionListener() {
	 		    @Override
	 		    public void actionPerformed(ActionEvent e) {
	 		        String selectedValueCappy = (String) CappySize.getSelectedItem();
	 		        double FinalResultCappy = 0;
	 		        
	 		        boolean itemAlreadyAdded = false;
	 		        

	 		       
	 		        for (int i = 0; i < textArea.getLineCount(); i++) {
	 		            try {
	 		                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
	 		                if (line.contains("Cappy") && line.contains(selectedValueCappy)) {
	 		                    itemAlreadyAdded = true;
	 		                    break;
	 		                }
	 		            } catch (BadLocationException ex) {
	 		                ex.printStackTrace();
	 		            }
	 		        }
	 		        
	 		        
	 		        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
	 		            textArea.append("\n\n");
	 		        }
	 		        
	 		        if (!itemAlreadyAdded) {
	 		        if ("Small".equals(selectedValueCappy)) {
	 		            FinalResultCappy = beverages.getCappyJuicePrice() * resultCappy[0];
	 		            FinalResultCappy = Math.round(FinalResultCappy * 100.0) / 100.0;
	 		            String formattedPrice = String.format("%.2f", FinalResultCappy);
	 		            textArea.append("      "+ "Cappy"+"                                                   "                                          
	 		                    + selectedValueCappy 
	 		                    + "                                                       "  + resultCappy[0] + "                                                 "
	 		                    + formattedPrice + " $\n");
	 		        } else if ("Medium".equals(selectedValueCappy)) {
	 		            FinalResultCappy = 3.40 * resultCappy[0];
	 		            FinalResultCappy = Math.round(FinalResultCappy * 100.0) / 100.0;
	 		            String formattedPrice = String.format("%.2f", FinalResultCappy);
	 		            textArea.append("      "+ "Cappy"+"                                                   "                                          
	 		                    + selectedValueCappy 
	 		                    + "                                                   "  + resultCappy[0] + "                                                 "
	 		                    + formattedPrice + " $\n");
	 		        } 
	 		        
	 		        
	 		        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultCappy)
	                         .setScale(2, RoundingMode.HALF_UP);
	 		        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
	                 
	 		        }
	 		    }
	 		    
	 		});


		CappyReduce.addActionListener(new ActionListener() {
	 		    @Override
	 		    public void actionPerformed(ActionEvent e) {
	 		    	
	 		    	String selectedValueCappy = (String) CappySize.getSelectedItem();
	 		    	double FinalResultCappy = 0;
	 		    	
	 		    	if (resultCappy[0] > 1) {
	 		    		if ("Small".equals(selectedValueCappy)) {
	 		                FinalResultCappy = beverages.getCappyJuicePrice() * resultCappy[0];
	 		            } else if ("Medium".equals(selectedValueCappy)) {
	 		                FinalResultCappy = 3.40 * resultCappy[0];
	 		            }  

	 		        }

	 		        if (resultCappy[0] > 1) {
	 		        	resultCappy[0]--;
	 		        	CappyAdd.setText("Add: " + resultCappy[0]);
	 		        } else {
	 		        	CappyAdd.setText("Add");
	 		        }
	 		    }
	 		});		
		
		JButton SparklingWaterAdd = new JButton("Add");
		SparklingWaterAdd.setForeground(Color.WHITE);
		SparklingWaterAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		SparklingWaterAdd.setBackground(new Color(204, 0, 0));
		SparklingWaterAdd.setBounds(590, 726, 97, 28);
		
		JButton SparklingWaterIncrease = new JButton("");
		SparklingWaterIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
		SparklingWaterIncrease.setForeground(Color.WHITE);
		SparklingWaterIncrease.setBackground(Color.WHITE);
		SparklingWaterIncrease.setBounds(691, 726, 28, 28);
		
		JButton SparklingWaterReduce = new JButton("");
		SparklingWaterReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
		SparklingWaterReduce.setForeground(Color.WHITE);
		SparklingWaterReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		SparklingWaterReduce.setBackground(Color.WHITE);
		SparklingWaterReduce.setBounds(557, 726, 28, 28);
		
final int resultSparklingWater[] = {0};
		
SparklingWaterIncrease.addActionListener(new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent e) {
										resultSparklingWater[0]++;
										SparklingWaterAdd.setText("Add: " +  resultSparklingWater[0]);

									}
									
								});
								
SparklingWaterAdd.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
       
    	double FinalResultSparklingWater = 0;
        
        boolean itemAlreadyAdded = false;
        

       
        for (int i = 0; i < textArea.getLineCount(); i++) {
            try {
                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
                if (line.contains("Sparkling Water")) {
                    itemAlreadyAdded = true;
                    break;
                }
            } catch (BadLocationException ex) {
                ex.printStackTrace();
            }
        }
        
        if(!itemAlreadyAdded) {
        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
            textArea.append("\n\n");
        }
        
        
            FinalResultSparklingWater = beverages.getSparklingWaterPrice() * resultSparklingWater[0];
            FinalResultSparklingWater = Math.round(FinalResultSparklingWater * 100.0) / 100.0;
            String formattedPrice = String.format("%.2f", FinalResultSparklingWater);
            textArea.append("      "+ "Sparkling Water"+"                                  "                                          
                    + "                                                                 "  + resultSparklingWater[0] 
                    + "                                                 "
                    + formattedPrice + " $\n");
       
        
        
        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultSparklingWater)
                .setScale(2, RoundingMode.HALF_UP);
        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
        
        }
    }
    
});


SparklingWaterReduce.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
    	
    	double FinalResultSparklingWater = 0;
    	
                FinalResultSparklingWater = beverages.getSparklingWaterPrice() * resultSparklingWater[0];
            
        if (resultSparklingWater[0] > 1) {
        	resultSparklingWater[0]--;
        	SparklingWaterAdd.setText("Add: " + resultSparklingWater[0]);
        } else {
        	SparklingWaterAdd.setText("Add");
        }
    }
});	
		
		
		//Sauces
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		JButton KetchupAdd = new JButton("Add");
		KetchupAdd.setForeground(new Color(255, 255, 255));
		KetchupAdd.setBackground(new Color(204, 0, 0));
		KetchupAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		KetchupAdd.setBounds(47, 436, 97, 28);
		
		JButton KetchupIncrease = new JButton("");
		KetchupIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
		KetchupIncrease.setForeground(new Color(255, 255, 255));
		KetchupIncrease.setBackground(new Color(255, 255, 255));
		KetchupIncrease.setBounds(148, 436, 28, 28);
		
		JButton KetchupReduce = new JButton("");
		KetchupReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
		KetchupReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		KetchupReduce.setForeground(new Color(255, 255, 255));
		KetchupReduce.setBackground(new Color(255, 255, 255));
		KetchupReduce.setBounds(14, 436, 28, 28);
		
		final int resultKetchup[] = {0};
		
		KetchupIncrease.addActionListener(new ActionListener() {

											@Override
											public void actionPerformed(ActionEvent e) {
												resultKetchup[0]++;
												KetchupAdd.setText("Add: " +  resultKetchup[0]);

											}
											
										});
										
		KetchupAdd.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		       
		    	double FinalResultKetchup = 0;
		        
		        boolean itemAlreadyAdded = false;
		        

		       
		        for (int i = 0; i < textArea.getLineCount(); i++) {
		            try {
		                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
		                if (line.contains("Ketchup")) {
		                    itemAlreadyAdded = true;
		                    break;
		                }
		            } catch (BadLocationException ex) {
		                ex.printStackTrace();
		            }
		        }
		        
		        if(!itemAlreadyAdded) {
		        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
		            textArea.append("\n\n");
		        }
		        
		        
		            FinalResultKetchup = sauces.getSaucePrice() * resultKetchup[0];
		            FinalResultKetchup = Math.round(FinalResultKetchup * 100.0) / 100.0;
		            String formattedPrice = String.format("%.2f", FinalResultKetchup);
		            textArea.append("      "+ "Ketchup"+"                                                "                                          
		                    + "                                                                 "  + resultKetchup[0] 
		                    + "                                                 "
		                    + formattedPrice + " $\n");
		       
		        
		        
		        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultKetchup)
		                .setScale(2, RoundingMode.HALF_UP);
		        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
		        
		        }
		    }
		    
		});


		KetchupReduce.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	
		    	double FinalResultKetchup = 0;
		    	
		                FinalResultKetchup = sauces.getSaucePrice() * resultKetchup[0];
		            
		        if (resultKetchup[0] > 1) {
		        	resultKetchup[0]--;
		        	KetchupAdd.setText("Add: " + resultKetchup[0]);
		        } else {
		        	KetchupAdd.setText("Add");
		        }
		    }
		});	
		
		JButton MayonnaiseAdd = new JButton("Add");
		MayonnaiseAdd.setForeground(Color.WHITE);
		MayonnaiseAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		MayonnaiseAdd.setBackground(new Color(204, 0, 0));
		MayonnaiseAdd.setBounds(228, 436, 97, 28);
		
		JButton MayonnaiseIncrease = new JButton("");
		MayonnaiseIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
		MayonnaiseIncrease.setForeground(Color.WHITE);
		MayonnaiseIncrease.setBackground(Color.WHITE);
		MayonnaiseIncrease.setBounds(329, 436, 28, 28);
		
		JButton MayonnaiseReduce = new JButton("");
		MayonnaiseReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
		MayonnaiseReduce.setForeground(Color.WHITE);
		MayonnaiseReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		MayonnaiseReduce.setBackground(Color.WHITE);
		MayonnaiseReduce.setBounds(195, 436, 28, 28);
		
final int resultMayonnaise[] = {0};
		
        MayonnaiseIncrease.addActionListener(new ActionListener() {

											@Override
											public void actionPerformed(ActionEvent e) {
												resultMayonnaise[0]++;
												MayonnaiseAdd.setText("Add: " +  resultMayonnaise[0]);

											}
											
										});
										
        MayonnaiseAdd.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		       
		    	double FinalResultMayonnaise = 0;
		        
		        boolean itemAlreadyAdded = false;
		        

		       
		        for (int i = 0; i < textArea.getLineCount(); i++) {
		            try {
		                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
		                if (line.contains("Mayonnaise")) {
		                    itemAlreadyAdded = true;
		                    break;
		                }
		            } catch (BadLocationException ex) {
		                ex.printStackTrace();
		            }
		        }
		        
		        if(!itemAlreadyAdded) {
		        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
		            textArea.append("\n\n");
		        }
		        
		        
		            FinalResultMayonnaise = sauces.getSaucePrice() * resultMayonnaise[0];
		            FinalResultMayonnaise = Math.round(FinalResultMayonnaise * 100.0) / 100.0;
		            String formattedPrice = String.format("%.2f", FinalResultMayonnaise);
		            textArea.append("      "+ "Mayonnaise"+"                                         "                                          
		                    + "                                                                 "  + resultMayonnaise[0] 
		                    + "                                                 "
		                    + formattedPrice + " $\n");
		       
		        
		        
		        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultMayonnaise)
		                .setScale(2, RoundingMode.HALF_UP);
		        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
		        
		        }
		    }
		    
		});


        MayonnaiseReduce.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	
		    	double FinalResultMayonnaise = 0;
		    	
		                FinalResultMayonnaise = sauces.getSaucePrice() * resultMayonnaise[0];
		            
		        if (resultMayonnaise[0] > 1) {
		        	resultMayonnaise[0]--;
		        	MayonnaiseAdd.setText("Add: " + resultMayonnaise[0]);
		        } else {
		        	MayonnaiseAdd.setText("Add");
		        }
		    }
		});	
		
		JButton CheeseAdd = new JButton("Add");
		CheeseAdd.setForeground(Color.WHITE);
		CheeseAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		CheeseAdd.setBackground(new Color(204, 0, 0));
		CheeseAdd.setBounds(409, 436, 97, 28);
		
		JButton CheeseIncrease = new JButton("");
		CheeseIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
		CheeseIncrease.setForeground(Color.WHITE);
		CheeseIncrease.setBackground(Color.WHITE);
		CheeseIncrease.setBounds(510, 436, 28, 28);
		
		JButton CheeseReduce = new JButton("");
		CheeseReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
		CheeseReduce.setForeground(Color.WHITE);
		CheeseReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		CheeseReduce.setBackground(Color.WHITE);
		CheeseReduce.setBounds(376, 436, 28, 28);
		
final int resultCheese[] = {0};
		
CheeseIncrease.addActionListener(new ActionListener() {

											@Override
											public void actionPerformed(ActionEvent e) {
												resultCheese[0]++;
												CheeseAdd.setText("Add: " +  resultCheese[0]);

											}
											
										});
										
CheeseAdd.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
       
    	double FinalResultCheese = 0;
        
        boolean itemAlreadyAdded = false;
        

       
        for (int i = 0; i < textArea.getLineCount(); i++) {
            try {
                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
                if (line.contains("Cheese sauce")) {
                    itemAlreadyAdded = true;
                    break;
                }
            } catch (BadLocationException ex) {
                ex.printStackTrace();
            }
        }
        
        if(!itemAlreadyAdded) {
        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
            textArea.append("\n\n");
        }
        
        
            FinalResultCheese = sauces.getSaucePrice() * resultCheese[0];
            FinalResultCheese = Math.round(FinalResultCheese * 100.0) / 100.0;
            String formattedPrice = String.format("%.2f", FinalResultCheese);
            textArea.append("      "+ "Cheese sauce"+"                                    "                                          
                    + "                                                                 "  + resultCheese[0] 
                    + "                                                 "
                    + formattedPrice + " $\n");
       
        
        
        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultCheese)
                .setScale(2, RoundingMode.HALF_UP);
        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
        
        }
    }
    
});


CheeseReduce.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
    	
    	double FinalResultCheese = 0;
    	
                FinalResultCheese = sauces.getSaucePrice() * resultCheese[0];
            
        if (resultCheese[0] > 1) {
        	resultCheese[0]--;
        	CheeseAdd.setText("Add: " + resultCheese[0]);
        } else {
        	CheeseAdd.setText("Add");
        }
    }
});		
				
		
		JButton BarbecueAdd = new JButton("Add");
		BarbecueAdd.setForeground(Color.WHITE);
		BarbecueAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		BarbecueAdd.setBackground(new Color(204, 0, 0));
		BarbecueAdd.setBounds(590, 436, 97, 28);
		
		JButton BarbecueIncrease = new JButton("");
		BarbecueIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
		BarbecueIncrease.setForeground(Color.WHITE);
		BarbecueIncrease.setBackground(Color.WHITE);
		BarbecueIncrease.setBounds(691, 436, 28, 28);
		
		JButton BarbecueReduce = new JButton("");
		BarbecueReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
		BarbecueReduce.setForeground(Color.WHITE);
		BarbecueReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		BarbecueReduce.setBackground(Color.WHITE);
		BarbecueReduce.setBounds(557, 436, 28, 28);
		
		final int resultBarbecue[] = {0};
		
		BarbecueIncrease.addActionListener(new ActionListener() {

													@Override
													public void actionPerformed(ActionEvent e) {
														resultBarbecue[0]++;
														BarbecueAdd.setText("Add: " +  resultBarbecue[0]);

													}
													
												});
												
		BarbecueAdd.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		       
		    	double FinalResultBarbecue = 0;
		        
		        boolean itemAlreadyAdded = false;
		        

		       
		        for (int i = 0; i < textArea.getLineCount(); i++) {
		            try {
		                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
		                if (line.contains("Barbecue sauce")) {
		                    itemAlreadyAdded = true;
		                    break;
		                }
		            } catch (BadLocationException ex) {
		                ex.printStackTrace();
		            }
		        }
		        
		        if(!itemAlreadyAdded) {
		        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
		            textArea.append("\n\n");
		        }
		        
		        
		            FinalResultBarbecue = sauces.getSaucePrice() * resultBarbecue[0];
		            FinalResultBarbecue = Math.round(FinalResultBarbecue * 100.0) / 100.0;
		            String formattedPrice = String.format("%.2f", FinalResultBarbecue);
		            textArea.append("      "+ "Barbecue sauce"+"                                 "                                          
		                    + "                                                                 "  + resultBarbecue[0] 
		                    + "                                                 "
		                    + formattedPrice + " $\n");
		       
		        
		        
		        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultBarbecue)
		                .setScale(2, RoundingMode.HALF_UP);
		        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
		        
		        }
		    }
		    
		});


		BarbecueReduce.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	
		    	double FinalResultBarbecue = 0;
		    	
		                FinalResultBarbecue = sauces.getSaucePrice() * resultBarbecue[0];
		            
		        if (resultBarbecue[0] > 1) {
		        	resultBarbecue[0]--;
		        	BarbecueAdd.setText("Add: " + resultBarbecue[0]);
		        } else {
		        	BarbecueAdd.setText("Add");
		        }
		    }
		});			
		
		JButton MustardAdd = new JButton("Add");
		MustardAdd.setForeground(Color.WHITE);
		MustardAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		MustardAdd.setBackground(new Color(204, 0, 0));
		MustardAdd.setBounds(771, 436, 97, 28);
		
		JButton MustardIncrease = new JButton("");
		MustardIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
		MustardIncrease.setForeground(Color.WHITE);
		MustardIncrease.setBackground(Color.WHITE);
		MustardIncrease.setBounds(872, 436, 28, 28);
		
		JButton MustardReduce = new JButton("");
		MustardReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
		MustardReduce.setForeground(Color.WHITE);
		MustardReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		MustardReduce.setBackground(Color.WHITE);
		MustardReduce.setBounds(738, 436, 28, 28);
		
		final int resultMustard[] = {0};
		
		MustardIncrease.addActionListener(new ActionListener() {

										@Override
										public void actionPerformed(ActionEvent e) {
											resultMustard[0]++;
											MustardAdd.setText("Add: " +  resultMustard[0]);

													}
													
												});
												
		MustardAdd.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		       
		    	double FinalResultMustard = 0;
		        
		        boolean itemAlreadyAdded = false;
		        

		       
		        for (int i = 0; i < textArea.getLineCount(); i++) {
		            try {
		                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
		                if (line.contains("Mustard sauce")) {
		                    itemAlreadyAdded = true;
		                    break;
		                }
		            } catch (BadLocationException ex) {
		                ex.printStackTrace();
		            }
		        }
		        
		        if(!itemAlreadyAdded) {
		        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
		            textArea.append("\n\n");
		        }
		        
		        
		            FinalResultMustard = sauces.getSaucePrice() * resultMustard[0];
		            FinalResultMustard = Math.round(FinalResultMustard * 100.0) / 100.0;
		            String formattedPrice = String.format("%.2f", FinalResultMustard);
		            textArea.append("      "+ "Mustard sauce"+"                                    "                                          
		                    + "                                                                 "  + resultMustard[0] 
		                    + "                                                 "
		                    + formattedPrice + " $\n");
		       
		        
		        
		        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultMustard)
		                .setScale(2, RoundingMode.HALF_UP);
		        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
		        
		        }
		    }
		    
		});


		MustardReduce.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	
		    	double FinalResultMustard = 0;
		    	
		                FinalResultMustard = sauces.getSaucePrice() * resultMustard[0];
		            
		        if (resultMustard[0] > 1) {
		        	resultMustard[0]--;
		        	MustardAdd.setText("Add: " + resultMustard[0]);
		        } else {
		        	MustardAdd.setText("Add");
		        }
		    }
		});			
		
		JButton SalsaAdd = new JButton("Add");
		SalsaAdd.setForeground(Color.WHITE);
		SalsaAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		SalsaAdd.setBackground(new Color(204, 0, 0));
		SalsaAdd.setBounds(47, 726, 97, 28);
		
		JButton SalsaIncrease = new JButton("");
		SalsaIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
		SalsaIncrease.setForeground(Color.WHITE);
		SalsaIncrease.setBackground(Color.WHITE);
		SalsaIncrease.setBounds(148, 726, 28, 28);
		
		JButton SalsaReduce = new JButton("");
		SalsaReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
		SalsaReduce.setForeground(Color.WHITE);
		SalsaReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		SalsaReduce.setBackground(Color.WHITE);
		SalsaReduce.setBounds(14, 726, 28, 28);
		
final int resultSalsa[] = {0};
		
SalsaIncrease.addActionListener(new ActionListener() {

										@Override
										public void actionPerformed(ActionEvent e) {
											resultSalsa[0]++;
											SalsaAdd.setText("Add: " +  resultSalsa[0]);

													}
													
												});
												
SalsaAdd.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
       
    	double FinalResultSalsa = 0;
        
        boolean itemAlreadyAdded = false;
        

       
        for (int i = 0; i < textArea.getLineCount(); i++) {
            try {
                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
                if (line.contains("Salsa sauce")) {
                    itemAlreadyAdded = true;
                    break;
                }
            } catch (BadLocationException ex) {
                ex.printStackTrace();
            }
        }
        
        if(!itemAlreadyAdded) {
        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
            textArea.append("\n\n");
        }
        
        
            FinalResultSalsa = sauces.getSaucePrice() * resultSalsa[0];
            FinalResultSalsa = Math.round(FinalResultSalsa * 100.0) / 100.0;
            String formattedPrice = String.format("%.2f", FinalResultSalsa);
            textArea.append("      "+ "Salsa sauce"+"                                        "                                          
                    + "                                                                 "  + resultSalsa[0] 
                    + "                                                 "
                    + formattedPrice + " $\n");
       
        
        
        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultSalsa)
                .setScale(2, RoundingMode.HALF_UP);
        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
        
        }
    }
    
});


SalsaReduce.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
    	
    	double FinalResultSalsa = 0;
    	
                FinalResultSalsa = sauces.getSaucePrice() * resultSalsa[0];
            
        if (resultSalsa[0] > 1) {
        	resultSalsa[0]--;
        	SalsaAdd.setText("Add: " + resultSalsa[0]);
        } else {
        	SalsaAdd.setText("Add");
        }
    }
});			
		
		JButton SweetAdd = new JButton("Add");
		SweetAdd.setForeground(Color.WHITE);
		SweetAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		SweetAdd.setBackground(new Color(204, 0, 0));
		SweetAdd.setBounds(228, 726, 97, 28);
		
		JButton SweetIncrease = new JButton("");
		SweetIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
		SweetIncrease.setForeground(Color.WHITE);
		SweetIncrease.setBackground(Color.WHITE);
		SweetIncrease.setBounds(329, 726, 28, 28);
		
		JButton SweetReduce = new JButton("");
		SweetReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
		SweetReduce.setForeground(Color.WHITE);
		SweetReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		SweetReduce.setBackground(Color.WHITE);
		SweetReduce.setBounds(195, 726, 28, 28);
		
		final int resultSweet[] = {0};
		
		SweetIncrease.addActionListener(new ActionListener() {

												@Override
												public void actionPerformed(ActionEvent e) {
													resultSweet[0]++;
													SweetAdd.setText("Add: " +  resultSweet[0]);

															}
															
														});
														
		SweetAdd.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		       
		    	double FinalResultSweet = 0;
		        
		        boolean itemAlreadyAdded = false;
		        

		       
		        for (int i = 0; i < textArea.getLineCount(); i++) {
		            try {
		                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
		                if (line.contains("Sweet sauce")) {
		                    itemAlreadyAdded = true;
		                    break;
		                }
		            } catch (BadLocationException ex) {
		                ex.printStackTrace();
		            }
		        }
		        
		        if(!itemAlreadyAdded) {
		        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
		            textArea.append("\n\n");
		        }
		        
		        
		            FinalResultSweet = sauces.getSaucePrice() * resultSweet[0];
		            FinalResultSweet = Math.round(FinalResultSweet * 100.0) / 100.0;
		            String formattedPrice = String.format("%.2f", FinalResultSweet);
		            textArea.append("      "+ "Sweet sauce"+"                                       "                                          
		                    + "                                                                 "  + resultSweet[0] 
		                    + "                                                 "
		                    + formattedPrice + " $\n");
		       
		        
		        
		        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultSweet)
		                .setScale(2, RoundingMode.HALF_UP);
		        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
		        
		        }
		    }
		    
		});


		SweetReduce.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	
		    	double FinalResultSweet = 0;
		    	
		                FinalResultSweet = sauces.getSaucePrice() * resultSweet[0];
		            
		        if (resultSweet[0] > 1) {
		        	resultSweet[0]--;
		        	SweetAdd.setText("Add: " + resultSweet[0]);
		        } else {
		        	SweetAdd.setText("Add");
		        }
		    }
		});			
						
		
		
		//Hot Drinks
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
			JButton TeaAdd = new JButton("Add");
			TeaAdd.setForeground(new Color(255, 255, 255));
			TeaAdd.setBackground(new Color(204, 0, 0));
			TeaAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
			TeaAdd.setBounds(47, 436, 97, 28);
			
			JButton TeaIncrease = new JButton("");
			TeaIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
			TeaIncrease.setForeground(new Color(255, 255, 255));
			TeaIncrease.setBackground(new Color(255, 255, 255));
			TeaIncrease.setBounds(148, 436, 28, 28);
			
			JButton TeaReduce = new JButton("");
			TeaReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
			TeaReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
			TeaReduce.setForeground(new Color(255, 255, 255));
			TeaReduce.setBackground(new Color(255, 255, 255));
			TeaReduce.setBounds(14, 436, 28, 28);
			
			final int resultTea[] = {0};
			
			TeaIncrease.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
							resultTea[0]++;
							TeaAdd.setText("Add: " +  resultTea[0]);

							}
																
						});
															
			TeaAdd.addActionListener(new ActionListener() {
	 		    @Override
	 		    public void actionPerformed(ActionEvent e) {
	 		        String selectedValueTea = (String) TeaSize.getSelectedItem();
	 		        double FinalResultTea = 0;
	 		        
	 		        boolean itemAlreadyAdded = false;
	 		        

	 		       
	 		        for (int i = 0; i < textArea.getLineCount(); i++) {
	 		            try {
	 		                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
	 		                if (line.contains("Tea") && line.contains(selectedValueTea)) {
	 		                    itemAlreadyAdded = true;
	 		                    break;
	 		                }
	 		            } catch (BadLocationException ex) {
	 		                ex.printStackTrace();
	 		            }
	 		        }
	 		        
	 		        
	 		        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
	 		            textArea.append("\n\n");
	 		        }
	 		        
	 		        if (!itemAlreadyAdded) {
	 		        if ("0.3L".equals(selectedValueTea)) {
	 		            FinalResultTea = hotDrinks.getTeaPrice() * resultTea[0];
	 		            FinalResultTea = Math.round(FinalResultTea * 100.0) / 100.0;
	 		            String formattedPrice = String.format("%.2f", FinalResultTea);
	 		            textArea.append("      "+ "Tea"+"                                                       "                                          
	 		                    + selectedValueTea 
	 		                    + "                                                          "  + resultTea[0] + "                                                 "
	 		                    + formattedPrice + " $\n");
	 		        } else if ("0.4L".equals(selectedValueTea)) {
	 		            FinalResultTea = 1.30 * resultTea[0];
	 		            FinalResultTea = Math.round(FinalResultTea * 100.0) / 100.0;
	 		            String formattedPrice = String.format("%.2f", FinalResultTea);
	 		            textArea.append("      "+ "Tea"+"                                                       "                                          
	 		                    + selectedValueTea 
	 		                    + "                                                          "  + resultTea[0] + "                                                 "
	 		                    + formattedPrice + " $\n");
	 		        }  
	 		        


	 		        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultTea)
	                         .setScale(2, RoundingMode.HALF_UP);
	 		        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
	                 
	 		        }
	 		    }
	 		    
	 		});


			TeaReduce.addActionListener(new ActionListener() {
	 		    @Override
	 		    public void actionPerformed(ActionEvent e) {
	 		    	
	 		    	String selectedValueTea = (String) FantaSize.getSelectedItem();
	 		    	double FinalResultTea = 0;
	 		    	
	 		    	if (resultTea[0] > 1) {
	 		    		if ("0.3".equals(selectedValueTea)) {
	 		                FinalResultTea = hotDrinks.getTeaPrice() * resultTea[0];
	 		            } else if ("0.4".equals(selectedValueTea)) {
	 		                FinalResultTea = 1.30 * resultTea[0];
	 		            } 

	 		        }

	 		        if (resultTea[0] > 1) {
	 		        	resultTea[0]--;
	 		        	TeaAdd.setText("Add: " + resultTea[0]);
	 		        } else {
	 		        	TeaAdd.setText("Add");
	 		        }
	 		    }
	 		});				
			
			JButton CoffeeAdd = new JButton("Add");
			CoffeeAdd.setForeground(Color.WHITE);
			CoffeeAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
			CoffeeAdd.setBackground(new Color(204, 0, 0));
			CoffeeAdd.setBounds(228, 436, 97, 28);
			
			JButton CoffeeIncrease = new JButton("");
			CoffeeIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
			CoffeeIncrease.setForeground(Color.WHITE);
			CoffeeIncrease.setBackground(Color.WHITE);
			CoffeeIncrease.setBounds(329, 436, 28, 28);
			
			JButton CoffeeReduce = new JButton("");
			CoffeeReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
			CoffeeReduce.setForeground(Color.WHITE);
			CoffeeReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
			CoffeeReduce.setBackground(Color.WHITE);
			CoffeeReduce.setBounds(195, 436, 28, 28);
			
final int resultCoffee[] = {0};
			
CoffeeIncrease.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
							resultCoffee[0]++;
							CoffeeAdd.setText("Add: " +  resultCoffee[0]);

							}
																
						});
															
CoffeeAdd.addActionListener(new ActionListener() {
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        String selectedValueCoffee = (String) CoffeeSize.getSelectedItem();
	        double FinalResultCoffee = 0;
	        
	        boolean itemAlreadyAdded = false;
	        

	       
	        for (int i = 0; i < textArea.getLineCount(); i++) {
	            try {
	                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
	                if (line.contains("Coffee") && line.contains(selectedValueCoffee)) {
	                    itemAlreadyAdded = true;
	                    break;
	                }
	            } catch (BadLocationException ex) {
	                ex.printStackTrace();
	            }
	        }
	        
	        
	        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
	            textArea.append("\n\n");
	        }
	        
	        if (!itemAlreadyAdded) {
	        if ("Small".equals(selectedValueCoffee)) {
	            FinalResultCoffee = hotDrinks.getCoffeePrice() * resultCoffee[0];
	            FinalResultCoffee = Math.round(FinalResultCoffee * 100.0) / 100.0;
	            String formattedPrice = String.format("%.2f", FinalResultCoffee);
	            textArea.append("      "+ "Coffee"+"                                                  "                                          
	                    + selectedValueCoffee 
	                    + "                                                       "  + resultCoffee[0] + "                                                  "
	                    + formattedPrice + " $\n");
	        } else if ("Large".equals(selectedValueCoffee)) {
	            FinalResultCoffee = 3.75 * resultCoffee[0];
	            FinalResultCoffee = Math.round(FinalResultCoffee * 100.0) / 100.0;
	            String formattedPrice = String.format("%.2f", FinalResultCoffee);
	            textArea.append("      "+ "Coffee"+"                                                  "                                          
	                    + selectedValueCoffee 
	                    + "                                                       "  + resultCoffee[0] + "                                                  "
	                    + formattedPrice + " $\n");
	        }  
	        


	        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultCoffee)
                 .setScale(2, RoundingMode.HALF_UP);
	        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
         
	        }
	    }
	    
	});


CoffeeReduce.addActionListener(new ActionListener() {
	    @Override
	    public void actionPerformed(ActionEvent e) {
	    	
	    	String selectedValueCoffee = (String) CoffeeSize.getSelectedItem();
	    	double FinalResultCoffee = 0;
	    	
	    	if (resultCoffee[0] > 1) {
	    		if ("Small".equals(selectedValueCoffee)) {
	                FinalResultCoffee = hotDrinks.getCoffeePrice() * resultCoffee[0];
	            } else if ("Large".equals(selectedValueCoffee)) {
	                FinalResultCoffee = 3.75 * resultCoffee[0];
	            } 

	        }

	        if (resultCoffee[0] > 1) {
	        	resultCoffee[0]--;
	        	CoffeeAdd.setText("Add: " + resultCoffee[0]);
	        } else {
	        	CoffeeAdd.setText("Add");
	        }
	    }
	});
			
			JButton LatteAdd = new JButton("Add");
			LatteAdd.setForeground(Color.WHITE);
			LatteAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
			LatteAdd.setBackground(new Color(204, 0, 0));
			LatteAdd.setBounds(409, 436, 97, 28);
			
			JButton LatteIncrease = new JButton("");
			LatteIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
			LatteIncrease.setForeground(Color.WHITE);
			LatteIncrease.setBackground(Color.WHITE);
			LatteIncrease.setBounds(510, 436, 28, 28);
			
			JButton LatteReduce = new JButton("");
			LatteReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
			LatteReduce.setForeground(Color.WHITE);
			LatteReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
			LatteReduce.setBackground(Color.WHITE);
			LatteReduce.setBounds(376, 436, 28, 28);
			
			final int resultLatte[] = {0};
			
			LatteIncrease.addActionListener(new ActionListener() {

										@Override
										public void actionPerformed(ActionEvent e) {
										resultLatte[0]++;
										LatteAdd.setText("Add: " +  resultLatte[0]);

										}
																			
									});
																		
			LatteAdd.addActionListener(new ActionListener() {
			    @Override
			    public void actionPerformed(ActionEvent e) {
			        String selectedValueLatte = (String) LatteSize.getSelectedItem();
			        double FinalResultLatte = 0;
			        
			        boolean itemAlreadyAdded = false;
			        

			       
			        for (int i = 0; i < textArea.getLineCount(); i++) {
			            try {
			                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
			                if (line.contains("Latte") && line.contains(selectedValueLatte)) {
			                    itemAlreadyAdded = true;
			                    break;
			                }
			            } catch (BadLocationException ex) {
			                ex.printStackTrace();
			            }
			        }
			        
			        
			        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
			            textArea.append("\n\n");
			        }
			        
			        if (!itemAlreadyAdded) {
			        if ("Small".equals(selectedValueLatte)) {
			            FinalResultLatte = hotDrinks.getLattePrice() * resultLatte[0];
			            FinalResultLatte = Math.round(FinalResultLatte * 100.0) / 100.0;
			            String formattedPrice = String.format("%.2f", FinalResultLatte);
			            textArea.append("      "+ "Latte"+"                                                     "                                          
			                    + selectedValueLatte 
			                    + "                                                       "  + resultLatte[0] + "                                                  "
			                    + formattedPrice + " $\n");
			        } else if ("Large".equals(selectedValueLatte)) {
			            FinalResultLatte = 3.75 * resultLatte[0];
			            FinalResultLatte = Math.round(FinalResultLatte * 100.0) / 100.0;
			            String formattedPrice = String.format("%.2f", FinalResultLatte);
			            textArea.append("      "+ "Latte"+"                                                     "                                          
			                    + selectedValueLatte 
			                    + "                                                       "  + resultLatte[0] + "                                                  "
			                    + formattedPrice + " $\n");
			        }  
			        


			        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultLatte)
		                 .setScale(2, RoundingMode.HALF_UP);
			        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
		         
			        }
			    }
			    
			});


			LatteReduce.addActionListener(new ActionListener() {
			    @Override
			    public void actionPerformed(ActionEvent e) {
			    	
			    	String selectedValueLatte = (String) LatteSize.getSelectedItem();
			    	double FinalResultLatte = 0;
			    	
			    	if (resultLatte[0] > 1) {
			    		if ("Small".equals(selectedValueLatte)) {
			                FinalResultLatte = hotDrinks.getLattePrice() * resultLatte[0];
			            } else if ("Large".equals(selectedValueLatte)) {
			                FinalResultLatte = 3.75 * resultLatte[0];
			            } 

			        }

			        if (resultLatte[0] > 1) {
			        	resultLatte[0]--;
			        	LatteAdd.setText("Add: " + resultLatte[0]);
			        } else {
			        	LatteAdd.setText("Add");
			        }
			    }
			});			
			
			JButton CappucinoAdd = new JButton("Add");
			CappucinoAdd.setForeground(Color.WHITE);
			CappucinoAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
			CappucinoAdd.setBackground(new Color(204, 0, 0));
			CappucinoAdd.setBounds(590, 436, 97, 28);
			
			JButton CappucinoIncrease = new JButton("");
			CappucinoIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
			CappucinoIncrease.setForeground(Color.WHITE);
			CappucinoIncrease.setBackground(Color.WHITE);
			CappucinoIncrease.setBounds(691, 436, 28, 28);
			
			JButton CappucinoReduce = new JButton("");
			CappucinoReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
			CappucinoReduce.setForeground(Color.WHITE);
			CappucinoReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
			CappucinoReduce.setBackground(Color.WHITE);
			CappucinoReduce.setBounds(557, 436, 28, 28);
			
final int resultCappucino[] = {0};
			
CappucinoIncrease.addActionListener(new ActionListener() {

										@Override
										public void actionPerformed(ActionEvent e) {
										resultCappucino[0]++;
										CappucinoAdd.setText("Add: " +  resultCappucino[0]);

										}
																			
									});
																		
CappucinoAdd.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String selectedValueCappucino = (String) CappucinoSize.getSelectedItem();
        double FinalResultCappucino = 0;
        
        boolean itemAlreadyAdded = false;
        

       
        for (int i = 0; i < textArea.getLineCount(); i++) {
            try {
                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
                if (line.contains("Cappuccino") && line.contains(selectedValueCappucino)) {
                    itemAlreadyAdded = true;
                    break;
                }
            } catch (BadLocationException ex) {
                ex.printStackTrace();
            }
        }
        
        
        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
            textArea.append("\n\n");
        }
        
        if (!itemAlreadyAdded) {
        if ("Small".equals(selectedValueCappucino)) {
            FinalResultCappucino = hotDrinks.getCappuccinoPrice() * resultCappucino[0];
            FinalResultCappucino = Math.round(FinalResultCappucino * 100.0) / 100.0;
            String formattedPrice = String.format("%.2f", FinalResultCappucino);
            textArea.append("      "+ "Cappuccino"+"                                        "                                          
                    + selectedValueCappucino 
                    + "                                                       "  + resultCappucino[0] + "                                                  "
                    + formattedPrice + " $\n");
        } else if ("Large".equals(selectedValueCappucino)) {
            FinalResultCappucino = 3.75 * resultCappucino[0];
            FinalResultCappucino = Math.round(FinalResultCappucino * 100.0) / 100.0;
            String formattedPrice = String.format("%.2f", FinalResultCappucino);
            textArea.append("      "+ "Cappuccino"+"                                        "                                          
                    + selectedValueCappucino 
                    + "                                                       "  + resultCappucino[0] + "                                                  "
                    + formattedPrice + " $\n");
        }  
        


        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultCappucino)
             .setScale(2, RoundingMode.HALF_UP);
        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
     
        }
    }
    
});


CappucinoReduce.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
    	
    	String selectedValueCappucino = (String) CappucinoSize.getSelectedItem();
    	double FinalResultCappucino = 0;
    	
    	if (resultCappucino[0] > 1) {
    		if ("Small".equals(selectedValueCappucino)) {
                FinalResultCappucino = hotDrinks.getCappuccinoPrice() * resultCappucino[0];
            } else if ("Large".equals(selectedValueCappucino)) {
                FinalResultCappucino = 3.75 * resultCappucino[0];
            } 

        }

        if (resultCappucino[0] > 1) {
        	resultCappucino[0]--;
        	CappucinoAdd.setText("Add: " + resultCappucino[0]);
        } else {
        	CappucinoAdd.setText("Add");
        }
    }
});				
			
			JButton HotChocolateAdd = new JButton("Add");
			HotChocolateAdd.setForeground(Color.WHITE);
			HotChocolateAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
			HotChocolateAdd.setBackground(new Color(204, 0, 0));
			HotChocolateAdd.setBounds(771, 436, 97, 28);
			
			JButton HotChocolateIncrease = new JButton("");
			HotChocolateIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
			HotChocolateIncrease.setForeground(Color.WHITE);
			HotChocolateIncrease.setBackground(Color.WHITE);
			HotChocolateIncrease.setBounds(872, 436, 28, 28);
			
			JButton HotChocolateReduce = new JButton("");
			HotChocolateReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
			HotChocolateReduce.setForeground(Color.WHITE);
			HotChocolateReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
			HotChocolateReduce.setBackground(Color.WHITE);
			HotChocolateReduce.setBounds(738, 436, 28, 28);
			
			final int resultHotChocolate[] = {0};
			
			HotChocolateIncrease.addActionListener(new ActionListener() {

													@Override
													public void actionPerformed(ActionEvent e) {
													resultHotChocolate[0]++;
													HotChocolateAdd.setText("Add: " +  resultHotChocolate[0]);

													}
																						
												});
																					
			HotChocolateAdd.addActionListener(new ActionListener() {
			    @Override
			    public void actionPerformed(ActionEvent e) {
			        String selectedValueHotChocolate = (String) HotChocolateSize.getSelectedItem();
			        double FinalResultHotChocolate = 0;
			        
			        boolean itemAlreadyAdded = false;
			        

			       
			        for (int i = 0; i < textArea.getLineCount(); i++) {
			            try {
			                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
			                if (line.contains("Hot Chocolate") && line.contains(selectedValueHotChocolate)) {
			                    itemAlreadyAdded = true;
			                    break;
			                }
			            } catch (BadLocationException ex) {
			                ex.printStackTrace();
			            }
			        }
			        
			        
			        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
			            textArea.append("\n\n");
			        }
			        
			        if (!itemAlreadyAdded) {
			        if ("Small".equals(selectedValueHotChocolate)) {
			            FinalResultHotChocolate = hotDrinks.getHotChocolatePrice() * resultHotChocolate[0];
			            FinalResultHotChocolate = Math.round(FinalResultHotChocolate * 100.0) / 100.0;
			            String formattedPrice = String.format("%.2f", FinalResultHotChocolate);
			            textArea.append("      "+ "Hot Chocolate"+"                                    "                                          
			                    + selectedValueHotChocolate 
			                    + "                                                       "  + resultHotChocolate[0] + "                                                  "
			                    + formattedPrice + " $\n");
			        } else if ("Large".equals(selectedValueHotChocolate)) {
			            FinalResultHotChocolate = 4.20 * resultHotChocolate[0];
			            FinalResultHotChocolate = Math.round(FinalResultHotChocolate * 100.0) / 100.0;
			            String formattedPrice = String.format("%.2f", FinalResultHotChocolate);
			            textArea.append("      "+ "Hot Chocolate"+"                                    "                                          
			                    + selectedValueHotChocolate 
			                    + "                                                       "  + resultHotChocolate[0] + "                                                  "
			                    + formattedPrice + " $\n");
			        }  
			        


			        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultHotChocolate)
			             .setScale(2, RoundingMode.HALF_UP);
			        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
			     
			        }
			    }
			    
			});


			HotChocolateReduce.addActionListener(new ActionListener() {
			    @Override
			    public void actionPerformed(ActionEvent e) {
			    	
			    	String selectedValueHotChocolate = (String) HotChocolateSize.getSelectedItem();
			    	double FinalResultHotChocolate = 0;
			    	
			    	if (resultHotChocolate[0] > 1) {
			    		if ("Small".equals(selectedValueHotChocolate)) {
			                FinalResultHotChocolate = hotDrinks.getHotChocolatePrice() * resultHotChocolate[0];
			            } else if ("Large".equals(selectedValueHotChocolate)) {
			                FinalResultHotChocolate = 4.20 * resultHotChocolate[0];
			            } 

			        }

			        if (resultHotChocolate[0] > 1) {
			        	resultHotChocolate[0]--;
			        	HotChocolateAdd.setText("Add: " + resultHotChocolate[0]);
			        } else {
			        	HotChocolateAdd.setText("Add");
			        }
			    }
			});			
			
			JButton EspressoAdd = new JButton("Add");
			EspressoAdd.setForeground(Color.WHITE);
			EspressoAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
			EspressoAdd.setBackground(new Color(204, 0, 0));
			EspressoAdd.setBounds(47, 726, 97, 28);
			
			JButton EspressoIncrease = new JButton("");
			EspressoIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
			EspressoIncrease.setForeground(Color.WHITE);
			EspressoIncrease.setBackground(Color.WHITE);
			EspressoIncrease.setBounds(148, 726, 28, 28);
			
			JButton EspressoReduce = new JButton("");
			EspressoReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
			EspressoReduce.setForeground(Color.WHITE);
			EspressoReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
			EspressoReduce.setBackground(Color.WHITE);
			EspressoReduce.setBounds(14, 726, 28, 28);
		
final int resultEspresso[] = {0};
			
EspressoIncrease.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
		resultEspresso[0]++;
		EspressoAdd.setText("Add: " +  resultEspresso[0]);

		}
																						
	});
																					
EspressoAdd.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
       
    	double FinalResultEspresso = 0;
        
        boolean itemAlreadyAdded = false;
        

       
        for (int i = 0; i < textArea.getLineCount(); i++) {
            try {
                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
                if (line.contains("Espresso")) {
                    itemAlreadyAdded = true;
                    break;
                }
            } catch (BadLocationException ex) {
                ex.printStackTrace();
            }
        }
        
        if(!itemAlreadyAdded) {
        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
            textArea.append("\n\n");
        }
        
        
            FinalResultEspresso = hotDrinks.getEspressoPrice() * resultEspresso[0];
            FinalResultEspresso = Math.round(FinalResultEspresso * 100.0) / 100.0;
            String formattedPrice = String.format("%.2f", FinalResultEspresso);
            textArea.append("      "+ "Espresso"+"                                             "                                          
                    + "                                                                 "  + resultEspresso[0] 
                    + "                                                  "
                    + formattedPrice + " $\n");
       
        
        
        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultEspresso)
                .setScale(2, RoundingMode.HALF_UP);
        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
        
        }
    }
    
});

EspressoReduce.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
    	
    	double FinalResultEspresso = 0;
    	
                FinalResultEspresso = hotDrinks.getEspressoPrice() * resultEspresso[0];
            
        if (resultEspresso[0] > 1) {
        	resultEspresso[0]--;
        	EspressoAdd.setText("Add: " + resultEspresso[0]);
        } else {
        	EspressoAdd.setText("Add");
        }
    }
});
			
		//Ice Creams
	//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		JButton McSundaeAdd = new JButton("Add");
		McSundaeAdd.setForeground(new Color(255, 255, 255));
		McSundaeAdd.setBackground(new Color(204, 0, 0));
		McSundaeAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		McSundaeAdd.setBounds(47, 436, 97, 28);
		
		JButton McSundaeIncrease = new JButton("");
		McSundaeIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
		McSundaeIncrease.setForeground(new Color(255, 255, 255));
		McSundaeIncrease.setBackground(new Color(255, 255, 255));
		McSundaeIncrease.setBounds(148, 436, 28, 28);
		
		JButton McSundaeReduce = new JButton("");
		McSundaeReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
		McSundaeReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		McSundaeReduce.setForeground(new Color(255, 255, 255));
		McSundaeReduce.setBackground(new Color(255, 255, 255));
		McSundaeReduce.setBounds(14, 436, 28, 28);
		
		final int resultMcSundae[] = {0};
		
		McSundaeIncrease.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
						resultMcSundae[0]++;
						McSundaeAdd.setText("Add: " +  resultMcSundae[0]);

						}
															
					});
														
		McSundaeAdd.addActionListener(new ActionListener() {
 		    @Override
 		    public void actionPerformed(ActionEvent e) {
 		        String selectedValueMcSundae = (String) McSundaeType.getSelectedItem();
 		        double FinalResultMcSundae = 0;
 		        
 		        boolean itemAlreadyAdded = false;
 		        

 		       
 		        for (int i = 0; i < textArea.getLineCount(); i++) {
 		            try {
 		                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
 		                if (line.contains("McSundae") && line.contains(selectedValueMcSundae)) {
 		                    itemAlreadyAdded = true;
 		                    break;
 		                }
 		            } catch (BadLocationException ex) {
 		                ex.printStackTrace();
 		            }
 		        }
 		        
 		        
 		        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
 		            textArea.append("\n\n");
 		        }
 		        
 		        if (!itemAlreadyAdded) {
 		        if ("Chocolate".equals(selectedValueMcSundae)) {
 		            FinalResultMcSundae = IceCreams.getMcSundaePrice() * resultMcSundae[0];
 		            FinalResultMcSundae = Math.round(FinalResultMcSundae * 100.0) / 100.0;
 		            String formattedPrice = String.format("%.2f", FinalResultMcSundae);
 		            textArea.append("      "+ "McSundae Chocolate"+"                       "                                          
 		                    + selectedValueMcSundae 
 		                    + "                                               "  + resultMcSundae[0] + "                                                 "
 		                    + formattedPrice + " $\n");
 		        } else if ("Caramel".equals(selectedValueMcSundae)) {
 		        	FinalResultMcSundae = IceCreams.getMcSundaePrice() * resultMcSundae[0];
 		            FinalResultMcSundae = Math.round(FinalResultMcSundae * 100.0) / 100.0;
 		            String formattedPrice = String.format("%.2f", FinalResultMcSundae);
 		            textArea.append("      "+ "McSundae Caramel"+"                          "                                          
 		                    + selectedValueMcSundae 
 		                    + "                                                 "  + resultMcSundae[0] + "                                                 "
 		                    + formattedPrice + " $\n");
 		        } else if ("Strawberry".equals(selectedValueMcSundae)) {
 		        	FinalResultMcSundae = IceCreams.getMcSundaePrice() * resultMcSundae[0];
 		           FinalResultMcSundae = Math.round(FinalResultMcSundae * 100.0) / 100.0;
 		           String formattedPrice = String.format("%.2f", FinalResultMcSundae);
 		           textArea.append("      "+ "McSundae Strawberry"+"                      "                                          
 		                  + selectedValueMcSundae 
 		                  + "                                              "  + resultMcSundae[0] + "                                                 "
 		                  + formattedPrice + " $\n");
 		        } else if ("Cherry".equals(selectedValueMcSundae)) {
 		        	FinalResultMcSundae = IceCreams.getMcSundaePrice() * resultMcSundae[0];
 		            FinalResultMcSundae = Math.round(FinalResultMcSundae * 100.0) / 100.0;
 		            String formattedPrice = String.format("%.2f", FinalResultMcSundae);
 		            textArea.append("      "+ "McSundae Cherry"+"                              "                                          
 		                    + selectedValueMcSundae 
 		                    + "                                                     "  + resultMcSundae[0] + "                                                 "
 		                    + formattedPrice + " $\n");
 		        } 
 		        
 		        
 		        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultMcSundae)
                         .setScale(2, RoundingMode.HALF_UP);
 		        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
                 
 		        }
 		    }
 		    
 		});


		McSundaeReduce.addActionListener(new ActionListener() {
 		    @Override
 		    public void actionPerformed(ActionEvent e) {
 		    	
 		    	String selectedValueMcSundae = (String) McSundaeType.getSelectedItem();
 		    	double FinalResultMcSundae = 0;
 		    	
 		    	if (resultMcSundae[0] > 1) {
 		    		if ("Chocolate".equals(selectedValueMcSundae)) {
 		    			FinalResultMcSundae = IceCreams.getMcSundaePrice() * resultMcSundae[0];
 		            } else if ("Caramel".equals(selectedValueMcSundae)) {
 		            	FinalResultMcSundae = IceCreams.getMcSundaePrice() * resultMcSundae[0];
 		            } else if ("Strawberry".equals(selectedValueMcSundae)) {
 		            	FinalResultMcSundae = IceCreams.getMcSundaePrice() * resultMcSundae[0];
 		            } else if ("Cherry".equals(selectedValueMcSundae)) {
 		            	FinalResultMcSundae = IceCreams.getMcSundaePrice() * resultMcSundae[0];
 		            } 

 		        }

 		        if (resultMcSundae[0] > 1) {
 		        	resultMcSundae[0]--;
 		        	McSundaeAdd.setText("Add: " + resultMcSundae[0]);
 		        } else {
 		        	McSundaeAdd.setText("Add");
 		        }
 		    }
 		});		
		
		JButton McFlurryAdd = new JButton("Add");
		McFlurryAdd.setForeground(Color.WHITE);
		McFlurryAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		McFlurryAdd.setBackground(new Color(204, 0, 0));
		McFlurryAdd.setBounds(228, 436, 97, 28);
		
		JButton McFlurryIncrease = new JButton("");
		McFlurryIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
		McFlurryIncrease.setForeground(Color.WHITE);
		McFlurryIncrease.setBackground(Color.WHITE);
		McFlurryIncrease.setBounds(329, 436, 28, 28);
		
		JButton McFlurryReduce = new JButton("");
		McFlurryReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
		McFlurryReduce.setForeground(Color.WHITE);
		McFlurryReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		McFlurryReduce.setBackground(Color.WHITE);
		McFlurryReduce.setBounds(195, 436, 28, 28);
		
final int resultMcFlurry[] = {0};
		
McFlurryIncrease.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
						resultMcFlurry[0]++;
						McFlurryAdd.setText("Add: " +  resultMcFlurry[0]);

						}
															
					});
														
McFlurryAdd.addActionListener(new ActionListener() {
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        String selectedValueMcFlurry = (String) McFlurryType.getSelectedItem();
	        double FinalResultMcFlurry = 0;
	        
	        boolean itemAlreadyAdded = false;
	        

	       
	        for (int i = 0; i < textArea.getLineCount(); i++) {
	            try {
	                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
	                if (line.contains("McFlurry") && line.contains(selectedValueMcFlurry)) {
	                    itemAlreadyAdded = true;
	                    break;
	                }
	            } catch (BadLocationException ex) {
	                ex.printStackTrace();
	            }
	        }
	        
	        
	        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
	            textArea.append("\n\n");
	        }
	        
	        if (!itemAlreadyAdded) {
	        if ("Kit-Kat".equals(selectedValueMcFlurry)) {
	            FinalResultMcFlurry = IceCreams.getMcFlurryPrice() * resultMcFlurry[0];
	            FinalResultMcFlurry = Math.round(FinalResultMcFlurry * 100.0) / 100.0;
	            String formattedPrice = String.format("%.2f", FinalResultMcFlurry);
	            textArea.append("      "+ "McFlurry Kit-Kat"+"                                  "                                          
	                    + selectedValueMcFlurry 
	                    + "                                                      "  + resultMcFlurry[0] + "                                                 "
	                    + formattedPrice + " $\n");
	        } else if ("Caramel Kit-Kat".equals(selectedValueMcFlurry)) {
	        	FinalResultMcFlurry = IceCreams.getMcFlurryPrice() * resultMcFlurry[0];
	            FinalResultMcFlurry = Math.round(FinalResultMcFlurry * 100.0) / 100.0;
	            String formattedPrice = String.format("%.2f", FinalResultMcFlurry);
	            textArea.append("      "+ "McFlurry Caramel"+"                              "                                          
	                    + selectedValueMcFlurry 
	                    + "                                     "  + resultMcFlurry[0] + "                                                 "
	                    + formattedPrice + " $\n");
	        } else if ("Strawberry Kit-Kat".equals(selectedValueMcFlurry)) {
	        	FinalResultMcFlurry = IceCreams.getMcFlurryPrice() * resultMcFlurry[0];
	           FinalResultMcFlurry = Math.round(FinalResultMcFlurry * 100.0) / 100.0;
	           String formattedPrice = String.format("%.2f", FinalResultMcFlurry);
	           textArea.append("      "+ "McFlurry Strawberry"+"                           "                                          
	                  + selectedValueMcFlurry 
	                  + "                                 "  + resultMcFlurry[0] + "                                                 "
	                  + formattedPrice + " $\n");
	        } else if ("Cherry Kit-Kat".equals(selectedValueMcFlurry)) {
	        	FinalResultMcFlurry = IceCreams.getMcFlurryPrice() * resultMcFlurry[0];
	            FinalResultMcFlurry = Math.round(FinalResultMcFlurry * 100.0) / 100.0;
	            String formattedPrice = String.format("%.2f", FinalResultMcFlurry);
	            textArea.append("      "+ "McFlurry Cherry"+"                                  "                                          
	                    + selectedValueMcFlurry 
	                    + "                                         "  + resultMcFlurry[0] + "                                                 "
	                    + formattedPrice + " $\n");
	        } 
	        
	        
	        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultMcFlurry)
                 .setScale(2, RoundingMode.HALF_UP);
	        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
         
	        }
	    }
	    
	});


McFlurryReduce.addActionListener(new ActionListener() {
	    @Override
	    public void actionPerformed(ActionEvent e) {
	    	
	    	String selectedValueMcFlurry = (String) McFlurryType.getSelectedItem();
	    	double FinalResultMcFlurry = 0;
	    	
	    	if (resultMcFlurry[0] > 1) {
	    		if ("Kit-Kat".equals(selectedValueMcFlurry)) {
	    			FinalResultMcFlurry = IceCreams.getMcFlurryPrice() * resultMcFlurry[0];
	            } else if ("Caramel Kit-Kat".equals(selectedValueMcFlurry)) {
	            	FinalResultMcFlurry = IceCreams.getMcFlurryPrice() * resultMcFlurry[0];
	            } else if ("Strawberry Kit-Kat".equals(selectedValueMcFlurry)) {
	            	FinalResultMcFlurry = IceCreams.getMcFlurryPrice() * resultMcFlurry[0];
	            } else if ("Cherry Kit-Kat".equals(selectedValueMcFlurry)) {
	            	FinalResultMcFlurry = IceCreams.getMcFlurryPrice() * resultMcFlurry[0];
	            } 

	        }

	        if (resultMcFlurry[0] > 1) {
	        	resultMcFlurry[0]--;
	        	McFlurryAdd.setText("Add: " + resultMcFlurry[0]);
	        } else {
	        	McFlurryAdd.setText("Add");
	        }
	    }
	});			
		
		JButton MilkShakeChocolateAdd = new JButton("Add");
		MilkShakeChocolateAdd.setForeground(Color.WHITE);
		MilkShakeChocolateAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		MilkShakeChocolateAdd.setBackground(new Color(204, 0, 0));
		MilkShakeChocolateAdd.setBounds(409, 436, 97, 28);
		
		JButton MilkShakeChocolateIncrease = new JButton("");
		MilkShakeChocolateIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
		MilkShakeChocolateIncrease.setForeground(Color.WHITE);
		MilkShakeChocolateIncrease.setBackground(Color.WHITE);
		MilkShakeChocolateIncrease.setBounds(510, 436, 28, 28);
		
		JButton MilkShakeChocolateReduce = new JButton("");
		MilkShakeChocolateReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
		MilkShakeChocolateReduce.setForeground(Color.WHITE);
		MilkShakeChocolateReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		MilkShakeChocolateReduce.setBackground(Color.WHITE);
		MilkShakeChocolateReduce.setBounds(376, 436, 28, 28);
		
		final int resultMilkShakeChocolate[] = {0};
		
		MilkShakeChocolateIncrease.addActionListener(new ActionListener() {

								@Override
								public void actionPerformed(ActionEvent e) {
								resultMilkShakeChocolate[0]++;
								MilkShakeChocolateAdd.setText("Add: " +  resultMilkShakeChocolate[0]);

								}
																	
							});
																
		MilkShakeChocolateAdd.addActionListener(new ActionListener() {
 		    @Override
 		    public void actionPerformed(ActionEvent e) {
 		        String selectedValueMilkShakeChocolate = (String) ChocolateShakeSize.getSelectedItem();
 		        double FinalResultMilkShakeChocolate = 0;
 		        
 		        boolean itemAlreadyAdded = false;
 		        

 		       
 		        for (int i = 0; i < textArea.getLineCount(); i++) {
 		            try {
 		                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
 		                if (line.contains("Milk Shake Chocolate") && line.contains(selectedValueMilkShakeChocolate)) {
 		                    itemAlreadyAdded = true;
 		                    break;
 		                }
 		            } catch (BadLocationException ex) {
 		                ex.printStackTrace();
 		            }
 		        }
 		        
 		        
 		        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
 		            textArea.append("\n\n");
 		        }
 		        
 		        if (!itemAlreadyAdded) {
 		        if ("Small".equals(selectedValueMilkShakeChocolate)) {
 		            FinalResultMilkShakeChocolate = IceCreams.getMilkShakePrice() * resultMilkShakeChocolate[0];
 		            FinalResultMilkShakeChocolate = Math.round(FinalResultMilkShakeChocolate * 100.0) / 100.0;
 		            String formattedPrice = String.format("%.2f", FinalResultMilkShakeChocolate);
 		            textArea.append("      "+ "Milk Shake Chocolate"+"                       "                                          
 		                    + selectedValueMilkShakeChocolate 
 		                    + "                                                       "  + resultMilkShakeChocolate[0] + "                                                 "
 		                    + formattedPrice + " $\n");
 		        } else if ("Medium".equals(selectedValueMilkShakeChocolate)) {
 		            FinalResultMilkShakeChocolate = 2.90 * resultMilkShakeChocolate[0];
 		            FinalResultMilkShakeChocolate = Math.round(FinalResultMilkShakeChocolate * 100.0) / 100.0;
 		            String formattedPrice = String.format("%.2f", FinalResultMilkShakeChocolate);
 		            textArea.append("      "+ "Milk Shake Chocolate"+"                       "                                          
 		                    + selectedValueMilkShakeChocolate 
 		                    + "                                                   "  + resultMilkShakeChocolate[0] + "                                                 "
 		                    + formattedPrice + " $\n");
 		        } else if ("Large".equals(selectedValueMilkShakeChocolate)) {
 		           FinalResultMilkShakeChocolate = 3.70 * resultMilkShakeChocolate[0];
 		           FinalResultMilkShakeChocolate = Math.round(FinalResultMilkShakeChocolate * 100.0) / 100.0;
 		           String formattedPrice = String.format("%.2f", FinalResultMilkShakeChocolate);
 		           textArea.append("      "+ "Milk Shake Chocolate"+"                       "                                          
 		                  + selectedValueMilkShakeChocolate 
 		                  + "                                                       "  + resultMilkShakeChocolate[0] + "                                                 "
 		                  + formattedPrice + " $\n");
 		        } 
 		        
 		        
 		        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultMilkShakeChocolate)
                         .setScale(2, RoundingMode.HALF_UP);
 		        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
                 
 		        }
 		    }
 		    
 		});


		MilkShakeChocolateReduce.addActionListener(new ActionListener() {
 		    @Override
 		    public void actionPerformed(ActionEvent e) {
 		    	
 		    	String selectedValueMilkShakeChocolate = (String) ChocolateShakeSize.getSelectedItem();
 		    	double FinalResultMilkShakeChocolate = 0;
 		    	
 		    	if (resultMilkShakeChocolate[0] > 1) {
 		    		if ("Small".equals(selectedValueMilkShakeChocolate)) {
 		                FinalResultMilkShakeChocolate = IceCreams.getMilkShakePrice() * resultMilkShakeChocolate[0];
 		            } else if ("Medium".equals(selectedValueMilkShakeChocolate)) {
 		                FinalResultMilkShakeChocolate = 2.90 * resultMilkShakeChocolate[0];
 		            } else if ("Large".equals(selectedValueMilkShakeChocolate)) {
 		                FinalResultMilkShakeChocolate = 3.70 * resultMilkShakeChocolate[0];
 		            } 

 		        }

 		        if (resultMilkShakeChocolate[0] > 1) {
 		        	resultMilkShakeChocolate[0]--;
 		        	MilkShakeChocolateAdd.setText("Add: " + resultMilkShakeChocolate[0]);
 		        } else {
 		        	MilkShakeChocolateAdd.setText("Add");
 		        }
 		    }
 		});		
		
		JButton MilkShakeVanillaAdd = new JButton("Add");
		MilkShakeVanillaAdd.setForeground(Color.WHITE);
		MilkShakeVanillaAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		MilkShakeVanillaAdd.setBackground(new Color(204, 0, 0));
		MilkShakeVanillaAdd.setBounds(590, 436, 97, 28);
		
		JButton MilkShakeVanillaIncrease = new JButton("");
		MilkShakeVanillaIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
		MilkShakeVanillaIncrease.setForeground(Color.WHITE);
		MilkShakeVanillaIncrease.setBackground(Color.WHITE);
		MilkShakeVanillaIncrease.setBounds(691, 436, 28, 28);
		
		JButton MilkShakeVanillaReduce = new JButton("");
		MilkShakeVanillaReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
		MilkShakeVanillaReduce.setForeground(Color.WHITE);
		MilkShakeVanillaReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		MilkShakeVanillaReduce.setBackground(Color.WHITE);
		MilkShakeVanillaReduce.setBounds(557, 436, 28, 28);
		
		final int resultMilkShakeVanilla[] = {0};
		
		MilkShakeVanillaIncrease.addActionListener(new ActionListener() {

								@Override
								public void actionPerformed(ActionEvent e) {
								resultMilkShakeVanilla[0]++;
								MilkShakeVanillaAdd.setText("Add: " +  resultMilkShakeVanilla[0]);

								}
																	
							});
																
		MilkShakeVanillaAdd.addActionListener(new ActionListener() {
 		    @Override
 		    public void actionPerformed(ActionEvent e) {
 		        String selectedValueMilkShakeVanilla = (String) VanillaShakeSize.getSelectedItem();
 		        double FinalResultMilkShakeVanilla = 0;
 		        
 		        boolean itemAlreadyAdded = false;
 		        

 		       
 		        for (int i = 0; i < textArea.getLineCount(); i++) {
 		            try {
 		                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
 		                if (line.contains("Milk Shake Vanilla") && line.contains(selectedValueMilkShakeVanilla)) {
 		                    itemAlreadyAdded = true;
 		                    break;
 		                }
 		            } catch (BadLocationException ex) {
 		                ex.printStackTrace();
 		            }
 		        }
 		        
 		        
 		        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
 		            textArea.append("\n\n");
 		        }
 		        
 		        if (!itemAlreadyAdded) {
 		        if ("Small".equals(selectedValueMilkShakeVanilla)) {
 		            FinalResultMilkShakeVanilla = IceCreams.getMilkShakePrice() * resultMilkShakeVanilla[0];
 		            FinalResultMilkShakeVanilla = Math.round(FinalResultMilkShakeVanilla * 100.0) / 100.0;
 		            String formattedPrice = String.format("%.2f", FinalResultMilkShakeVanilla);
 		            textArea.append("      "+ "Milk Shake Vanilla"+"                             "                                          
 		                    + selectedValueMilkShakeVanilla 
 		                    + "                                                       "  + resultMilkShakeVanilla[0] + "                                                 "
 		                    + formattedPrice + " $\n");
 		        } else if ("Medium".equals(selectedValueMilkShakeVanilla)) {
 		            FinalResultMilkShakeVanilla = 2.90 * resultMilkShakeVanilla[0];
 		            FinalResultMilkShakeVanilla = Math.round(FinalResultMilkShakeVanilla * 100.0) / 100.0;
 		            String formattedPrice = String.format("%.2f", FinalResultMilkShakeVanilla);
 		            textArea.append("      "+ "Milk Shake Vanilla"+"                             "                                          
 		                    + selectedValueMilkShakeVanilla 
 		                    + "                                                   "  + resultMilkShakeVanilla[0] + "                                                 "
 		                    + formattedPrice + " $\n");
 		        } else if ("Large".equals(selectedValueMilkShakeVanilla)) {
 		           FinalResultMilkShakeVanilla = 3.70 * resultMilkShakeVanilla[0];
 		           FinalResultMilkShakeVanilla = Math.round(FinalResultMilkShakeVanilla * 100.0) / 100.0;
 		           String formattedPrice = String.format("%.2f", FinalResultMilkShakeVanilla);
 		           textArea.append("      "+ "Milk Shake Vanilla"+"                             "                                          
 		                  + selectedValueMilkShakeVanilla 
 		                  + "                                                       "  + resultMilkShakeVanilla[0] + "                                                 "
 		                  + formattedPrice + " $\n");
 		        } 
 		        
 		        
 		        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultMilkShakeVanilla)
                         .setScale(2, RoundingMode.HALF_UP);
 		        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
                 
 		        }
 		    }
 		    
 		});


		MilkShakeVanillaReduce.addActionListener(new ActionListener() {
 		    @Override
 		    public void actionPerformed(ActionEvent e) {
 		    	
 		    	String selectedValueMilkShakeVanilla = (String) VanillaShakeSize.getSelectedItem();
 		    	double FinalResultMilkShakeVanilla = 0;
 		    	
 		    	if (resultMilkShakeVanilla[0] > 1) {
 		    		if ("Small".equals(selectedValueMilkShakeVanilla)) {
 		                FinalResultMilkShakeVanilla = IceCreams.getMilkShakePrice() * resultMilkShakeVanilla[0];
 		            } else if ("Medium".equals(selectedValueMilkShakeVanilla)) {
 		                FinalResultMilkShakeVanilla = 2.90 * resultMilkShakeVanilla[0];
 		            } else if ("Large".equals(selectedValueMilkShakeVanilla)) {
 		                FinalResultMilkShakeVanilla = 3.70 * resultMilkShakeVanilla[0];
 		            } 

 		        }

 		        if (resultMilkShakeVanilla[0] > 1) {
 		        	resultMilkShakeVanilla[0]--;
 		        	MilkShakeVanillaAdd.setText("Add: " + resultMilkShakeVanilla[0]);
 		        } else {
 		        	MilkShakeVanillaAdd.setText("Add");
 		        }
 		    }
 		});		
		
		JButton MilkShakeStrawberryAdd = new JButton("Add");
		MilkShakeStrawberryAdd.setForeground(Color.WHITE);
		MilkShakeStrawberryAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		MilkShakeStrawberryAdd.setBackground(new Color(204, 0, 0));
		MilkShakeStrawberryAdd.setBounds(771, 436, 97, 28);
		
		JButton MilkShakeStrawberryIncrease = new JButton("");
		MilkShakeStrawberryIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
		MilkShakeStrawberryIncrease.setForeground(Color.WHITE);
		MilkShakeStrawberryIncrease.setBackground(Color.WHITE);
		MilkShakeStrawberryIncrease.setBounds(872, 436, 28, 28);
		
		JButton MilkShakeStrawberryReduce = new JButton("");
		MilkShakeStrawberryReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
		MilkShakeStrawberryReduce.setForeground(Color.WHITE);
		MilkShakeStrawberryReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		MilkShakeStrawberryReduce.setBackground(Color.WHITE);
		MilkShakeStrawberryReduce.setBounds(738, 436, 28, 28);
		
		final int resultMilkShakeStrawberry[] = {0};
		
		MilkShakeStrawberryIncrease.addActionListener(new ActionListener() {

								@Override
								public void actionPerformed(ActionEvent e) {
								resultMilkShakeStrawberry[0]++;
								MilkShakeStrawberryAdd.setText("Add: " +  resultMilkShakeStrawberry[0]);

								}
																	
							});
																
		MilkShakeStrawberryAdd.addActionListener(new ActionListener() {
 		    @Override
 		    public void actionPerformed(ActionEvent e) {
 		        String selectedValueMilkShakeStrawberry = (String) StrawberryShakeSize.getSelectedItem();
 		        double FinalResultMilkShakeStrawberry = 0;
 		        
 		        boolean itemAlreadyAdded = false;
 		        

 		       
 		        for (int i = 0; i < textArea.getLineCount(); i++) {
 		            try {
 		                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
 		                if (line.contains("Milk Shake Strawberry") && line.contains(selectedValueMilkShakeStrawberry)) {
 		                    itemAlreadyAdded = true;
 		                    break;
 		                }
 		            } catch (BadLocationException ex) {
 		                ex.printStackTrace();
 		            }
 		        }
 		        
 		        
 		        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
 		            textArea.append("\n\n");
 		        }
 		        
 		        if (!itemAlreadyAdded) {
 		        if ("Small".equals(selectedValueMilkShakeStrawberry)) {
 		            FinalResultMilkShakeStrawberry = IceCreams.getMilkShakePrice() * resultMilkShakeStrawberry[0];
 		            FinalResultMilkShakeStrawberry = Math.round(FinalResultMilkShakeStrawberry * 100.0) / 100.0;
 		            String formattedPrice = String.format("%.2f", FinalResultMilkShakeStrawberry);
 		            textArea.append("      "+ "Milk Shake Strawberry"+"                      "                                          
 		                    + selectedValueMilkShakeStrawberry 
 		                    + "                                                       "  + resultMilkShakeStrawberry[0] + "                                                 "
 		                    + formattedPrice + " $\n");
 		        } else if ("Medium".equals(selectedValueMilkShakeStrawberry)) {
 		            FinalResultMilkShakeStrawberry = 2.90 * resultMilkShakeStrawberry[0];
 		            FinalResultMilkShakeStrawberry = Math.round(FinalResultMilkShakeStrawberry * 100.0) / 100.0;
 		            String formattedPrice = String.format("%.2f", FinalResultMilkShakeStrawberry);
 		            textArea.append("      "+ "Milk Shake Strawberry"+"                      "                                          
 		                    + selectedValueMilkShakeStrawberry 
 		                    + "                                                   "  + resultMilkShakeStrawberry[0] + "                                                 "
 		                    + formattedPrice + " $\n");
 		        } else if ("Large".equals(selectedValueMilkShakeStrawberry)) {
 		           FinalResultMilkShakeStrawberry = 3.70 * resultMilkShakeStrawberry[0];
 		           FinalResultMilkShakeStrawberry = Math.round(FinalResultMilkShakeStrawberry * 100.0) / 100.0;
 		           String formattedPrice = String.format("%.2f", FinalResultMilkShakeStrawberry);
 		           textArea.append("      "+ "Milk Shake Strawberry"+"                      "                                          
 		                  + selectedValueMilkShakeStrawberry 
 		                  + "                                                       "  + resultMilkShakeStrawberry[0] + "                                                 "
 		                  + formattedPrice + " $\n");
 		        } 
 		        
 		        
 		        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultMilkShakeStrawberry)
                         .setScale(2, RoundingMode.HALF_UP);
 		        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
                 
 		        }
 		    }
 		    
 		});


		MilkShakeStrawberryReduce.addActionListener(new ActionListener() {
 		    @Override
 		    public void actionPerformed(ActionEvent e) {
 		    	
 		    	String selectedValueMilkShakeStrawberry = (String) StrawberryShakeSize.getSelectedItem();
 		    	double FinalResultMilkShakeStrawberry = 0;
 		    	
 		    	if (resultMilkShakeStrawberry[0] > 1) {
 		    		if ("Small".equals(selectedValueMilkShakeStrawberry)) {
 		                FinalResultMilkShakeStrawberry = IceCreams.getMilkShakePrice() * resultMilkShakeStrawberry[0];
 		            } else if ("Medium".equals(selectedValueMilkShakeStrawberry)) {
 		                FinalResultMilkShakeStrawberry = 2.90 * resultMilkShakeStrawberry[0];
 		            } else if ("Large".equals(selectedValueMilkShakeStrawberry)) {
 		                FinalResultMilkShakeStrawberry = 3.70 * resultMilkShakeStrawberry[0];
 		            } 

 		        }

 		        if (resultMilkShakeStrawberry[0] > 1) {
 		        	resultMilkShakeStrawberry[0]--;
 		        	MilkShakeStrawberryAdd.setText("Add: " + resultMilkShakeStrawberry[0]);
 		        } else {
 		        	MilkShakeStrawberryAdd.setText("Add");
 		        }
 		    }
 		});		
		
		JButton MilkShakeBananaAdd = new JButton("Add");
		MilkShakeBananaAdd.setForeground(Color.WHITE);
		MilkShakeBananaAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		MilkShakeBananaAdd.setBackground(new Color(204, 0, 0));
		MilkShakeBananaAdd.setBounds(47, 726, 97, 28);
		
		JButton MilkShakeBananaIncrease = new JButton("");
		MilkShakeBananaIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
		MilkShakeBananaIncrease.setForeground(Color.WHITE);
		MilkShakeBananaIncrease.setBackground(Color.WHITE);
		MilkShakeBananaIncrease.setBounds(148, 726, 28, 28);
		
		JButton MilkShakeBananaReduce = new JButton("");
		MilkShakeBananaReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
		MilkShakeBananaReduce.setForeground(Color.WHITE);
		MilkShakeBananaReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		MilkShakeBananaReduce.setBackground(Color.WHITE);
		MilkShakeBananaReduce.setBounds(14, 726, 28, 28);
		
final int resultMilkShakeBanana[] = {0};
		
MilkShakeBananaIncrease.addActionListener(new ActionListener() {

								@Override
								public void actionPerformed(ActionEvent e) {
								resultMilkShakeBanana[0]++;
								MilkShakeBananaAdd.setText("Add: " +  resultMilkShakeBanana[0]);

								}
																	
							});
																
MilkShakeBananaAdd.addActionListener(new ActionListener() {
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        String selectedValueMilkShakeBanana = (String) BananaShakeSize.getSelectedItem();
	        double FinalResultMilkShakeBanana = 0;
	        
	        boolean itemAlreadyAdded = false;
	        

	       
	        for (int i = 0; i < textArea.getLineCount(); i++) {
	            try {
	                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
	                if (line.contains("Milk Shake Banana") && line.contains(selectedValueMilkShakeBanana)) {
	                    itemAlreadyAdded = true;
	                    break;
	                }
	            } catch (BadLocationException ex) {
	                ex.printStackTrace();
	            }
	        }
	        
	        
	        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
	            textArea.append("\n\n");
	        }
	        
	        if (!itemAlreadyAdded) {
	        if ("Small".equals(selectedValueMilkShakeBanana)) {
	            FinalResultMilkShakeBanana = IceCreams.getMilkShakePrice() * resultMilkShakeBanana[0];
	            FinalResultMilkShakeBanana = Math.round(FinalResultMilkShakeBanana * 100.0) / 100.0;
	            String formattedPrice = String.format("%.2f", FinalResultMilkShakeBanana);
	            textArea.append("      "+ "Milk Shake Banana"+"                           "                                          
	                    + selectedValueMilkShakeBanana 
	                    + "                                                       "  + resultMilkShakeBanana[0] + "                                                 "
	                    + formattedPrice + " $\n");
	        } else if ("Medium".equals(selectedValueMilkShakeBanana)) {
	            FinalResultMilkShakeBanana = 2.90 * resultMilkShakeBanana[0];
	            FinalResultMilkShakeBanana = Math.round(FinalResultMilkShakeBanana * 100.0) / 100.0;
	            String formattedPrice = String.format("%.2f", FinalResultMilkShakeBanana);
	            textArea.append("      "+ "Milk Shake Banana"+"                           "                                          
	                    + selectedValueMilkShakeBanana 
	                    + "                                                   "  + resultMilkShakeBanana[0] + "                                                 "
	                    + formattedPrice + " $\n");
	        } else if ("Large".equals(selectedValueMilkShakeBanana)) {
	           FinalResultMilkShakeBanana = 3.70 * resultMilkShakeBanana[0];
	           FinalResultMilkShakeBanana = Math.round(FinalResultMilkShakeBanana * 100.0) / 100.0;
	           String formattedPrice = String.format("%.2f", FinalResultMilkShakeBanana);
	           textArea.append("      "+ "Milk Shake Banana"+"                           "                                          
	                  + selectedValueMilkShakeBanana 
	                  + "                                                       "  + resultMilkShakeBanana[0] + "                                                 "
	                  + formattedPrice + " $\n");
	        } 
	        
	        
	        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultMilkShakeBanana)
                 .setScale(2, RoundingMode.HALF_UP);
	        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
         
	        }
	    }
	    
	});


MilkShakeBananaReduce.addActionListener(new ActionListener() {
	    @Override
	    public void actionPerformed(ActionEvent e) {
	    	
	    	String selectedValueMilkShakeBanana = (String) BananaShakeSize.getSelectedItem();
	    	double FinalResultMilkShakeBanana = 0;
	    	
	    	if (resultMilkShakeBanana[0] > 1) {
	    		if ("Small".equals(selectedValueMilkShakeBanana)) {
	                FinalResultMilkShakeBanana = IceCreams.getMilkShakePrice() * resultMilkShakeBanana[0];
	            } else if ("Medium".equals(selectedValueMilkShakeBanana)) {
	                FinalResultMilkShakeBanana = 2.90 * resultMilkShakeBanana[0];
	            } else if ("Large".equals(selectedValueMilkShakeBanana)) {
	                FinalResultMilkShakeBanana = 3.70 * resultMilkShakeBanana[0];
	            } 

	        }

	        if (resultMilkShakeBanana[0] > 1) {
	        	resultMilkShakeBanana[0]--;
	        	MilkShakeBananaAdd.setText("Add: " + resultMilkShakeBanana[0]);
	        } else {
	        	MilkShakeBananaAdd.setText("Add");
	        }
	    }
	});		
		
		JButton ConeIceAdd = new JButton("Add");
		ConeIceAdd.setForeground(Color.WHITE);
		ConeIceAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		ConeIceAdd.setBackground(new Color(204, 0, 0));
		ConeIceAdd.setBounds(228, 726, 97, 28);
		
		JButton ConeIceIncrease = new JButton("");
		ConeIceIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
		ConeIceIncrease.setForeground(Color.WHITE);
		ConeIceIncrease.setBackground(Color.WHITE);
		ConeIceIncrease.setBounds(329, 726, 28, 28);
		
		JButton ConeIceReduce = new JButton("");
		ConeIceReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
		ConeIceReduce.setForeground(Color.WHITE);
		ConeIceReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		ConeIceReduce.setBackground(Color.WHITE);
		ConeIceReduce.setBounds(195, 726, 28, 28);
		
		final int resultConeIce[] = {0};
		
		ConeIceIncrease.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			resultConeIce[0]++;
			ConeIceAdd.setText("Add: " +  resultConeIce[0]);

			}
																			
		});
																		
		ConeIceAdd.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		       
		    	double FinalResultConeIce = 0;
		        
		        boolean itemAlreadyAdded = false;
		        

		       
		        for (int i = 0; i < textArea.getLineCount(); i++) {
		            try {
		                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
		                if (line.contains("Cone Ice")) {
		                    itemAlreadyAdded = true;
		                    break;
		                }
		            } catch (BadLocationException ex) {
		                ex.printStackTrace();
		            }
		        }
		        
		        if(!itemAlreadyAdded) {
		        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
		            textArea.append("\n\n");
		        }
		        
		        
		            FinalResultConeIce = IceCreams.getConeIcePrice() * resultConeIce[0];
		            FinalResultConeIce = Math.round(FinalResultConeIce * 100.0) / 100.0;
		            String formattedPrice = String.format("%.2f", FinalResultConeIce);
		            textArea.append("      "+ "Cone Ice"+"                                               "                                          
		                    + "                                                                 "  + resultConeIce[0] 
		                    + "                                                 "
		                    + formattedPrice + " $\n");
		       
		        
		        
		        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultConeIce)
		                .setScale(2, RoundingMode.HALF_UP);
		        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
		        
		        }
		    }
		    
		});

		ConeIceReduce.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	
		    	double FinalResultConeIce = 0;
		    	
		                FinalResultConeIce = IceCreams.getConeIcePrice() * resultConeIce[0];
		            
		        if (resultConeIce[0] > 1) {
		        	resultConeIce[0]--;
		        	ConeIceAdd.setText("Add: " + resultConeIce[0]);
		        } else {
		        	ConeIceAdd.setText("Add");
		        }
		    }
		});		
		
		//Desserts
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
			JButton BananaMuffinAdd = new JButton("Add");
			BananaMuffinAdd.setForeground(new Color(255, 255, 255));
			BananaMuffinAdd.setBackground(new Color(204, 0, 0));
			BananaMuffinAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
			BananaMuffinAdd.setBounds(47, 436, 97, 28);
			
			JButton BananaMuffinIncrease = new JButton("");
			BananaMuffinIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
			BananaMuffinIncrease.setForeground(new Color(255, 255, 255));
			BananaMuffinIncrease.setBackground(new Color(255, 255, 255));
			BananaMuffinIncrease.setBounds(148, 436, 28, 28);
			
			JButton BananaMuffinReduce = new JButton("");
			BananaMuffinReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
			BananaMuffinReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
			BananaMuffinReduce.setForeground(new Color(255, 255, 255));
			BananaMuffinReduce.setBackground(new Color(255, 255, 255));
			BananaMuffinReduce.setBounds(14, 436, 28, 28);
			
			final int resultBananaMuffin[] = {0};
			
			BananaMuffinIncrease.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
							resultBananaMuffin[0]++;
							BananaMuffinAdd.setText("Add: " +  resultBananaMuffin[0]);

							}
																
						});
															
			BananaMuffinAdd.addActionListener(new ActionListener() {
			    @Override
			    public void actionPerformed(ActionEvent e) {
			       
			    	double FinalResultBananaMuffin = 0;
			        
			        boolean itemAlreadyAdded = false;
			        

			       
			        for (int i = 0; i < textArea.getLineCount(); i++) {
			            try {
			                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
			                if (line.contains("Banana Muffin")) {
			                    itemAlreadyAdded = true;
			                    break;
			                }
			            } catch (BadLocationException ex) {
			                ex.printStackTrace();
			            }
			        }
			        
			        if(!itemAlreadyAdded) {
			        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
			            textArea.append("\n\n");
			        }
			        
			        
			            FinalResultBananaMuffin = desserts.getMuffinPrice() * resultBananaMuffin[0];
			            FinalResultBananaMuffin = Math.round(FinalResultBananaMuffin * 100.0) / 100.0;
			            String formattedPrice = String.format("%.2f", FinalResultBananaMuffin);
			            textArea.append("      "+ "Banana Muffin"+"                                     "                                          
			                    + "                                                                 "  + resultBananaMuffin[0] 
			                    + "                                                 "
			                    + formattedPrice + " $\n");
			       
			        
			        
			        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultBananaMuffin)
			                .setScale(2, RoundingMode.HALF_UP);
			        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
			        
			        }
			    }
			    
			});

			BananaMuffinReduce.addActionListener(new ActionListener() {
			    @Override
			    public void actionPerformed(ActionEvent e) {
			    	
			    	double FinalResultBananaMuffin = 0;
			    	
			                FinalResultBananaMuffin = desserts.getMuffinPrice() * resultBananaMuffin[0];
			            
			        if (resultBananaMuffin[0] > 1) {
			        	resultBananaMuffin[0]--;
			        	BananaMuffinAdd.setText("Add: " + resultBananaMuffin[0]);
			        } else {
			        	BananaMuffinAdd.setText("Add");
			        }
			    }
			});			
			
			JButton BrownMuffinAdd = new JButton("Add");
			BrownMuffinAdd.setForeground(Color.WHITE);
			BrownMuffinAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
			BrownMuffinAdd.setBackground(new Color(204, 0, 0));
			BrownMuffinAdd.setBounds(228, 436, 97, 28);
			
			JButton BrownMuffinIncrease = new JButton("");
			BrownMuffinIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
			BrownMuffinIncrease.setForeground(Color.WHITE);
			BrownMuffinIncrease.setBackground(Color.WHITE);
			BrownMuffinIncrease.setBounds(329, 436, 28, 28);
			
			JButton BrownMuffinReduce = new JButton("");
			BrownMuffinReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
			BrownMuffinReduce.setForeground(Color.WHITE);
			BrownMuffinReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
			BrownMuffinReduce.setBackground(Color.WHITE);
			BrownMuffinReduce.setBounds(195, 436, 28, 28);
			
final int resultBrownMuffin[] = {0};
			
BrownMuffinIncrease.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
							resultBrownMuffin[0]++;
							BrownMuffinAdd.setText("Add: " +  resultBrownMuffin[0]);

							}
																
						});
															
BrownMuffinAdd.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
       
    	double FinalResultBrownMuffin = 0;
        
        boolean itemAlreadyAdded = false;
        

       
        for (int i = 0; i < textArea.getLineCount(); i++) {
            try {
                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
                if (line.contains("Brown Muffin")) {
                    itemAlreadyAdded = true;
                    break;
                }
            } catch (BadLocationException ex) {
                ex.printStackTrace();
            }
        }
        
        if(!itemAlreadyAdded) {
        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
            textArea.append("\n\n");
        }
        
        
            FinalResultBrownMuffin = desserts.getMuffinPrice() * resultBrownMuffin[0];
            FinalResultBrownMuffin = Math.round(FinalResultBrownMuffin * 100.0) / 100.0;
            String formattedPrice = String.format("%.2f", FinalResultBrownMuffin);
            textArea.append("      "+ "Brown Muffin"+"                                        "                                          
                    + "                                                                 "  + resultBrownMuffin[0] 
                    + "                                                 "
                    + formattedPrice + " $\n");
       
        
        
        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultBrownMuffin)
                .setScale(2, RoundingMode.HALF_UP);
        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
        
        }
    }
    
});

BrownMuffinReduce.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
    	
    	double FinalResultBrownMuffin = 0;
    	
                FinalResultBrownMuffin = desserts.getMuffinPrice() * resultBrownMuffin[0];
            
        if (resultBrownMuffin[0] > 1) {
        	resultBrownMuffin[0]--;
        	BrownMuffinAdd.setText("Add: " + resultBrownMuffin[0]);
        } else {
        	BrownMuffinAdd.setText("Add");
        }
    }
});			
			
			JButton MuffinBlackAdd = new JButton("Add");
			MuffinBlackAdd.setForeground(Color.WHITE);
			MuffinBlackAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
			MuffinBlackAdd.setBackground(new Color(204, 0, 0));
			MuffinBlackAdd.setBounds(409, 436, 97, 28);
			
			JButton MuffinBlackIncrease = new JButton("");
			MuffinBlackIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
			MuffinBlackIncrease.setForeground(Color.WHITE);
			MuffinBlackIncrease.setBackground(Color.WHITE);
			MuffinBlackIncrease.setBounds(510, 436, 28, 28);
			
			JButton MuffinBlackReduce = new JButton("");
			MuffinBlackReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
			MuffinBlackReduce.setForeground(Color.WHITE);
			MuffinBlackReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
			MuffinBlackReduce.setBackground(Color.WHITE);
			MuffinBlackReduce.setBounds(376, 436, 28, 28);
			
			final int resultMuffinBlack[] = {0};
			
			MuffinBlackIncrease.addActionListener(new ActionListener() {

										@Override
										public void actionPerformed(ActionEvent e) {
										resultMuffinBlack[0]++;
										MuffinBlackAdd.setText("Add: " +  resultMuffinBlack[0]);

										}
																			
									});
																		
			MuffinBlackAdd.addActionListener(new ActionListener() {
			    @Override
			    public void actionPerformed(ActionEvent e) {
			       
			    	double FinalResultMuffinBlack = 0;
			        
			        boolean itemAlreadyAdded = false;
			        

			       
			        for (int i = 0; i < textArea.getLineCount(); i++) {
			            try {
			                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
			                if (line.contains("Muffin Black")) {
			                    itemAlreadyAdded = true;
			                    break;
			                }
			            } catch (BadLocationException ex) {
			                ex.printStackTrace();
			            }
			        }
			        
			        if(!itemAlreadyAdded) {
			        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
			            textArea.append("\n\n");
			        }
			        
			        
			            FinalResultMuffinBlack = desserts.getMuffinPrice() * resultMuffinBlack[0];
			            FinalResultMuffinBlack = Math.round(FinalResultMuffinBlack * 100.0) / 100.0;
			            String formattedPrice = String.format("%.2f", FinalResultMuffinBlack);
			            textArea.append("      "+ "Muffin Black"+"                                          "                                          
			                    + "                                                                 "  + resultMuffinBlack[0] 
			                    + "                                                 "
			                    + formattedPrice + " $\n");
			       
			        
			        
			        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultMuffinBlack)
			                .setScale(2, RoundingMode.HALF_UP);
			        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
			        
			        }
			    }
			    
			});

			MuffinBlackReduce.addActionListener(new ActionListener() {
			    @Override
			    public void actionPerformed(ActionEvent e) {
			    	
			    	double FinalResultMuffinBlack = 0;
			    	
			                FinalResultMuffinBlack = desserts.getMuffinPrice() * resultMuffinBlack[0];
			            
			        if (resultMuffinBlack[0] > 1) {
			        	resultMuffinBlack[0]--;
			        	MuffinBlackAdd.setText("Add: " + resultMuffinBlack[0]);
			        } else {
			        	MuffinBlackAdd.setText("Add");
			        }
			    }
			});			
			
			JButton MuffinChocolateAdd = new JButton("Add");
			MuffinChocolateAdd.setForeground(Color.WHITE);
			MuffinChocolateAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
			MuffinChocolateAdd.setBackground(new Color(204, 0, 0));
			MuffinChocolateAdd.setBounds(590, 436, 97, 28);
			
			JButton MuffinChocolateIncrease = new JButton("");
			MuffinChocolateIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
			MuffinChocolateIncrease.setForeground(Color.WHITE);
			MuffinChocolateIncrease.setBackground(Color.WHITE);
			MuffinChocolateIncrease.setBounds(691, 436, 28, 28);
			
			JButton MuffinChocolateReduce = new JButton("");
			MuffinChocolateReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
			MuffinChocolateReduce.setForeground(Color.WHITE);
			MuffinChocolateReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
			MuffinChocolateReduce.setBackground(Color.WHITE);
			MuffinChocolateReduce.setBounds(557, 436, 28, 28);
			
final int resultMuffinChocolate[] = {0};
			
MuffinChocolateIncrease.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
							resultMuffinChocolate[0]++;
							MuffinChocolateAdd.setText("Add: " +  resultMuffinChocolate[0]);

							}
																
						});
															
MuffinChocolateAdd.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
       
    	double FinalResultMuffinChocolate = 0;
        
        boolean itemAlreadyAdded = false;
        

       
        for (int i = 0; i < textArea.getLineCount(); i++) {
            try {
                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
                if (line.contains("Muffin Chocolate")) {
                    itemAlreadyAdded = true;
                    break;
                }
            } catch (BadLocationException ex) {
                ex.printStackTrace();
            }
        }
        
        if(!itemAlreadyAdded) {
        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
            textArea.append("\n\n");
        }
        
        
            FinalResultMuffinChocolate = desserts.getMuffinPrice() * resultMuffinChocolate[0];
            FinalResultMuffinChocolate = Math.round(FinalResultMuffinChocolate * 100.0) / 100.0;
            String formattedPrice = String.format("%.2f", FinalResultMuffinChocolate);
            textArea.append("      "+ "Muffin Chocolate"+"                                 "                                          
                    + "                                                                 "  + resultMuffinChocolate[0] 
                    + "                                                 "
                    + formattedPrice + " $\n");
       
        
        
        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultMuffinChocolate)
                .setScale(2, RoundingMode.HALF_UP);
        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
        
        }
    }
    
});

MuffinChocolateReduce.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
    	
    	double FinalResultMuffinChocolate = 0;
    	
                FinalResultMuffinChocolate = desserts.getMuffinPrice() * resultMuffinChocolate[0];
            
        if (resultMuffinChocolate[0] > 1) {
        	resultMuffinChocolate[0]--;
        	MuffinChocolateAdd.setText("Add: " + resultMuffinChocolate[0]);
        } else {
        	MuffinChocolateAdd.setText("Add");
        }
    }
});			
			
			JButton BakedApplePieAdd = new JButton("Add");
			BakedApplePieAdd.setForeground(Color.WHITE);
			BakedApplePieAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
			BakedApplePieAdd.setBackground(new Color(204, 0, 0));
			BakedApplePieAdd.setBounds(771, 436, 97, 28);
			
			JButton BakedApplePieIncrease = new JButton("");
			BakedApplePieIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
			BakedApplePieIncrease.setForeground(Color.WHITE);
			BakedApplePieIncrease.setBackground(Color.WHITE);
			BakedApplePieIncrease.setBounds(872, 436, 28, 28);
			
			JButton BakedApplePieReduce = new JButton("");
			BakedApplePieReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
			BakedApplePieReduce.setForeground(Color.WHITE);
			BakedApplePieReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
			BakedApplePieReduce.setBackground(Color.WHITE);
			BakedApplePieReduce.setBounds(738, 436, 28, 28);
			
			final int resultBakedApplePie[] = {0};
			
			BakedApplePieIncrease.addActionListener(new ActionListener() {

										@Override
										public void actionPerformed(ActionEvent e) {
										resultBakedApplePie[0]++;
										BakedApplePieAdd.setText("Add: " +  resultBakedApplePie[0]);

										}
																			
									});
																		
			BakedApplePieAdd.addActionListener(new ActionListener() {
			    @Override
			    public void actionPerformed(ActionEvent e) {
			       
			    	double FinalResultBakedApplePie = 0;
			        
			        boolean itemAlreadyAdded = false;
			        

			       
			        for (int i = 0; i < textArea.getLineCount(); i++) {
			            try {
			                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
			                if (line.contains("Baked Apple Pie")) {
			                    itemAlreadyAdded = true;
			                    break;
			                }
			            } catch (BadLocationException ex) {
			                ex.printStackTrace();
			            }
			        }
			        
			        if(!itemAlreadyAdded) {
			        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
			            textArea.append("\n\n");
			        }
			        
			        
			            FinalResultBakedApplePie = desserts.getFruitPiePrice() * resultBakedApplePie[0];
			            FinalResultBakedApplePie = Math.round(FinalResultBakedApplePie * 100.0) / 100.0;
			            String formattedPrice = String.format("%.2f", FinalResultBakedApplePie);
			            textArea.append("      "+ "Baked Apple Pie"+"                                 "                                          
			                    + "                                                                 "  + resultBakedApplePie[0] 
			                    + "                                                 "
			                    + formattedPrice + " $\n");
			       
			        
			        
			        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultBakedApplePie)
			                .setScale(2, RoundingMode.HALF_UP);
			        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
			        
			        }
			      }
			    
			});

			BakedApplePieReduce.addActionListener(new ActionListener() {
			    @Override
			    public void actionPerformed(ActionEvent e) {
			    	
			    	double FinalResultBakedApplePie = 0;
			    	
			                FinalResultBakedApplePie = desserts.getFruitPiePrice() * resultBakedApplePie[0];
			            
			        if (resultBakedApplePie[0] > 1) {
			        	resultBakedApplePie[0]--;
			        	BakedApplePieAdd.setText("Add: " + resultBakedApplePie[0]);
			        } else {
			        	BakedApplePieAdd.setText("Add");
			        }
			    }
			});					
			
			JButton FruitPieStrawberryAdd = new JButton("Add");
			FruitPieStrawberryAdd.setForeground(Color.WHITE);
			FruitPieStrawberryAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
			FruitPieStrawberryAdd.setBackground(new Color(204, 0, 0));
			FruitPieStrawberryAdd.setBounds(47, 726, 97, 28);
			
			JButton FruitPieStrawberryIncrease = new JButton("");
			FruitPieStrawberryIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
			FruitPieStrawberryIncrease.setForeground(Color.WHITE);
			FruitPieStrawberryIncrease.setBackground(Color.WHITE);
			FruitPieStrawberryIncrease.setBounds(148, 726, 28, 28);
			
			JButton FruitPieStrawberryReduce = new JButton("");
			FruitPieStrawberryReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
			FruitPieStrawberryReduce.setForeground(Color.WHITE);
			FruitPieStrawberryReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
			FruitPieStrawberryReduce.setBackground(Color.WHITE);
			FruitPieStrawberryReduce.setBounds(14, 726, 28, 28);
			
			final int resultFruitPieStrawberry[] = {0};
			
			FruitPieStrawberryIncrease.addActionListener(new ActionListener() {

										@Override
										public void actionPerformed(ActionEvent e) {
										resultFruitPieStrawberry[0]++;
										FruitPieStrawberryAdd.setText("Add: " +  resultFruitPieStrawberry[0]);

										}
																			
									});
																		
			FruitPieStrawberryAdd.addActionListener(new ActionListener() {
			    @Override
			    public void actionPerformed(ActionEvent e) {
			       
			    	double FinalResultFruitPieStrawberry = 0;
			        
			        boolean itemAlreadyAdded = false;
			        

			       
			        for (int i = 0; i < textArea.getLineCount(); i++) {
			            try {
			                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
			                if (line.contains("Fruit Pie Strawberry")) {
			                    itemAlreadyAdded = true;
			                    break;
			                }
			            } catch (BadLocationException ex) {
			                ex.printStackTrace();
			            }
			        }
			        
			        if(!itemAlreadyAdded) {
			        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
			            textArea.append("\n\n");
			        }
			        
			        
			            FinalResultFruitPieStrawberry = desserts.getFruitPiePrice() * resultFruitPieStrawberry[0];
			            FinalResultFruitPieStrawberry = Math.round(FinalResultFruitPieStrawberry * 100.0) / 100.0;
			            String formattedPrice = String.format("%.2f", FinalResultFruitPieStrawberry);
			            textArea.append("      "+ "Fruit Pie Strawberry"+"                            "                                          
			                    + "                                                                 "  + resultFruitPieStrawberry[0] 
			                    + "                                                 "
			                    + formattedPrice + " $\n");
			       
			        
			        
			        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultFruitPieStrawberry)
			                .setScale(2, RoundingMode.HALF_UP);
			        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
			        
			        }
			    }
			    
			});

			FruitPieStrawberryReduce.addActionListener(new ActionListener() {
			    @Override
			    public void actionPerformed(ActionEvent e) {
			    	
			    	double FinalResultFruitPieStrawberry = 0;
			    	
			                FinalResultFruitPieStrawberry = desserts.getFruitPiePrice() * resultFruitPieStrawberry[0];
			            
			        if (resultFruitPieStrawberry[0] > 1) {
			        	resultFruitPieStrawberry[0]--;
			        	FruitPieStrawberryAdd.setText("Add: " + resultFruitPieStrawberry[0]);
			        } else {
			        	FruitPieStrawberryAdd.setText("Add");
			        }
			    }
			});			
			
			JButton FruitPieCherryAdd = new JButton("Add");
			FruitPieCherryAdd.setForeground(Color.WHITE);
			FruitPieCherryAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
			FruitPieCherryAdd.setBackground(new Color(204, 0, 0));
			FruitPieCherryAdd.setBounds(228, 726, 97, 28);
			
			JButton FruitPieCherryIncrease = new JButton("");
			FruitPieCherryIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
			FruitPieCherryIncrease.setForeground(Color.WHITE);
			FruitPieCherryIncrease.setBackground(Color.WHITE);
			FruitPieCherryIncrease.setBounds(329, 726, 28, 28);
			
			JButton FruitPieCherryReduce = new JButton("");
			FruitPieCherryReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
			FruitPieCherryReduce.setForeground(Color.WHITE);
			FruitPieCherryReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
			FruitPieCherryReduce.setBackground(Color.WHITE);
			FruitPieCherryReduce.setBounds(195, 726, 28, 28);
		
			final int resultFruitPieCherry[] = {0};
			
			FruitPieCherryIncrease.addActionListener(new ActionListener() {

										@Override
										public void actionPerformed(ActionEvent e) {
										resultFruitPieCherry[0]++;
										FruitPieCherryAdd.setText("Add: " +  resultFruitPieCherry[0]);

										}
																			
									});
																		
			FruitPieCherryAdd.addActionListener(new ActionListener() {
			    @Override
			    public void actionPerformed(ActionEvent e) {
			       
			    	double FinalResultFruitPieCherry = 0;
			        
			        boolean itemAlreadyAdded = false;
			        

			       
			        for (int i = 0; i < textArea.getLineCount(); i++) {
			            try {
			                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
			                if (line.contains("Fruit Pie Cherry")) {
			                    itemAlreadyAdded = true;
			                    break;
			                }
			            } catch (BadLocationException ex) {
			                ex.printStackTrace();
			            }
			        }
			        
			        if(!itemAlreadyAdded) {
			        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
			            textArea.append("\n\n");
			        }
			        
			        
			            FinalResultFruitPieCherry = desserts.getFruitPiePrice() * resultFruitPieCherry[0];
			            FinalResultFruitPieCherry = Math.round(FinalResultFruitPieCherry * 100.0) / 100.0;
			            String formattedPrice = String.format("%.2f", FinalResultFruitPieCherry);
			            textArea.append("      "+ "Fruit Pie Cherry"+"                                   "                                          
			                    + "                                                                 "  + resultFruitPieCherry[0] 
			                    + "                                                 "
			                    + formattedPrice + " $\n");
			       
			        
			        
			        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultFruitPieCherry)
			                .setScale(2, RoundingMode.HALF_UP);
			        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
			        
			        }
			    }
			    
			});

			FruitPieCherryReduce.addActionListener(new ActionListener() {
			    @Override
			    public void actionPerformed(ActionEvent e) {
			    	
			    	double FinalResultFruitPieCherry = 0;
			    	
			                FinalResultFruitPieCherry = desserts.getFruitPiePrice() * resultFruitPieCherry[0];
			            
			        if (resultFruitPieCherry[0] > 1) {
			        	resultFruitPieCherry[0]--;
			        	FruitPieCherryAdd.setText("Add: " + resultFruitPieCherry[0]);
			        } else {
			        	FruitPieCherryAdd.setText("Add");
			        }
			    }
			});			
			
			
			//HappyMeals
		//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
				JButton HappyMealHamburgerAdd = new JButton("Add");
				HappyMealHamburgerAdd.setForeground(new Color(255, 255, 255));
				HappyMealHamburgerAdd.setBackground(new Color(204, 0, 0));
				HappyMealHamburgerAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
				HappyMealHamburgerAdd.setBounds(47, 436, 97, 28);
				
				JButton HappyMealHamburgerIncrease = new JButton("");
				HappyMealHamburgerIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
				HappyMealHamburgerIncrease.setForeground(new Color(255, 255, 255));
				HappyMealHamburgerIncrease.setBackground(new Color(255, 255, 255));
				HappyMealHamburgerIncrease.setBounds(148, 436, 28, 28);
				
				JButton HappyMealHamburgerReduce = new JButton("");
				HappyMealHamburgerReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
				HappyMealHamburgerReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
				HappyMealHamburgerReduce.setForeground(new Color(255, 255, 255));
				HappyMealHamburgerReduce.setBackground(new Color(255, 255, 255));
				HappyMealHamburgerReduce.setBounds(14, 436, 28, 28);
				
				final int resultHappyMealHamburger[] = {0};
				
				HappyMealHamburgerIncrease.addActionListener(new ActionListener() {

											@Override
											public void actionPerformed(ActionEvent e) {
											resultHappyMealHamburger[0]++;
											HappyMealHamburgerAdd.setText("Add: " +  resultHappyMealHamburger[0]);

											}
																				
										});
																			
				HappyMealHamburgerAdd.addActionListener(new ActionListener() {
				    @Override
				    public void actionPerformed(ActionEvent e) {
				       
				    	double FinalResultHappyMealHamburger = 0;
				        
				        boolean itemAlreadyAdded = false;
				        

				       
				        for (int i = 0; i < textArea.getLineCount(); i++) {
				            try {
				                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
				                if (line.contains("HappyMeal Hamburger")) {
				                    itemAlreadyAdded = true;
				                    break;
				                }
				            } catch (BadLocationException ex) {
				                ex.printStackTrace();
				            }
				        }
				        
				        if(!itemAlreadyAdded) {
				        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
				            textArea.append("\n\n");
				        }
				        
				        
				            FinalResultHappyMealHamburger = happyMeal.getHappyMealsPrice() * resultHappyMealHamburger[0];
				            FinalResultHappyMealHamburger = Math.round(FinalResultHappyMealHamburger * 100.0) / 100.0;
				            String formattedPrice = String.format("%.2f", FinalResultHappyMealHamburger);
				            textArea.append("      "+ "HappyMeal Hamburger"+"                    "                                          
				                    + "                                                                 "  + resultHappyMealHamburger[0] 
				                    + "                                                  "
				                    + formattedPrice + " $\n");
				       
				        
				        
				        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultHappyMealHamburger)
				                .setScale(2, RoundingMode.HALF_UP);
				        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
				        
				        }
				    }
				    
				});

				HappyMealHamburgerReduce.addActionListener(new ActionListener() {
				    @Override
				    public void actionPerformed(ActionEvent e) {
				    	
				    	double FinalResultHappyMealHamburger = 0;
				    	
				                FinalResultHappyMealHamburger = happyMeal.getHappyMealsPrice() * resultHappyMealHamburger[0];
				            
				        if (resultHappyMealHamburger[0] > 1) {
				        	resultHappyMealHamburger[0]--;
				        	HappyMealHamburgerAdd.setText("Add: " + resultHappyMealHamburger[0]);
				        } else {
				        	HappyMealHamburgerAdd.setText("Add");
				        }
				    }
				});				
				
				JButton HappyMealCheeseburgerAdd = new JButton("Add");
				HappyMealCheeseburgerAdd.setForeground(Color.WHITE);
				HappyMealCheeseburgerAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
				HappyMealCheeseburgerAdd.setBackground(new Color(204, 0, 0));
				HappyMealCheeseburgerAdd.setBounds(228, 436, 97, 28);
				
				JButton HappyMealCheeseburgerIncrease = new JButton("");
				HappyMealCheeseburgerIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
				HappyMealCheeseburgerIncrease.setForeground(Color.WHITE);
				HappyMealCheeseburgerIncrease.setBackground(Color.WHITE);
				HappyMealCheeseburgerIncrease.setBounds(329, 436, 28, 28);
				
				JButton HappyMealCheeseburgerReduce = new JButton("");
				HappyMealCheeseburgerReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
				HappyMealCheeseburgerReduce.setForeground(Color.WHITE);
				HappyMealCheeseburgerReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
				HappyMealCheeseburgerReduce.setBackground(Color.WHITE);
				HappyMealCheeseburgerReduce.setBounds(195, 436, 28, 28);
				
				final int resultHappyMealCheeseburger[] = {0};
				
				HappyMealCheeseburgerIncrease.addActionListener(new ActionListener() {

								@Override
								public void actionPerformed(ActionEvent e) {
								resultHappyMealCheeseburger[0]++;
								HappyMealCheeseburgerAdd.setText("Add: " +  resultHappyMealCheeseburger[0]);

								}
																	
							});
																
				HappyMealCheeseburgerAdd.addActionListener(new ActionListener() {
				    @Override
				    public void actionPerformed(ActionEvent e) {
				       
				    	double FinalResultHappyMealCheeseburger = 0;
				        
				        boolean itemAlreadyAdded = false;
				        

				       
				        for (int i = 0; i < textArea.getLineCount(); i++) {
				            try {
				                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
				                if (line.contains("HappyMeal Cheeseburger")) {
				                    itemAlreadyAdded = true;
				                    break;
				                }
				            } catch (BadLocationException ex) {
				                ex.printStackTrace();
				            }
				        }
				        
				        if(!itemAlreadyAdded) {
				        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
				            textArea.append("\n\n");
				        }
				        
				        
				            FinalResultHappyMealCheeseburger = happyMeal.getHappyMealsPrice() * resultHappyMealCheeseburger[0];
				            FinalResultHappyMealCheeseburger = Math.round(FinalResultHappyMealCheeseburger * 100.0) / 100.0;
				            String formattedPrice = String.format("%.2f", FinalResultHappyMealCheeseburger);
				            textArea.append("      "+ "HappyMeal Cheeseburger"+"              "                                          
				                    + "                                                                 "  + resultHappyMealCheeseburger[0] 
				                    + "                                                  "
				                    + formattedPrice + " $\n");
				       
				        
				        
				        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultHappyMealCheeseburger)
				                .setScale(2, RoundingMode.HALF_UP);
				        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
				        
				        }
				    }
				    
				});

				HappyMealCheeseburgerReduce.addActionListener(new ActionListener() {
				    @Override
				    public void actionPerformed(ActionEvent e) {
				    	
				    	double FinalResultHappyMealCheeseburger = 0;
				    	
				                FinalResultHappyMealCheeseburger = happyMeal.getHappyMealsPrice() * resultHappyMealCheeseburger[0];
				            
				        if (resultHappyMealCheeseburger[0] > 1) {
				        	resultHappyMealCheeseburger[0]--;
				        	HappyMealCheeseburgerAdd.setText("Add: " + resultHappyMealCheeseburger[0]);
				        } else {
				        	HappyMealCheeseburgerAdd.setText("Add");
				        }
				    }
				});				
				
				JButton HappyMealChickenburgerAdd = new JButton("Add");
				HappyMealChickenburgerAdd.setForeground(Color.WHITE);
				HappyMealChickenburgerAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
				HappyMealChickenburgerAdd.setBackground(new Color(204, 0, 0));
				HappyMealChickenburgerAdd.setBounds(409, 436, 97, 28);
				
				JButton HappyMealChickenburgerIncrease = new JButton("");
				HappyMealChickenburgerIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
				HappyMealChickenburgerIncrease.setForeground(Color.WHITE);
				HappyMealChickenburgerIncrease.setBackground(Color.WHITE);
				HappyMealChickenburgerIncrease.setBounds(510, 436, 28, 28);
				
				JButton HappyMealChickenburgerReduce = new JButton("");
				HappyMealChickenburgerReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
				HappyMealChickenburgerReduce.setForeground(Color.WHITE);
				HappyMealChickenburgerReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
				HappyMealChickenburgerReduce.setBackground(Color.WHITE);
				HappyMealChickenburgerReduce.setBounds(376, 436, 28, 28);
				
final int resultHappyMealChickenburger[] = {0};
				
HappyMealChickenburgerIncrease.addActionListener(new ActionListener() {

								@Override
								public void actionPerformed(ActionEvent e) {
								resultHappyMealChickenburger[0]++;
								HappyMealChickenburgerAdd.setText("Add: " +  resultHappyMealChickenburger[0]);

								}
																	
							});
																
HappyMealChickenburgerAdd.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
       
    	double FinalResultHappyMealChickenburger = 0;
        
        boolean itemAlreadyAdded = false;
        

       
        for (int i = 0; i < textArea.getLineCount(); i++) {
            try {
                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
                if (line.contains("HappyMeal Chickenburger")) {
                    itemAlreadyAdded = true;
                    break;
                }
            } catch (BadLocationException ex) {
                ex.printStackTrace();
            }
        }
        
        if(!itemAlreadyAdded) {
        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
            textArea.append("\n\n");
        }
        
        
            FinalResultHappyMealChickenburger = happyMeal.getHappyMealsPrice() * resultHappyMealChickenburger[0];
            FinalResultHappyMealChickenburger = Math.round(FinalResultHappyMealChickenburger * 100.0) / 100.0;
            String formattedPrice = String.format("%.2f", FinalResultHappyMealChickenburger);
            textArea.append("      "+ "HappyMeal Chickenburger"+"              "                                          
                    + "                                                                 "  + resultHappyMealChickenburger[0] 
                    + "                                                  "
                    + formattedPrice + " $\n");
       
        
        
        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultHappyMealChickenburger)
                .setScale(2, RoundingMode.HALF_UP);
        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
        
        }
    }
    
});

HappyMealChickenburgerReduce.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
    	
    	double FinalResultHappyMealChickenburger = 0;
    	
                FinalResultHappyMealChickenburger = happyMeal.getHappyMealsPrice() * resultHappyMealChickenburger[0];
            
        if (resultHappyMealChickenburger[0] > 1) {
        	resultHappyMealChickenburger[0]--;
        	HappyMealChickenburgerAdd.setText("Add: " + resultHappyMealChickenburger[0]);
        } else {
        	HappyMealChickenburgerAdd.setText("Add");
        }
    }
});				
				
				JButton HappyMealMcNuggetsAdd = new JButton("Add");
				HappyMealMcNuggetsAdd.setForeground(Color.WHITE);
				HappyMealMcNuggetsAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
				HappyMealMcNuggetsAdd.setBackground(new Color(204, 0, 0));
				HappyMealMcNuggetsAdd.setBounds(590, 436, 97, 28);
				
				JButton HappyMealMcNuggetsIncrease = new JButton("");
				HappyMealMcNuggetsIncrease.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Plus.png"));
				HappyMealMcNuggetsIncrease.setForeground(Color.WHITE);
				HappyMealMcNuggetsIncrease.setBackground(Color.WHITE);
				HappyMealMcNuggetsIncrease.setBounds(691, 436, 28, 28);
				
				JButton HappyMealMcNuggetsReduce = new JButton("");
				HappyMealMcNuggetsReduce.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Minus.png"));
				HappyMealMcNuggetsReduce.setForeground(Color.WHITE);
				HappyMealMcNuggetsReduce.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
				HappyMealMcNuggetsReduce.setBackground(Color.WHITE);
				HappyMealMcNuggetsReduce.setBounds(557, 436, 28, 28);
			
				final int resultHappyMealMcNuggets[] = {0};
				
				HappyMealMcNuggetsIncrease.addActionListener(new ActionListener() {

												@Override
												public void actionPerformed(ActionEvent e) {
												resultHappyMealMcNuggets[0]++;
												HappyMealMcNuggetsAdd.setText("Add: " +  resultHappyMealMcNuggets[0]);

												}
																					
											});
																				
				HappyMealMcNuggetsAdd.addActionListener(new ActionListener() {
				    @Override
				    public void actionPerformed(ActionEvent e) {
				       
				    	double FinalResultHappyMealMcNuggets = 0;
				        
				        boolean itemAlreadyAdded = false;
				        

				       
				        for (int i = 0; i < textArea.getLineCount(); i++) {
				            try {
				                String line = textArea.getText(textArea.getLineStartOffset(i), textArea.getLineEndOffset(i) - textArea.getLineStartOffset(i));
				                if (line.contains("HappyMeal McNuggets")) {
				                    itemAlreadyAdded = true;
				                    break;
				                }
				            } catch (BadLocationException ex) {
				                ex.printStackTrace();
				            }
				        }
				        
				        if(!itemAlreadyAdded) {
				        if (textArea.getText().isEmpty() || !textArea.getText().startsWith("\n\n")) {
				            textArea.append("\n\n");
				        }
				        
				        
				            FinalResultHappyMealMcNuggets = happyMeal.getHappyMealsPrice() * resultHappyMealMcNuggets[0];
				            FinalResultHappyMealMcNuggets = Math.round(FinalResultHappyMealMcNuggets * 100.0) / 100.0;
				            String formattedPrice = String.format("%.2f", FinalResultHappyMealMcNuggets);
				            textArea.append("      "+ "HappyMeal McNuggets"+"                      "                                          
				                    + "                                                               "  + resultHappyMealMcNuggets[0] 
				                    + "                                                  "
				                    + formattedPrice + " $\n");
				       
				        
				        
				        BigDecimal finalResultBigDecimal = BigDecimal.valueOf(FinalResultHappyMealMcNuggets)
				                .setScale(2, RoundingMode.HALF_UP);
				        totalPrice[0] = totalPrice[0].add(finalResultBigDecimal); 
				        
				        }
				    }
				    
				});

				HappyMealMcNuggetsReduce.addActionListener(new ActionListener() {
				    @Override
				    public void actionPerformed(ActionEvent e) {
				    	
				    	double FinalResultHappyMealMcNuggets = 0;
				    	
				                FinalResultHappyMealMcNuggets = happyMeal.getHappyMealsPrice() * resultHappyMealMcNuggets[0];
				            
				        if (resultHappyMealMcNuggets[0] > 1) {
				        	resultHappyMealMcNuggets[0]--;
				        	HappyMealMcNuggetsAdd.setText("Add: " + resultHappyMealMcNuggets[0]);
				        } else {
				        	HappyMealMcNuggetsAdd.setText("Add");
				        }
				    }
				});				
				
		//Added Prices
		//Snacks
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
		JLabel FrenchFriesPriceSt = new JLabel(String.format("%.2f $", snacks.getFrenchFriesPrice()));
		FrenchFriesPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		FrenchFriesPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		FrenchFriesPriceSt.setBounds(74, 411, 46, 14);
		
		JLabel WedgesPriceSt = new JLabel(String.format("%.2f $", snacks.getWedgesPrice()));
		WedgesPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		WedgesPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		WedgesPriceSt.setBounds(255, 411, 46, 14);
		
		JLabel McNuggetsPriceSt = new JLabel(String.format("%.2f $", snacks.getChickenMcNuggetsPrice()));
		McNuggetsPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		McNuggetsPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		McNuggetsPriceSt.setBounds(436, 411, 46, 14);
		
		JLabel WingsPriceSt = new JLabel(String.format("%.2f $", snacks.getChickenWingsPrice()));
		WingsPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		WingsPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		WingsPriceSt.setBounds(617, 411, 46, 14);
		
		JLabel OnionRingsPriceSt = new JLabel(String.format("%.2f $", snacks.getOnionRingsPrice()));
		OnionRingsPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		OnionRingsPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		OnionRingsPriceSt.setBounds(798, 411, 46, 14);
		
		JLabel ShrimpsPriceSt = new JLabel(String.format("%.2f $", snacks.getShrimpsPrice()));
		ShrimpsPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		ShrimpsPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		ShrimpsPriceSt.setBounds(74, 701, 46, 14);
		
		JLabel ChickenBoxPriceSt = new JLabel(String.format("%.2f $", snacks.getChickenBoxPrice()));
		ChickenBoxPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		ChickenBoxPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		ChickenBoxPriceSt.setBounds(255, 701, 51, 14);
		
		
		
	   //Beverages
	//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		JLabel FantaPriceSt = new JLabel(String.format("%.2f $", beverages.getFantaPrice()));
		FantaPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		FantaPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		FantaPriceSt.setBounds(74, 411, 46, 14);
		
		JLabel CocaColaPriceSt = new JLabel(String.format("%.2f $", beverages.getCocaColaPrice()));
		CocaColaPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		CocaColaPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		CocaColaPriceSt.setBounds(255, 411, 46, 14);
		
		JLabel SpritePriceSt = new JLabel(String.format("%.2f $", beverages.getSpritePrice()));
		SpritePriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		SpritePriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		SpritePriceSt.setBounds(436, 411, 46, 14);
		
		JLabel CocaColaZeroPriceSt = new JLabel(String.format("%.2f $", beverages.getCocaColaZeroPrice()));
		CocaColaZeroPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		CocaColaZeroPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		CocaColaZeroPriceSt.setBounds(617, 411, 46, 14);
		
		JLabel LemonadeGrapefruitPriceSt = new JLabel(String.format("%.2f $", beverages.getLemonadeGrapefruitPrice()));
		LemonadeGrapefruitPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		LemonadeGrapefruitPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		LemonadeGrapefruitPriceSt.setBounds(798, 411, 46, 14);
		
		JLabel LemonadeStrawberryPriceSt = new JLabel(String.format("%.2f $", beverages.getLemonadeStrawberryPrice()));
		LemonadeStrawberryPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		LemonadeStrawberryPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		LemonadeStrawberryPriceSt.setBounds(74, 701, 46, 14);
		
		JLabel OrangeJuicePriceSt = new JLabel(String.format("%.2f $", beverages.getOrangeJuicePrice()));
		OrangeJuicePriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		OrangeJuicePriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		OrangeJuicePriceSt.setBounds(255, 701, 51, 14);
		
		JLabel CappyPriceSt = new JLabel(String.format("%.2f $",beverages.getCappyJuicePrice()));
		CappyPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		CappyPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		CappyPriceSt.setBounds(436, 701, 51, 14);
		
		JLabel SparklingWaterPriceSt = new JLabel(String.format("%.2f $",beverages.getSparklingWaterPrice()));
		SparklingWaterPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		SparklingWaterPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		SparklingWaterPriceSt.setBounds(617, 701, 46, 14);
		
		
		//Sauces
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		JLabel KetchupPriceSt = new JLabel(String.format("%.2f $", sauces.getSaucePrice()));
		KetchupPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		KetchupPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		KetchupPriceSt.setBounds(74, 411, 46, 14);
		
		JLabel MayonnaisePriceSt = new JLabel(String.format("%.2f $", sauces.getSaucePrice()));
		MayonnaisePriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		MayonnaisePriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		MayonnaisePriceSt.setBounds(255, 411, 46, 14);
		
		JLabel CheesePriceSt = new JLabel(String.format("%.2f $",sauces.getSaucePrice()));
		CheesePriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		CheesePriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		CheesePriceSt.setBounds(436, 411, 46, 14);
		
		JLabel BarbecuePriceSt = new JLabel(String.format("%.2f $", sauces.getSaucePrice()));
		BarbecuePriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		BarbecuePriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		BarbecuePriceSt.setBounds(617, 411, 46, 14);
		
		JLabel MustardPriceSt = new JLabel(String.format("%.2f $", sauces.getSaucePrice()));
		MustardPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		MustardPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		MustardPriceSt.setBounds(798, 411, 46, 14);
		
		JLabel SalsaPriceSt = new JLabel(String.format("%.2f $", sauces.getSaucePrice()));
		SalsaPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		SalsaPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		SalsaPriceSt.setBounds(74, 701, 46, 14);
		
		JLabel SweetPriceSt = new JLabel(String.format("%.2f $", sauces.getSaucePrice()));
		SweetPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		SweetPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		SweetPriceSt.setBounds(255, 701, 51, 14);
		
		
		//Ice Creams
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		JLabel McSundaePriceSt = new JLabel(String.format("%.2f $", IceCreams.getMcSundaePrice()));
		McSundaePriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		McSundaePriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		McSundaePriceSt.setBounds(74, 411, 46, 14);
		
		JLabel McFlurryPriceSt = new JLabel(String.format("%.2f $", IceCreams.getMcFlurryPrice()));
		McFlurryPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		McFlurryPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		McFlurryPriceSt.setBounds(255, 411, 46, 14);
		
		JLabel MilkShakeChocolatePriceSt = new JLabel(String.format("%.2f $",IceCreams.getMilkShakePrice()));
		MilkShakeChocolatePriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		MilkShakeChocolatePriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		MilkShakeChocolatePriceSt.setBounds(436, 411, 46, 14);
		
		JLabel MilkShakeVanillaPriceSt = new JLabel(String.format("%.2f $", IceCreams.getMilkShakePrice()));
		MilkShakeVanillaPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		MilkShakeVanillaPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		MilkShakeVanillaPriceSt.setBounds(617, 411, 46, 14);
		
		JLabel MilkShakeStrawberryPriceSt = new JLabel(String.format("%.2f $", IceCreams.getMilkShakePrice()));
		MilkShakeStrawberryPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		MilkShakeStrawberryPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		MilkShakeStrawberryPriceSt.setBounds(798, 411, 46, 14);
		
		JLabel MilkShakeBananaPriceSt = new JLabel(String.format("%.2f $", IceCreams.getMilkShakePrice()));
		MilkShakeBananaPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		MilkShakeBananaPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		MilkShakeBananaPriceSt.setBounds(74, 701, 46, 14);
		
		JLabel ConeIcePriceSt = new JLabel(String.format("%.2f $", IceCreams.getConeIcePrice()));
		ConeIcePriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		ConeIcePriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		ConeIcePriceSt.setBounds(255, 701, 51, 14);
		
		
		//Hot Drinks
	//----------------------------------------------------------------------------------------------------------------------------------------------------------------------	
		JLabel TeaPriceSt = new JLabel(String.format("%.2f $", hotDrinks.getTeaPrice()));
		TeaPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		TeaPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		TeaPriceSt.setBounds(74, 411, 46, 14);
		
		JLabel CoffeePriceSt = new JLabel(String.format("%.2f $", hotDrinks.getCoffeePrice()));
		CoffeePriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		CoffeePriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		CoffeePriceSt.setBounds(255, 411, 46, 14);
		
		JLabel LattePriceSt = new JLabel(String.format("%.2f $",hotDrinks.getLattePrice()));
		LattePriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		LattePriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		LattePriceSt.setBounds(436, 411, 46, 14);
		
		JLabel CappucinoPriceSt = new JLabel(String.format("%.2f $", hotDrinks.getCappuccinoPrice()));
		CappucinoPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		CappucinoPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		CappucinoPriceSt.setBounds(617, 411, 46, 14);
		
		JLabel HotChocolatePriceSt = new JLabel(String.format("%.2f $", hotDrinks.getHotChocolatePrice()));
		HotChocolatePriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		HotChocolatePriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		HotChocolatePriceSt.setBounds(798, 411, 46, 14);
		
		JLabel EspressoPriceSt = new JLabel(String.format("%.2f $", hotDrinks.getEspressoPrice()));
		EspressoPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		EspressoPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		EspressoPriceSt.setBounds(74, 701, 46, 14);
		
		
		//Desserts
	//----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		JLabel BananaMuffinPriceSt = new JLabel(String.format("%.2f $", desserts.getMuffinPrice()));
		BananaMuffinPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		BananaMuffinPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		BananaMuffinPriceSt.setBounds(74, 411, 46, 14);
		
		JLabel BrownMuffinPriceSt = new JLabel(String.format("%.2f $", desserts.getMuffinPrice()));
		BrownMuffinPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		BrownMuffinPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		BrownMuffinPriceSt.setBounds(255, 411, 46, 14);
		
		JLabel MuffinBlackCurrantPriceSt = new JLabel(String.format("%.2f $",desserts.getMuffinPrice()));
		MuffinBlackCurrantPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		MuffinBlackCurrantPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		MuffinBlackCurrantPriceSt.setBounds(436, 411, 46, 14);
		
		JLabel MuffinChocolatePriceSt = new JLabel(String.format("%.2f $", desserts.getMuffinPrice()));
		MuffinChocolatePriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		MuffinChocolatePriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		MuffinChocolatePriceSt.setBounds(617, 411, 46, 14);
		
		JLabel BakedApplePiePriceSt = new JLabel(String.format("%.2f $", desserts.getFruitPiePrice()));
		BakedApplePiePriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		BakedApplePiePriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		BakedApplePiePriceSt.setBounds(798, 411, 46, 14);
		
		JLabel FruitPieStrawberryPriceSt = new JLabel(String.format("%.2f $", desserts.getFruitPiePrice()));
		FruitPieStrawberryPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		FruitPieStrawberryPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		FruitPieStrawberryPriceSt.setBounds(74, 701, 46, 14);
		
		JLabel FruitPieCherryPriceSt = new JLabel(String.format("%.2f $", desserts.getFruitPiePrice()));
		FruitPieCherryPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		FruitPieCherryPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		FruitPieCherryPriceSt.setBounds(255, 701, 51, 14);
		
		
		//Happy Meal
	//----------------------------------------------------------------------------------------------------------------------------------------------------------------------	
		JLabel HappyMealHamburgerPriceSt = new JLabel(String.format("%.2f $", happyMeal.getHappyMealsPrice()));
		HappyMealHamburgerPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		HappyMealHamburgerPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		HappyMealHamburgerPriceSt.setBounds(74, 411, 46, 14);
		
		JLabel HappyMealCheeseburgerPriceSt = new JLabel(String.format("%.2f $", happyMeal.getHappyMealsPrice()));
		HappyMealCheeseburgerPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		HappyMealCheeseburgerPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		HappyMealCheeseburgerPriceSt.setBounds(255, 411, 46, 14);
		
		JLabel HappyMealChickenburgerPriceSt = new JLabel(String.format("%.2f $", happyMeal.getHappyMealsPrice()));
		HappyMealChickenburgerPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		HappyMealChickenburgerPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		HappyMealChickenburgerPriceSt.setBounds(436, 411, 46, 14);
		
		JLabel HappyMealMcNuggetsPriceSt = new JLabel(String.format("%.2f $", happyMeal.getHappyMealsPrice()));
		HappyMealMcNuggetsPriceSt.setFont(new Font("Cambria", Font.PLAIN, 16));
		HappyMealMcNuggetsPriceSt.setHorizontalAlignment(SwingConstants.CENTER);
		HappyMealMcNuggetsPriceSt.setBounds(617, 411, 46, 14);
		
		
	//----------------------------------------------------------------------------------------------------------------------------------------------------------------------	
		JLabel HappyMealFont1 = new JLabel();			    	
    	JLabel HappyMealFont2 = new JLabel();
    	JLabel HappyMealFont3 = new JLabel();
    	JLabel HappyMealFont4 = new JLabel();

		
		
		 
		 
		//Snacks
		//French Fries
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		 
		 
		Snacks.addActionListener(new ActionListener() {
              
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	
		        
		        FrenchFriesSize.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		            	double resultFrenchFries=0;
		            	
		              String selectedValueFrenchFries = (String) FrenchFriesSize.getSelectedItem();
		               

		                
		                if ("Small".equals(selectedValueFrenchFries)) {
		                	FrenchFriesPriceSt.setText(String.format("%.2f $", snacks.getFrenchFriesPrice()));
		                } else if ("Medium".equals(selectedValueFrenchFries)) {
		                	resultFrenchFries = snacks.getFrenchFriesPrice() * 1.5;
		                	FrenchFriesPriceSt.setText(String.format("%.2f $", resultFrenchFries));
		                } else if ("Large".equals(selectedValueFrenchFries)) {
		                	resultFrenchFries = snacks.getFrenchFriesPrice() * 2.0;
		                	FrenchFriesPriceSt.setText(String.format("%.2f $", resultFrenchFries));
		                } else if ("Extra".equals(selectedValueFrenchFries)) {
		                	resultFrenchFries = snacks.getFrenchFriesPrice() * 2.5;
		                	FrenchFriesPriceSt.setText(String.format("%.2f $", resultFrenchFries));
		                }
		            }
		        });
		        FrenchFriesSize.setEditable(true);
		        FrenchFriesSize.setFont(new Font("Century", Font.PLAIN, 13));
		        FrenchFriesSize.setBounds(55, 380, 83, 20);
				contentPane.remove(HamburgerSize);
				contentPane.remove(HamburgerPriceSt);
				contentPane.add(FrenchFriesSize);
				contentPane.add(FrenchFriesPriceSt);

				
		        Hamburger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Snacks\\French Fries.png"));
		        HamburgerName.setText("French Fries");
		        Hamburger.setVerticalAlignment(SwingConstants.CENTER);
		        
		       
		        // Wedges
   //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		        
		        
		        
		                WedgesSize.addActionListener(new ActionListener() {
		                	
		                    @Override
		                    public void actionPerformed(ActionEvent e) {
		                    	double resultWedge = 0;

		                        String selectedValueWedges = (String) WedgesSize.getSelectedItem();

		                        if ("Medium".equals(selectedValueWedges)) {
		                        	WedgesPriceSt.setText(String.format("%.2f $", snacks.getWedgesPrice()));
		                        } else if ("Large".equals(selectedValueWedges)) {
		                            resultWedge = snacks.getWedgesPrice() * 1.5;
		                            WedgesPriceSt.setText(String.format("%.2f $", resultWedge));
		                        } else if ("Extra".equals(selectedValueWedges)) {
		                            resultWedge = snacks.getWedgesPrice() * 2.0;
		                            WedgesPriceSt.setText(String.format("%.2f $", resultWedge));
		                            
		                        }
		                        
		                    }
		                });

		                WedgesSize.setEditable(true);
		                WedgesSize.setFont(new Font("Century", Font.PLAIN, 13));
		                WedgesSize.setBounds(236, 380, 83, 20);

		                contentPane.add(WedgesSize);
		                contentPane.add(WedgesPriceSt);
		                contentPane.remove(CheeseburgerSize);
		                contentPane.remove(CheeseBurgerPriceSt);

		                
		        Cheeseburger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Snacks\\Wedges.png"));
		        CheeseBurgerName.setText("Wedges");
		        Cheeseburger.setVerticalAlignment(SwingConstants.CENTER);
		        Cheeseburger.setHorizontalAlignment(SwingConstants.CENTER);

		        //McNuggets
  //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		        
		        
		        McNuggetsSize.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                double resultMcNuggets = 0;

		                String selectedValueMcNuggets = (String) McNuggetsSize.getSelectedItem();

		                        if (" 4 pieces".equals(selectedValueMcNuggets)) {
		                        	McNuggetsPriceSt.setText(String.format("%.2f $", snacks.getChickenMcNuggetsPrice()));
		                        } else if (" 6 pieces".equals(selectedValueMcNuggets)) {
		                            resultMcNuggets = snacks.getChickenMcNuggetsPrice() * 1.5;  
		                            McNuggetsPriceSt.setText(String.format("%.2f $", resultMcNuggets));
		                        } else if (" 9 pieces".equals(selectedValueMcNuggets)) {
		                            resultMcNuggets = snacks.getChickenMcNuggetsPrice() * 2.5;
		                            McNuggetsPriceSt.setText(String.format("%.2f $", resultMcNuggets));
		                        } else if (" 20 pieces".equals(selectedValueMcNuggets)) {
		                            resultMcNuggets = snacks.getChickenMcNuggetsPrice() * 2.8;
		                            McNuggetsPriceSt.setText(String.format("%.2f $", resultMcNuggets));
		                        }
		                    }

		                });

		              McNuggetsSize.setEditable(true);
		              McNuggetsSize.setFont(new Font("Century", Font.PLAIN, 13));
		              McNuggetsSize.setBounds(417, 380, 83, 20);

		                contentPane.add(McNuggetsSize);
		                contentPane.add(McNuggetsPriceSt);
		                contentPane.remove(McChickenSize);
		                contentPane.remove(McChickenPriceSt);
		                
		                
		        McChicken.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Snacks\\McNuggets.png"));
		        McChickenName.setText("Chicken McNuggets");
		        McChicken.setHorizontalAlignment(SwingConstants.CENTER);
		        
		        //Wings
   //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		        
		        
		            WingsSize.addActionListener(new ActionListener() {
		                	
		                    @Override
		                    public void actionPerformed(ActionEvent e) {
		                    	double resultWings = 0;

		                        String selectedValueWings = (String) WingsSize.getSelectedItem();

		                        if (" 3 pieces".equals(selectedValueWings)) {
		                        	WingsPriceSt.setText(String.format("%.2f $", snacks.getChickenWingsPrice()));
		                        } else if (" 5 pieces".equals(selectedValueWings)) {
		                        	resultWings = snacks.getChickenWingsPrice() * 1.5;
		                        	WingsPriceSt.setText(String.format("%.2f $", resultWings));
		                        } else if (" 8 pieces".equals(selectedValueWings)) {
		                        	resultWings = snacks.getChickenWingsPrice() * 2.0;
		                        	WingsPriceSt.setText(String.format("%.2f $", resultWings));
		                        } 
		                    }
		                });

		            WingsSize.setEditable(true);
		            WingsSize.setFont(new Font("Century", Font.PLAIN, 13));
		            WingsSize.setBounds(598, 380, 83, 20);

		                contentPane.add(WingsSize);
		                contentPane.add(WingsPriceSt);
		                contentPane.remove(BigMacSize);
		                contentPane.remove(BigMacPriceSt);
		                
		                
		           BigMac.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Snacks\\Wings.png"));
				   BigMacName.setText("Wings");
				   BigMac.setHorizontalAlignment(SwingConstants.CENTER);
		
				   //Onion Rings
  //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------     
		        
				   
			       OnionRingsSize.addActionListener(new ActionListener() {
			                	
			                    @Override
			                    public void actionPerformed(ActionEvent e) {
			                    	double resultOnionRings = 0;

			                        String selectedValueOnionRings = (String) OnionRingsSize.getSelectedItem();

			                        if (" 5 pieces".equals(selectedValueOnionRings)) {
			                        	OnionRingsPriceSt.setText(String.format("%.2f $", snacks.getOnionRingsPrice()));
			                        } else if (" 10 pieces".equals(selectedValueOnionRings)) {
			                        	resultOnionRings = snacks.getOnionRingsPrice() * 1.5;
			                        	OnionRingsPriceSt.setText(String.format("%.2f $", resultOnionRings));
			                        } 
			                    }
			                });

			       OnionRingsSize.setEditable(true);
			       OnionRingsSize.setFont(new Font("Century", Font.PLAIN, 13));
			       OnionRingsSize.setBounds(779, 380, 83, 20);

			                contentPane.add(OnionRingsSize);
			                contentPane.add(OnionRingsPriceSt);
			                contentPane.remove(RoyalCheeseBurgerSize);
			                contentPane.remove(RoyalCheeseburgerPriceSt);
		        
		        RoyalCheeseBurger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Snacks\\Onion Rings.png"));
		        RoyalCheeseburgerName.setText("Onion Rings");
		        RoyalCheeseBurger.setHorizontalAlignment(SwingConstants.CENTER);
		        
		        //Shrimps
  //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		        
			        
			       ShrimpsSize.addActionListener(new ActionListener() {
			                	
			                    @Override
			                    public void actionPerformed(ActionEvent e) {
			                    	double resultShrimps = 0;

			                        String selectedValueShrimps = (String) ShrimpsSize.getSelectedItem();

			                        if (" 4 pieces".equals(selectedValueShrimps)) {
			                        	ShrimpsPriceSt.setText(String.format("%.2f $", snacks.getShrimpsPrice()));
			                        } else if (" 6 pieces".equals(selectedValueShrimps)) {
			                        	resultShrimps = snacks.getShrimpsPrice() * 1.5;
			                        	ShrimpsPriceSt.setText(String.format("%.2f $", resultShrimps));
			                        
			                        } 
			                       
			                    }
			                });

			       ShrimpsSize.setEditable(true);
			       ShrimpsSize.setFont(new Font("Century", Font.PLAIN, 13));
			       ShrimpsSize.setBounds(55, 670, 83, 20);

			                contentPane.add(ShrimpsSize);
			                contentPane.add(ShrimpsPriceSt);
			                contentPane.remove(ChickenBurgerSize);
			                contentPane.remove(ChickenBurgerPriceSt);
		        
		        ChickenBurger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Snacks\\Shrimps.png"));
		        ChickenBurgerName.setText("Shrimps");
		        ChickenBurger.setHorizontalAlignment(SwingConstants.CENTER);
		        
 //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		        
		        MaestroBurger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Snacks\\Chicken Box.png"));
		        MaestroBurgerName.setText("Chicken Box");
		        MaestroBurger.setHorizontalAlignment(SwingConstants.CENTER);
		        MaestroBurger.setVerticalAlignment(SwingConstants.TOP);
		        
		        
		        
		        contentPane.add(FrenchFriesAdd);
		        contentPane.add(FrenchFriesIncrease);
		        contentPane.add(FrenchFriesReduce);

		        contentPane.add(WedgesAdd);
		        contentPane.add(WedgesIncrease);
		        contentPane.add(WedgesReduce);
		        		        
		        contentPane.add(McNuggetsAdd);
		        contentPane.add(McNuggetsIncrease);		
		        contentPane.add(McNuggetsReduce);

		        contentPane.add(WingsAdd);
		        contentPane.add(WingsIncrease);
		        contentPane.add(WingsReduce);

		        contentPane.add(OnionRingsAdd);
		        contentPane.add(OnionRingsIncrease);
		        contentPane.add(OnionRingsReduce);

		        contentPane.add(ShrimpsAdd);
		        contentPane.add(ShrimpsIncrease);
		        contentPane.add(ShrimpsReduce);

		        contentPane.add(ChickenBoxAdd);
		        contentPane.add(ChickenBoxIncrease);
		        contentPane.add(ChickenBoxReduce);

		        
		        contentPane.remove(ChickenBurgerAdd);
		        contentPane.remove(ChickenBurgerIncrease);
		        contentPane.remove(ChickenBurgerReduce);

		        contentPane.remove(RoyalCheeseburgerAdd);
		        contentPane.remove(RoyalCheeseburgerIncrease);
		        contentPane.remove(RoyalCheeseburgerReduce);
		        		        
		        contentPane.remove(MaestroBurgerAdd);
		        contentPane.remove(MaestroBurgerIncrease);		
		        contentPane.remove(MaestroBurgerReduce);

		        contentPane.remove(BigTastyAdd);
		        contentPane.remove(BigTastyIncrease);
		        contentPane.remove(BigTastyReduce);

		        contentPane.remove(CesarRollAdd);
		        contentPane.remove(CesarRollIncrease);
		        contentPane.remove(CesarRollReduce);

		        contentPane.remove(FiletOFishAdd);
		        contentPane.remove(FiletOFishIncrease);
		        contentPane.remove(FiletOFishReduce);

		        contentPane.remove(BigMacAdd);
		        contentPane.remove(BigMacIncrease);
		        contentPane.remove(BigMacReduce);

		        contentPane.remove(McChickenAdd);
		        contentPane.remove(McChickenIncrease);
		        contentPane.remove(McChickenReduce);

		        contentPane.remove(CheeseburgerAdd);
		        contentPane.remove(CheeseburgerIncrease);
		        contentPane.remove(CheeseburgerReduce);

		        contentPane.remove(HamburgerAdd);
		        contentPane.remove(HamburgerIncrease);
		        contentPane.remove(HamburgerReduce);

		        
		        contentPane.remove(MaestroBurgerSize);
		        contentPane.remove(MaestroBurgerPriceSt);
		        contentPane.add(ChickenBoxPriceSt);
		        
		        contentPane.add(ChickenBurger);
		        contentPane.add(ChickenBurgerName);
		        
				
				contentPane.add(RoyalCheeseBurger);
		        contentPane.add(RoyalCheeseburgerName);
		        
		        contentPane.add(MaestroBurger);
				contentPane.add(MaestroBurgerName);
		       
		        contentPane.remove(BigTasty);
		        contentPane.remove(BigTastyName);
		        contentPane.remove(BigTastyPriceSt);
		        contentPane.remove(BigTastySize);
		        
		        contentPane.remove(CesarRoll);
		        contentPane.remove(CesarRollName);
		        contentPane.remove(CesarRollPriceSt);
		        
		        contentPane.remove(FiletOFish);
		        contentPane.remove(FiletOFishName);
		        contentPane.remove(FiletOFishPriceSt);
		        contentPane.remove(FiletOFishSize);
		        
		        contentPane.remove(FantaSize);
		        contentPane.remove(CocaColaSize);
		        contentPane.remove(CocaColaZeroSize);
		        contentPane.remove(SpriteSize);
		        contentPane.remove(OrangeJuiceSize);
		        contentPane.remove(CappySize);		
		        
		        contentPane.remove(McSundaeType);
		        contentPane.remove(McFlurryType);
		        contentPane.remove(BananaShakeSize);
		        contentPane.remove(ChocolateShakeSize);
		        contentPane.remove(StrawberryShakeSize);
		        contentPane.remove(VanillaShakeSize);
		        
		        contentPane.remove(TeaSize);
		        contentPane.remove(CoffeeSize);
		        contentPane.remove(LatteSize);
		        contentPane.remove(HotChocolateSize);
		        contentPane.remove(CappucinoSize);
		        
		        contentPane.add(HamburgerName);
				contentPane.add(CheeseBurgerName);
				contentPane.add(McChickenName);
				contentPane.add(BigMacName);

		        contentPane.remove(HappyMealFont1);
		        contentPane.remove(HappyMealFont2);
		        contentPane.remove(HappyMealFont3);
		        contentPane.remove(HappyMealFont4);
		        
		        contentPane.remove(FantaPriceSt);
		        contentPane.remove(CocaColaZeroPriceSt);
		        contentPane.remove(CocaColaPriceSt);
		        contentPane.remove(SpritePriceSt);
		        contentPane.remove(OrangeJuicePriceSt);
		        contentPane.remove(CappyPriceSt);
		        contentPane.remove(LemonadeGrapefruitPriceSt);
		        contentPane.remove(LemonadeStrawberryPriceSt);
		        contentPane.remove(SparklingWaterPriceSt);
		        
		        contentPane.remove(KetchupPriceSt);
		        contentPane.remove(MayonnaisePriceSt);
		        contentPane.remove(CheesePriceSt);
		        contentPane.remove(MustardPriceSt);
		        contentPane.remove(SalsaPriceSt);
		        contentPane.remove(SweetPriceSt);
		        contentPane.remove(BarbecuePriceSt);
		        
		        contentPane.remove(McSundaePriceSt);
		        contentPane.remove(McFlurryPriceSt);
		        contentPane.remove(MilkShakeChocolatePriceSt);
		        contentPane.remove(MilkShakeVanillaPriceSt);
		        contentPane.remove(MilkShakeStrawberryPriceSt);
		        contentPane.remove(MilkShakeBananaPriceSt);
		        contentPane.remove(ConeIcePriceSt);
		        
		        contentPane.remove(TeaPriceSt);
		        contentPane.remove(CoffeePriceSt);
		        contentPane.remove(LattePriceSt);
		        contentPane.remove(CappucinoPriceSt);
		        contentPane.remove(HotChocolatePriceSt);
		        contentPane.remove(EspressoPriceSt);
		        
		        contentPane.remove(MuffinBlackCurrantPriceSt);
		        contentPane.remove(MuffinChocolatePriceSt);
		        contentPane.remove(BananaMuffinPriceSt);
		        contentPane.remove(BrownMuffinPriceSt);
		        contentPane.remove(FruitPieCherryPriceSt);
		        contentPane.remove(FruitPieStrawberryPriceSt);
		        contentPane.remove(BakedApplePiePriceSt);
		        
		        contentPane.remove(HappyMealCheeseburgerPriceSt);
		        contentPane.remove(HappyMealChickenburgerPriceSt);
		        contentPane.remove(HappyMealHamburgerPriceSt);
		        contentPane.remove(HappyMealMcNuggetsPriceSt);
		        
		       
		        
		         FrenchFriesSize.setEditable(false);
				 WedgesSize.setEditable(false);
				 McNuggetsSize.setEditable(false);
				 WingsSize.setEditable(false);
				 OnionRingsSize.setEditable(false);
				 ShrimpsSize.setEditable(false);
		        
		        contentPane.revalidate();
		        contentPane.repaint();
		        
		        
		        
		           }
		    
			});
		        
		        //Burgers
		        //Hamburger
  //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		       
                 
		
		
		Burgers.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	
	            HamburgerSize.addActionListener(new ActionListener() {
	                @Override
	                public void actionPerformed(ActionEvent e) {
	                    double resultHamburger = 0;
	                    String selectedHamburgerSize = "Normal";
	                   
	                    String selectedValueHamburger = (String) HamburgerSize.getSelectedItem();

				                
	                    if ("Normal".equals(selectedValueHamburger)) {
	                        HamburgerPriceSt.setText(String.format("%.2f $", burgers.getHamburgerPrice()));
	                    } else if ("Double".equals(selectedValueHamburger)) {
	                        resultHamburger = burgers.getHamburgerPrice() * 2;
	                        HamburgerPriceSt.setText(String.format("%.2f $", resultHamburger));
	                    } else if ("Triple".equals(selectedValueHamburger)) {
	                        resultHamburger = burgers.getHamburgerPrice() * 3;
	                        HamburgerPriceSt.setText(String.format("%.2f $", resultHamburger));
	                    }
						        
						    }
							
						});
					
					contentPane.remove(FrenchFriesSize);
					contentPane.remove(FrenchFriesPriceSt);
					contentPane.remove(FantaPriceSt);
					contentPane.remove(KetchupPriceSt);
					contentPane.remove(McSundaePriceSt);
					contentPane.remove(TeaPriceSt);
					contentPane.remove(BananaMuffinPriceSt);
					contentPane.remove(HappyMealHamburgerPriceSt);
					contentPane.add(HamburgerPriceSt);
				    contentPane.add(HamburgerSize);
				    
				    
					
				    Hamburger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Burgers\\Hamburgers.png"));
					
					
					//Cheeseburger
		//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
					
				   
				    
					CheeseburgerSize.addActionListener(new ActionListener() {
			              double resultCheeseburger = 0; 
						@Override
						public void actionPerformed(ActionEvent e) {
							String selectedValueCheeseburger = (String) CheeseburgerSize.getSelectedItem();
					        
					        if ("Normal".equals(selectedValueCheeseburger)) {
					        	CheeseBurgerPriceSt.setText(String.format("%.2f $", burgers.getCheeseBurgerPrice()));
					        } else if ("Double".equals(selectedValueCheeseburger)) {
					        	resultCheeseburger= burgers.getCheeseBurgerPrice()*2;
					        	CheeseBurgerPriceSt.setText(String.format("%.2f $", resultCheeseburger));
					        } else {
					        	resultCheeseburger= burgers.getCheeseBurgerPrice()*3;
					        	CheeseBurgerPriceSt.setText(String.format("%.2f $", resultCheeseburger));
					        }
					    }
						
					});
		               
		                contentPane.remove(WedgesSize);
		                contentPane.remove(WedgesPriceSt);
		                contentPane.remove(CocaColaPriceSt);
		                contentPane.remove(MayonnaisePriceSt);
		                contentPane.remove(McFlurryPriceSt);
		                contentPane.remove(CoffeePriceSt);
		                contentPane.remove(BrownMuffinPriceSt);
		                contentPane.remove(HappyMealCheeseburgerPriceSt);
		                contentPane.add(CheeseburgerSize);
		                contentPane.add(CheeseBurgerPriceSt);
		               
		                
		              

						
					
					Cheeseburger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Burgers\\Cheeseburgers.png"));
					
					
					//McChicken
 //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
					
					McChickenSize.addActionListener(new ActionListener() {
			            double resultMcChicken = 0; 
						@Override
						public void actionPerformed(ActionEvent e) {
							String selectedValueMcChicken = (String) McChickenSize.getSelectedItem();
					        
					        if ("Normal".equals(selectedValueMcChicken)) {
					        	McChickenPriceSt.setText(String.format("%.2f $", burgers.getMcChickenPrice()));
					        } else {
					        	resultMcChicken= burgers.getMcChickenPrice()*2;
					        	McChickenPriceSt.setText(String.format("%.2f $", resultMcChicken));
					        	
					        } 
					    }
						
					});
		              
		                contentPane.remove(McNuggetsSize);
		                contentPane.remove(McNuggetsPriceSt);
		                contentPane.remove(SpritePriceSt);
		                contentPane.remove(CheesePriceSt);
		                contentPane.remove(MilkShakeChocolatePriceSt);
		                contentPane.remove(LattePriceSt);
		                contentPane.remove(MuffinBlackCurrantPriceSt);
		                contentPane.remove(HappyMealChickenburgerPriceSt);
		                contentPane.add(McChickenSize);
		                contentPane.add(McChickenPriceSt);
					
					McChicken.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Burgers\\Mc Chicken.png"));
					
					
					//Bigmac
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
					
					BigMacSize.addActionListener(new ActionListener() {
			            double resultBigMac = 0; 
						@Override
						public void actionPerformed(ActionEvent e) {
							String selectedValueBigMac = (String) BigMacSize.getSelectedItem();
					        
					        if ("Normal".equals(selectedValueBigMac)) {
					        	BigMacPriceSt.setText(String.format("%.2f $", burgers.getBigMacPrice()));
					        } else {
					        	resultBigMac= burgers.getBigMacPrice()*2;
					        	BigMacPriceSt.setText(String.format("%.2f $", resultBigMac));
					        	
					        } 
					    }
						
					});
					
		              
		                contentPane.remove(WingsSize);
		                contentPane.remove(WingsPriceSt);
		                contentPane.remove(CocaColaZeroPriceSt);
		                contentPane.remove(BarbecuePriceSt);
		                contentPane.remove(MilkShakeVanillaPriceSt);
		                contentPane.remove(CappucinoPriceSt);
		                contentPane.remove(MuffinChocolatePriceSt);
		                contentPane.remove(HappyMealMcNuggetsPriceSt);
		                contentPane.add(BigMacSize);
		                contentPane.add(BigMacPriceSt);
					
					BigMac.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Burgers\\BigMac.png"));
					
					
				//Royal Cheeseburger	
 //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
					
					RoyalCheeseBurgerSize.addActionListener(new ActionListener() {
			            double resultRoyalCheeseBurger = 0; 
						@Override
						public void actionPerformed(ActionEvent e) {
							String selectedValueRoyalCheeseburger = (String) RoyalCheeseBurgerSize.getSelectedItem();
					        
					        if ("Normal".equals(selectedValueRoyalCheeseburger)) {
					        	RoyalCheeseburgerPriceSt.setText(String.format("%.2f $", burgers.getRoyalCheeseBurgerPrice()));
					        } else {
					        	resultRoyalCheeseBurger= burgers.getRoyalCheeseBurgerPrice()*2;
					        	RoyalCheeseburgerPriceSt.setText(String.format("%.2f $", resultRoyalCheeseBurger));
					        	
					        } 
					    }
						
					});
					
		             
		                contentPane.remove(OnionRingsSize);
		                contentPane.remove(OnionRingsPriceSt);
		                contentPane.remove(LemonadeGrapefruitPriceSt);
		                contentPane.remove(MustardPriceSt);
		                contentPane.remove(MilkShakeStrawberryPriceSt);
		                contentPane.remove(HotChocolatePriceSt);
		                contentPane.remove(BakedApplePiePriceSt);
		                contentPane.add(RoyalCheeseBurgerSize);
		                contentPane.add(RoyalCheeseburgerPriceSt);
					
					RoyalCheeseBurger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Burgers\\Royal CheeseBurger.png"));
					
					
					//Chickenburger
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
					
					
					ChickenBurgerSize.addActionListener(new ActionListener() {
			            double resultChickenBurger = 0; 
						@Override
						public void actionPerformed(ActionEvent e) {
							String selectedValueChickenBurger = (String) ChickenBurgerSize.getSelectedItem();
					        
					        if ("Normal".equals(selectedValueChickenBurger)) {
					        	ChickenBurgerPriceSt.setText(String.format("%.2f $", burgers.getChickenBurgerPrice()));
					        } else {
					        	resultChickenBurger= burgers.getChickenBurgerPrice()*2;
					        	ChickenBurgerPriceSt.setText(String.format("%.2f $", resultChickenBurger));
					        	
					        } 
					    }
						
					});
					
		              
		                contentPane.remove(ShrimpsSize);
		                contentPane.remove(ShrimpsPriceSt);
		                contentPane.remove(LemonadeStrawberryPriceSt);
		                contentPane.remove(SalsaPriceSt);
		                contentPane.remove(MilkShakeBananaPriceSt);
		                contentPane.remove(HotChocolatePriceSt);
		                contentPane.remove(FruitPieStrawberryPriceSt);
		                contentPane.add(ChickenBurgerSize);
		                contentPane.add(ChickenBurgerPriceSt);
					
					ChickenBurger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Burgers\\Chicken Burger.png"));
					
					
					//Maestro Burger
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------				
					
					MaestroBurgerSize.addActionListener(new ActionListener() {
			            double resultMaestroBurger = 0; 
						@Override
						public void actionPerformed(ActionEvent e) {
							String selectedValueMaestroBurger = (String) MaestroBurgerSize.getSelectedItem();
					        
					        if ("Normal".equals(selectedValueMaestroBurger)) {
					        	MaestroBurgerPriceSt.setText(String.format("%.2f $", burgers.getMaestroBurgerPrice()));
					        } else {
					        	resultMaestroBurger= burgers.getMaestroBurgerPrice()*2;
					        	MaestroBurgerPriceSt.setText(String.format("%.2f $", resultMaestroBurger));
					        	
					        } 
					    }
						
					});
					
				    contentPane.remove(ChickenBoxPriceSt);
				    contentPane.remove(OrangeJuicePriceSt);
				    contentPane.remove(SweetPriceSt);
				    contentPane.remove(ConeIcePriceSt);
				    contentPane.remove(EspressoPriceSt);
				    contentPane.remove(FruitPieCherryPriceSt);
	                contentPane.add(MaestroBurgerSize);
	                contentPane.add(MaestroBurgerPriceSt);
					
					MaestroBurger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Burgers\\Maestro Burger.png"));
					
					
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
					
					BigTasty.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Burgers\\Big Tasty.png"));
					contentPane.remove(CappyPriceSt);
					BigTastyName.setText("Big Tasty");
					
					
					CesarRoll.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Burgers\\Cesar Roll.png"));
					CesarRollName.setText("Cesar Roll");
					contentPane.remove(SparklingWaterPriceSt);
					
					FiletOFish.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Burgers\\Filet-O-Fish.png"));
					
					
					
					HamburgerName.setText("Hamburger");
					CheeseBurgerName.setText("Cheeseburger");
					McChickenName.setText("McChicken");
					BigMacName.setText("BigMac");
					RoyalCheeseburgerName.setText("Royal Cheeseburger");
					ChickenBurgerName.setText("Chickenburger ");
					MaestroBurgerName.setText("Maestro Burger");
					
					contentPane.add(ChickenBurgerAdd);
					contentPane.add(ChickenBurgerIncrease);
					contentPane.add(ChickenBurgerReduce);

					contentPane.add(RoyalCheeseburgerAdd);
					contentPane.add(RoyalCheeseburgerIncrease);
					contentPane.add(RoyalCheeseburgerReduce);
							        
					contentPane.add(MaestroBurgerAdd);
					contentPane.add(MaestroBurgerIncrease);		
					contentPane.add(MaestroBurgerReduce);

					contentPane.add(BigTastyAdd);
					contentPane.add(BigTastyIncrease);
					contentPane.add(BigTastyReduce);

					contentPane.add(CesarRollAdd);
					contentPane.add(CesarRollIncrease);
					contentPane.add(CesarRollReduce);

					contentPane.add(FiletOFishAdd);
					contentPane.add(FiletOFishIncrease);
					contentPane.add(FiletOFishReduce);

					contentPane.add(BigMacAdd);
					contentPane.add(BigMacIncrease);
					contentPane.add(BigMacReduce);

					contentPane.add(McChickenAdd);
					contentPane.add(McChickenIncrease);
					contentPane.add(McChickenReduce);

					contentPane.add(CheeseburgerAdd);
					contentPane.add(CheeseburgerIncrease);
					contentPane.add(CheeseburgerReduce);

					contentPane.add(HamburgerAdd);
					contentPane.add(HamburgerIncrease);
					contentPane.add(HamburgerReduce);  
					
					contentPane.add(ChickenBurger);
			        contentPane.add(ChickenBurgerName);
					
					contentPane.add(RoyalCheeseBurger);
			        contentPane.add(RoyalCheeseburgerName);
			        
					contentPane.add(MaestroBurger);
					contentPane.add(MaestroBurgerName);
					contentPane.add(MaestroBurgerSize);
					
					contentPane.add(BigTasty);
					contentPane.add(BigTastyName);
					contentPane.add(BigTastyPriceSt);
					contentPane.add(BigTastySize);
					
					contentPane.add(CesarRoll);
					contentPane.add(CesarRollName);
					contentPane.add(CesarRollPriceSt);
					
					contentPane.add(FiletOFish);
					contentPane.add(FiletOFishName);
					contentPane.add(FiletOFishPriceSt);
					contentPane.add(FiletOFishSize);
					
					
					contentPane.remove(FantaSize);
			        contentPane.remove(CocaColaSize);
			        contentPane.remove(CocaColaZeroSize);
			        contentPane.remove(SpriteSize);
			        contentPane.remove(OrangeJuiceSize);
			        contentPane.remove(CappySize);	
			        
			        contentPane.remove(McSundaeType);
			        contentPane.remove(McFlurryType);
			        contentPane.remove(BananaShakeSize);
			        contentPane.remove(ChocolateShakeSize);
			        contentPane.remove(StrawberryShakeSize);
			        contentPane.remove(VanillaShakeSize);
			        
			        contentPane.remove(TeaSize);
			        contentPane.remove(CoffeeSize);
			        contentPane.remove(LatteSize);
			        contentPane.remove(HotChocolateSize);
			        contentPane.remove(CappucinoSize);
					
			        
			        contentPane.add(HamburgerName);
					contentPane.add(CheeseBurgerName);
					contentPane.add(McChickenName);
					contentPane.add(BigMacName);

			        contentPane.remove(HappyMealFont1);
			        contentPane.remove(HappyMealFont2);
			        contentPane.remove(HappyMealFont3);
			        contentPane.remove(HappyMealFont4);
					
					contentPane.revalidate();
			        contentPane.repaint();
					
				}
				
			});
			
	        //Beverages
	        //Fanta
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	       
		 Beverages.addActionListener(new ActionListener() {
             
			    @Override
			    public void actionPerformed(ActionEvent e) {
			        
			    	FantaSize.addActionListener(new ActionListener() {
			            @Override
			            public void actionPerformed(ActionEvent e) {
			            	double resultFanta=0;
			            	
			              String selectedValueFanta = (String) FantaSize.getSelectedItem();
			               

			                
			                if ("Small".equals(selectedValueFanta)) {
			                	FantaPriceSt.setText(String.format("%.2f $", beverages.getFantaPrice()));
			                } else if ("Medium".equals(selectedValueFanta)) {
			                	resultFanta = beverages.getFantaPrice() * 1.5;
			                	FantaPriceSt.setText(String.format("%.2f $", resultFanta));
			                } else if ("Large".equals(selectedValueFanta)) {
			                	resultFanta = beverages.getFantaPrice() * 2.0;
			                	FantaPriceSt.setText(String.format("%.2f $", resultFanta));
			                } else if ("Extra".equals(selectedValueFanta)) {
			                	resultFanta = beverages.getFantaPrice() * 2.5;
			                	FantaPriceSt.setText(String.format("%.2f $", resultFanta));
			                }
			            }
			        });
			    	FantaSize.setEditable(true);
			    	FantaSize.setFont(new Font("Century", Font.PLAIN, 13));
			    	FantaSize.setBounds(55, 380, 83, 20);
			    	
					contentPane.remove(HamburgerSize);
					contentPane.remove(FrenchFriesSize);
					contentPane.remove(HamburgerPriceSt);
					contentPane.add(FantaSize);
					contentPane.add(FantaPriceSt);



					
			        Hamburger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Beverages\\Fanta.png"));
			        HamburgerName.setText("Fanta");
			        Hamburger.setVerticalAlignment(SwingConstants.CENTER);
			        
			        //Coca-Cola
  //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
			      	
					        
					    	CocaColaSize.addActionListener(new ActionListener() {
					            @Override
					            public void actionPerformed(ActionEvent e) {
					            	double resultCocaCola=0;
					            	
					              String selectedValueCocaCola = (String) CocaColaSize.getSelectedItem();
					               

					                
					                if ("Small".equals(selectedValueCocaCola)) {
					                	CocaColaPriceSt.setText(String.format("%.2f $", beverages.getCocaColaPrice()));
					                } else if ("Medium".equals(selectedValueCocaCola)) {
					                	resultCocaCola = beverages.getCocaColaPrice() * 1.5;
					                	CocaColaPriceSt.setText(String.format("%.2f $", resultCocaCola));
					                } else if ("Large".equals(selectedValueCocaCola)) {
					                	resultCocaCola = beverages.getCocaColaPrice() * 2.0;
					                	CocaColaPriceSt.setText(String.format("%.2f $", resultCocaCola));
					                } else if ("Extra".equals(selectedValueCocaCola)) {
					                	resultCocaCola = beverages.getCocaColaPrice() * 2.5;
					                	CocaColaPriceSt.setText(String.format("%.2f $", resultCocaCola));
					                }
					                
					            }
					        });
					    	CocaColaSize.setEditable(true);
					    	CocaColaSize.setFont(new Font("Century", Font.PLAIN, 13));
					    	CocaColaSize.setBounds(236, 380, 83, 20);
					    	
					    	contentPane.remove(CheeseburgerSize);
							contentPane.remove(WedgesSize);
							contentPane.remove(CheeseBurgerPriceSt);
							contentPane.add(CocaColaSize);
							contentPane.add(CocaColaPriceSt);

							
							Cheeseburger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Beverages\\Coca-Cola.png"));
							CheeseBurgerName.setText("Coca-Cola");
							Cheeseburger.setVerticalAlignment(SwingConstants.CENTER);
							Cheeseburger.setHorizontalAlignment(SwingConstants.CENTER);
							
					 //Sprite
  //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
										      						
							
							SpriteSize.addActionListener(new ActionListener() {
					            @Override
					            public void actionPerformed(ActionEvent e) {
					            	double resultSprite=0;
					            	
					              String selectedValueSprite = (String) SpriteSize.getSelectedItem();
					               

					                
					                if ("Small".equals(selectedValueSprite)) {
					                	SpritePriceSt.setText(String.format("%.2f $", beverages.getSpritePrice()));
					                } else if ("Medium".equals(selectedValueSprite)) {
					                	resultSprite = beverages.getSpritePrice() * 1.5;
					                	SpritePriceSt.setText(String.format("%.2f $", resultSprite));
					                } else if ("Large".equals(selectedValueSprite)) {
					                	resultSprite = beverages.getSpritePrice() * 2.0;
					                	SpritePriceSt.setText(String.format("%.2f $", resultSprite));
					                } else if ("Extra".equals(selectedValueSprite)) {
					                	resultSprite = beverages.getSpritePrice() * 2.5;
					                	SpritePriceSt.setText(String.format("%.2f $",resultSprite));
					                }
					            }
					        });
							SpriteSize.setEditable(true);
							SpriteSize.setFont(new Font("Century", Font.PLAIN, 13));
							SpriteSize.setBounds(417, 380, 83, 20);
							
							contentPane.remove(McChickenSize);
							contentPane.remove(McNuggetsSize);
							contentPane.remove(McChickenPriceSt);
							contentPane.add(SpriteSize);
							contentPane.add(SpritePriceSt);
							

							
							McChicken.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Beverages\\Sprite.png"));
							McChickenName.setText("Sprite");
							McChicken.setVerticalAlignment(SwingConstants.CENTER);
							McChicken.setHorizontalAlignment(SwingConstants.CENTER);
							
							//CocaColaZero
 //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------						
							
							CocaColaZeroSize.addActionListener(new ActionListener() {
					            @Override
					            public void actionPerformed(ActionEvent e) {
					            	double resultCocaColaZero=0;
					            	
					              String selectedValueCocaColaZero = (String) CocaColaZeroSize.getSelectedItem();
					               

					                
					                if ("Small".equals(selectedValueCocaColaZero)) {
					                	CocaColaZeroPriceSt.setText(String.format("%.2f $", beverages.getCocaColaZeroPrice()));
					                } else if ("Medium".equals(selectedValueCocaColaZero)) {
					                	resultCocaColaZero = beverages.getCocaColaZeroPrice() * 1.5;
					                	CocaColaZeroPriceSt.setText(String.format("%.2f $", resultCocaColaZero));
					                } else if ("Large".equals(selectedValueCocaColaZero)) {
					                	resultCocaColaZero = beverages.getCocaColaZeroPrice() * 2.0;
					                	CocaColaZeroPriceSt.setText(String.format("%.2f $", resultCocaColaZero));
					                } else if ("Extra".equals(selectedValueCocaColaZero)) {
					                	resultCocaColaZero = beverages.getCocaColaZeroPrice() * 2.5;
					                	CocaColaZeroPriceSt.setText(String.format("%.2f $", resultCocaColaZero));
					                }
					            }
					        });
							CocaColaZeroSize.setEditable(true);
							CocaColaZeroSize.setFont(new Font("Century", Font.PLAIN, 13));
							CocaColaZeroSize.setBounds(598, 380, 83, 20);
							
							contentPane.remove(BigMacSize);
							contentPane.remove(WingsSize);
							contentPane.remove(BigMacPriceSt);
							contentPane.add(CocaColaZeroSize);
							contentPane.add(CocaColaZeroPriceSt);

							
							BigMac.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Beverages\\Coca-Cola Zero.png"));
							BigMacName.setText("Coca-Cola Zero");
							BigMac.setVerticalAlignment(SwingConstants.CENTER);
							BigMac.setHorizontalAlignment(SwingConstants.CENTER);
							
							
							//Lemonade Grapefruit
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------						
						
							contentPane.remove(RoyalCheeseBurgerSize);
							contentPane.remove(OnionRingsSize);
							contentPane.remove(RoyalCheeseburgerPriceSt);
							contentPane.add(LemonadeGrapefruitPriceSt);
							
							RoyalCheeseBurger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Beverages\\Lemonade Grapefruit.png"));
							RoyalCheeseburgerName.setText("Lemonade Grapefruit");
							RoyalCheeseBurger.setVerticalAlignment(SwingConstants.CENTER);
							RoyalCheeseBurger.setHorizontalAlignment(SwingConstants.CENTER);
							
							
							//Lemonade Stawberry
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------						
							contentPane.remove(ChickenBurgerSize);
							contentPane.remove(ShrimpsSize);
							contentPane.remove(ChickenBurgerPriceSt);
							contentPane.add(LemonadeStrawberryPriceSt);
							
							ChickenBurger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Beverages\\Lemonade Strawberry.png"));
							ChickenBurgerName.setText("Lemonade Strawberry");
							ChickenBurger.setVerticalAlignment(SwingConstants.CENTER);
							ChickenBurger.setHorizontalAlignment(SwingConstants.CENTER);
							
							
							//Orange Juice
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------						
							
							OrangeJuiceSize.addActionListener(new ActionListener() {
					            @Override
					            public void actionPerformed(ActionEvent e) {
					            	double resultOrangeJuice=0;
					            	
					              String selectedValueOrangeJuice = (String) OrangeJuiceSize.getSelectedItem();
					               

					                
					                if ("Small".equals(selectedValueOrangeJuice)) {
					                	OrangeJuicePriceSt.setText(String.format("%.2f $", beverages.getOrangeJuicePrice()));
					                } else if ("Medium".equals(selectedValueOrangeJuice)) {
					                	resultOrangeJuice = beverages.getOrangeJuicePrice() * 1.5;
					                	OrangeJuicePriceSt.setText(String.format("%.2f $", resultOrangeJuice));
					                } else if ("Large".equals(selectedValueOrangeJuice)) {
					                	resultOrangeJuice = beverages.getOrangeJuicePrice() * 2.0;
					                	OrangeJuicePriceSt.setText(String.format("%.2f $", resultOrangeJuice));
					                }
					            }
					        });
							OrangeJuiceSize.setEditable(true);
							OrangeJuiceSize.setFont(new Font("Century", Font.PLAIN, 13));
							OrangeJuiceSize.setBounds(236, 670, 83, 20);
							
							contentPane.remove(MaestroBurgerSize);
							contentPane.remove(MaestroBurgerPriceSt);
							contentPane.add(OrangeJuicePriceSt);
							contentPane.add(OrangeJuiceSize);

							
							MaestroBurger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Beverages\\Orange Juice.png"));
							MaestroBurgerName.setText("Orange Juice");
							MaestroBurger.setVerticalAlignment(SwingConstants.CENTER);
							MaestroBurger.setHorizontalAlignment(SwingConstants.CENTER);
							
							//Cappy
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
							
							CappySize.addActionListener(new ActionListener() {
					            @Override
					            public void actionPerformed(ActionEvent e) {
					            	double resultCappy=0;
					            	
					              String selectedValueCappy = (String) CappySize.getSelectedItem();
					               

					                
					                if ("Small".equals(selectedValueCappy)) {
					                	CappyPriceSt.setText(String.format("%.2f $", beverages.getCappyJuicePrice()));
					                } else if ("Medium".equals(selectedValueCappy)) {
					                	resultCappy = beverages.getCappyJuicePrice() * 1.8 - 0.02;
					                	CappyPriceSt.setText(String.format("%.2f $", resultCappy));
					                } 
					            }
					        });
							CappySize.setEditable(true);
							CappySize.setFont(new Font("Century", Font.PLAIN, 13));
							CappySize.setBounds(417, 670, 83, 20);
							
							contentPane.remove(BigTastySize);
							contentPane.remove(BigTastyPriceSt);
							contentPane.add(CappySize);
							contentPane.add(CappyPriceSt);

							
							BigTasty.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Beverages\\Cappy.png"));
							BigTastyName.setText("Cappy");
							BigTasty.setVerticalAlignment(SwingConstants.CENTER);
							BigTasty.setHorizontalAlignment(SwingConstants.CENTER);
							
							//Sparkling Water
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
							
							contentPane.remove(CesarRollPriceSt);
							contentPane.add(SparklingWaterPriceSt);
							
							CesarRoll.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Beverages\\Sparkling Water.png"));
							CesarRollName.setText("Sparkling Water");
							CesarRoll.setVerticalAlignment(SwingConstants.CENTER);
							CesarRoll.setHorizontalAlignment(SwingConstants.CENTER);
							
							contentPane.add(FantaAdd);
					        contentPane.add(FantaIncrease);
					        contentPane.add(FantaReduce);

					        contentPane.add(CocaColaAdd);
					        contentPane.add(CocaColaIncrease);
					        contentPane.add(CocaColaReduce);
					        		        
					        contentPane.add(SpriteAdd);
					        contentPane.add(SpriteIncrease);		
					        contentPane.add(SpriteReduce);

					        contentPane.add(CocaColaZeroAdd);
					        contentPane.add(CocaColaZeroIncrease);
					        contentPane.add(CocaColaZeroReduce);

					        contentPane.add(LemonadeGrapefruitAdd);
					        contentPane.add(LemonadeGrapefruitIncrease);
					        contentPane.add(LemonadeGrapefruitReduce);

					        contentPane.add(LemonadeStrawberryAdd);
					        contentPane.add(LemonadeStrawberryIncrease);
					        contentPane.add(LemonadeStrawberryReduce);

					        contentPane.add(OrangeJuiceAdd);
					        contentPane.add(OrangeJuiceIncrease);
					        contentPane.add(OrangeJuiceReduce);
					        
					        contentPane.add(CappyAdd);
					        contentPane.add(CappyIncrease);
					        contentPane.add(CappyReduce);
					        
					        contentPane.add(SparklingWaterAdd);
					        contentPane.add(SparklingWaterIncrease);
					        contentPane.add(SparklingWaterReduce);
							
							contentPane.remove(ChickenBurgerAdd);
							contentPane.remove(ChickenBurgerIncrease);
							contentPane.remove(ChickenBurgerReduce);

							contentPane.remove(RoyalCheeseburgerAdd);
							contentPane.remove(RoyalCheeseburgerIncrease);
							contentPane.remove(RoyalCheeseburgerReduce);
									        
							contentPane.remove(MaestroBurgerAdd);
							contentPane.remove(MaestroBurgerIncrease);		
							contentPane.remove(MaestroBurgerReduce);

							contentPane.remove(BigTastyAdd);
							contentPane.remove(BigTastyIncrease);
							contentPane.remove(BigTastyReduce);

							contentPane.remove(CesarRollAdd);
							contentPane.remove(CesarRollIncrease);
							contentPane.remove(CesarRollReduce);

							contentPane.remove(FiletOFishAdd);
							contentPane.remove(FiletOFishIncrease);
							contentPane.remove(FiletOFishReduce);

							contentPane.remove(BigMacAdd);
							contentPane.remove(BigMacIncrease);
							contentPane.remove(BigMacReduce);

							contentPane.remove(McChickenAdd);
							contentPane.remove(McChickenIncrease);
							contentPane.remove(McChickenReduce);

							contentPane.remove(CheeseburgerAdd);
							contentPane.remove(CheeseburgerIncrease);
							contentPane.remove(CheeseburgerReduce);

							contentPane.remove(HamburgerAdd);
							contentPane.remove(HamburgerIncrease);
							contentPane.remove(HamburgerReduce);

							
							contentPane.add(ChickenBurger);
					        contentPane.add(ChickenBurgerName);
							
							contentPane.add(RoyalCheeseBurger);
					        contentPane.add(RoyalCheeseburgerName);
							
							contentPane.add(MaestroBurger);
							contentPane.add(MaestroBurgerName);
							contentPane.add(MaestroBurgerSize);
							
							contentPane.add(BigTasty);
							contentPane.add(BigTastyName);
							contentPane.add(BigTastySize);
							
							contentPane.add(CesarRoll);
							contentPane.add(CesarRollName);
							
							
							contentPane.remove(FiletOFish);
					        contentPane.remove(FiletOFishName);
					        contentPane.remove(FiletOFishPriceSt);
					        contentPane.remove(FiletOFishSize);
							
					        contentPane.remove(TeaSize);
					        contentPane.remove(CoffeeSize);
					        contentPane.remove(LatteSize);
					        contentPane.remove(HotChocolateSize);
					        contentPane.remove(CappucinoSize);
					        
					        contentPane.remove(McSundaeType);
					        contentPane.remove(McFlurryType);
					        contentPane.remove(VanillaShakeSize);
					        contentPane.remove(BananaShakeSize);
					        contentPane.remove(ChocolateShakeSize);
					        contentPane.remove(StrawberryShakeSize);
					        
					        contentPane.add(HamburgerName);
							contentPane.add(CheeseBurgerName);
							contentPane.add(McChickenName);
							contentPane.add(BigMacName);

					        contentPane.remove(HappyMealFont1);
					        contentPane.remove(HappyMealFont2);
					        contentPane.remove(HappyMealFont3);
					        contentPane.remove(HappyMealFont4);
					        
					        contentPane.remove(FrenchFriesPriceSt);
					        contentPane.remove(WedgesPriceSt);
					        contentPane.remove(McNuggetsPriceSt);
					        contentPane.remove(WingsPriceSt);
					        contentPane.remove(OnionRingsPriceSt);
					        contentPane.remove(ShrimpsPriceSt);
					        contentPane.remove(ChickenBoxPriceSt);
					        
					        contentPane.remove(KetchupPriceSt);
					        contentPane.remove(MayonnaisePriceSt);
					        contentPane.remove(CheesePriceSt);
					        contentPane.remove(MustardPriceSt);
					        contentPane.remove(SalsaPriceSt);
					        contentPane.remove(SweetPriceSt);
					        contentPane.remove(BarbecuePriceSt);
					        
					        contentPane.remove(McSundaePriceSt);
					        contentPane.remove(McFlurryPriceSt);
					        contentPane.remove(MilkShakeChocolatePriceSt);
					        contentPane.remove(MilkShakeVanillaPriceSt);
					        contentPane.remove(MilkShakeStrawberryPriceSt);
					        contentPane.remove(MilkShakeBananaPriceSt);
					        contentPane.remove(ConeIcePriceSt);
					        
					        contentPane.remove(TeaPriceSt);
					        contentPane.remove(CoffeePriceSt);
					        contentPane.remove(LattePriceSt);
					        contentPane.remove(CappucinoPriceSt);
					        contentPane.remove(HotChocolatePriceSt);
					        contentPane.remove(EspressoPriceSt);
					        
					        contentPane.remove(MuffinBlackCurrantPriceSt);
					        contentPane.remove(MuffinChocolatePriceSt);
					        contentPane.remove(BananaMuffinPriceSt);
					        contentPane.remove(BrownMuffinPriceSt);
					        contentPane.remove(FruitPieCherryPriceSt);
					        contentPane.remove(FruitPieStrawberryPriceSt);
					        contentPane.remove(BakedApplePiePriceSt);
					        
					        contentPane.remove(HappyMealCheeseburgerPriceSt);
					        contentPane.remove(HappyMealChickenburgerPriceSt);
					        contentPane.remove(HappyMealHamburgerPriceSt);
					        contentPane.remove(HappyMealMcNuggetsPriceSt);
					        
					         FantaSize.setEditable(false);
							 CocaColaSize.setEditable(false);
							 SpriteSize.setEditable(false);
							 CocaColaZeroSize.setEditable(false);
							 OrangeJuiceSize.setEditable(false);
							 CappySize.setEditable(false);
					        
							contentPane.revalidate();
					        contentPane.repaint();
		
		
		
			    }
		 });
				
		 //Ketchup
 //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		 
		 
		 Sauces.addActionListener(new ActionListener() {
             
			    @Override
			    public void actionPerformed(ActionEvent e) {
			    	
			    	
					contentPane.remove(HamburgerSize);
					contentPane.remove(FrenchFriesSize);
					contentPane.remove(FantaSize);
					contentPane.remove(HamburgerPriceSt);
					contentPane.add(KetchupPriceSt);
					

					
			        Hamburger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Sauces\\Ketchup.png"));
			        HamburgerName.setText("Ketchup");
			        Hamburger.setVerticalAlignment(SwingConstants.CENTER);
			        Hamburger.setHorizontalAlignment(SwingConstants.CENTER);
			      
			        //Mayonnaise
 //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------		        
			        
			        contentPane.remove(CheeseburgerSize);
					contentPane.remove(WedgesSize);
					contentPane.remove(CocaColaSize);
					contentPane.remove(CheeseBurgerPriceSt);
					contentPane.add(MayonnaisePriceSt);
					

					
					Cheeseburger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Sauces\\Mayonnaise.png"));
					CheeseBurgerName.setText("Mayonnaise");
					Cheeseburger.setVerticalAlignment(SwingConstants.CENTER);
					Cheeseburger.setHorizontalAlignment(SwingConstants.CENTER);
			        
					contentPane.revalidate();
			        contentPane.repaint();
			        
			        //Cheese Sauce
 //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------    
			        
			        contentPane.remove(McChickenSize);
					contentPane.remove(McNuggetsSize);
					contentPane.remove(SpriteSize);
					contentPane.remove(McChickenPriceSt);
					contentPane.add(CheesePriceSt);
					
					McChicken.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Sauces\\Cheese Sauce.png"));
					McChickenName.setText("Cheese Sauce");
					McChicken.setVerticalAlignment(SwingConstants.CENTER);
					McChicken.setHorizontalAlignment(SwingConstants.CENTER);
			        
				
			       //Barbecue Sauce 
 //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------		        
			        
			        contentPane.remove(BigMacSize);
					contentPane.remove(WingsSize);
					contentPane.remove(CocaColaZeroSize);
					contentPane.remove(BigMacPriceSt);
					contentPane.add(BarbecuePriceSt);
					
					BigMac.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Sauces\\Barbecue Sauce.png"));
					BigMacName.setText("Barbecue Sauce");
					BigMac.setVerticalAlignment(SwingConstants.CENTER);
					BigMac.setHorizontalAlignment(SwingConstants.CENTER);
			        
					//Mustard Sauce
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
					
					contentPane.remove(RoyalCheeseBurgerSize);
					contentPane.remove(OnionRingsSize);
					contentPane.remove(RoyalCheeseburgerPriceSt);
					contentPane.add(MustardPriceSt);
					
					RoyalCheeseBurger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Sauces\\Mustard Sauce.png"));
					RoyalCheeseburgerName.setText("Mustard Sauce");
					RoyalCheeseBurger.setVerticalAlignment(SwingConstants.CENTER);
					RoyalCheeseBurger.setHorizontalAlignment(SwingConstants.CENTER);
					
					//Salsa Sauce
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
					
					contentPane.remove(ChickenBurgerSize);
					contentPane.remove(ShrimpsSize);
					contentPane.remove(ChickenBurgerPriceSt);
					contentPane.add(SalsaPriceSt);
					
					ChickenBurger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Sauces\\Salsa Sauce.png"));
					ChickenBurgerName.setText("Salsa Sauce");
					ChickenBurger.setVerticalAlignment(SwingConstants.CENTER);
					ChickenBurger.setHorizontalAlignment(SwingConstants.CENTER);
					
					//Sweet Sauce
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------			
					
					contentPane.remove(MaestroBurgerSize);
					contentPane.remove(OrangeJuiceSize);
					contentPane.remove(MaestroBurgerPriceSt);
					contentPane.add(SweetPriceSt);
					
					MaestroBurger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Sauces\\Sweet Sauce.png"));
					MaestroBurgerName.setText("Sweet Sauce");
					MaestroBurger.setVerticalAlignment(SwingConstants.CENTER);
					MaestroBurger.setHorizontalAlignment(SwingConstants.CENTER);
					
					contentPane.add(KetchupAdd);
			        contentPane.add(KetchupIncrease);
			        contentPane.add(KetchupReduce);

			        contentPane.add(MayonnaiseAdd);
			        contentPane.add(MayonnaiseIncrease);
			        contentPane.add(MayonnaiseReduce);
			        		        
			        contentPane.add(CheeseAdd);
			        contentPane.add(CheeseIncrease);		
			        contentPane.add(CheeseReduce);

			        contentPane.add(BarbecueAdd);
			        contentPane.add(BarbecueIncrease);
			        contentPane.add(BarbecueReduce);

			        contentPane.add(MustardAdd);
			        contentPane.add(MustardIncrease);
			        contentPane.add(MustardReduce);

			        contentPane.add(SalsaAdd);
			        contentPane.add(SalsaIncrease);
			        contentPane.add(SalsaReduce);

			        contentPane.add(SweetAdd);
			        contentPane.add(SweetIncrease);
			        contentPane.add(SweetReduce);
					
					contentPane.remove(ChickenBurgerAdd);
					contentPane.remove(ChickenBurgerIncrease);
					contentPane.remove(ChickenBurgerReduce);

					contentPane.remove(RoyalCheeseburgerAdd);
					contentPane.remove(RoyalCheeseburgerIncrease);
					contentPane.remove(RoyalCheeseburgerReduce);
							        
					contentPane.remove(MaestroBurgerAdd);
					contentPane.remove(MaestroBurgerIncrease);		
					contentPane.remove(MaestroBurgerReduce);

					contentPane.remove(BigTastyAdd);
					contentPane.remove(BigTastyIncrease);
					contentPane.remove(BigTastyReduce);

					contentPane.remove(CesarRollAdd);
					contentPane.remove(CesarRollIncrease);
					contentPane.remove(CesarRollReduce);

					contentPane.remove(FiletOFishAdd);
					contentPane.remove(FiletOFishIncrease);
					contentPane.remove(FiletOFishReduce);

					contentPane.remove(BigMacAdd);
					contentPane.remove(BigMacIncrease);
					contentPane.remove(BigMacReduce);

					contentPane.remove(McChickenAdd);
					contentPane.remove(McChickenIncrease);
					contentPane.remove(McChickenReduce);

					contentPane.remove(CheeseburgerAdd);
					contentPane.remove(CheeseburgerIncrease);
					contentPane.remove(CheeseburgerReduce);

					contentPane.remove(HamburgerAdd);
					contentPane.remove(HamburgerIncrease);
					contentPane.remove(HamburgerReduce);

					
					contentPane.add(ChickenBurger);
			        contentPane.add(ChickenBurgerName);
			        
					contentPane.add(RoyalCheeseBurger);
			        contentPane.add(RoyalCheeseburgerName);
					
					contentPane.add(MaestroBurger);
					contentPane.add(MaestroBurgerName);
					
					contentPane.remove(BigTasty);
			        contentPane.remove(BigTastyName);
			        contentPane.remove(BigTastyPriceSt);
			        contentPane.remove(BigTastySize);
			        
			        contentPane.remove(CesarRoll);
			        contentPane.remove(CesarRollName);
			        contentPane.remove(CesarRollPriceSt);
			        
			        contentPane.remove(FiletOFish);
			        contentPane.remove(FiletOFishIncrease);
			        contentPane.remove(FiletOFishName);
			        contentPane.remove(FiletOFishPriceSt);
			        contentPane.remove(FiletOFishSize);
			        
			        contentPane.remove(CappySize);
			        
			        contentPane.remove(McSundaeType);
			        contentPane.remove(McFlurryType);
			        contentPane.remove(BananaShakeSize);
			        contentPane.remove(ChocolateShakeSize);
			        contentPane.remove(StrawberryShakeSize);
			        contentPane.remove(VanillaShakeSize);
			        
			        contentPane.remove(TeaSize);
			        contentPane.remove(CoffeeSize);
			        contentPane.remove(LatteSize);
			        contentPane.remove(CappySize);
			        contentPane.remove(HotChocolateSize);
			        contentPane.remove(CappucinoSize);
					
			        contentPane.add(HamburgerName);
					contentPane.add(CheeseBurgerName);
					contentPane.add(McChickenName);
					contentPane.add(BigMacName);

			        contentPane.remove(HappyMealFont1);
			        contentPane.remove(HappyMealFont2);
			        contentPane.remove(HappyMealFont3);
			        contentPane.remove(HappyMealFont4);
			        
			        contentPane.remove(FrenchFriesPriceSt);
			        contentPane.remove(WedgesPriceSt);
			        contentPane.remove(McNuggetsPriceSt);
			        contentPane.remove(WingsPriceSt);
			        contentPane.remove(OnionRingsPriceSt);
			        contentPane.remove(ShrimpsPriceSt);
			        contentPane.remove(ChickenBoxPriceSt);
			        
			        contentPane.remove(FantaPriceSt);
			        contentPane.remove(CocaColaZeroPriceSt);
			        contentPane.remove(CocaColaPriceSt);
			        contentPane.remove(SpritePriceSt);
			        contentPane.remove(OrangeJuicePriceSt);
			        contentPane.remove(CappyPriceSt);
			        contentPane.remove(LemonadeGrapefruitPriceSt);
			        contentPane.remove(LemonadeStrawberryPriceSt);
			        contentPane.remove(SparklingWaterPriceSt);
			        
			        contentPane.remove(McSundaePriceSt);
			        contentPane.remove(McFlurryPriceSt);
			        contentPane.remove(MilkShakeChocolatePriceSt);
			        contentPane.remove(MilkShakeVanillaPriceSt);
			        contentPane.remove(MilkShakeStrawberryPriceSt);
			        contentPane.remove(MilkShakeBananaPriceSt);
			        contentPane.remove(ConeIcePriceSt);
			        
			        contentPane.remove(TeaPriceSt);
			        contentPane.remove(CoffeePriceSt);
			        contentPane.remove(LattePriceSt);
			        contentPane.remove(CappucinoPriceSt);
			        contentPane.remove(HotChocolatePriceSt);
			        contentPane.remove(EspressoPriceSt);
			        
			        contentPane.remove(MuffinBlackCurrantPriceSt);
			        contentPane.remove(MuffinChocolatePriceSt);
			        contentPane.remove(BananaMuffinPriceSt);
			        contentPane.remove(BrownMuffinPriceSt);
			        contentPane.remove(FruitPieCherryPriceSt);
			        contentPane.remove(FruitPieStrawberryPriceSt);
			        contentPane.remove(BakedApplePiePriceSt);
			        
			        contentPane.remove(HappyMealCheeseburgerPriceSt);
			        contentPane.remove(HappyMealChickenburgerPriceSt);
			        contentPane.remove(HappyMealHamburgerPriceSt);
			        contentPane.remove(HappyMealMcNuggetsPriceSt);
			        
					contentPane.revalidate();
			        contentPane.repaint();
			        

			    }
			    
				
		 });
		 
		 
		 
		 //Ice Creams and Milk Shakes
		 //McSundae
  //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		 
		 CreamsAndShakes.addActionListener(new ActionListener() {
             
			    @Override
			    public void actionPerformed(ActionEvent e) {
			    	
			        
			    	 String selectedValueMcSundae = (String) McSundaeType.getSelectedItem();
			    	McSundaeType.addActionListener(new ActionListener() {
			            @Override
			            public void actionPerformed(ActionEvent e) {
			            	
			              String selectedValueMcSundae = (String) McSundaeType.getSelectedItem();
			               

			                
			                if ("Chocolate".equals(selectedValueMcSundae)) {
			                	McSundaePriceSt.setText(String.format("%.2f $", IceCreams.getMcSundaePrice()));
			                    Hamburger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Milk Shakes and Ice Creams\\MucSundae Chocolate.png"));
			                } else if ("Caramel".equals(selectedValueMcSundae)) {
			                	McSundaePriceSt.setText(String.format("%.2f $", IceCreams.getMcSundaePrice()));
			                    Hamburger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Milk Shakes and Ice Creams\\MucSundae Caramel.png"));
			                } else if ("Strawberry".equals(selectedValueMcSundae)) {
			                	McSundaePriceSt.setText(String.format("%.2f $", IceCreams.getMcSundaePrice()));
			                    Hamburger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Milk Shakes and Ice Creams\\MucSundae Strawberry .png"));
			                } else if ("Cherry".equals(selectedValueMcSundae)) {
			                	McSundaePriceSt.setText(String.format("%.2f $",IceCreams.getMcSundaePrice()));
			                    Hamburger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Milk Shakes and Ice Creams\\MucSundae Cherry.png"));
			                }
			            }
			        });
			    	
			    	 if ("Chocolate".equals(selectedValueMcSundae)) {
		                	McSundaePriceSt.setText(String.format("%.2f $", IceCreams.getMcSundaePrice()));
		                    Hamburger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Milk Shakes and Ice Creams\\MucSundae Chocolate.png"));
		                } else if ("Caramel".equals(selectedValueMcSundae)) {
		                	McSundaePriceSt.setText(String.format("%.2f $", IceCreams.getMcSundaePrice()));
		                    Hamburger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Milk Shakes and Ice Creams\\MucSundae Caramel.png"));
		                } else if ("Strawberry".equals(selectedValueMcSundae)) {
		                	McSundaePriceSt.setText(String.format("%.2f $", IceCreams.getMcSundaePrice()));
		                    Hamburger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Milk Shakes and Ice Creams\\MucSundae Strawberry .png"));
		                } else if ("Cherry".equals(selectedValueMcSundae)) {
		                	McSundaePriceSt.setText(String.format("%.2f $",IceCreams.getMcSundaePrice()));
		                    Hamburger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Milk Shakes and Ice Creams\\MucSundae Cherry.png"));
		                }
			    	
			    	McSundaeType.setEditable(true);
			    	McSundaeType.setFont(new Font("Century", Font.PLAIN, 13));
			    	McSundaeType.setBounds(55, 380, 83, 20);
			    	
					contentPane.remove(HamburgerSize);
					contentPane.remove(FrenchFriesSize);
					contentPane.remove(FantaSize);
					contentPane.remove(HamburgerPriceSt);
					contentPane.add(McSundaeType);
					contentPane.add(McSundaePriceSt);

					
			        HamburgerName.setText("MucSundae");
			        McSundaeType.setBounds(55, 380, 93, 20);
			        Hamburger.setVerticalAlignment(SwingConstants.CENTER);
			        Hamburger.setHorizontalAlignment(SwingConstants.CENTER);
			        
			        //McFlurry
  //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------	        
			        
			        String selectedValueMcFlurry = (String) McFlurryType.getSelectedItem();
			        
			        McFlurryType.addActionListener(new ActionListener() {
			            @Override
			            public void actionPerformed(ActionEvent e) {
			            	
			             
			            	String selectedValueMcFlurry = (String) McFlurryType.getSelectedItem();

			                
			                if ("Kit-Kat".equals(selectedValueMcFlurry)) {
			                	McFlurryPriceSt.setText(String.format("%.2f $", IceCreams.getMcFlurryPrice()));
			                    Cheeseburger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Milk Shakes and Ice Creams\\McFlurry Kit-Kat.png"));
			                    Cheeseburger.setVerticalAlignment(SwingConstants.CENTER);
								Cheeseburger.setHorizontalAlignment(SwingConstants.CENTER);
			                } else if ("Caramel Kit-Kat".equals(selectedValueMcFlurry)) {
			                	McFlurryPriceSt.setText(String.format("%.2f $", IceCreams.getMcFlurryPrice()));
			                    Cheeseburger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Milk Shakes and Ice Creams\\McFlurry Caramel Kit-Kat.png"));
			                    Cheeseburger.setVerticalAlignment(SwingConstants.TOP);
								Cheeseburger.setHorizontalAlignment(SwingConstants.CENTER);
			                } else if ("Strawberry Kit-Kat".equals(selectedValueMcFlurry)) {
			                	McFlurryPriceSt.setText(String.format("%.2f $", IceCreams.getMcFlurryPrice()));
			                    Cheeseburger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Milk Shakes and Ice Creams\\McFlurry Stawberry Kit-Kat.png"));
			                    Cheeseburger.setVerticalAlignment(SwingConstants.CENTER);
								Cheeseburger.setHorizontalAlignment(SwingConstants.CENTER);
			                } else if ("Cherry Kit-Kat".equals(selectedValueMcFlurry)) {
			                	McFlurryPriceSt.setText(String.format("%.2f $", IceCreams.getMcFlurryPrice()));
			                    Cheeseburger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Milk Shakes and Ice Creams\\McFlurry Cherry Kit-Kat.png"));
			                    Cheeseburger.setVerticalAlignment(SwingConstants.TOP);
			                    Cheeseburger.setHorizontalAlignment(SwingConstants.CENTER);
			                }
			            }
			        });
			        
			        if ("Kit-Kat".equals(selectedValueMcFlurry)) {
	                	McFlurryPriceSt.setText(String.format("%.2f $", IceCreams.getMcFlurryPrice()));
	                    Cheeseburger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Milk Shakes and Ice Creams\\McFlurry Kit-Kat.png"));
	                    Cheeseburger.setVerticalAlignment(SwingConstants.CENTER);
						Cheeseburger.setHorizontalAlignment(SwingConstants.CENTER);
	                } else if ("Caramel Kit-Kat".equals(selectedValueMcFlurry)) {
	                	McFlurryPriceSt.setText(String.format("%.2f $", IceCreams.getMcFlurryPrice()));
	                    Cheeseburger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Milk Shakes and Ice Creams\\McFlurry Caramel Kit-Kat.png"));
	                    Cheeseburger.setVerticalAlignment(SwingConstants.TOP);
						Cheeseburger.setHorizontalAlignment(SwingConstants.CENTER);
	                } else if ("Strawberry Kit-Kat".equals(selectedValueMcFlurry)) {
	                	McFlurryPriceSt.setText(String.format("%.2f $", IceCreams.getMcFlurryPrice()));
	                    Cheeseburger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Milk Shakes and Ice Creams\\McFlurry Stawberry Kit-Kat.png"));
	                    Cheeseburger.setVerticalAlignment(SwingConstants.CENTER);
						Cheeseburger.setHorizontalAlignment(SwingConstants.CENTER);
	                } else if ("Cherry Kit-Kat".equals(selectedValueMcFlurry)) {
	                	McFlurryPriceSt.setText(String.format("%.2f $", IceCreams.getMcFlurryPrice()));
	                    Cheeseburger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Milk Shakes and Ice Creams\\McFlurry Cherry Kit-Kat.png"));
	                    Cheeseburger.setVerticalAlignment(SwingConstants.TOP);
	                    Cheeseburger.setHorizontalAlignment(SwingConstants.CENTER);
	                }
			        
			        McFlurryType.setEditable(true);
			        McFlurryType.setFont(new Font("Century", Font.PLAIN, 13));
			        McFlurryType.setBounds(207, 380, 143, 20);
			        
					contentPane.remove(CheeseburgerSize);
					contentPane.remove(WedgesSize);
					contentPane.remove(CocaColaSize);
					contentPane.remove(CheeseBurgerPriceSt);
					contentPane.add(McFlurryPriceSt);
					contentPane.add(McFlurryType);

					
					
					CheeseBurgerName.setText("McFlurry");
					Cheeseburger.setVerticalAlignment(SwingConstants.CENTER);
					Cheeseburger.setHorizontalAlignment(SwingConstants.CENTER);
			        
			        //Milk Shake Chocolate
  //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
					ChocolateShakeSize.addActionListener(new ActionListener() {
			            @Override
			            public void actionPerformed(ActionEvent e) {
			            	double resultChocolateShake=0;
			            	
			              String selectedValueChocolateShake = (String) ChocolateShakeSize.getSelectedItem();
			               

			                
			                if ("Small".equals(selectedValueChocolateShake)) {
			                	MilkShakeChocolatePriceSt.setText(String.format("%.2f $", IceCreams.getMilkShakePrice()));
			                } else if ("Medium".equals(selectedValueChocolateShake)) {
			                	resultChocolateShake = IceCreams.getMilkShakePrice() + 1.0;
			                	MilkShakeChocolatePriceSt.setText(String.format("%.2f $", resultChocolateShake));
			                } else if ("Large".equals(selectedValueChocolateShake)) {
			                	resultChocolateShake = IceCreams.getMilkShakePrice() + 1.80;
			                	MilkShakeChocolatePriceSt.setText(String.format("%.2f $", resultChocolateShake));
			                }
			            }
			        });
					ChocolateShakeSize.setEditable(true);
					ChocolateShakeSize.setFont(new Font("Century", Font.PLAIN, 13));
					ChocolateShakeSize.setBounds(417, 380, 83, 20);
					contentPane.remove(McChickenSize);
					contentPane.remove(McNuggetsSize);
					contentPane.remove(SpriteSize);
					contentPane.remove(McChickenPriceSt);
					contentPane.add(MilkShakeChocolatePriceSt);
					contentPane.add(ChocolateShakeSize);

					
					McChicken.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Milk Shakes and Ice Creams\\Milk Shake Chocolate.png"));
					McChickenName.setText("Milk Shake Chocolate");
					McChicken.setVerticalAlignment(SwingConstants.CENTER);
					McChicken.setHorizontalAlignment(SwingConstants.CENTER);
					
					//Milk Shake Vanilla
  //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
					
					VanillaShakeSize.addActionListener(new ActionListener() {
			            @Override
			            public void actionPerformed(ActionEvent e) {
			            	double resultVanillaShake=0;
			            	
			              String selectedValueVanillaShake = (String) VanillaShakeSize.getSelectedItem();
			               

			                
			                if ("Small".equals(selectedValueVanillaShake)) {
			                	MilkShakeVanillaPriceSt.setText(String.format("%.2f $", IceCreams.getMilkShakePrice()));
			                } else if ("Medium".equals(selectedValueVanillaShake)) {
			                	resultVanillaShake = IceCreams.getMilkShakePrice() + 1.0;
			                	MilkShakeVanillaPriceSt.setText(String.format("%.2f $", resultVanillaShake));
			                } else if ("Large".equals(selectedValueVanillaShake)) {
			                	resultVanillaShake = IceCreams.getMilkShakePrice() + 1.80;
			                	MilkShakeVanillaPriceSt.setText(String.format("%.2f $", resultVanillaShake));
			                }
			            }
			        });
					VanillaShakeSize.setEditable(true);
					VanillaShakeSize.setFont(new Font("Century", Font.PLAIN, 13));
					VanillaShakeSize.setBounds(598, 380, 83, 20);
					contentPane.remove(BigMacSize);
					contentPane.remove(WingsSize);
					contentPane.remove(CocaColaZeroSize);
					contentPane.remove(BigMacPriceSt);
					contentPane.add(MilkShakeVanillaPriceSt);
					contentPane.add(VanillaShakeSize);

					
					BigMac.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Milk Shakes and Ice Creams\\Milk Shake Vanilla.png"));
					BigMacName.setText("Milk Shake Vanilla");
					BigMac.setVerticalAlignment(SwingConstants.CENTER);
					BigMac.setHorizontalAlignment(SwingConstants.CENTER);
					
					//Milk Shake Strawberry
  //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
					
					StrawberryShakeSize.addActionListener(new ActionListener() {
			            @Override
			            public void actionPerformed(ActionEvent e) {
			            	double resultStrawberryShake=0;
			            	
			              String selectedValueStrawberryShake = (String) StrawberryShakeSize.getSelectedItem();
			               

			                
			                if ("Small".equals(selectedValueStrawberryShake)) {
			                	MilkShakeStrawberryPriceSt.setText(String.format("%.2f $", IceCreams.getMilkShakePrice()));
			                } else if ("Medium".equals(selectedValueStrawberryShake)) {
			                	resultStrawberryShake = IceCreams.getMilkShakePrice() + 1.0;
			                	MilkShakeStrawberryPriceSt.setText(String.format("%.2f $", resultStrawberryShake));
			                } else if ("Large".equals(selectedValueStrawberryShake)) {
			                	resultStrawberryShake = IceCreams.getMilkShakePrice() + 1.80;
			                	MilkShakeStrawberryPriceSt.setText(String.format("%.2f $", resultStrawberryShake));
			                }
			            }
			        });
					StrawberryShakeSize.setEditable(true);
					StrawberryShakeSize.setFont(new Font("Century", Font.PLAIN, 13));
					StrawberryShakeSize.setBounds(779, 380, 83, 20);
					contentPane.remove(RoyalCheeseBurgerSize);
					contentPane.remove(OnionRingsSize);
					contentPane.remove(RoyalCheeseburgerPriceSt);
					contentPane.add(MilkShakeStrawberryPriceSt);
					contentPane.add(StrawberryShakeSize);

					
					RoyalCheeseBurger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Milk Shakes and Ice Creams\\Milk Shake Stawberry.png"));
					RoyalCheeseburgerName.setText("Milk Shake Strawberry");
					RoyalCheeseburgerName.setBounds(738, 349, 163, 20);
					RoyalCheeseBurger.setVerticalAlignment(SwingConstants.CENTER);
					RoyalCheeseBurger.setHorizontalAlignment(SwingConstants.CENTER);
					
					//Milk Shake Banana
 //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
					
					BananaShakeSize.addActionListener(new ActionListener() {
			            @Override
			            public void actionPerformed(ActionEvent e) {
			            	double resultBananaShake=0;
			            	
			              String selectedValueBananaShake = (String) BananaShakeSize.getSelectedItem();
			               

			                
			                if ("Small".equals(selectedValueBananaShake)) {
			                	MilkShakeBananaPriceSt.setText(String.format("%.2f $", IceCreams.getMilkShakePrice()));
			                } else if ("Medium".equals(selectedValueBananaShake)) {
			                	resultBananaShake = IceCreams.getMilkShakePrice() + 1.0;
			                	MilkShakeBananaPriceSt.setText(String.format("%.2f $", resultBananaShake));
			                } else if ("Large".equals(selectedValueBananaShake)) {
			                	resultBananaShake = IceCreams.getMilkShakePrice() + 1.80;
			                	MilkShakeBananaPriceSt.setText(String.format("%.2f $", resultBananaShake));
			                }
			                
			            }
			        });
					BananaShakeSize.setEditable(true);
					BananaShakeSize.setFont(new Font("Century", Font.PLAIN, 13));
					BananaShakeSize.setBounds(55, 670, 83, 20);
					contentPane.remove(ChickenBurgerSize);
					contentPane.remove(ShrimpsSize);
					contentPane.remove(ChickenBurgerPriceSt);
					contentPane.add(MilkShakeBananaPriceSt);
					contentPane.add(BananaShakeSize);

					
					ChickenBurger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Milk Shakes and Ice Creams\\Milk Shake Banana.png"));
					ChickenBurgerName.setText("Milk Shake Banana");
					ChickenBurger.setVerticalAlignment(SwingConstants.CENTER);
					ChickenBurger.setHorizontalAlignment(SwingConstants.CENTER);
					
					//Cone Ice Cream
  //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
					
					contentPane.remove(MaestroBurgerSize);
					contentPane.remove(ShrimpsSize);
					contentPane.remove(MaestroBurgerPriceSt);
					contentPane.add(ConeIcePriceSt);

					
					MaestroBurger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Milk Shakes and Ice Creams\\Cone Ice Cream.png"));
					MaestroBurgerName.setText("Cone Ice Cream");
					MaestroBurger.setVerticalAlignment(SwingConstants.CENTER);
					MaestroBurger.setHorizontalAlignment(SwingConstants.CENTER);
					
					contentPane.add(McSundaeAdd);
			        contentPane.add(McSundaeIncrease);
			        contentPane.add(McSundaeReduce);

			        contentPane.add(McFlurryAdd);
			        contentPane.add(McFlurryIncrease);
			        contentPane.add(McFlurryReduce);
			        		        
			        contentPane.add(MilkShakeChocolateAdd);
			        contentPane.add(MilkShakeChocolateIncrease);		
			        contentPane.add(MilkShakeChocolateReduce);

			        contentPane.add(MilkShakeVanillaAdd);
			        contentPane.add(MilkShakeVanillaIncrease);
			        contentPane.add(MilkShakeVanillaReduce);

			        contentPane.add(MilkShakeStrawberryAdd);
			        contentPane.add(MilkShakeStrawberryIncrease);
			        contentPane.add(MilkShakeStrawberryReduce);

			        contentPane.add(MilkShakeBananaAdd);
			        contentPane.add(MilkShakeBananaIncrease);
			        contentPane.add(MilkShakeBananaReduce);

			        contentPane.add(ConeIceAdd);
			        contentPane.add(ConeIceIncrease);
			        contentPane.add(ConeIceReduce);
					
					contentPane.remove(ChickenBurgerAdd);
					contentPane.remove(ChickenBurgerIncrease);
					contentPane.remove(ChickenBurgerReduce);

					contentPane.remove(RoyalCheeseburgerAdd);
					contentPane.remove(RoyalCheeseburgerIncrease);
					contentPane.remove(RoyalCheeseburgerReduce);
							        
					contentPane.remove(MaestroBurgerAdd);
					contentPane.remove(MaestroBurgerIncrease);		
					contentPane.remove(MaestroBurgerReduce);

					contentPane.remove(BigTastyAdd);
					contentPane.remove(BigTastyIncrease);
					contentPane.remove(BigTastyReduce);

					contentPane.remove(CesarRollAdd);
					contentPane.remove(CesarRollIncrease);
					contentPane.remove(CesarRollReduce);

					contentPane.remove(FiletOFishAdd);
					contentPane.remove(FiletOFishIncrease);
					contentPane.remove(FiletOFishReduce);

					contentPane.remove(BigMacAdd);
					contentPane.remove(BigMacIncrease);
					contentPane.remove(BigMacReduce);

					contentPane.remove(McChickenAdd);
					contentPane.remove(McChickenIncrease);
					contentPane.remove(McChickenReduce);

					contentPane.remove(CheeseburgerAdd);
					contentPane.remove(CheeseburgerIncrease);
					contentPane.remove(CheeseburgerReduce);

					contentPane.remove(HamburgerAdd);
					contentPane.remove(HamburgerIncrease);
					contentPane.remove(HamburgerReduce);

					
					contentPane.add(ChickenBurger);
			        contentPane.add(ChickenBurgerName);
			        
					
					contentPane.add(RoyalCheeseBurger);
			        contentPane.add(RoyalCheeseburgerName);
					
			        contentPane.add(MaestroBurger);
					contentPane.add(MaestroBurgerName);
			        
					contentPane.remove(BigTasty);
			        contentPane.remove(BigTastyName);
			        contentPane.remove(BigTastyPriceSt);
			        contentPane.remove(BigTastySize);
			        
			        contentPane.remove(CesarRoll);
			        contentPane.remove(CesarRollName);
			        contentPane.remove(CesarRollPriceSt);
			        
			        contentPane.remove(FiletOFish);
			        contentPane.remove(FiletOFishName);
			        contentPane.remove(FiletOFishPriceSt);
			        contentPane.remove(FiletOFishSize);
			        
			        contentPane.remove(CappySize);	
			        
			        contentPane.remove(TeaSize);
			        contentPane.remove(CoffeeSize);
			        contentPane.remove(LatteSize);
			        contentPane.remove(CappySize);
			        contentPane.remove(HotChocolateSize);
			        contentPane.remove(CappucinoSize);
			        
			        contentPane.remove(OrangeJuiceSize);
			        
			        contentPane.add(HamburgerName);
					contentPane.add(CheeseBurgerName);
					contentPane.add(McChickenName);
					contentPane.add(BigMacName);

			        contentPane.remove(HappyMealFont1);
			        contentPane.remove(HappyMealFont2);
			        contentPane.remove(HappyMealFont3);
			        contentPane.remove(HappyMealFont4);
			        
			        contentPane.remove(FrenchFriesPriceSt);
			        contentPane.remove(WedgesPriceSt);
			        contentPane.remove(McNuggetsPriceSt);
			        contentPane.remove(WingsPriceSt);
			        contentPane.remove(OnionRingsPriceSt);
			        contentPane.remove(ShrimpsPriceSt);
			        contentPane.remove(ChickenBoxPriceSt);
			        
			        contentPane.remove(FantaPriceSt);
			        contentPane.remove(CocaColaZeroPriceSt);
			        contentPane.remove(CocaColaPriceSt);
			        contentPane.remove(SpritePriceSt);
			        contentPane.remove(OrangeJuicePriceSt);
			        contentPane.remove(CappyPriceSt);
			        contentPane.remove(LemonadeGrapefruitPriceSt);
			        contentPane.remove(LemonadeStrawberryPriceSt);
			        contentPane.remove(SparklingWaterPriceSt);
			        
			        contentPane.remove(KetchupPriceSt);
			        contentPane.remove(MayonnaisePriceSt);
			        contentPane.remove(CheesePriceSt);
			        contentPane.remove(MustardPriceSt);
			        contentPane.remove(SalsaPriceSt);
			        contentPane.remove(SweetPriceSt);
			        contentPane.remove(BarbecuePriceSt);
			        
			        contentPane.remove(TeaPriceSt);
			        contentPane.remove(CoffeePriceSt);
			        contentPane.remove(LattePriceSt);
			        contentPane.remove(CappucinoPriceSt);
			        contentPane.remove(HotChocolatePriceSt);
			        contentPane.remove(EspressoPriceSt);
			        
			        contentPane.remove(MuffinBlackCurrantPriceSt);
			        contentPane.remove(MuffinChocolatePriceSt);
			        contentPane.remove(BananaMuffinPriceSt);
			        contentPane.remove(BrownMuffinPriceSt);
			        contentPane.remove(FruitPieCherryPriceSt);
			        contentPane.remove(FruitPieStrawberryPriceSt);
			        contentPane.remove(BakedApplePiePriceSt);
			        
			        contentPane.remove(HappyMealCheeseburgerPriceSt);
			        contentPane.remove(HappyMealChickenburgerPriceSt);
			        contentPane.remove(HappyMealHamburgerPriceSt);
			        contentPane.remove(HappyMealMcNuggetsPriceSt);
			        
			         McSundaeType.setEditable(false);
					 McFlurryType.setEditable(false);
					 ChocolateShakeSize.setEditable(false);
					 VanillaShakeSize.setEditable(false);
					 StrawberryShakeSize.setEditable(false);
					 BananaShakeSize.setEditable(false);
			        
			        contentPane.revalidate();
			        contentPane.repaint();
                }
			    
				
		  });
		 
		 
		 //Hot Drinks
		 //Tea
 //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		 HotDrinks.addActionListener(new ActionListener() {
             
			    @Override
			    public void actionPerformed(ActionEvent e) {
			    	
			        
			    	TeaSize.addActionListener(new ActionListener() {
			            @Override
			            public void actionPerformed(ActionEvent e) {
			            	double resultTea=0;
			              String selectedValueTea = (String) TeaSize.getSelectedItem();
			               

			                if ("0.3L".equals(selectedValueTea)) {
			                	TeaPriceSt.setText(String.format("%.2f $", hotDrinks.getTeaPrice()));
			                } else if ("0.4L".equals(selectedValueTea)) {
			                	resultTea = hotDrinks.getTeaPrice() + 0.30;
			                	TeaPriceSt.setText(String.format("%.2f $", resultTea));
			                }

			                
			               
			            }
			        });
			    	TeaSize.setEditable(true);
			    	TeaSize.setFont(new Font("Century", Font.PLAIN, 13));
			    	TeaSize.setBounds(55, 380, 83, 20);
					contentPane.remove(HamburgerSize);
					contentPane.remove(FrenchFriesSize);
					contentPane.remove(FantaSize);
					contentPane.remove(McSundaeType);
					contentPane.remove(HamburgerPriceSt);
					contentPane.add(TeaSize);
					contentPane.add(TeaPriceSt);

					
			        Hamburger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hot Drinks\\Tea.png"));
			        HamburgerName.setText("Tea");
			        Hamburger.setVerticalAlignment(SwingConstants.TOP);
			        Hamburger.setHorizontalAlignment(SwingConstants.CENTER);
			        
			        //Coffee
  //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------	        
			        
			        CoffeeSize.addActionListener(new ActionListener() {
			            @Override
			            public void actionPerformed(ActionEvent e) {
			            	double resultCoffee=0;
			              String selectedValueCoffee = (String) CoffeeSize.getSelectedItem();
			               

			                if ("Small".equals(selectedValueCoffee)) {
			                	CoffeePriceSt.setText(String.format("%.2f $", hotDrinks.getCoffeePrice()));
			                } else if ("Large".equals(selectedValueCoffee)) {
			                	resultCoffee = hotDrinks.getCoffeePrice() * 1.5;
			                	CoffeePriceSt.setText(String.format("%.2f $", resultCoffee));
			                }

			            }
			        });
			        CoffeeSize.setEditable(true);
			        CoffeeSize.setFont(new Font("Century", Font.PLAIN, 13));
			        CoffeeSize.setBounds(236, 380, 83, 20);
					contentPane.remove(CheeseburgerSize);
					contentPane.remove(WedgesSize);
					contentPane.remove(CocaColaSize);
					contentPane.remove(McFlurryType);
					contentPane.remove(CheeseBurgerPriceSt);
					contentPane.add(CoffeePriceSt);
					contentPane.add(CoffeeSize);

					
					Cheeseburger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hot Drinks\\Coffee.png"));
					CheeseBurgerName.setText("Coffee");
					Cheeseburger.setVerticalAlignment(SwingConstants.CENTER);
					Cheeseburger.setHorizontalAlignment(SwingConstants.CENTER);
			        
			        //Latte
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
					
					LatteSize.addActionListener(new ActionListener() {
			            @Override
			            public void actionPerformed(ActionEvent e) {
			            	double resultLatte=0;
			              String selectedValueLatte = (String) LatteSize.getSelectedItem();
			               

			                if ("Small".equals(selectedValueLatte)) {
			                	LattePriceSt.setText(String.format("%.2f $", hotDrinks.getLattePrice()));
			                } else if ("Large".equals(selectedValueLatte)) {
			                	resultLatte = hotDrinks.getLattePrice() * 1.5;
			                	LattePriceSt.setText(String.format("%.2f $", resultLatte));
			                }

			            }
			        });
					LatteSize.setEditable(true);
					LatteSize.setFont(new Font("Century", Font.PLAIN, 13));
					LatteSize.setBounds(417, 380, 83, 20);
					contentPane.remove(McChickenSize);
					contentPane.remove(McNuggetsSize);
					contentPane.remove(SpriteSize);
					contentPane.remove(ChocolateShakeSize);
					contentPane.remove(McChickenPriceSt);
					contentPane.add(LattePriceSt);
					contentPane.add(LatteSize);

					
					McChicken.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hot Drinks\\Latte.png"));
					McChickenName.setText("Latte");
					McChicken.setVerticalAlignment(SwingConstants.CENTER);
					McChicken.setHorizontalAlignment(SwingConstants.CENTER);
					
					//Cappucino
 //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
					
					CappucinoSize.addActionListener(new ActionListener() {
			            @Override
			            public void actionPerformed(ActionEvent e) {
			            	double resultCappucino = 0;
			              String selectedValueCappucino = (String) CappucinoSize.getSelectedItem();
			               

			                if ("Small".equals(selectedValueCappucino)) {
			                	CappucinoPriceSt.setText(String.format("%.2f $", hotDrinks.getCappuccinoPrice()));
			                } else if ("Large".equals(selectedValueCappucino)) {
			                	resultCappucino = hotDrinks.getCappuccinoPrice() * 1.5;
			                	CappucinoPriceSt.setText(String.format("%.2f $", resultCappucino));
			                }

			            }
			        });
					CappucinoSize.setEditable(true);
					CappucinoSize.setFont(new Font("Century", Font.PLAIN, 13));
					CappucinoSize.setBounds(598, 380, 83, 20);
					contentPane.remove(BigMacSize);
					contentPane.remove(WingsSize);
					contentPane.remove(CocaColaZeroSize);
					contentPane.remove(VanillaShakeSize);
					contentPane.remove(BigMacPriceSt);
					contentPane.add(CappucinoPriceSt);
					contentPane.add(CappucinoSize);

					
					BigMac.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hot Drinks\\Cappucino.png"));
					BigMacName.setText("Cappuccino");
					BigMac.setVerticalAlignment(SwingConstants.CENTER);
					BigMac.setHorizontalAlignment(SwingConstants.CENTER);
					
					//Hot Chocolate
 //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
					
					HotChocolateSize.addActionListener(new ActionListener() {
			            @Override
			            public void actionPerformed(ActionEvent e) {
			            	double resultHotChocolate = 0;
			              String selectedValueHotChocolate = (String) HotChocolateSize.getSelectedItem();
			               

			                if ("Small".equals(selectedValueHotChocolate)) {
			                	HotChocolatePriceSt.setText(String.format("%.2f $", hotDrinks.getHotChocolatePrice()));
			                } else if ("Large".equals(selectedValueHotChocolate)) {
			                	resultHotChocolate = hotDrinks.getHotChocolatePrice() + 1.5;
			                	HotChocolatePriceSt.setText(String.format("%.2f $", resultHotChocolate));
			                }

			            }
			        });
					HotChocolateSize.setEditable(true);
					HotChocolateSize.setFont(new Font("Century", Font.PLAIN, 13));
					HotChocolateSize.setBounds(779, 380, 83, 20);
					contentPane.remove(RoyalCheeseBurgerSize);
					contentPane.remove(OnionRingsSize);
					contentPane.remove(StrawberryShakeSize);
					contentPane.remove(RoyalCheeseburgerPriceSt);
					contentPane.add(HotChocolatePriceSt);
					contentPane.add(HotChocolateSize);

					
					RoyalCheeseBurger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hot Drinks\\Hot Chocolate.png"));
					RoyalCheeseburgerName.setText("Hot Chocolate");
					RoyalCheeseBurger.setVerticalAlignment(SwingConstants.CENTER);
					RoyalCheeseBurger.setHorizontalAlignment(SwingConstants.CENTER);
					
					//Espresso
 //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
					
					contentPane.remove(ChickenBurgerSize);
					contentPane.remove(ShrimpsSize);
					contentPane.remove(BananaShakeSize);
					contentPane.remove(ChickenBurgerPriceSt);
					contentPane.add(EspressoPriceSt);

					
					ChickenBurger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Hot Drinks\\Espresso.png"));
					ChickenBurgerPriceSt.setText(String.format("%.2f $", hotDrinks.getEspressoPrice()));
					ChickenBurgerName.setText("Espresso");
					ChickenBurger.setVerticalAlignment(SwingConstants.CENTER);
					ChickenBurger.setHorizontalAlignment(SwingConstants.CENTER);
					
					contentPane.add(TeaAdd);
			        contentPane.add(TeaIncrease);
			        contentPane.add(TeaReduce);

			        contentPane.add(CoffeeAdd);
			        contentPane.add(CoffeeIncrease);
			        contentPane.add(CoffeeReduce);
			        		        
			        contentPane.add(LatteAdd);
			        contentPane.add(LatteIncrease);		
			        contentPane.add(LatteReduce);

			        contentPane.add(CappucinoAdd);
			        contentPane.add(CappucinoIncrease);
			        contentPane.add(CappucinoReduce);

			        contentPane.add(HotChocolateAdd);
			        contentPane.add(HotChocolateIncrease);
			        contentPane.add(HotChocolateReduce);

			        contentPane.add(EspressoAdd);
			        contentPane.add(EspressoIncrease);
			        contentPane.add(EspressoReduce);
					
					contentPane.remove(ChickenBurgerAdd);
					contentPane.remove(ChickenBurgerIncrease);
					contentPane.remove(ChickenBurgerReduce);

					contentPane.remove(RoyalCheeseburgerAdd);
					contentPane.remove(RoyalCheeseburgerIncrease);
					contentPane.remove(RoyalCheeseburgerReduce);
							        
					contentPane.remove(MaestroBurgerAdd);
					contentPane.remove(MaestroBurgerIncrease);		
					contentPane.remove(MaestroBurgerReduce);

					contentPane.remove(BigTastyAdd);
					contentPane.remove(BigTastyIncrease);
					contentPane.remove(BigTastyReduce);

					contentPane.remove(CesarRollAdd);
					contentPane.remove(CesarRollIncrease);
					contentPane.remove(CesarRollReduce);

					contentPane.remove(FiletOFishAdd);
					contentPane.remove(FiletOFishIncrease);
					contentPane.remove(FiletOFishReduce);

					contentPane.remove(BigMacAdd);
					contentPane.remove(BigMacIncrease);
					contentPane.remove(BigMacReduce);

					contentPane.remove(McChickenAdd);
					contentPane.remove(McChickenIncrease);
					contentPane.remove(McChickenReduce);

					contentPane.remove(CheeseburgerAdd);
					contentPane.remove(CheeseburgerIncrease);
					contentPane.remove(CheeseburgerReduce);

					contentPane.remove(HamburgerAdd);
					contentPane.remove(HamburgerIncrease);
					contentPane.remove(HamburgerReduce);

					
					contentPane.add(ChickenBurger);
			        contentPane.add(ChickenBurgerName);
					
					contentPane.add(RoyalCheeseBurger);
			        contentPane.add(RoyalCheeseburgerName);
					
					contentPane.remove(MaestroBurger);
					contentPane.remove(MaestroBurgerName);
					contentPane.remove(MaestroBurgerPriceSt);
					contentPane.remove(MaestroBurgerSize);
					
					contentPane.remove(BigTasty);
			        contentPane.remove(BigTastyName);
			        contentPane.remove(BigTastyPriceSt);
			        contentPane.remove(BigTastySize);
			        
			        contentPane.remove(CesarRoll);
			        contentPane.remove(CesarRollName);
			        contentPane.remove(CesarRollPriceSt);
			        
			        
			        contentPane.remove(FiletOFish);
			        contentPane.remove(FiletOFishName);
			        contentPane.remove(FiletOFishPriceSt);
			        contentPane.remove(FiletOFishSize);
			        
			        contentPane.remove(OrangeJuiceSize);
			        contentPane.remove(CappySize);
					
			        contentPane.add(HamburgerName);
					contentPane.add(CheeseBurgerName);
					contentPane.add(McChickenName);
					contentPane.add(BigMacName);

					contentPane.remove(FrenchFriesPriceSt);
			        contentPane.remove(WedgesPriceSt);
			        contentPane.remove(McNuggetsPriceSt);
			        contentPane.remove(WingsPriceSt);
			        contentPane.remove(OnionRingsPriceSt);
			        contentPane.remove(ShrimpsPriceSt);
			        contentPane.remove(ChickenBoxPriceSt);
					
			        contentPane.remove(FantaPriceSt);
			        contentPane.remove(CocaColaZeroPriceSt);
			        contentPane.remove(CocaColaPriceSt);
			        contentPane.remove(SpritePriceSt);
			        contentPane.remove(OrangeJuicePriceSt);
			        contentPane.remove(CappyPriceSt);
			        contentPane.remove(LemonadeGrapefruitPriceSt);
			        contentPane.remove(LemonadeStrawberryPriceSt);
			        contentPane.remove(SparklingWaterPriceSt);
			        
			        contentPane.remove(KetchupPriceSt);
			        contentPane.remove(MayonnaisePriceSt);
			        contentPane.remove(CheesePriceSt);
			        contentPane.remove(MustardPriceSt);
			        contentPane.remove(SalsaPriceSt);
			        contentPane.remove(SweetPriceSt);
			        contentPane.remove(BarbecuePriceSt);
			        
			        contentPane.remove(McSundaePriceSt);
			        contentPane.remove(McFlurryPriceSt);
			        contentPane.remove(MilkShakeChocolatePriceSt);
			        contentPane.remove(MilkShakeVanillaPriceSt);
			        contentPane.remove(MilkShakeStrawberryPriceSt);
			        contentPane.remove(MilkShakeBananaPriceSt);
			        contentPane.remove(ConeIcePriceSt);
			        
			        contentPane.remove(MuffinBlackCurrantPriceSt);
			        contentPane.remove(MuffinChocolatePriceSt);
			        contentPane.remove(BananaMuffinPriceSt);
			        contentPane.remove(BrownMuffinPriceSt);
			        contentPane.remove(FruitPieCherryPriceSt);
			        contentPane.remove(FruitPieStrawberryPriceSt);
			        contentPane.remove(BakedApplePiePriceSt);
			        
			        contentPane.remove(HappyMealCheeseburgerPriceSt);
			        contentPane.remove(HappyMealChickenburgerPriceSt);
			        contentPane.remove(HappyMealHamburgerPriceSt);
			        contentPane.remove(HappyMealMcNuggetsPriceSt);
			        
					 TeaSize.setEditable(false);
					 CoffeeSize.setEditable(false);
					 LatteSize.setEditable(false);
					 CappucinoSize.setEditable(false);
					 StrawberryShakeSize.setEditable(false);
					 HotChocolateSize.setEditable(false);
					
			        contentPane.remove(HappyMealFont1);
			        contentPane.remove(HappyMealFont2);
			        contentPane.remove(HappyMealFont3);
			        contentPane.remove(HappyMealFont4);
			        
					contentPane.revalidate();
			        contentPane.repaint();
			        
			        
			    }
			    
					
		 });        
		
		 //Desserts
		 //Banana Chocolate Muffin
  //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		 
		 
		 Desserts.addActionListener(new ActionListener() {
             
			    @Override
			    public void actionPerformed(ActionEvent e) {
			    	
			        
			    	
					contentPane.remove(HamburgerSize);
					contentPane.remove(FrenchFriesSize);
					contentPane.remove(FantaSize);
					contentPane.remove(McSundaeType);
					contentPane.remove(TeaSize);
					contentPane.remove(HamburgerPriceSt);
					contentPane.add(BananaMuffinPriceSt);

					
			        Hamburger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Desserts\\Banana Chocolate Muffin.png"));
			        HamburgerName.setText("Banana Muffin");
			        Hamburger.setVerticalAlignment(SwingConstants.CENTER);
			        Hamburger.setHorizontalAlignment(SwingConstants.CENTER);
		 
			        
			        
                   //Maple & Brown Muffin
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------	        
			        

					contentPane.remove(CheeseburgerSize);
					contentPane.remove(WedgesSize);
					contentPane.remove(CocaColaSize);
					contentPane.remove(McFlurryType);
					contentPane.remove(CoffeeSize);
					contentPane.remove(CheeseBurgerPriceSt);
					contentPane.add(BrownMuffinPriceSt);

					
					Cheeseburger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Desserts\\Maple & Brown Muffin.png"));
					CheeseBurgerName.setText("Brown Muffin");
					Cheeseburger.setVerticalAlignment(SwingConstants.CENTER);
					Cheeseburger.setHorizontalAlignment(SwingConstants.CENTER);
			        
					
					//Muffin Black Currant
 //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
					
					contentPane.remove(McChickenSize);
					contentPane.remove(McNuggetsSize);
					contentPane.remove(SpriteSize);
					contentPane.remove(ChocolateShakeSize);
					contentPane.remove(LatteSize);
					contentPane.remove(McChickenPriceSt);
					contentPane.add(MuffinBlackCurrantPriceSt);

					
					McChicken.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Desserts\\Muffin Black Currant.png"));
					McChickenName.setText("Muffin Black Currant");
					McChicken.setVerticalAlignment(SwingConstants.BOTTOM);
					McChicken.setHorizontalAlignment(SwingConstants.CENTER);
					
					
					//Muffin Black Currant
 //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------			
					
					contentPane.remove(BigMacSize);
					contentPane.remove(WingsSize);
					contentPane.remove(CocaColaZeroSize);
					contentPane.remove(VanillaShakeSize);
					contentPane.remove(CappucinoSize);
					contentPane.remove(BigMacPriceSt);
					contentPane.add(MuffinChocolatePriceSt);

					
					BigMac.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Desserts\\Muffin Chocolate.png"));
					BigMacName.setText("Muffin Chocolate");
					BigMac.setVerticalAlignment(SwingConstants.BOTTOM);
					BigMac.setHorizontalAlignment(SwingConstants.CENTER);
					
					
					//Baked Apple Pie
 //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------					
					
					contentPane.remove(RoyalCheeseBurgerSize);
					contentPane.remove(OnionRingsSize);
					contentPane.remove(StrawberryShakeSize);
					contentPane.remove(HotChocolateSize);
					contentPane.remove(RoyalCheeseburgerPriceSt);
					contentPane.add(BakedApplePiePriceSt);

					
					RoyalCheeseBurger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Desserts\\Baked Apple Pie.png"));
					RoyalCheeseburgerName.setText("Baked Apple Pie");
					RoyalCheeseBurger.setVerticalAlignment(SwingConstants.CENTER);
					RoyalCheeseBurger.setHorizontalAlignment(SwingConstants.CENTER);
					
					
					//Fruit Pie Strawberry
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------			
					
					contentPane.remove(ChickenBurgerSize);
					contentPane.remove(ShrimpsSize);
					contentPane.remove(ChickenBurgerPriceSt);
					contentPane.add(FruitPieStrawberryPriceSt);
					
					

					
					ChickenBurger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Desserts\\Fruit Pie Strawberry.png"));
					ChickenBurgerName.setText("Fruit Pie Strawberry");
					ChickenBurger.setVerticalAlignment(SwingConstants.CENTER);
					ChickenBurger.setHorizontalAlignment(SwingConstants.CENTER);
					
					
					//Fruit Pie Cherry
  //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

					contentPane.remove(MaestroBurgerSize);
					contentPane.remove(OrangeJuiceSize);
					contentPane.remove(BananaShakeSize);
					contentPane.remove(MaestroBurgerPriceSt);
					contentPane.add(FruitPieCherryPriceSt);
					

					
					MaestroBurger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Desserts\\Fruit Pie Cherry.png"));
					MaestroBurgerName.setText("Fruit Pie Cherry");
					MaestroBurger.setVerticalAlignment(SwingConstants.CENTER);
					MaestroBurger.setHorizontalAlignment(SwingConstants.CENTER);
					
					contentPane.add(BananaMuffinAdd);
			        contentPane.add(BananaMuffinIncrease);
			        contentPane.add(BananaMuffinReduce);

			        contentPane.add(BrownMuffinAdd);
			        contentPane.add(BrownMuffinIncrease);
			        contentPane.add(BrownMuffinReduce);
			        		        
			        contentPane.add(MuffinBlackAdd);
			        contentPane.add(MuffinBlackIncrease);		
			        contentPane.add(MuffinBlackReduce);

			        contentPane.add(MuffinChocolateAdd);
			        contentPane.add(MuffinChocolateIncrease);
			        contentPane.add(MuffinChocolateReduce);

			        contentPane.add(BakedApplePieAdd);
			        contentPane.add(BakedApplePieIncrease);
			        contentPane.add(BakedApplePieReduce);

			        contentPane.add(FruitPieStrawberryAdd);
			        contentPane.add(FruitPieStrawberryIncrease);
			        contentPane.add(FruitPieStrawberryReduce);

			        contentPane.add(FruitPieCherryAdd);
			        contentPane.add(FruitPieCherryIncrease);
			        contentPane.add(FruitPieCherryReduce);
					
					contentPane.remove(ChickenBurgerAdd);
					contentPane.remove(ChickenBurgerIncrease);
					contentPane.remove(ChickenBurgerReduce);

					contentPane.remove(RoyalCheeseburgerAdd);
					contentPane.remove(RoyalCheeseburgerIncrease);
					contentPane.remove(RoyalCheeseburgerReduce);
							        
					contentPane.remove(MaestroBurgerAdd);
					contentPane.remove(MaestroBurgerIncrease);		
					contentPane.remove(MaestroBurgerReduce);

					contentPane.remove(BigTastyAdd);
					contentPane.remove(BigTastyIncrease);
					contentPane.remove(BigTastyReduce);

					contentPane.remove(CesarRollAdd);
					contentPane.remove(CesarRollIncrease);
					contentPane.remove(CesarRollReduce);

					contentPane.remove(FiletOFishAdd);
					contentPane.remove(FiletOFishIncrease);
					contentPane.remove(FiletOFishReduce);

					contentPane.remove(BigMacAdd);
					contentPane.remove(BigMacIncrease);
					contentPane.remove(BigMacReduce);

					contentPane.remove(McChickenAdd);
					contentPane.remove(McChickenIncrease);
					contentPane.remove(McChickenReduce);

					contentPane.remove(CheeseburgerAdd);
					contentPane.remove(CheeseburgerIncrease);
					contentPane.remove(CheeseburgerReduce);

					contentPane.remove(HamburgerAdd);
					contentPane.remove(HamburgerIncrease);
					contentPane.remove(HamburgerReduce);
					
					
					contentPane.add(ChickenBurger);
			        contentPane.add(ChickenBurgerName);
					
					contentPane.add(RoyalCheeseBurger);
			        contentPane.add(RoyalCheeseburgerName);
					
					contentPane.add(MaestroBurger);
					contentPane.add(MaestroBurgerName);
					
					contentPane.remove(BigTasty);
			        contentPane.remove(BigTastyName);
			        contentPane.remove(BigTastyPriceSt);
			        contentPane.remove(BigTastySize);
			        
			        contentPane.remove(CesarRoll);
			        contentPane.remove(CesarRollName);
			        contentPane.remove(CesarRollPriceSt);
			        
			        contentPane.remove(FiletOFish);
			        contentPane.remove(FiletOFishName);
			        contentPane.remove(FiletOFishPriceSt);
			        contentPane.remove(FiletOFishSize);
					
			        contentPane.remove(CappySize);
			        
			        contentPane.add(HamburgerName);
					contentPane.add(CheeseBurgerName);
					contentPane.add(McChickenName);
					contentPane.add(BigMacName);

			        contentPane.remove(HappyMealFont1);
			        contentPane.remove(HappyMealFont2);
			        contentPane.remove(HappyMealFont3);
			        contentPane.remove(HappyMealFont4);
			        
			        contentPane.remove(FrenchFriesPriceSt);
			        contentPane.remove(WedgesPriceSt);
			        contentPane.remove(McNuggetsPriceSt);
			        contentPane.remove(WingsPriceSt);
			        contentPane.remove(OnionRingsPriceSt);
			        contentPane.remove(ShrimpsPriceSt);
			        contentPane.remove(ChickenBoxPriceSt);
			        
			        contentPane.remove(FantaPriceSt);
			        contentPane.remove(CocaColaZeroPriceSt);
			        contentPane.remove(CocaColaPriceSt);
			        contentPane.remove(SpritePriceSt);
			        contentPane.remove(OrangeJuicePriceSt);
			        contentPane.remove(CappyPriceSt);
			        contentPane.remove(LemonadeGrapefruitPriceSt);
			        contentPane.remove(LemonadeStrawberryPriceSt);
			        contentPane.remove(SparklingWaterPriceSt);
			        
			        contentPane.remove(KetchupPriceSt);
			        contentPane.remove(MayonnaisePriceSt);
			        contentPane.remove(CheesePriceSt);
			        contentPane.remove(MustardPriceSt);
			        contentPane.remove(SalsaPriceSt);
			        contentPane.remove(SweetPriceSt);
			        contentPane.remove(BarbecuePriceSt);
			        
			        contentPane.remove(McSundaePriceSt);
			        contentPane.remove(McFlurryPriceSt);
			        contentPane.remove(MilkShakeChocolatePriceSt);
			        contentPane.remove(MilkShakeVanillaPriceSt);
			        contentPane.remove(MilkShakeStrawberryPriceSt);
			        contentPane.remove(MilkShakeBananaPriceSt);
			        contentPane.remove(ConeIcePriceSt);
			        
			        contentPane.remove(TeaPriceSt);
			        contentPane.remove(CoffeePriceSt);
			        contentPane.remove(LattePriceSt);
			        contentPane.remove(CappucinoPriceSt);
			        contentPane.remove(HotChocolatePriceSt);
			        contentPane.remove(EspressoPriceSt);
			        
			        contentPane.remove(HappyMealCheeseburgerPriceSt);
			        contentPane.remove(HappyMealChickenburgerPriceSt);
			        contentPane.remove(HappyMealHamburgerPriceSt);
			        contentPane.remove(HappyMealMcNuggetsPriceSt);
			        
			        contentPane.revalidate();
			        contentPane.repaint();
			    }
			    
			 		
		  });      
		 
		
			//Happy Meal
		    //Happy Meal Hamburger
 //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------	 
		 
		 HappyMeal.addActionListener(new ActionListener() {
                         
			    @Override
			    public void actionPerformed(ActionEvent e) {
			    	
			    	
					contentPane.remove(HamburgerSize);
					contentPane.remove(FrenchFriesSize);
					contentPane.remove(FantaSize);
					contentPane.remove(McSundaeType);
					contentPane.remove(TeaSize);
					contentPane.remove(HamburgerName);
					contentPane.remove(HamburgerPriceSt);
					contentPane.add(HappyMealHamburgerPriceSt);
					contentPane.add(HappyMealFont1);
 
					
			        Hamburger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Happy Meal\\Happy Meal Hamburger.png"));
			        HappyMealFont1.setText("<html><div style='text-align: center; margin-top: 2em;'>Happy Meal<br>Hamburger</div></html>");
			        HappyMealFont1.setBounds(50, 349, 162, 40);
			        HappyMealFont1.setFont(new Font("Georgia", Font.PLAIN, 16));
			        Hamburger.setVerticalAlignment(SwingConstants.CENTER);
			        Hamburger.setHorizontalAlignment(SwingConstants.CENTER);
			        
			        //Happy Meal Cheeseburger
  //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
			        
			        contentPane.remove(CheeseburgerSize);
					contentPane.remove(WedgesSize);
					contentPane.remove(CocaColaSize);
					contentPane.remove(McFlurryType);
					contentPane.remove(CoffeeSize);
					contentPane.remove(CheeseBurgerName);
					contentPane.remove(CheeseBurgerPriceSt);
					contentPane.add(HappyMealCheeseburgerPriceSt);
					contentPane.add(HappyMealFont2);
					
					Cheeseburger.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Happy Meal\\Happy Meal Cheeseburger.png"));
					HappyMealFont2.setText("<html><div style='text-align: center; margin-top: 2em;'>Happy Meal<br>Cheeseburger</div></html>");
			        HappyMealFont2.setBounds(225, 349, 162, 40);
			        HappyMealFont2.setFont(new Font("Georgia", Font.PLAIN, 16));
					CheeseBurgerName.setText("Happy Meal Cheeseburger");
			        Cheeseburger.setVerticalAlignment(SwingConstants.CENTER);
			        Cheeseburger.setHorizontalAlignment(SwingConstants.CENTER);
			        
			     
			        //Happy Meal Chickenburger
 //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
			        
			        contentPane.remove(McChickenSize);
					contentPane.remove(McNuggetsSize);
					contentPane.remove(SpriteSize);
					contentPane.remove(ChocolateShakeSize);
					contentPane.remove(LatteSize);
					contentPane.remove(McChickenName);
					contentPane.remove(McChickenPriceSt);
					contentPane.add(HappyMealChickenburgerPriceSt);
					contentPane.add(HappyMealFont3);

					
					McChicken.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Happy Meal\\Happy Meal Chickenburger.png"));
					HappyMealFont3.setText("<html><div style='text-align: center; margin-top: 2em;'>Happy Meal<br>Chickenburger</div></html>");
					HappyMealFont3.setBounds(400, 349, 162, 40);
					HappyMealFont3.setFont(new Font("Georgia", Font.PLAIN, 16));
					McChickenName.setText("Happy Meal Chickenburger");
					McChicken.setVerticalAlignment(SwingConstants.CENTER);
					McChicken.setHorizontalAlignment(SwingConstants.CENTER);
			        
					
					 //Happy Meal McNuggets
  //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
					
					contentPane.remove(BigMacSize);
					contentPane.remove(WingsSize);
					contentPane.remove(CocaColaZeroSize);
					contentPane.remove(VanillaShakeSize);
					contentPane.remove(CappucinoSize);
					contentPane.remove(BigMacName);
					contentPane.remove(BigMacPriceSt);
					contentPane.add(HappyMealMcNuggetsPriceSt);
					contentPane.add(HappyMealFont4);

					
					BigMac.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Happy Meal\\Happy Meal McNuggets.png"));
					HappyMealFont4.setText("<html><div style='text-align: center; margin-top: 2em;'>Happy Meal<br>McNuggets</div></html>");
					HappyMealFont4.setBounds(590, 349, 162, 40);
					HappyMealFont4.setFont(new Font("Georgia", Font.PLAIN, 16));
					BigMacName.setText("Happy Meal McNuggets");
					BigMac.setVerticalAlignment(SwingConstants.CENTER);
					BigMac.setHorizontalAlignment(SwingConstants.CENTER);
					
					contentPane.add(HappyMealHamburgerAdd);
			        contentPane.add(HappyMealHamburgerIncrease);
			        contentPane.add(HappyMealHamburgerReduce);

			        contentPane.add(HappyMealCheeseburgerAdd);
			        contentPane.add(HappyMealCheeseburgerIncrease);
			        contentPane.add(HappyMealCheeseburgerReduce);
			        		        
			        contentPane.add(HappyMealChickenburgerAdd);
			        contentPane.add(HappyMealChickenburgerIncrease);		
			        contentPane.add(HappyMealChickenburgerReduce);

			        contentPane.add(HappyMealMcNuggetsAdd);
			        contentPane.add(HappyMealMcNuggetsIncrease);
			        contentPane.add(HappyMealMcNuggetsReduce);

					
					contentPane.remove(ChickenBurgerAdd);
					contentPane.remove(ChickenBurgerIncrease);
					contentPane.remove(ChickenBurgerReduce);

					contentPane.remove(RoyalCheeseburgerAdd);
					contentPane.remove(RoyalCheeseburgerIncrease);
					contentPane.remove(RoyalCheeseburgerReduce);
							        
					contentPane.remove(MaestroBurgerAdd);
					contentPane.remove(MaestroBurgerIncrease);		
					contentPane.remove(MaestroBurgerReduce);

					contentPane.remove(BigTastyAdd);
					contentPane.remove(BigTastyIncrease);
					contentPane.remove(BigTastyReduce);

					contentPane.remove(CesarRollAdd);
					contentPane.remove(CesarRollIncrease);
					contentPane.remove(CesarRollReduce);

					contentPane.remove(FiletOFishAdd);
					contentPane.remove(FiletOFishIncrease);
					contentPane.remove(FiletOFishReduce);

					contentPane.remove(BigMacAdd);
					contentPane.remove(BigMacIncrease);
					contentPane.remove(BigMacReduce);

					contentPane.remove(McChickenAdd);
					contentPane.remove(McChickenIncrease);
					contentPane.remove(McChickenReduce);

					contentPane.remove(CheeseburgerAdd);
					contentPane.remove(CheeseburgerIncrease);
					contentPane.remove(CheeseburgerReduce);

					contentPane.remove(HamburgerAdd);
					contentPane.remove(HamburgerIncrease);
					contentPane.remove(HamburgerReduce);
					
					contentPane.remove(MaestroBurger);
					contentPane.remove(MaestroBurgerName);
					contentPane.remove(MaestroBurgerPriceSt);
					contentPane.remove(MaestroBurgerSize);
					
					contentPane.remove(ChickenBurger);
			        contentPane.remove(ChickenBurgerName);
			        contentPane.remove(ChickenBurgerPriceSt);
			        contentPane.remove(ChickenBurgerSize);
					
					contentPane.remove(RoyalCheeseBurger);
			        contentPane.remove(RoyalCheeseburgerName);
			        contentPane.remove(RoyalCheeseburgerPriceSt);
			        contentPane.remove(RoyalCheeseBurgerSize);
					
					contentPane.remove(BigTasty);
			        contentPane.remove(BigTastyName);
			        contentPane.remove(BigTastyPriceSt);
			        contentPane.remove(BigTastySize);
			        
			        contentPane.remove(CesarRoll);
			        contentPane.remove(CesarRollName);
			        contentPane.remove(CesarRollPriceSt);
			        
			        
			        contentPane.remove(FiletOFish);
			        contentPane.remove(FiletOFishName);
			        contentPane.remove(FiletOFishPriceSt);
			        contentPane.remove(FiletOFishSize);
					
			        contentPane.remove(HotChocolateSize);
			        contentPane.remove(StrawberryShakeSize);
			        contentPane.remove(BananaShakeSize);
			        contentPane.remove(OrangeJuiceSize);
			        contentPane.remove(CappySize);
			        contentPane.remove(OnionRingsSize);
			        contentPane.remove(ShrimpsSize);
			        
			        contentPane.remove(FrenchFriesPriceSt);
			        contentPane.remove(WedgesPriceSt);
			        contentPane.remove(McNuggetsPriceSt);
			        contentPane.remove(WingsPriceSt);
			        contentPane.remove(OnionRingsPriceSt);
			        contentPane.remove(ShrimpsPriceSt);
			        contentPane.remove(ChickenBoxPriceSt);
			        
			        contentPane.remove(FantaPriceSt);
			        contentPane.remove(CocaColaZeroPriceSt);
			        contentPane.remove(CocaColaPriceSt);
			        contentPane.remove(SpritePriceSt);
			        contentPane.remove(OrangeJuicePriceSt);
			        contentPane.remove(CappyPriceSt);
			        contentPane.remove(LemonadeGrapefruitPriceSt);
			        contentPane.remove(LemonadeStrawberryPriceSt);
			        contentPane.remove(SparklingWaterPriceSt);
			        
			        contentPane.remove(KetchupPriceSt);
			        contentPane.remove(MayonnaisePriceSt);
			        contentPane.remove(CheesePriceSt);
			        contentPane.remove(MustardPriceSt);
			        contentPane.remove(SalsaPriceSt);
			        contentPane.remove(SweetPriceSt);
			        contentPane.remove(BarbecuePriceSt);
			        
			        contentPane.remove(McSundaePriceSt);
			        contentPane.remove(McFlurryPriceSt);
			        contentPane.remove(MilkShakeChocolatePriceSt);
			        contentPane.remove(MilkShakeVanillaPriceSt);
			        contentPane.remove(MilkShakeStrawberryPriceSt);
			        contentPane.remove(MilkShakeBananaPriceSt);
			        contentPane.remove(ConeIcePriceSt);
			        
			        contentPane.remove(TeaPriceSt);
			        contentPane.remove(CoffeePriceSt);
			        contentPane.remove(LattePriceSt);
			        contentPane.remove(CappucinoPriceSt);
			        contentPane.remove(HotChocolatePriceSt);
			        contentPane.remove(EspressoPriceSt);
			        
			        contentPane.remove(MuffinBlackCurrantPriceSt);
			        contentPane.remove(MuffinChocolatePriceSt);
			        contentPane.remove(BananaMuffinPriceSt);
			        contentPane.remove(BrownMuffinPriceSt);
			        contentPane.remove(FruitPieCherryPriceSt);
			        contentPane.remove(FruitPieStrawberryPriceSt);
			        contentPane.remove(BakedApplePiePriceSt);
			        
			        contentPane.revalidate();
			        contentPane.repaint();
			        
			        
			        
			    }
			    
			   
		 		
		  });   
		 
		 //1
	//-----------------------------------------------------------------------------------------------------------------------------------------------	 

		 Snacks.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				contentPane.remove(HappyMealHamburgerAdd);
		        contentPane.remove(HappyMealHamburgerIncrease);
		        contentPane.remove(HappyMealHamburgerReduce);

		        contentPane.remove(HappyMealCheeseburgerAdd);
		        contentPane.remove(HappyMealCheeseburgerIncrease);
		        contentPane.remove(HappyMealCheeseburgerReduce);
		        		        
		        contentPane.remove(HappyMealChickenburgerAdd);
		        contentPane.remove(HappyMealChickenburgerIncrease);		
		        contentPane.remove(HappyMealChickenburgerReduce);

		        contentPane.remove(HappyMealMcNuggetsAdd);
		        contentPane.remove(HappyMealMcNuggetsIncrease);
		        contentPane.remove(HappyMealMcNuggetsReduce);

                contentPane.remove(BananaMuffinAdd);
		        contentPane.remove(BananaMuffinIncrease);
		        contentPane.remove(BananaMuffinReduce);

		        contentPane.remove(BrownMuffinAdd);
		        contentPane.remove(BrownMuffinIncrease);
		        contentPane.remove(BrownMuffinReduce);
		        		        
		        contentPane.remove(MuffinBlackAdd);
		        contentPane.remove(MuffinBlackIncrease);		
		        contentPane.remove(MuffinBlackReduce);

		        contentPane.remove(MuffinChocolateAdd);
		        contentPane.remove(MuffinChocolateIncrease);
		        contentPane.remove(MuffinChocolateReduce);

		        contentPane.remove(BakedApplePieAdd);
		        contentPane.remove(BakedApplePieIncrease);
		        contentPane.remove(BakedApplePieReduce);

		        contentPane.remove(FruitPieStrawberryAdd);
		        contentPane.remove(FruitPieStrawberryIncrease);
		        contentPane.remove(FruitPieStrawberryReduce);

		        contentPane.remove(FruitPieCherryAdd);
		        contentPane.remove(FruitPieCherryIncrease);
		        contentPane.remove(FruitPieCherryReduce);

                contentPane.remove(TeaAdd);
		        contentPane.remove(TeaIncrease);
		        contentPane.remove(TeaReduce);

		        contentPane.remove(CoffeeAdd);
		        contentPane.remove(CoffeeIncrease);
		        contentPane.remove(CoffeeReduce);
		        		        
		        contentPane.remove(LatteAdd);
		        contentPane.remove(LatteIncrease);		
		        contentPane.remove(LatteReduce);

		        contentPane.remove(CappucinoAdd);
		        contentPane.remove(CappucinoIncrease);
		        contentPane.remove(CappucinoReduce);

		        contentPane.remove(HotChocolateAdd);
		        contentPane.remove(HotChocolateIncrease);
		        contentPane.remove(HotChocolateReduce);

		        contentPane.remove(EspressoAdd);
		        contentPane.remove(EspressoIncrease);
		        contentPane.remove(EspressoReduce);

                contentPane.remove(McSundaeAdd);
		        contentPane.remove(McSundaeIncrease);
		        contentPane.remove(McSundaeReduce);

		        contentPane.remove(McFlurryAdd);
		        contentPane.remove(McFlurryIncrease);
		        contentPane.remove(McFlurryReduce);
		        		        
		        contentPane.remove(MilkShakeChocolateAdd);
		        contentPane.remove(MilkShakeChocolateIncrease);		
		        contentPane.remove(MilkShakeChocolateReduce);

		        contentPane.remove(MilkShakeVanillaAdd);
		        contentPane.remove(MilkShakeVanillaIncrease);
		        contentPane.remove(MilkShakeVanillaReduce);

		        contentPane.remove(MilkShakeStrawberryAdd);
		        contentPane.remove(MilkShakeStrawberryIncrease);
		        contentPane.remove(MilkShakeStrawberryReduce);

		        contentPane.remove(MilkShakeBananaAdd);
		        contentPane.remove(MilkShakeBananaIncrease);
		        contentPane.remove(MilkShakeBananaReduce);

		        contentPane.remove(ConeIceAdd);
		        contentPane.remove(ConeIceIncrease);
		        contentPane.remove(ConeIceReduce);

                contentPane.remove(KetchupAdd);
		        contentPane.remove(KetchupIncrease);
		        contentPane.remove(KetchupReduce);

		        contentPane.remove(MayonnaiseAdd);
		        contentPane.remove(MayonnaiseIncrease);
		        contentPane.remove(MayonnaiseReduce);
		        		        
		        contentPane.remove(CheeseAdd);
		        contentPane.remove(CheeseIncrease);		
		        contentPane.remove(CheeseReduce);

		        contentPane.remove(BarbecueAdd);
		        contentPane.remove(BarbecueIncrease);
		        contentPane.remove(BarbecueReduce);

		        contentPane.remove(MustardAdd);
		        contentPane.remove(MustardIncrease);
		        contentPane.remove(MustardReduce);

		        contentPane.remove(SalsaAdd);
		        contentPane.remove(SalsaIncrease);
		        contentPane.remove(SalsaReduce);

		        contentPane.remove(SweetAdd);
		        contentPane.remove(SweetIncrease);
		        contentPane.remove(SweetReduce);

                contentPane.remove(FantaAdd);
				contentPane.remove(FantaIncrease);
				contentPane.remove(FantaReduce);

		        contentPane.remove(CocaColaAdd);
				contentPane.remove(CocaColaIncrease);
				contentPane.remove(CocaColaReduce);
				        		        
				contentPane.remove(SpriteAdd);
			    contentPane.remove(SpriteIncrease);		
			    contentPane.remove(SpriteReduce);

			    contentPane.remove(CocaColaZeroAdd);
				contentPane.remove(CocaColaZeroIncrease);
				contentPane.remove(CocaColaZeroReduce);

				contentPane.remove(LemonadeGrapefruitAdd);
				contentPane.remove(LemonadeGrapefruitIncrease);
				contentPane.remove(LemonadeGrapefruitReduce);

				contentPane.remove(LemonadeStrawberryAdd);
				contentPane.remove(LemonadeStrawberryIncrease);
				contentPane.remove(LemonadeStrawberryReduce);

				contentPane.remove(OrangeJuiceAdd);
				contentPane.remove(OrangeJuiceIncrease);
				contentPane.remove(OrangeJuiceReduce);
				        
				contentPane.remove(CappyAdd);
				contentPane.remove(CappyIncrease);
				contentPane.remove(CappyReduce);
				        
				contentPane.remove(SparklingWaterAdd);
				contentPane.remove(SparklingWaterIncrease);
				contentPane.remove(SparklingWaterReduce);
				
			}
			 
		 });
		 
		
		 //2
	//-----------------------------------------------------------------------------------------------------------------------------------------------	 
		 
		 Burgers.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				contentPane.remove(HappyMealHamburgerAdd);
		        contentPane.remove(HappyMealHamburgerIncrease);
		        contentPane.remove(HappyMealHamburgerReduce);

		        contentPane.remove(HappyMealCheeseburgerAdd);
		        contentPane.remove(HappyMealCheeseburgerIncrease);
		        contentPane.remove(HappyMealCheeseburgerReduce);
		        		        
		        contentPane.remove(HappyMealChickenburgerAdd);
		        contentPane.remove(HappyMealChickenburgerIncrease);		
		        contentPane.remove(HappyMealChickenburgerReduce);

		        contentPane.remove(HappyMealMcNuggetsAdd);
		        contentPane.remove(HappyMealMcNuggetsIncrease);
		        contentPane.remove(HappyMealMcNuggetsReduce);


                contentPane.remove(BananaMuffinAdd);
		        contentPane.remove(BananaMuffinIncrease);
		        contentPane.remove(BananaMuffinReduce);

		        contentPane.remove(BrownMuffinAdd);
		        contentPane.remove(BrownMuffinIncrease);
		        contentPane.remove(BrownMuffinReduce);
		        		        
		        contentPane.remove(MuffinBlackAdd);
		        contentPane.remove(MuffinBlackIncrease);		
		        contentPane.remove(MuffinBlackReduce);

		        contentPane.remove(MuffinChocolateAdd);
		        contentPane.remove(MuffinChocolateIncrease);
		        contentPane.remove(MuffinChocolateReduce);

		        contentPane.remove(BakedApplePieAdd);
		        contentPane.remove(BakedApplePieIncrease);
		        contentPane.remove(BakedApplePieReduce);

		        contentPane.remove(FruitPieStrawberryAdd);
		        contentPane.remove(FruitPieStrawberryIncrease);
		        contentPane.remove(FruitPieStrawberryReduce);

		        contentPane.remove(FruitPieCherryAdd);
		        contentPane.remove(FruitPieCherryIncrease);
		        contentPane.remove(FruitPieCherryReduce);

                contentPane.remove(TeaAdd);
		        contentPane.remove(TeaIncrease);
		        contentPane.remove(TeaReduce);

		        contentPane.remove(CoffeeAdd);
		        contentPane.remove(CoffeeIncrease);
		        contentPane.remove(CoffeeReduce);
		        		        
		        contentPane.remove(LatteAdd);
		        contentPane.remove(LatteIncrease);		
		        contentPane.remove(LatteReduce);

		        contentPane.remove(CappucinoAdd);
		        contentPane.remove(CappucinoIncrease);
		        contentPane.remove(CappucinoReduce);

		        contentPane.remove(HotChocolateAdd);
		        contentPane.remove(HotChocolateIncrease);
		        contentPane.remove(HotChocolateReduce);

		        contentPane.remove(EspressoAdd);
		        contentPane.remove(EspressoIncrease);
		        contentPane.remove(EspressoReduce);

                contentPane.remove(McSundaeAdd);
		        contentPane.remove(McSundaeIncrease);
		        contentPane.remove(McSundaeReduce);

		        contentPane.remove(McFlurryAdd);
		        contentPane.remove(McFlurryIncrease);
		        contentPane.remove(McFlurryReduce);
		        		        
		        contentPane.remove(MilkShakeChocolateAdd);
		        contentPane.remove(MilkShakeChocolateIncrease);		
		        contentPane.remove(MilkShakeChocolateReduce);

		        contentPane.remove(MilkShakeVanillaAdd);
		        contentPane.remove(MilkShakeVanillaIncrease);
		        contentPane.remove(MilkShakeVanillaReduce);

		        contentPane.remove(MilkShakeStrawberryAdd);
		        contentPane.remove(MilkShakeStrawberryIncrease);
		        contentPane.remove(MilkShakeStrawberryReduce);

		        contentPane.remove(MilkShakeBananaAdd);
		        contentPane.remove(MilkShakeBananaIncrease);
		        contentPane.remove(MilkShakeBananaReduce);

		        contentPane.remove(ConeIceAdd);
		        contentPane.remove(ConeIceIncrease);
		        contentPane.remove(ConeIceReduce);

                contentPane.remove(KetchupAdd);
		        contentPane.remove(KetchupIncrease);
		        contentPane.remove(KetchupReduce);

		        contentPane.remove(MayonnaiseAdd);
		        contentPane.remove(MayonnaiseIncrease);
		        contentPane.remove(MayonnaiseReduce);
		        		        
		        contentPane.remove(CheeseAdd);
		        contentPane.remove(CheeseIncrease);		
		        contentPane.remove(CheeseReduce);

		        contentPane.remove(BarbecueAdd);
		        contentPane.remove(BarbecueIncrease);
		        contentPane.remove(BarbecueReduce);

		        contentPane.remove(MustardAdd);
		        contentPane.remove(MustardIncrease);
		        contentPane.remove(MustardReduce);

		        contentPane.remove(SalsaAdd);
		        contentPane.remove(SalsaIncrease);
		        contentPane.remove(SalsaReduce);

		        contentPane.remove(SweetAdd);
		        contentPane.remove(SweetIncrease);
		        contentPane.remove(SweetReduce);

                contentPane.remove(FantaAdd);
				contentPane.remove(FantaIncrease);
				contentPane.remove(FantaReduce);

		        contentPane.remove(CocaColaAdd);
				contentPane.remove(CocaColaIncrease);
				contentPane.remove(CocaColaReduce);
				        		        
				contentPane.remove(SpriteAdd);
			    contentPane.remove(SpriteIncrease);		
			    contentPane.remove(SpriteReduce);

			    contentPane.remove(CocaColaZeroAdd);
				contentPane.remove(CocaColaZeroIncrease);
				contentPane.remove(CocaColaZeroReduce);

				contentPane.remove(LemonadeGrapefruitAdd);
				contentPane.remove(LemonadeGrapefruitIncrease);
				contentPane.remove(LemonadeGrapefruitReduce);

				contentPane.remove(LemonadeStrawberryAdd);
				contentPane.remove(LemonadeStrawberryIncrease);
				contentPane.remove(LemonadeStrawberryReduce);

				contentPane.remove(OrangeJuiceAdd);
				contentPane.remove(OrangeJuiceIncrease);
				contentPane.remove(OrangeJuiceReduce);
				        
				contentPane.remove(CappyAdd);
				contentPane.remove(CappyIncrease);
				contentPane.remove(CappyReduce);
				        
				contentPane.remove(SparklingWaterAdd);
				contentPane.remove(SparklingWaterIncrease);
				contentPane.remove(SparklingWaterReduce);


            contentPane.remove(FrenchFriesAdd);
	        contentPane.remove(FrenchFriesIncrease);
	        contentPane.remove(FrenchFriesReduce);

	        contentPane.remove(WedgesAdd);
	        contentPane.remove(WedgesIncrease);
	        contentPane.remove(WedgesReduce);
	        		        
	        contentPane.remove(McNuggetsAdd);
	        contentPane.remove(McNuggetsIncrease);		
	        contentPane.remove(McNuggetsReduce);

	        contentPane.remove(WingsAdd);
	        contentPane.remove(WingsIncrease);
	        contentPane.remove(WingsReduce);

	        contentPane.remove(OnionRingsAdd);
	        contentPane.remove(OnionRingsIncrease);
	        contentPane.remove(OnionRingsReduce);

	        contentPane.remove(ShrimpsAdd);
	        contentPane.remove(ShrimpsIncrease);
	        contentPane.remove(ShrimpsReduce);

	        contentPane.remove(ChickenBoxAdd);
	        contentPane.remove(ChickenBoxIncrease);
	        contentPane.remove(ChickenBoxReduce);				
			}
			 
		 });
		
		 
		 //3 
	//-----------------------------------------------------------------------------------------------------------------------------------------------	 
       
		 Beverages.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				contentPane.remove(HappyMealHamburgerAdd);
		        contentPane.remove(HappyMealHamburgerIncrease);
		        contentPane.remove(HappyMealHamburgerReduce);

		        contentPane.remove(HappyMealCheeseburgerAdd);
		        contentPane.remove(HappyMealCheeseburgerIncrease);
		        contentPane.remove(HappyMealCheeseburgerReduce);
		        		        
		        contentPane.remove(HappyMealChickenburgerAdd);
		        contentPane.remove(HappyMealChickenburgerIncrease);		
		        contentPane.remove(HappyMealChickenburgerReduce);

		        contentPane.remove(HappyMealMcNuggetsAdd);
		        contentPane.remove(HappyMealMcNuggetsIncrease);
		        contentPane.remove(HappyMealMcNuggetsReduce);


                contentPane.remove(BananaMuffinAdd);
		        contentPane.remove(BananaMuffinIncrease);
		        contentPane.remove(BananaMuffinReduce);

		        contentPane.remove(BrownMuffinAdd);
		        contentPane.remove(BrownMuffinIncrease);
		        contentPane.remove(BrownMuffinReduce);
		        		        
		        contentPane.remove(MuffinBlackAdd);
		        contentPane.remove(MuffinBlackIncrease);		
		        contentPane.remove(MuffinBlackReduce);

		        contentPane.remove(MuffinChocolateAdd);
		        contentPane.remove(MuffinChocolateIncrease);
		        contentPane.remove(MuffinChocolateReduce);

		        contentPane.remove(BakedApplePieAdd);
		        contentPane.remove(BakedApplePieIncrease);
		        contentPane.remove(BakedApplePieReduce);

		        contentPane.remove(FruitPieStrawberryAdd);
		        contentPane.remove(FruitPieStrawberryIncrease);
		        contentPane.remove(FruitPieStrawberryReduce);

		        contentPane.remove(FruitPieCherryAdd);
		        contentPane.remove(FruitPieCherryIncrease);
		        contentPane.remove(FruitPieCherryReduce);

                contentPane.remove(TeaAdd);
		        contentPane.remove(TeaIncrease);
		        contentPane.remove(TeaReduce);

		        contentPane.remove(CoffeeAdd);
		        contentPane.remove(CoffeeIncrease);
		        contentPane.remove(CoffeeReduce);
		        		        
		        contentPane.remove(LatteAdd);
		        contentPane.remove(LatteIncrease);		
		        contentPane.remove(LatteReduce);

		        contentPane.remove(CappucinoAdd);
		        contentPane.remove(CappucinoIncrease);
		        contentPane.remove(CappucinoReduce);

		        contentPane.remove(HotChocolateAdd);
		        contentPane.remove(HotChocolateIncrease);
		        contentPane.remove(HotChocolateReduce);

		        contentPane.remove(EspressoAdd);
		        contentPane.remove(EspressoIncrease);
		        contentPane.remove(EspressoReduce);

                contentPane.remove(McSundaeAdd);
		        contentPane.remove(McSundaeIncrease);
		        contentPane.remove(McSundaeReduce);

		        contentPane.remove(McFlurryAdd);
		        contentPane.remove(McFlurryIncrease);
		        contentPane.remove(McFlurryReduce);
		        		        
		        contentPane.remove(MilkShakeChocolateAdd);
		        contentPane.remove(MilkShakeChocolateIncrease);		
		        contentPane.remove(MilkShakeChocolateReduce);

		        contentPane.remove(MilkShakeVanillaAdd);
		        contentPane.remove(MilkShakeVanillaIncrease);
		        contentPane.remove(MilkShakeVanillaReduce);

		        contentPane.remove(MilkShakeStrawberryAdd);
		        contentPane.remove(MilkShakeStrawberryIncrease);
		        contentPane.remove(MilkShakeStrawberryReduce);

		        contentPane.remove(MilkShakeBananaAdd);
		        contentPane.remove(MilkShakeBananaIncrease);
		        contentPane.remove(MilkShakeBananaReduce);

		        contentPane.remove(ConeIceAdd);
		        contentPane.remove(ConeIceIncrease);
		        contentPane.remove(ConeIceReduce);

                contentPane.remove(KetchupAdd);
		        contentPane.remove(KetchupIncrease);
		        contentPane.remove(KetchupReduce);

		        contentPane.remove(MayonnaiseAdd);
		        contentPane.remove(MayonnaiseIncrease);
		        contentPane.remove(MayonnaiseReduce);
		        		        
		        contentPane.remove(CheeseAdd);
		        contentPane.remove(CheeseIncrease);		
		        contentPane.remove(CheeseReduce);

		        contentPane.remove(BarbecueAdd);
		        contentPane.remove(BarbecueIncrease);
		        contentPane.remove(BarbecueReduce);

		        contentPane.remove(MustardAdd);
		        contentPane.remove(MustardIncrease);
		        contentPane.remove(MustardReduce);

		        contentPane.remove(SalsaAdd);
		        contentPane.remove(SalsaIncrease);
		        contentPane.remove(SalsaReduce);

		        contentPane.remove(SweetAdd);
		        contentPane.remove(SweetIncrease);
		        contentPane.remove(SweetReduce);


            contentPane.remove(FrenchFriesAdd);
	        contentPane.remove(FrenchFriesIncrease);
	        contentPane.remove(FrenchFriesReduce);

	        contentPane.remove(WedgesAdd);
	        contentPane.remove(WedgesIncrease);
	        contentPane.remove(WedgesReduce);
	        		        
	        contentPane.remove(McNuggetsAdd);
	        contentPane.remove(McNuggetsIncrease);		
	        contentPane.remove(McNuggetsReduce);

	        contentPane.remove(WingsAdd);
	        contentPane.remove(WingsIncrease);
	        contentPane.remove(WingsReduce);

	        contentPane.remove(OnionRingsAdd);
	        contentPane.remove(OnionRingsIncrease);
	        contentPane.remove(OnionRingsReduce);

	        contentPane.remove(ShrimpsAdd);
	        contentPane.remove(ShrimpsIncrease);
	        contentPane.remove(ShrimpsReduce);

	        contentPane.remove(ChickenBoxAdd);
	        contentPane.remove(ChickenBoxIncrease);
	        contentPane.remove(ChickenBoxReduce);

			}
			 
		 });
	     
		 
		 //4
	//-----------------------------------------------------------------------------------------------------------------------------------------------	 

		 Sauces.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				contentPane.remove(HappyMealHamburgerAdd);
		        contentPane.remove(HappyMealHamburgerIncrease);
		        contentPane.remove(HappyMealHamburgerReduce);

		        contentPane.remove(HappyMealCheeseburgerAdd);
		        contentPane.remove(HappyMealCheeseburgerIncrease);
		        contentPane.remove(HappyMealCheeseburgerReduce);
		        		        
		        contentPane.remove(HappyMealChickenburgerAdd);
		        contentPane.remove(HappyMealChickenburgerIncrease);		
		        contentPane.remove(HappyMealChickenburgerReduce);

		        contentPane.remove(HappyMealMcNuggetsAdd);
		        contentPane.remove(HappyMealMcNuggetsIncrease);
		        contentPane.remove(HappyMealMcNuggetsReduce);


                contentPane.remove(BananaMuffinAdd);
		        contentPane.remove(BananaMuffinIncrease);
		        contentPane.remove(BananaMuffinReduce);

		        contentPane.remove(BrownMuffinAdd);
		        contentPane.remove(BrownMuffinIncrease);
		        contentPane.remove(BrownMuffinReduce);
		        		        
		        contentPane.remove(MuffinBlackAdd);
		        contentPane.remove(MuffinBlackIncrease);		
		        contentPane.remove(MuffinBlackReduce);

		        contentPane.remove(MuffinChocolateAdd);
		        contentPane.remove(MuffinChocolateIncrease);
		        contentPane.remove(MuffinChocolateReduce);

		        contentPane.remove(BakedApplePieAdd);
		        contentPane.remove(BakedApplePieIncrease);
		        contentPane.remove(BakedApplePieReduce);

		        contentPane.remove(FruitPieStrawberryAdd);
		        contentPane.remove(FruitPieStrawberryIncrease);
		        contentPane.remove(FruitPieStrawberryReduce);

		        contentPane.remove(FruitPieCherryAdd);
		        contentPane.remove(FruitPieCherryIncrease);
		        contentPane.remove(FruitPieCherryReduce);

                contentPane.remove(TeaAdd);
		        contentPane.remove(TeaIncrease);
		        contentPane.remove(TeaReduce);

		        contentPane.remove(CoffeeAdd);
		        contentPane.remove(CoffeeIncrease);
		        contentPane.remove(CoffeeReduce);
		        		        
		        contentPane.remove(LatteAdd);
		        contentPane.remove(LatteIncrease);		
		        contentPane.remove(LatteReduce);

		        contentPane.remove(CappucinoAdd);
		        contentPane.remove(CappucinoIncrease);
		        contentPane.remove(CappucinoReduce);

		        contentPane.remove(HotChocolateAdd);
		        contentPane.remove(HotChocolateIncrease);
		        contentPane.remove(HotChocolateReduce);

		        contentPane.remove(EspressoAdd);
		        contentPane.remove(EspressoIncrease);
		        contentPane.remove(EspressoReduce);

                contentPane.remove(McSundaeAdd);
		        contentPane.remove(McSundaeIncrease);
		        contentPane.remove(McSundaeReduce);

		        contentPane.remove(McFlurryAdd);
		        contentPane.remove(McFlurryIncrease);
		        contentPane.remove(McFlurryReduce);
		        		        
		        contentPane.remove(MilkShakeChocolateAdd);
		        contentPane.remove(MilkShakeChocolateIncrease);		
		        contentPane.remove(MilkShakeChocolateReduce);

		        contentPane.remove(MilkShakeVanillaAdd);
		        contentPane.remove(MilkShakeVanillaIncrease);
		        contentPane.remove(MilkShakeVanillaReduce);

		        contentPane.remove(MilkShakeStrawberryAdd);
		        contentPane.remove(MilkShakeStrawberryIncrease);
		        contentPane.remove(MilkShakeStrawberryReduce);

		        contentPane.remove(MilkShakeBananaAdd);
		        contentPane.remove(MilkShakeBananaIncrease);
		        contentPane.remove(MilkShakeBananaReduce);

		        contentPane.remove(ConeIceAdd);
		        contentPane.remove(ConeIceIncrease);
		        contentPane.remove(ConeIceReduce);

                contentPane.remove(FantaAdd);
				contentPane.remove(FantaIncrease);
				contentPane.remove(FantaReduce);

		        contentPane.remove(CocaColaAdd);
				contentPane.remove(CocaColaIncrease);
				contentPane.remove(CocaColaReduce);
				        		        
				contentPane.remove(SpriteAdd);
			    contentPane.remove(SpriteIncrease);		
			    contentPane.remove(SpriteReduce);

			    contentPane.remove(CocaColaZeroAdd);
				contentPane.remove(CocaColaZeroIncrease);
				contentPane.remove(CocaColaZeroReduce);

				contentPane.remove(LemonadeGrapefruitAdd);
				contentPane.remove(LemonadeGrapefruitIncrease);
				contentPane.remove(LemonadeGrapefruitReduce);

				contentPane.remove(LemonadeStrawberryAdd);
				contentPane.remove(LemonadeStrawberryIncrease);
				contentPane.remove(LemonadeStrawberryReduce);

				contentPane.remove(OrangeJuiceAdd);
				contentPane.remove(OrangeJuiceIncrease);
				contentPane.remove(OrangeJuiceReduce);
				        
				contentPane.remove(CappyAdd);
				contentPane.remove(CappyIncrease);
				contentPane.remove(CappyReduce);
				        
				contentPane.remove(SparklingWaterAdd);
				contentPane.remove(SparklingWaterIncrease);
				contentPane.remove(SparklingWaterReduce);


            contentPane.remove(FrenchFriesAdd);
	        contentPane.remove(FrenchFriesIncrease);
	        contentPane.remove(FrenchFriesReduce);

	        contentPane.remove(WedgesAdd);
	        contentPane.remove(WedgesIncrease);
	        contentPane.remove(WedgesReduce);
	        		        
	        contentPane.remove(McNuggetsAdd);
	        contentPane.remove(McNuggetsIncrease);		
	        contentPane.remove(McNuggetsReduce);

	        contentPane.remove(WingsAdd);
	        contentPane.remove(WingsIncrease);
	        contentPane.remove(WingsReduce);

	        contentPane.remove(OnionRingsAdd);
	        contentPane.remove(OnionRingsIncrease);
	        contentPane.remove(OnionRingsReduce);

	        contentPane.remove(ShrimpsAdd);
	        contentPane.remove(ShrimpsIncrease);
	        contentPane.remove(ShrimpsReduce);

	        contentPane.remove(ChickenBoxAdd);
	        contentPane.remove(ChickenBoxIncrease);
	        contentPane.remove(ChickenBoxReduce);

			}
			 
		 });
		 
		 
		 //5
	//-----------------------------------------------------------------------------------------------------------------------------------------------	 
	 
		 CreamsAndShakes.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				contentPane.remove(HappyMealHamburgerAdd);
		        contentPane.remove(HappyMealHamburgerIncrease);
		        contentPane.remove(HappyMealHamburgerReduce);

		        contentPane.remove(HappyMealCheeseburgerAdd);
		        contentPane.remove(HappyMealCheeseburgerIncrease);
		        contentPane.remove(HappyMealCheeseburgerReduce);
		        		        
		        contentPane.remove(HappyMealChickenburgerAdd);
		        contentPane.remove(HappyMealChickenburgerIncrease);		
		        contentPane.remove(HappyMealChickenburgerReduce);

		        contentPane.remove(HappyMealMcNuggetsAdd);
		        contentPane.remove(HappyMealMcNuggetsIncrease);
		        contentPane.remove(HappyMealMcNuggetsReduce);


                contentPane.remove(BananaMuffinAdd);
		        contentPane.remove(BananaMuffinIncrease);
		        contentPane.remove(BananaMuffinReduce);

		        contentPane.remove(BrownMuffinAdd);
		        contentPane.remove(BrownMuffinIncrease);
		        contentPane.remove(BrownMuffinReduce);
		        		        
		        contentPane.remove(MuffinBlackAdd);
		        contentPane.remove(MuffinBlackIncrease);		
		        contentPane.remove(MuffinBlackReduce);

		        contentPane.remove(MuffinChocolateAdd);
		        contentPane.remove(MuffinChocolateIncrease);
		        contentPane.remove(MuffinChocolateReduce);

		        contentPane.remove(BakedApplePieAdd);
		        contentPane.remove(BakedApplePieIncrease);
		        contentPane.remove(BakedApplePieReduce);

		        contentPane.remove(FruitPieStrawberryAdd);
		        contentPane.remove(FruitPieStrawberryIncrease);
		        contentPane.remove(FruitPieStrawberryReduce);

		        contentPane.remove(FruitPieCherryAdd);
		        contentPane.remove(FruitPieCherryIncrease);
		        contentPane.remove(FruitPieCherryReduce);

                contentPane.remove(TeaAdd);
		        contentPane.remove(TeaIncrease);
		        contentPane.remove(TeaReduce);

		        contentPane.remove(CoffeeAdd);
		        contentPane.remove(CoffeeIncrease);
		        contentPane.remove(CoffeeReduce);
		        		        
		        contentPane.remove(LatteAdd);
		        contentPane.remove(LatteIncrease);		
		        contentPane.remove(LatteReduce);

		        contentPane.remove(CappucinoAdd);
		        contentPane.remove(CappucinoIncrease);
		        contentPane.remove(CappucinoReduce);

		        contentPane.remove(HotChocolateAdd);
		        contentPane.remove(HotChocolateIncrease);
		        contentPane.remove(HotChocolateReduce);

		        contentPane.remove(EspressoAdd);
		        contentPane.remove(EspressoIncrease);
		        contentPane.remove(EspressoReduce);

                contentPane.remove(KetchupAdd);
		        contentPane.remove(KetchupIncrease);
		        contentPane.remove(KetchupReduce);

		        contentPane.remove(MayonnaiseAdd);
		        contentPane.remove(MayonnaiseIncrease);
		        contentPane.remove(MayonnaiseReduce);
		        		        
		        contentPane.remove(CheeseAdd);
		        contentPane.remove(CheeseIncrease);		
		        contentPane.remove(CheeseReduce);

		        contentPane.remove(BarbecueAdd);
		        contentPane.remove(BarbecueIncrease);
		        contentPane.remove(BarbecueReduce);

		        contentPane.remove(MustardAdd);
		        contentPane.remove(MustardIncrease);
		        contentPane.remove(MustardReduce);

		        contentPane.remove(SalsaAdd);
		        contentPane.remove(SalsaIncrease);
		        contentPane.remove(SalsaReduce);

		        contentPane.remove(SweetAdd);
		        contentPane.remove(SweetIncrease);
		        contentPane.remove(SweetReduce);

                contentPane.remove(FantaAdd);
				contentPane.remove(FantaIncrease);
				contentPane.remove(FantaReduce);

		        contentPane.remove(CocaColaAdd);
				contentPane.remove(CocaColaIncrease);
				contentPane.remove(CocaColaReduce);
				        		        
				contentPane.remove(SpriteAdd);
			    contentPane.remove(SpriteIncrease);		
			    contentPane.remove(SpriteReduce);

			    contentPane.remove(CocaColaZeroAdd);
				contentPane.remove(CocaColaZeroIncrease);
				contentPane.remove(CocaColaZeroReduce);

				contentPane.remove(LemonadeGrapefruitAdd);
				contentPane.remove(LemonadeGrapefruitIncrease);
				contentPane.remove(LemonadeGrapefruitReduce);

				contentPane.remove(LemonadeStrawberryAdd);
				contentPane.remove(LemonadeStrawberryIncrease);
				contentPane.remove(LemonadeStrawberryReduce);

				contentPane.remove(OrangeJuiceAdd);
				contentPane.remove(OrangeJuiceIncrease);
				contentPane.remove(OrangeJuiceReduce);
				        
				contentPane.remove(CappyAdd);
				contentPane.remove(CappyIncrease);
				contentPane.remove(CappyReduce);
				        
				contentPane.remove(SparklingWaterAdd);
				contentPane.remove(SparklingWaterIncrease);
				contentPane.remove(SparklingWaterReduce);


            contentPane.remove(FrenchFriesAdd);
	        contentPane.remove(FrenchFriesIncrease);
	        contentPane.remove(FrenchFriesReduce);

	        contentPane.remove(WedgesAdd);
	        contentPane.remove(WedgesIncrease);
	        contentPane.remove(WedgesReduce);
	        		        
	        contentPane.remove(McNuggetsAdd);
	        contentPane.remove(McNuggetsIncrease);		
	        contentPane.remove(McNuggetsReduce);

	        contentPane.remove(WingsAdd);
	        contentPane.remove(WingsIncrease);
	        contentPane.remove(WingsReduce);

	        contentPane.remove(OnionRingsAdd);
	        contentPane.remove(OnionRingsIncrease);
	        contentPane.remove(OnionRingsReduce);

	        contentPane.remove(ShrimpsAdd);
	        contentPane.remove(ShrimpsIncrease);
	        contentPane.remove(ShrimpsReduce);

	        contentPane.remove(ChickenBoxAdd);
	        contentPane.remove(ChickenBoxIncrease);
	        contentPane.remove(ChickenBoxReduce);				
			}
			 
		 });
		 
		 
		 //6
	//-----------------------------------------------------------------------------------------------------------------------------------------------	 

		 HotDrinks.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				contentPane.remove(HappyMealHamburgerAdd);
		        contentPane.remove(HappyMealHamburgerIncrease);
		        contentPane.remove(HappyMealHamburgerReduce);

		        contentPane.remove(HappyMealCheeseburgerAdd);
		        contentPane.remove(HappyMealCheeseburgerIncrease);
		        contentPane.remove(HappyMealCheeseburgerReduce);
		        		        
		        contentPane.remove(HappyMealChickenburgerAdd);
		        contentPane.remove(HappyMealChickenburgerIncrease);		
		        contentPane.remove(HappyMealChickenburgerReduce);

		        contentPane.remove(HappyMealMcNuggetsAdd);
		        contentPane.remove(HappyMealMcNuggetsIncrease);
		        contentPane.remove(HappyMealMcNuggetsReduce);


                contentPane.remove(BananaMuffinAdd);
		        contentPane.remove(BananaMuffinIncrease);
		        contentPane.remove(BananaMuffinReduce);

		        contentPane.remove(BrownMuffinAdd);
		        contentPane.remove(BrownMuffinIncrease);
		        contentPane.remove(BrownMuffinReduce);
		        		        
		        contentPane.remove(MuffinBlackAdd);
		        contentPane.remove(MuffinBlackIncrease);		
		        contentPane.remove(MuffinBlackReduce);

		        contentPane.remove(MuffinChocolateAdd);
		        contentPane.remove(MuffinChocolateIncrease);
		        contentPane.remove(MuffinChocolateReduce);

		        contentPane.remove(BakedApplePieAdd);
		        contentPane.remove(BakedApplePieIncrease);
		        contentPane.remove(BakedApplePieReduce);

		        contentPane.remove(FruitPieStrawberryAdd);
		        contentPane.remove(FruitPieStrawberryIncrease);
		        contentPane.remove(FruitPieStrawberryReduce);

		        contentPane.remove(FruitPieCherryAdd);
		        contentPane.remove(FruitPieCherryIncrease);
		        contentPane.remove(FruitPieCherryReduce);

                contentPane.remove(McSundaeAdd);
		        contentPane.remove(McSundaeIncrease);
		        contentPane.remove(McSundaeReduce);

		        contentPane.remove(McFlurryAdd);
		        contentPane.remove(McFlurryIncrease);
		        contentPane.remove(McFlurryReduce);
		        		        
		        contentPane.remove(MilkShakeChocolateAdd);
		        contentPane.remove(MilkShakeChocolateIncrease);		
		        contentPane.remove(MilkShakeChocolateReduce);

		        contentPane.remove(MilkShakeVanillaAdd);
		        contentPane.remove(MilkShakeVanillaIncrease);
		        contentPane.remove(MilkShakeVanillaReduce);

		        contentPane.remove(MilkShakeStrawberryAdd);
		        contentPane.remove(MilkShakeStrawberryIncrease);
		        contentPane.remove(MilkShakeStrawberryReduce);

		        contentPane.remove(MilkShakeBananaAdd);
		        contentPane.remove(MilkShakeBananaIncrease);
		        contentPane.remove(MilkShakeBananaReduce);

		        contentPane.remove(ConeIceAdd);
		        contentPane.remove(ConeIceIncrease);
		        contentPane.remove(ConeIceReduce);

                contentPane.remove(KetchupAdd);
		        contentPane.remove(KetchupIncrease);
		        contentPane.remove(KetchupReduce);

		        contentPane.remove(MayonnaiseAdd);
		        contentPane.remove(MayonnaiseIncrease);
		        contentPane.remove(MayonnaiseReduce);
		        		        
		        contentPane.remove(CheeseAdd);
		        contentPane.remove(CheeseIncrease);		
		        contentPane.remove(CheeseReduce);

		        contentPane.remove(BarbecueAdd);
		        contentPane.remove(BarbecueIncrease);
		        contentPane.remove(BarbecueReduce);

		        contentPane.remove(MustardAdd);
		        contentPane.remove(MustardIncrease);
		        contentPane.remove(MustardReduce);

		        contentPane.remove(SalsaAdd);
		        contentPane.remove(SalsaIncrease);
		        contentPane.remove(SalsaReduce);

		        contentPane.remove(SweetAdd);
		        contentPane.remove(SweetIncrease);
		        contentPane.remove(SweetReduce);

                contentPane.remove(FantaAdd);
				contentPane.remove(FantaIncrease);
				contentPane.remove(FantaReduce);

		        contentPane.remove(CocaColaAdd);
				contentPane.remove(CocaColaIncrease);
				contentPane.remove(CocaColaReduce);
				        		        
				contentPane.remove(SpriteAdd);
			    contentPane.remove(SpriteIncrease);		
			    contentPane.remove(SpriteReduce);

			    contentPane.remove(CocaColaZeroAdd);
				contentPane.remove(CocaColaZeroIncrease);
				contentPane.remove(CocaColaZeroReduce);

				contentPane.remove(LemonadeGrapefruitAdd);
				contentPane.remove(LemonadeGrapefruitIncrease);
				contentPane.remove(LemonadeGrapefruitReduce);

				contentPane.remove(LemonadeStrawberryAdd);
				contentPane.remove(LemonadeStrawberryIncrease);
				contentPane.remove(LemonadeStrawberryReduce);

				contentPane.remove(OrangeJuiceAdd);
				contentPane.remove(OrangeJuiceIncrease);
				contentPane.remove(OrangeJuiceReduce);
				        
				contentPane.remove(CappyAdd);
				contentPane.remove(CappyIncrease);
				contentPane.remove(CappyReduce);
				        
				contentPane.remove(SparklingWaterAdd);
				contentPane.remove(SparklingWaterIncrease);
				contentPane.remove(SparklingWaterReduce);


            contentPane.remove(FrenchFriesAdd);
	        contentPane.remove(FrenchFriesIncrease);
	        contentPane.remove(FrenchFriesReduce);

	        contentPane.remove(WedgesAdd);
	        contentPane.remove(WedgesIncrease);
	        contentPane.remove(WedgesReduce);
	        		        
	        contentPane.remove(McNuggetsAdd);
	        contentPane.remove(McNuggetsIncrease);		
	        contentPane.remove(McNuggetsReduce);

	        contentPane.remove(WingsAdd);
	        contentPane.remove(WingsIncrease);
	        contentPane.remove(WingsReduce);

	        contentPane.remove(OnionRingsAdd);
	        contentPane.remove(OnionRingsIncrease);
	        contentPane.remove(OnionRingsReduce);

	        contentPane.remove(ShrimpsAdd);
	        contentPane.remove(ShrimpsIncrease);
	        contentPane.remove(ShrimpsReduce);

	        contentPane.remove(ChickenBoxAdd);
	        contentPane.remove(ChickenBoxIncrease);
	        contentPane.remove(ChickenBoxReduce);				
			}
			 
		 });
		 
		 //7
	//-----------------------------------------------------------------------------------------------------------------------------------------------	 

		 Desserts.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				contentPane.remove(HappyMealHamburgerAdd);
		        contentPane.remove(HappyMealHamburgerIncrease);
		        contentPane.remove(HappyMealHamburgerReduce);

		        contentPane.remove(HappyMealCheeseburgerAdd);
		        contentPane.remove(HappyMealCheeseburgerIncrease);
		        contentPane.remove(HappyMealCheeseburgerReduce);
		        		        
		        contentPane.remove(HappyMealChickenburgerAdd);
		        contentPane.remove(HappyMealChickenburgerIncrease);		
		        contentPane.remove(HappyMealChickenburgerReduce);

		        contentPane.remove(HappyMealMcNuggetsAdd);
		        contentPane.remove(HappyMealMcNuggetsIncrease);
		        contentPane.remove(HappyMealMcNuggetsReduce);

                contentPane.remove(TeaAdd);
		        contentPane.remove(TeaIncrease);
		        contentPane.remove(TeaReduce);

		        contentPane.remove(CoffeeAdd);
		        contentPane.remove(CoffeeIncrease);
		        contentPane.remove(CoffeeReduce);
		        		        
		        contentPane.remove(LatteAdd);
		        contentPane.remove(LatteIncrease);		
		        contentPane.remove(LatteReduce);

		        contentPane.remove(CappucinoAdd);
		        contentPane.remove(CappucinoIncrease);
		        contentPane.remove(CappucinoReduce);

		        contentPane.remove(HotChocolateAdd);
		        contentPane.remove(HotChocolateIncrease);
		        contentPane.remove(HotChocolateReduce);

		        contentPane.remove(EspressoAdd);
		        contentPane.remove(EspressoIncrease);
		        contentPane.remove(EspressoReduce);

                contentPane.remove(McSundaeAdd);
		        contentPane.remove(McSundaeIncrease);
		        contentPane.remove(McSundaeReduce);

		        contentPane.remove(McFlurryAdd);
		        contentPane.remove(McFlurryIncrease);
		        contentPane.remove(McFlurryReduce);
		        		        
		        contentPane.remove(MilkShakeChocolateAdd);
		        contentPane.remove(MilkShakeChocolateIncrease);		
		        contentPane.remove(MilkShakeChocolateReduce);

		        contentPane.remove(MilkShakeVanillaAdd);
		        contentPane.remove(MilkShakeVanillaIncrease);
		        contentPane.remove(MilkShakeVanillaReduce);

		        contentPane.remove(MilkShakeStrawberryAdd);
		        contentPane.remove(MilkShakeStrawberryIncrease);
		        contentPane.remove(MilkShakeStrawberryReduce);

		        contentPane.remove(MilkShakeBananaAdd);
		        contentPane.remove(MilkShakeBananaIncrease);
		        contentPane.remove(MilkShakeBananaReduce);

		        contentPane.remove(ConeIceAdd);
		        contentPane.remove(ConeIceIncrease);
		        contentPane.remove(ConeIceReduce);

                contentPane.remove(KetchupAdd);
		        contentPane.remove(KetchupIncrease);
		        contentPane.remove(KetchupReduce);

		        contentPane.remove(MayonnaiseAdd);
		        contentPane.remove(MayonnaiseIncrease);
		        contentPane.remove(MayonnaiseReduce);
		        		        
		        contentPane.remove(CheeseAdd);
		        contentPane.remove(CheeseIncrease);		
		        contentPane.remove(CheeseReduce);

		        contentPane.remove(BarbecueAdd);
		        contentPane.remove(BarbecueIncrease);
		        contentPane.remove(BarbecueReduce);

		        contentPane.remove(MustardAdd);
		        contentPane.remove(MustardIncrease);
		        contentPane.remove(MustardReduce);

		        contentPane.remove(SalsaAdd);
		        contentPane.remove(SalsaIncrease);
		        contentPane.remove(SalsaReduce);

		        contentPane.remove(SweetAdd);
		        contentPane.remove(SweetIncrease);
		        contentPane.remove(SweetReduce);

                contentPane.remove(FantaAdd);
				contentPane.remove(FantaIncrease);
				contentPane.remove(FantaReduce);

		        contentPane.remove(CocaColaAdd);
				contentPane.remove(CocaColaIncrease);
				contentPane.remove(CocaColaReduce);
				        		        
				contentPane.remove(SpriteAdd);
			    contentPane.remove(SpriteIncrease);		
			    contentPane.remove(SpriteReduce);

			    contentPane.remove(CocaColaZeroAdd);
				contentPane.remove(CocaColaZeroIncrease);
				contentPane.remove(CocaColaZeroReduce);

				contentPane.remove(LemonadeGrapefruitAdd);
				contentPane.remove(LemonadeGrapefruitIncrease);
				contentPane.remove(LemonadeGrapefruitReduce);

				contentPane.remove(LemonadeStrawberryAdd);
				contentPane.remove(LemonadeStrawberryIncrease);
				contentPane.remove(LemonadeStrawberryReduce);

				contentPane.remove(OrangeJuiceAdd);
				contentPane.remove(OrangeJuiceIncrease);
				contentPane.remove(OrangeJuiceReduce);
				        
				contentPane.remove(CappyAdd);
				contentPane.remove(CappyIncrease);
				contentPane.remove(CappyReduce);
				        
				contentPane.remove(SparklingWaterAdd);
				contentPane.remove(SparklingWaterIncrease);
				contentPane.remove(SparklingWaterReduce);


            contentPane.remove(FrenchFriesAdd);
	        contentPane.remove(FrenchFriesIncrease);
	        contentPane.remove(FrenchFriesReduce);

	        contentPane.remove(WedgesAdd);
	        contentPane.remove(WedgesIncrease);
	        contentPane.remove(WedgesReduce);
	        		        
	        contentPane.remove(McNuggetsAdd);
	        contentPane.remove(McNuggetsIncrease);		
	        contentPane.remove(McNuggetsReduce);

	        contentPane.remove(WingsAdd);
	        contentPane.remove(WingsIncrease);
	        contentPane.remove(WingsReduce);

	        contentPane.remove(OnionRingsAdd);
	        contentPane.remove(OnionRingsIncrease);
	        contentPane.remove(OnionRingsReduce);

	        contentPane.remove(ShrimpsAdd);
	        contentPane.remove(ShrimpsIncrease);
	        contentPane.remove(ShrimpsReduce);

	        contentPane.remove(ChickenBoxAdd);
	        contentPane.remove(ChickenBoxIncrease);
	        contentPane.remove(ChickenBoxReduce);				
			}
			 
		 });
		 
		 //8
	//-----------------------------------------------------------------------------------------------------------------------------------------------	 

		 HappyMeal.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
                contentPane.remove(BananaMuffinAdd);
		        contentPane.remove(BananaMuffinIncrease);
		        contentPane.remove(BananaMuffinReduce);

		        contentPane.remove(BrownMuffinAdd);
		        contentPane.remove(BrownMuffinIncrease);
		        contentPane.remove(BrownMuffinReduce);
		        		        
		        contentPane.remove(MuffinBlackAdd);
		        contentPane.remove(MuffinBlackIncrease);		
		        contentPane.remove(MuffinBlackReduce);

		        contentPane.remove(MuffinChocolateAdd);
		        contentPane.remove(MuffinChocolateIncrease);
		        contentPane.remove(MuffinChocolateReduce);

		        contentPane.remove(BakedApplePieAdd);
		        contentPane.remove(BakedApplePieIncrease);
		        contentPane.remove(BakedApplePieReduce);

		        contentPane.remove(FruitPieStrawberryAdd);
		        contentPane.remove(FruitPieStrawberryIncrease);
		        contentPane.remove(FruitPieStrawberryReduce);

		        contentPane.remove(FruitPieCherryAdd);
		        contentPane.remove(FruitPieCherryIncrease);
		        contentPane.remove(FruitPieCherryReduce);

                contentPane.remove(TeaAdd);
		        contentPane.remove(TeaIncrease);
		        contentPane.remove(TeaReduce);

		        contentPane.remove(CoffeeAdd);
		        contentPane.remove(CoffeeIncrease);
		        contentPane.remove(CoffeeReduce);
		        		        
		        contentPane.remove(LatteAdd);
		        contentPane.remove(LatteIncrease);		
		        contentPane.remove(LatteReduce);

		        contentPane.remove(CappucinoAdd);
		        contentPane.remove(CappucinoIncrease);
		        contentPane.remove(CappucinoReduce);

		        contentPane.remove(HotChocolateAdd);
		        contentPane.remove(HotChocolateIncrease);
		        contentPane.remove(HotChocolateReduce);

		        contentPane.remove(EspressoAdd);
		        contentPane.remove(EspressoIncrease);
		        contentPane.remove(EspressoReduce);

                contentPane.remove(McSundaeAdd);
		        contentPane.remove(McSundaeIncrease);
		        contentPane.remove(McSundaeReduce);

		        contentPane.remove(McFlurryAdd);
		        contentPane.remove(McFlurryIncrease);
		        contentPane.remove(McFlurryReduce);
		        		        
		        contentPane.remove(MilkShakeChocolateAdd);
		        contentPane.remove(MilkShakeChocolateIncrease);		
		        contentPane.remove(MilkShakeChocolateReduce);

		        contentPane.remove(MilkShakeVanillaAdd);
		        contentPane.remove(MilkShakeVanillaIncrease);
		        contentPane.remove(MilkShakeVanillaReduce);

		        contentPane.remove(MilkShakeStrawberryAdd);
		        contentPane.remove(MilkShakeStrawberryIncrease);
		        contentPane.remove(MilkShakeStrawberryReduce);

		        contentPane.remove(MilkShakeBananaAdd);
		        contentPane.remove(MilkShakeBananaIncrease);
		        contentPane.remove(MilkShakeBananaReduce);

		        contentPane.remove(ConeIceAdd);
		        contentPane.remove(ConeIceIncrease);
		        contentPane.remove(ConeIceReduce);

                contentPane.remove(KetchupAdd);
		        contentPane.remove(KetchupIncrease);
		        contentPane.remove(KetchupReduce);

		        contentPane.remove(MayonnaiseAdd);
		        contentPane.remove(MayonnaiseIncrease);
		        contentPane.remove(MayonnaiseReduce);
		        		        
		        contentPane.remove(CheeseAdd);
		        contentPane.remove(CheeseIncrease);		
		        contentPane.remove(CheeseReduce);

		        contentPane.remove(BarbecueAdd);
		        contentPane.remove(BarbecueIncrease);
		        contentPane.remove(BarbecueReduce);

		        contentPane.remove(MustardAdd);
		        contentPane.remove(MustardIncrease);
		        contentPane.remove(MustardReduce);

		        contentPane.remove(SalsaAdd);
		        contentPane.remove(SalsaIncrease);
		        contentPane.remove(SalsaReduce);

		        contentPane.remove(SweetAdd);
		        contentPane.remove(SweetIncrease);
		        contentPane.remove(SweetReduce);

                contentPane.remove(FantaAdd);
				contentPane.remove(FantaIncrease);
				contentPane.remove(FantaReduce);

		        contentPane.remove(CocaColaAdd);
				contentPane.remove(CocaColaIncrease);
				contentPane.remove(CocaColaReduce);
				        		        
				contentPane.remove(SpriteAdd);
			    contentPane.remove(SpriteIncrease);		
			    contentPane.remove(SpriteReduce);

			    contentPane.remove(CocaColaZeroAdd);
				contentPane.remove(CocaColaZeroIncrease);
				contentPane.remove(CocaColaZeroReduce);

				contentPane.remove(LemonadeGrapefruitAdd);
				contentPane.remove(LemonadeGrapefruitIncrease);
				contentPane.remove(LemonadeGrapefruitReduce);

				contentPane.remove(LemonadeStrawberryAdd);
				contentPane.remove(LemonadeStrawberryIncrease);
				contentPane.remove(LemonadeStrawberryReduce);

				contentPane.remove(OrangeJuiceAdd);
				contentPane.remove(OrangeJuiceIncrease);
				contentPane.remove(OrangeJuiceReduce);
				        
				contentPane.remove(CappyAdd);
				contentPane.remove(CappyIncrease);
				contentPane.remove(CappyReduce);
				        
				contentPane.remove(SparklingWaterAdd);
				contentPane.remove(SparklingWaterIncrease);
				contentPane.remove(SparklingWaterReduce);


            contentPane.remove(FrenchFriesAdd);
	        contentPane.remove(FrenchFriesIncrease);
	        contentPane.remove(FrenchFriesReduce);

	        contentPane.remove(WedgesAdd);
	        contentPane.remove(WedgesIncrease);
	        contentPane.remove(WedgesReduce);
	        		        
	        contentPane.remove(McNuggetsAdd);
	        contentPane.remove(McNuggetsIncrease);		
	        contentPane.remove(McNuggetsReduce);

	        contentPane.remove(WingsAdd);
	        contentPane.remove(WingsIncrease);
	        contentPane.remove(WingsReduce);

	        contentPane.remove(OnionRingsAdd);
	        contentPane.remove(OnionRingsIncrease);
	        contentPane.remove(OnionRingsReduce);

	        contentPane.remove(ShrimpsAdd);
	        contentPane.remove(ShrimpsIncrease);
	        contentPane.remove(ShrimpsReduce);

	        contentPane.remove(ChickenBoxAdd);
	        contentPane.remove(ChickenBoxIncrease);
	        contentPane.remove(ChickenBoxReduce);				
			}
			 
		 });
		 
		 
		
		 
		 
		 
		    JButton Bill = new JButton("");
			Bill.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\26.01.2024_23.01.18_REC.png"));
			Bill.setBounds(808, 780, 95, 33);
			Bill.setBorderPainted(false);
			contentPane.add(Bill);
			
			
			
			Bill.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					
					
					Color color = new Color(255,242,204);
					Color colorBlack = new Color(0,0,0);
					
					JFrame BillFrame = new JFrame();
					BillFrame.setBounds(0, 0, 650,650);
					BillFrame.setVisible(true);
					BillFrame.setLocationRelativeTo(null);
					BillFrame.getContentPane().setBackground(Color.white);
					BillFrame.setBackground(color);
					BillFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
					
					JPanel panel = new JPanel();
					panel.setBackground(color);
					BillFrame.setContentPane(panel);
					
					JPanel p = new JPanel();
					p.setBackground(color);
					p.setBounds(-1, 500, 650, 115);
					p.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
					
					JButton Back = new JButton();
					Back.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Back.png"));
					Back.setBounds(25, 535, 100, 38);
					Back.setBorderPainted(false);
					
					JButton Pay = new JButton();
					Pay.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Icons\\Pay.png"));
					Pay.setBounds(510, 535, 96, 36);
					Pay.setBorderPainted(false);
					
					JLabel TotalPrice = new JLabel("Total Price: " + totalPrice[0]+" $");
					TotalPrice.setBounds(255, 543, 200, 20);
					TotalPrice.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
					TotalPrice.setForeground(colorBlack);
					
					JLabel Orders = new JLabel("Orders");
					Orders.setBounds(270, 0, 200, 50);
					Orders.setFont(new Font("Britannic Bold", Font.PLAIN, 30));
					
					JLabel name = new JLabel("Name");
					name.setBounds(35, 57, 100, 30);
					name.setFont(new Font("Calibri", Font.BOLD, 17));
					
					JLabel size = new JLabel("Size");
					size.setBounds(220, 57, 100, 30);
					size.setFont(new Font("Calibri", Font.BOLD, 17));
					
					JLabel amount = new JLabel("Amount");
					amount.setBounds(385, 57, 100, 30);
					amount.setFont(new Font("Calibri", Font.BOLD, 17));
					
					JLabel price = new JLabel("Price");
					price.setBounds(565, 57, 100, 30);
					price.setFont(new Font("Calibri", Font.BOLD, 17));
					
					
			       
					
					Back.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							textArea.setText("");
							totalPrice[0] = BigDecimal.ZERO;							
							BillFrame.dispose();
							
						}
						
					});
				
					BillFrame.getContentPane().add(price);
					BillFrame.getContentPane().add(amount);
					BillFrame.getContentPane().add(size);
					BillFrame.getContentPane().add(name);
					BillFrame.getContentPane().add(textArea);
					BillFrame.getContentPane().add(Orders);
					BillFrame.getContentPane().add(TotalPrice);
					BillFrame.getContentPane().add(Pay);
					BillFrame.getContentPane().add(Back);
					BillFrame.getContentPane().add(p);	
					
					BillFrame.getContentPane().setLayout(null);
					JOptionPane.showMessageDialog(null, "If something is wrong, press the BACK button and select again.", "Message", JOptionPane.INFORMATION_MESSAGE);

					
					
			        
				}
				
			});
		 
	}
}


	







