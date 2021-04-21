import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;

class ProfilesShower {

    /**
     * Provides a JPanel with two columns (labels & fields) laid out using
     * GroupLayout. The arrays must be of equal size.
     *
     * Typical fields would be single line textual/input components such as
     * JTextField, JPasswordField, JFormattedTextField, JSpinner, JComboBox,
     * JCheckBox.. & the multi-line components wrapped in a JScrollPane -
     * JTextArea or (at a stretch) JList or JTable.
     *
     * @param labels The first column contains labels.
     * @param fields The last column contains fields.
     * @param addMnemonics Add mnemonic by next available letter in label text.
     * @return JComponent A JPanel with two columns of the components provided.
     */
    public static JComponent getTwoColumnLayout(
            JLabel[] labels,
            JComponent[] fields,
            boolean addMnemonics) {
        if (labels.length != fields.length) {
            String s = labels.length + " labels supplied for "
                    + fields.length + " fields!";
            throw new IllegalArgumentException(s);
        }
        JComponent panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        // Turn on automatically adding gaps between components
        layout.setAutoCreateGaps(true);
        // Create a sequential group for the horizontal axis.
        GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();
        GroupLayout.Group yLabelGroup = layout.createParallelGroup(GroupLayout.Alignment.TRAILING);
        hGroup.addGroup(yLabelGroup);
        GroupLayout.Group yFieldGroup = layout.createParallelGroup();
        hGroup.addGroup(yFieldGroup);
        layout.setHorizontalGroup(hGroup);
        // Create a sequential group for the vertical axis.
        GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();
        layout.setVerticalGroup(vGroup);

        int p = GroupLayout.PREFERRED_SIZE;
        // add the components to the groups
        for (JLabel label : labels) {
            yLabelGroup.addComponent(label);
        }
        for (Component field : fields) {
            yFieldGroup.addComponent(field, p, p, p);
        }
        for (int ii = 0; ii < labels.length; ii++) {
            vGroup.addGroup(layout.createParallelGroup().
                    addComponent(labels[ii]).
                    addComponent(fields[ii], p, p, p));
        }

        if (addMnemonics) {
            addMnemonics(labels, fields);
        }

        return panel;
    }

    private final static void addMnemonics(
            JLabel[] labels,
            JComponent[] fields) {
        Map<Character, Object> m = new HashMap<Character, Object>();
        for (int ii = 0; ii < labels.length; ii++) {
            labels[ii].setLabelFor(fields[ii]);
            String lwr = labels[ii].getText().toLowerCase();
            for (int jj = 0; jj < lwr.length(); jj++) {
                char ch = lwr.charAt(jj);
                if (m.get(ch) == null && Character.isLetterOrDigit(ch)) {
                    m.put(ch, ch);
                    labels[ii].setDisplayedMnemonic(ch);
                    break;
                }
            }
        }
    }

    /**
     * Provides a JPanel with two columns (labels & fields) laid out using
     * GroupLayout. The arrays must be of equal size.
     *
     * @param labelStrings Strings that will be used for labels.
     * @param fields The corresponding fields.
     * @return JComponent A JPanel with two columns of the components provided.
     */
    public static JComponent getTwoColumnLayout(
            String[] labelStrings,
            JComponent[] fields) {
        JLabel[] labels = new JLabel[labelStrings.length];
        for (int ii = 0; ii < labels.length; ii++) {
            labels[ii] = new JLabel(labelStrings[ii]);
        }
        return getTwoColumnLayout(labels, fields);
    }

    /**
     * Provides a JPanel with two columns (labels & fields) laid out using
     * GroupLayout. The arrays must be of equal size.
     *
     * @param labels The first column contains labels.
     * @param fields The last column contains fields.
     * @return JComponent A JPanel with two columns of the components provided.
     */
    public static JComponent getTwoColumnLayout(
            JLabel[] labels,
            JComponent[] fields) {
        return getTwoColumnLayout(labels, fields, true);
    }

    public static String getProperty(String name) {
        return name + ": \t"
                + System.getProperty(name)
                + System.getProperty("line.separator");
    }

    public static void main(String[] args) {
        Runnable r = new Runnable() {

            @Override
            public void run() {
                JTextField projnameField = new JTextField(10);
                JTextField nField = new JTextField(5);
                JTextField mField = new JTextField(5);
                JTextField alphaField = new JTextField(5);
                JTextField kField = new JTextField(5);

                JTextField[] components = {
                    projnameField,
                    nField,
                    mField,
                    alphaField,
                    kField
                };

                String[] labels = {
                    "Project Name:",
                    "Number of instances:",
                    "Number of attributes:",
                    "Alpha:",
                    "Number of patterns:"
                };

                JOptionPane.showMessageDialog(null, 
                        getTwoColumnLayout(labels,components));
            }
        };
        // Swing GUIs should be created and updated on the EDT
        // http://docs.oracle.com/javase/tutorial/uiswing/concurrency/initial.html
        SwingUtilities.invokeLater(r);
    }
}