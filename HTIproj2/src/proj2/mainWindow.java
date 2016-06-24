package proj2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JTextPane;

public class mainWindow {

	private JFrame frmNameOfGame;
	private JTextField textField;
	private JTextField txtAlice;
	private JTextField txtBob;
	private JTextField txtCarly;
	private JTextField txtDave;
	private JTextField textField_1;
	private String p1 = "Alice";
	private String p2 = "Bob";
	private String p3 = "Carly";
	private String p4 = "Dave";
	private ArrayList<String> pList = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainWindow window = new mainWindow();
					window.frmNameOfGame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public mainWindow() {
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		pList.add(p4);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNameOfGame = new JFrame();
		frmNameOfGame.setTitle("TRIVIAL PURSUIT");
		frmNameOfGame.setResizable(false);
		frmNameOfGame.setBounds(100, 100, 640, 480);
		frmNameOfGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNameOfGame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panelSplash = new JPanel();
		frmNameOfGame.getContentPane().add(panelSplash, "name_3369926822669");
		panelSplash.setLayout(null);
		
		JPanel panelMainMenu = new JPanel();
		frmNameOfGame.getContentPane().add(panelMainMenu, "name_3374085624224");
		panelMainMenu.setLayout(null);
		
		JPanel panelAddPlayer = new JPanel();
		frmNameOfGame.getContentPane().add(panelAddPlayer, "name_3377418950884");
		panelAddPlayer.setLayout(null);
		
		JPanel panelEditPlayer = new JPanel();
		frmNameOfGame.getContentPane().add(panelEditPlayer, "name_3444685357599");
		panelEditPlayer.setLayout(null);
		
		JPanel panelActiveGame = new JPanel();
		frmNameOfGame.getContentPane().add(panelActiveGame, "name_3451195487396");
		panelActiveGame.setLayout(null);
		
		JPanel panelPauseGame = new JPanel();
		frmNameOfGame.getContentPane().add(panelPauseGame, "name_3458649584436");
		panelPauseGame.setLayout(null);
		
		JPanel panelScore = new JPanel();
		frmNameOfGame.getContentPane().add(panelScore, "name_3461788865720");
		panelScore.setLayout(null);
		
		// panelActiveGame
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panelActiveGame.setVisible(false);
				panelScore.setVisible(true);
			}
		});
		lblNewLabel.setIcon(new ImageIcon(mainWindow.class.getResource("/proj2/board.jpg")));
		lblNewLabel.setBounds(10, 26, 390, 390);
		panelActiveGame.add(lblNewLabel);
		
		JLabel lblRound = new JLabel("Round 1");
		lblRound.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRound.setHorizontalAlignment(SwingConstants.CENTER);
		lblRound.setBounds(410, 11, 204, 17);
		panelActiveGame.add(lblRound);
		
		JLabel label_5 = new JLabel("0:15");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 32));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(410, 26, 204, 37);
		panelActiveGame.add(label_5);
		
		JLabel lblCategory = new JLabel("GEOGRAPHY");
		lblCategory.setForeground(new Color(30, 144, 255));
		lblCategory.setHorizontalAlignment(SwingConstants.LEFT);
		lblCategory.setBounds(512, 65, 102, 14);
		panelActiveGame.add(lblCategory);
		
		JLabel lblQuestion = new JLabel("Question:");
		lblQuestion.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuestion.setBounds(410, 84, 204, 14);
		panelActiveGame.add(lblQuestion);
		
		JLabel lblAnswers = new JLabel("Answers:");
		lblAnswers.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnswers.setBounds(410, 148, 204, 14);
		panelActiveGame.add(lblAnswers);
		
		JLabel lblARedWhite = new JLabel("A) red, white, blue");
		lblARedWhite.setHorizontalAlignment(SwingConstants.CENTER);
		lblARedWhite.setBounds(410, 164, 204, 14);
		panelActiveGame.add(lblARedWhite);
		
		JLabel lblBYellowBlue = new JLabel("B) yellow, blue, red");
		lblBYellowBlue.setHorizontalAlignment(SwingConstants.CENTER);
		lblBYellowBlue.setBounds(410, 179, 204, 14);
		panelActiveGame.add(lblBYellowBlue);
		
		JLabel lblXBlackYellow = new JLabel("X) black, yellow, red");
		lblXBlackYellow.setHorizontalAlignment(SwingConstants.CENTER);
		lblXBlackYellow.setBounds(410, 194, 204, 14);
		panelActiveGame.add(lblXBlackYellow);
		
		JLabel lblYGreenWhite = new JLabel("Y) green, white, yellow");
		lblYGreenWhite.setHorizontalAlignment(SwingConstants.CENTER);
		lblYGreenWhite.setBounds(410, 209, 204, 14);
		panelActiveGame.add(lblYGreenWhite);
		
		JLabel lblCategory_1 = new JLabel("Category: ");
		lblCategory_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCategory_1.setForeground(new Color(0, 0, 0));
		lblCategory_1.setBounds(410, 65, 102, 14);
		panelActiveGame.add(lblCategory_1);
		
		JLabel lblPlayer_4 = new JLabel("Player 1: Alice");
		lblPlayer_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer_4.setBounds(471, 234, 143, 14);
		panelActiveGame.add(lblPlayer_4);
		
		JLabel lblPoints = new JLabel("Points: 4");
		lblPoints.setHorizontalAlignment(SwingConstants.CENTER);
		lblPoints.setBounds(471, 250, 143, 14);
		panelActiveGame.add(lblPoints);
		
		JLabel lblPlayer_5 = new JLabel("Player 2: Bob");
		lblPlayer_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer_5.setBounds(471, 270, 143, 14);
		panelActiveGame.add(lblPlayer_5);
		
		JLabel lblPoints_1 = new JLabel("Points: 8");
		lblPoints_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPoints_1.setBounds(471, 286, 143, 14);
		panelActiveGame.add(lblPoints_1);
		
		JLabel lblPlayerDave = new JLabel("Player 4: Dave");
		lblPlayerDave.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayerDave.setBounds(471, 342, 143, 14);
		panelActiveGame.add(lblPlayerDave);
		
		JLabel lblPoints_3 = new JLabel("Points: 16");
		lblPoints_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblPoints_3.setBounds(471, 358, 143, 14);
		panelActiveGame.add(lblPoints_3);
		
		JLabel lblPoints_2 = new JLabel("Points: 15");
		lblPoints_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPoints_2.setBounds(471, 322, 143, 14);
		panelActiveGame.add(lblPoints_2);
		
		JLabel lblPlayerCarly = new JLabel("Player 3: Carly");
		lblPlayerCarly.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayerCarly.setBounds(471, 306, 143, 14);
		panelActiveGame.add(lblPlayerCarly);
		
		JButton btnNewButton = new JButton("PAUSE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelActiveGame.setVisible(false);
				panelPauseGame.setVisible(true);
				}
		});
		btnNewButton.setBounds(410, 397, 100, 43);
		panelActiveGame.add(btnNewButton);
		
		JButton btnExit_2 = new JButton("EXIT");
		btnExit_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelActiveGame.setVisible(false);
				panelMainMenu.setVisible(true);
			}
		});
		btnExit_2.setBounds(524, 397, 100, 43);
		panelActiveGame.add(btnExit_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(mainWindow.class.getResource("/proj2/cheese.jpg")));
		lblNewLabel_1.setBounds(432, 234, 40, 30);
		panelActiveGame.add(lblNewLabel_1);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(mainWindow.class.getResource("/proj2/cheese.jpg")));
		label_6.setBounds(432, 270, 40, 30);
		panelActiveGame.add(label_6);
		
		JLabel label_7 = new JLabel("CHEESE");
		label_7.setIcon(new ImageIcon(mainWindow.class.getResource("/proj2/cheese.jpg")));
		label_7.setBounds(432, 306, 40, 30);
		panelActiveGame.add(label_7);
		
		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon(mainWindow.class.getResource("/proj2/cheese.jpg")));
		label_8.setBounds(432, 342, 40, 30);
		panelActiveGame.add(label_8);
		
		JTextPane txtpnWhatThreeColors = new JTextPane();
		txtpnWhatThreeColors.setText("What three colors are on the French flag?");
		txtpnWhatThreeColors.setBounds(410, 103, 214, 43);
		panelActiveGame.add(txtpnWhatThreeColors);
		
		// panelStartGame
		
		JPanel panelStartGame = new JPanel();
		frmNameOfGame.getContentPane().add(panelStartGame, "name_3455162437616");
		panelStartGame.setLayout(null);
		
		txtAlice = new JTextField();
		txtAlice.setHorizontalAlignment(SwingConstants.CENTER);
		txtAlice.setText(p1);
		txtAlice.setEditable(false);
		txtAlice.setBounds(139, 150, 136, 20);
		panelStartGame.add(txtAlice);
		txtAlice.setColumns(10);
		
		txtBob = new JTextField();
		txtBob.setText(p2);
		txtBob.setHorizontalAlignment(SwingConstants.CENTER);
		txtBob.setEditable(false);
		txtBob.setColumns(10);
		txtBob.setBounds(355, 150, 136, 20);
		panelStartGame.add(txtBob);
		
		JLabel lblPlayer_1 = new JLabel("Player 2");
		lblPlayer_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer_1.setBounds(350, 125, 141, 14);
		panelStartGame.add(lblPlayer_1);
		
		txtCarly = new JTextField();
		txtCarly.setText(p3);
		txtCarly.setHorizontalAlignment(SwingConstants.CENTER);
		txtCarly.setEditable(false);
		txtCarly.setColumns(10);
		txtCarly.setBounds(139, 227, 136, 20);
		panelStartGame.add(txtCarly);
		
		JLabel lblPlayer_2 = new JLabel("Player 3");
		lblPlayer_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer_2.setBounds(139, 202, 136, 14);
		panelStartGame.add(lblPlayer_2);
		
		JLabel lblPlayer_3 = new JLabel("Player 4");
		lblPlayer_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer_3.setBounds(355, 202, 136, 14);
		panelStartGame.add(lblPlayer_3);
		
		txtDave = new JTextField();
		txtDave.setText(p4);
		txtDave.setHorizontalAlignment(SwingConstants.CENTER);
		txtDave.setEditable(false);
		txtDave.setColumns(10);
		txtDave.setBounds(355, 227, 136, 20);
		panelStartGame.add(txtDave);
		
		JButton btnConfirmPlayers = new JButton("CONFIRM PLAYERS");

		JComboBox comboBox_1 = new JComboBox(pList.toArray());
		comboBox_1.setSelectedIndex(0);
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p1 = (String)comboBox_1.getSelectedItem();
				txtAlice.setText(p1);
			}
		});
		comboBox_1.setEditable(true);
		comboBox_1.setVisible(false);
		comboBox_1.setBounds(139, 150, 136, 20);
		panelStartGame.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox(pList.toArray());
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p2 = (String)comboBox_2.getSelectedItem();
				txtBob.setText(p2);
			}
		});
		comboBox_2.setSelectedIndex(1);
		comboBox_2.setEditable(true);
		comboBox_2.setVisible(false);
		comboBox_2.setBounds(355, 150, 136, 20);
		panelStartGame.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox(pList.toArray());
		comboBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p3 = (String)comboBox_3.getSelectedItem();
				txtCarly.setText(p3);
			}
		});
		comboBox_3.setSelectedIndex(2);
		comboBox_3.setEditable(true);
		comboBox_3.setVisible(false);
		comboBox_3.setBounds(139, 227, 136, 20);
		panelStartGame.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox(pList.toArray());
		comboBox_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p4 = (String)comboBox_4.getSelectedItem();
				txtDave.setText(p4);
			}
		});
		comboBox_4.setSelectedIndex(3);
		comboBox_4.setEditable(true);
		comboBox_4.setVisible(false);
		comboBox_4.setBounds(355, 227, 136, 20);
		panelStartGame.add(comboBox_4);
		
		JButton btnSelectPlayers = new JButton("SELECT PLAYERS");
		btnSelectPlayers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtAlice.setVisible(false);
				txtBob.setVisible(false);
				txtCarly.setVisible(false);
				txtDave.setVisible(false);
				comboBox_1.setVisible(true);
				comboBox_2.setVisible(true);
				comboBox_3.setVisible(true);
				comboBox_4.setVisible(true);
				btnSelectPlayers.setVisible(false);
				btnConfirmPlayers.setVisible(true);
			}
		});
		btnSelectPlayers.setBounds(75, 292, 200, 56);
		panelStartGame.add(btnSelectPlayers);
		
		JButton btnStart_1 = new JButton("START");
		btnStart_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelStartGame.setVisible(false);
				panelActiveGame.setVisible(true);
			}
		});
		btnStart_1.setBounds(355, 292, 200, 56);
		panelStartGame.add(btnStart_1);
		
		JLabel lblPlayer = new JLabel("Player 1");
		lblPlayer.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer.setBounds(139, 125, 136, 14);
		panelStartGame.add(lblPlayer);
		
		JLabel lblTrivialPursuit_5 = new JLabel("TRIVIAL PURSUIT");
		lblTrivialPursuit_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblTrivialPursuit_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTrivialPursuit_5.setBounds(10, 11, 614, 47);
		panelStartGame.add(lblTrivialPursuit_5);
		
		btnConfirmPlayers.setVisible(false);
		btnConfirmPlayers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtAlice.setVisible(true);
				txtBob.setVisible(true);
				txtCarly.setVisible(true);
				txtDave.setVisible(true);
				comboBox_1.setVisible(false);
				comboBox_2.setVisible(false);
				comboBox_3.setVisible(false);
				comboBox_4.setVisible(false);
				btnConfirmPlayers.setVisible(false);
				btnSelectPlayers.setVisible(true);
			}
		});
		btnConfirmPlayers.setBounds(75, 292, 200, 56);
		panelStartGame.add(btnConfirmPlayers);
		
		// panelSplash
		
		JLabel lblNameOfGame = new JLabel("TRIVIAL PURSUIT");
		lblNameOfGame.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNameOfGame.setHorizontalAlignment(SwingConstants.CENTER);
		lblNameOfGame.setBounds(10, 116, 604, 56);
		panelSplash.add(lblNameOfGame);
		
		JButton btnStart = new JButton("START");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelSplash.setVisible(false);
				panelMainMenu.setVisible(true); 
			}
		});
		btnStart.setBounds(141, 238, 126, 56);
		panelSplash.add(btnStart);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmNameOfGame.dispose();
			}
		});
		btnExit.setBounds(355, 238, 126, 56);
		panelSplash.add(btnExit);
		
		// panel mainMenu
		
		JLabel lblTrivialPursuit = new JLabel("TRIVIAL PURSUIT");
		lblTrivialPursuit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTrivialPursuit.setHorizontalAlignment(SwingConstants.CENTER);
		lblTrivialPursuit.setBounds(10, 58, 614, 56);
		panelMainMenu.add(lblTrivialPursuit);
		
		JButton btnAddPlayerAccount = new JButton("START GAME");
		btnAddPlayerAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMainMenu.setVisible(false);
				panelStartGame.setVisible(true);
			}
		});
		btnAddPlayerAccount.setBounds(85, 155, 175, 56);
		panelMainMenu.add(btnAddPlayerAccount);
		
		JButton btnAddPlayerAccount_1 = new JButton("ADD PLAYER ACCOUNT");
		btnAddPlayerAccount_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMainMenu.setVisible(false);
				panelAddPlayer.setVisible(true);
			}
		});
		btnAddPlayerAccount_1.setBounds(374, 156, 175, 56);
		panelMainMenu.add(btnAddPlayerAccount_1);
		
		JButton btnEditPlayerAccount = new JButton("EDIT PLAYER ACCOUNT");
		btnEditPlayerAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMainMenu.setVisible(false);
				panelEditPlayer.setVisible(true);
			}
		});
		btnEditPlayerAccount.setBounds(85, 296, 175, 56);
		panelMainMenu.add(btnEditPlayerAccount);
		
		JButton btnExitGame = new JButton("EXIT GAME");
		btnExitGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmNameOfGame.dispose();
			}
		});
		btnExitGame.setBounds(374, 296, 175, 56);
		panelMainMenu.add(btnExitGame);
		
		JLabel lblAddPlayerAccount = new JLabel("ADD PLAYER ACCOUNT");
		lblAddPlayerAccount.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAddPlayerAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddPlayerAccount.setBounds(10, 149, 614, 30);
		panelAddPlayer.add(lblAddPlayerAccount);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = new String();
				temp = textField.getText();
				if(pList.contains(temp)){
					
				}
				else {
					pList.add(temp);
					textField.setText("");
					panelAddPlayer.setVisible(false);
					panelMainMenu.setVisible(true);
				}
			}
		});
		btnSave.setBounds(110, 307, 126, 56);
		panelAddPlayer.add(btnSave);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAddPlayer.setVisible(false);
				panelMainMenu.setVisible(true);
			}
		});
		btnCancel.setBounds(398, 307, 126, 56);
		panelAddPlayer.add(btnCancel);
		
		JLabel lblPlayerName = new JLabel("PLAYER NAME");
		lblPlayerName.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayerName.setBounds(10, 229, 614, 14);
		panelAddPlayer.add(lblPlayerName);
		
		textField = new JTextField();
		textField.setBounds(267, 254, 100, 20);
		panelAddPlayer.add(textField);
		textField.setColumns(10);
		
		JLabel lblTrivialPursuit_1 = new JLabel("TRIVIAL PURSUIT");
		lblTrivialPursuit_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTrivialPursuit_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTrivialPursuit_1.setBounds(10, 70, 614, 56);
		panelAddPlayer.add(lblTrivialPursuit_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(240, 190, 150, 20);
		panelEditPlayer.add(comboBox);
		
		JLabel lblEditPlayerAccount = new JLabel("EDIT PLAYER ACCOUNT");
		lblEditPlayerAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblEditPlayerAccount.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEditPlayerAccount.setBounds(10, 149, 614, 30);
		panelEditPlayer.add(lblEditPlayerAccount);
		
		JButton button = new JButton("SAVE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelEditPlayer.setVisible(false);
				panelMainMenu.setVisible(true);
			}
		});
		button.setBounds(110, 307, 126, 56);
		panelEditPlayer.add(button);
		
		JButton button_1 = new JButton("CANCEL");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button_1.setBounds(398, 307, 126, 56);
		panelEditPlayer.add(button_1);
		
		JLabel label_4 = new JLabel("PLAYER NAME");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(10, 229, 614, 14);
		panelEditPlayer.add(label_4);
		
		JLabel lblTrivialPursuit_2 = new JLabel("TRIVIAL PURSUIT");
		lblTrivialPursuit_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTrivialPursuit_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTrivialPursuit_2.setBounds(10, 70, 614, 56);
		panelEditPlayer.add(lblTrivialPursuit_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(267, 254, 100, 20);
		panelEditPlayer.add(textField_1);
		
		// panelPauseGame
		
		JLabel lblTrivialPursuit_3 = new JLabel("TRIVIAL PURSUIT");
		lblTrivialPursuit_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTrivialPursuit_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblTrivialPursuit_3.setBounds(10, 51, 614, 47);
		panelPauseGame.add(lblTrivialPursuit_3);
		
		JButton button_2 = new JButton("RESUME");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPauseGame.setVisible(false);
				panelActiveGame.setVisible(true);
			}
		});
		button_2.setBounds(217, 237, 200, 56);
		panelPauseGame.add(button_2);
		
		JLabel lblPaused = new JLabel("PAUSED");
		lblPaused.setHorizontalAlignment(SwingConstants.CENTER);
		lblPaused.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblPaused.setBounds(10, 179, 614, 47);
		panelPauseGame.add(lblPaused);
		
		// panelScore
		
		JButton btnReturnToMain = new JButton("RETURN TO \r\nMAIN MENU");
		btnReturnToMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelScore.setVisible(false);
				panelMainMenu.setVisible(true);
			}
		});
		btnReturnToMain.setBounds(10, 384, 175, 56);
		panelScore.add(btnReturnToMain);
		
		JButton btnExit_1 = new JButton("EXIT");
		btnExit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmNameOfGame.dispose();
			}
		});
		btnExit_1.setBounds(449, 384, 175, 56);
		panelScore.add(btnExit_1);
		
		JLabel lblTrivialPursuit_4 = new JLabel("TRIVIAL PURSUIT");
		lblTrivialPursuit_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblTrivialPursuit_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTrivialPursuit_4.setBounds(10, 11, 614, 47);
		panelScore.add(lblTrivialPursuit_4);
		
		JLabel label_11 = new JLabel("Player 1: Alice");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setBounds(96, 116, 143, 14);
		panelScore.add(label_11);
		
		JLabel lblPoints_4 = new JLabel("Points: 15");
		lblPoints_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblPoints_4.setBounds(96, 132, 143, 14);
		panelScore.add(lblPoints_4);
		
		JLabel label_13 = new JLabel("Player 2: Bob");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setBounds(437, 116, 143, 14);
		panelScore.add(label_13);
		
		JLabel lblPoints_5 = new JLabel("Points: 16");
		lblPoints_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblPoints_5.setBounds(437, 132, 143, 14);
		panelScore.add(lblPoints_5);
		
		JLabel label_15 = new JLabel("Player 3: Carly");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setBounds(95, 249, 143, 14);
		panelScore.add(label_15);
		
		JLabel lblPoints_6 = new JLabel("Points: 23");
		lblPoints_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblPoints_6.setBounds(95, 265, 143, 14);
		panelScore.add(lblPoints_6);
		
		JLabel label_17 = new JLabel("Player 4: Dave");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setBounds(436, 249, 143, 14);
		panelScore.add(label_17);
		
		JLabel lblPoints_7 = new JLabel("Points: 42");
		lblPoints_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblPoints_7.setBounds(436, 265, 143, 14);
		panelScore.add(lblPoints_7);
		
		JLabel label_19 = new JLabel("");
		label_19.setIcon(new ImageIcon(mainWindow.class.getResource("/proj2/cheese.jpg")));
		label_19.setBounds(397, 249, 40, 30);
		panelScore.add(label_19);
		
		JLabel label_20 = new JLabel("");
		label_20.setIcon(new ImageIcon(mainWindow.class.getResource("/proj2/cheese.jpg")));
		label_20.setBounds(56, 249, 40, 30);
		panelScore.add(label_20);
		
		JLabel label_21 = new JLabel("");
		label_21.setIcon(new ImageIcon(mainWindow.class.getResource("/proj2/cheese.jpg")));
		label_21.setBounds(398, 116, 40, 30);
		panelScore.add(label_21);
		
		JLabel label_22 = new JLabel("");
		label_22.setIcon(new ImageIcon(mainWindow.class.getResource("/proj2/cheese.jpg")));
		label_22.setBounds(56, 116, 40, 30);
		panelScore.add(label_22);
		
		JLabel lblWinner = new JLabel("WINNER");
		lblWinner.setHorizontalAlignment(SwingConstants.CENTER);
		lblWinner.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblWinner.setBounds(397, 191, 183, 47);
		panelScore.add(lblWinner);
	}
}
