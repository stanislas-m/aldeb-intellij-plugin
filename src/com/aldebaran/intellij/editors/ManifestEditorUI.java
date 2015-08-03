package com.aldebaran.intellij.editors;


import javax.swing.*;

public class ManifestEditorUI {
    private JTextArea supportedLanguagesField;
    private JTextArea descriptionLanguagesField;
    private JTextField applicationTitleField;
    private JTextField applicationIdField;
    private JTextField applicationVersionField;
    private JTree packageContentTree;
    private JTextArea applicationDescriptionField;
    private JTextArea robotRequirementsField;
    private JTextArea naoqiRequirementsField;
    private JLabel icon;
    private JPanel detailPanel;
    private JPanel rootPanel;

    public ManifestEditorUI() {

    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
