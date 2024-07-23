package view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

////////////////////////////////////////
// CLASS FerretSuiteTab
////////////////////////////////////////
public class FerretSuiteTab extends JPanel {

////////////////////////////////////////
// PUBLIC METHODS
////////////////////////////////////////
public FerretSuiteTab() {
  super(new GridBagLayout());
  JPanel info = getAppInfo();
  JPanel settings = getSettingsPanel();
  
  GridBagConstraints infoCons = new GridBagConstraints();
  infoCons.gridx = 0;
  infoCons.gridy = 0;
  infoCons.weightx = 1.0;
  infoCons.fill = GridBagConstraints.HORIZONTAL;
  infoCons.insets = new Insets(10, 10, 10, 10);
  
  GridBagConstraints settingsCons = new GridBagConstraints();
  settingsCons.gridx = 0;
  settingsCons.gridy = 1;
  settingsCons.weightx = 1.0;
  settingsCons.fill = GridBagConstraints.HORIZONTAL;
  settingsCons.insets = new Insets(10, 10, 10, 10);
  
  add(info, infoCons);
  add(settings, settingsCons);
}

//-----------------------------------------------------------------------------
public void registerListener(ActionListener l){
  checkBox8kb.addActionListener(l);
  checkBox16kb.addActionListener(l);
  checkBox32kb.addActionListener(l);
  checkBox64kb.addActionListener(l);
  checkBox128kb.addActionListener(l);
  checkBox1024kb.addActionListener(l);
  customSizeCheckBox.addActionListener(l);
}

//-----------------------------------------------------------------------------
public Integer getCustomInt(){
  try {
    return Integer.parseInt(customSizeTextField.getText());
  }
  catch(NumberFormatException e){
    return 0;
  }
}

//-----------------------------------------------------------------------------
public boolean is8kbSelected() {
  return checkBox8kb.isSelected();
}

//-----------------------------------------------------------------------------
public boolean is16kbSelected() {
  return checkBox16kb.isSelected();
}

//-----------------------------------------------------------------------------
public boolean is32kbSelected() {
  return checkBox32kb.isSelected();
}

//-----------------------------------------------------------------------------
public boolean is64kbSelected() {
  return checkBox64kb.isSelected();
}

//-----------------------------------------------------------------------------
public boolean is128kbSelected() {
  return checkBox128kb.isSelected();
}

//-----------------------------------------------------------------------------
public boolean is1024kbSelected() {
  return checkBox1024kb.isSelected();
}

//-----------------------------------------------------------------------------
public boolean isCustomSizeSelected() {
  return customSizeCheckBox.isSelected();
}

//-----------------------------------------------------------------------------
public void setMessage(String message) {
  messageLabel.setText(message);
}

////////////////////////////////////////
// PRIVATE FIELDS
////////////////////////////////////////
private JTextField customSizeTextField;
private JCheckBox  checkBox8kb;
private JCheckBox  checkBox16kb;
private JCheckBox  checkBox32kb;
private JCheckBox  checkBox64kb;
private JCheckBox  checkBox128kb;
private JCheckBox  checkBox1024kb;
private JCheckBox  customSizeCheckBox;
private JLabel     messageLabel;

////////////////////////////////////////
// PRIVATE METHODS
////////////////////////////////////////
//-----------------------------------------------------------------------------
private JPanel getAppInfo() {
  // todo
  return new JPanel();
}

//-----------------------------------------------------------------------------
private JPanel getSettingsPanel() {
  JPanel settingsPanel = new JPanel(new GridBagLayout());
  GridBagConstraints gbc = new GridBagConstraints();
  gbc.gridx = 0;
  gbc.gridy = 0;
  gbc.anchor = GridBagConstraints.WEST;
  gbc.insets = new Insets(5, 5, 5, 5);
  gbc.fill = GridBagConstraints.HORIZONTAL;
  
  // Add description label
  JLabel descriptionLabel = new JLabel(
    "These buttons control the set of bullets used in conjunction with standard burp suite scan checks.");
  gbc.gridwidth = 2; // Span across two columns
  settingsPanel.add(descriptionLabel, gbc);
  gbc.gridy++;
  
  // Reset gridwidth to default (1) for other components
  gbc.gridwidth = 1;
  
  checkBox8kb = new JCheckBox("8 kb bullets");
  checkBox8kb.setSelected(true);
  settingsPanel.add(checkBox8kb, gbc);
  gbc.gridy++;
  
  checkBox16kb = new JCheckBox("16 kb bullets");
  checkBox16kb.setSelected(true);
  settingsPanel.add(checkBox16kb, gbc);
  gbc.gridy++;
  
  checkBox32kb = new JCheckBox("32 kb bullets");
  checkBox32kb.setSelected(true);
  settingsPanel.add(checkBox32kb, gbc);
  gbc.gridy++;
  
  checkBox64kb = new JCheckBox("64 kb bullets");
  checkBox64kb.setSelected(true);
  settingsPanel.add(checkBox64kb, gbc);
  gbc.gridy++;
  
  checkBox128kb = new JCheckBox("128 kb bullets");
  checkBox128kb.setSelected(true);
  settingsPanel.add(checkBox128kb, gbc);
  gbc.gridy++;
  
  checkBox1024kb = new JCheckBox("1024 kb bullets");
  checkBox1024kb.setSelected(true);
  settingsPanel.add(checkBox1024kb, gbc);
  gbc.gridy++;
  
  customSizeCheckBox = new JCheckBox("Custom size");
  gbc.gridx = 0;
  settingsPanel.add(customSizeCheckBox, gbc);
  
  gbc.gridx = 1;
  customSizeTextField = new JTextField(10);
  settingsPanel.add(customSizeTextField, gbc);
  gbc.gridx = 0;
  gbc.gridy++;
  
  // Add messageLabel below the checkboxes
  gbc.gridwidth = 2; // Span across two columns
  gbc.fill = GridBagConstraints.HORIZONTAL;
  messageLabel = new JLabel(" "); // Initialize with empty text
  settingsPanel.add(messageLabel, gbc);
  
  return settingsPanel;
}


}
////////////////////////////////////////
// END CLASS FerretSuiteTab
////////////////////////////////////////