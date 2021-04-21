// ------------------------------------- Hands off ani para walay bun ug! ---------------------------------------------
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;
// ------------------------------------- ILISI ANG PUBLIC CLASS NAME PARA MOGANA DI MAG SIGE PANGUTANA ! ---------------------------------------------
public class Profiler extends JPanel {
   public static final String[] LABEL_TEXTS = { "Last Name", "First Name",
         "Address", "City", "State", "Zip" };
   public static final int COLS = 8;
   private Map<String, JTextField> labelFieldMap = new HashMap<>();

   public Profiler() {
      setLayout(new GridBagLayout());
      for (int i = 0; i < LABEL_TEXTS.length; i++) {
         String labelTxt = LABEL_TEXTS[i];
         add(new JLabel(labelTxt), createGbc(0, i));

         JTextField textField = new JTextField(COLS);	
         labelFieldMap.put(labelTxt, textField);
         add(textField, createGbc(1, i));
      }

      setBorder(BorderFactory.createTitledBorder("Enter User Information"));
   }
// ------------------------------------- SAY NO COPY RIGHT JOSHUA M. AMBALONG ---------------------------------------------
   public String getText(String labelText) {
      JTextField textField = labelFieldMap.get(labelText);
      if (textField != null) {
         return textField.getText();
      } else {
         throw new IllegalArgumentException(labelText);
      }
   }

   public static GridBagConstraints createGbc(int x, int y) {
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.gridx = x;
      gbc.gridy = y;
      gbc.weightx = 1.0;
      gbc.weighty = gbc.weightx;
      if (x == 0) {
         gbc.anchor = GridBagConstraints.LINE_START;
         gbc.fill = GridBagConstraints.BOTH;
         gbc.insets = new Insets(3, 3, 3, 8);
      } else {
         gbc.anchor = GridBagConstraints.LINE_END;
         gbc.fill = GridBagConstraints.HORIZONTAL;
         gbc.insets = new Insets(3, 3, 3, 3);
      }
      return gbc;
   }
// ------------------------------------- SAY NO COPY RIGHT JOSHUA M. AMBALONG ---------------------------------------------
   private static void createAndShowGui() {
      Profiler mainPanel = new Profiler();

      int optionType = JOptionPane.DEFAULT_OPTION;
      int messageType = JOptionPane.PLAIN_MESSAGE;
      Icon icon = null;
      String[] options = { "Submit", "Cancel" };
      Object initialValue = options[0];
      int reply = JOptionPane.showOptionDialog(null, mainPanel,
            "Get User Information", optionType, messageType, icon, options,
            initialValue);
      if (reply == 0) {
         System.out.println("Selections:");
         for (String labelText : LABEL_TEXTS) {
            System.out.printf("%12s: %s%n", labelText,
                  mainPanel.getText(labelText));
         }

      }
   }
// ------------------------------------- SAY NO COPY RIGHT JOSHUA M. AMBALONG ---------------------------------------------
   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            createAndShowGui();
         }
      });
   }
}