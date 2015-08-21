package com.aldebaran.intellij.settings;

import com.intellij.openapi.fileChooser.FileChooser;
import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory;
import com.intellij.openapi.ui.TextFieldWithBrowseButton;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.ui.components.JBLabel;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Objects;

public class AldebaranSettingsPanel {
    private TextFieldWithBrowseButton qibuildDirPathField;
    private JPanel panel;
    private JCheckBox enableNaoqiSupportCheckBox;
    private JBLabel qiBuildDirPathLabel;
    private final AldebaranSettingsProvider settingsProvider;

    private VirtualFile currentQibuildDir = null;

    public AldebaranSettingsPanel(AldebaranSettingsProvider provider) {
        settingsProvider = provider;

        // Bind dir selection dialog
        qibuildDirPathField.getButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FileChooserDescriptor descriptor = FileChooserDescriptorFactory.createSingleFolderDescriptor();
                VirtualFile dir = FileChooser.chooseFile(descriptor, qibuildDirPathField, null, currentQibuildDir);
                if (dir != null) {
                    if (dir.findChild("qibuild") != null) {
                        qibuildDirPathField.setText(dir.getPath().replace('/', File.separatorChar));
                        currentQibuildDir = dir;
                    } else {
                        System.out.println("qibuild not found in this dir"); // TODO: Notification
                    }
                }
            }
        });

        if (provider.getEnabled()) {
            setEnabled(true);
            qibuildDirPathField.setEnabled(true);
            qiBuildDirPathLabel.setEnabled(true);
        }

        enableNaoqiSupportCheckBox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JCheckBox cb = (JCheckBox) e.getSource();
                if (cb.isSelected()) {
                    qibuildDirPathField.setEnabled(true);
                    qiBuildDirPathLabel.setEnabled(true);
                } else {
                    qibuildDirPathField.setEnabled(false);
                    qiBuildDirPathLabel.setEnabled(false);
                }
            }
        });

        reset();
    }

    public JComponent createPanel() {
        return panel;
    }

    public boolean isModified() {
        return !getQibuildPath().equals(settingsProvider.getQibuildPath()) || getEnabled() != settingsProvider.getEnabled();
    }

    public void apply() {
        settingsProvider.setQibuildPath(getQibuildPath());
        settingsProvider.setEnabled(getEnabled());
    }

    public void reset() {
        setQibuildPath(settingsProvider.getQibuildPath());
        setEnabled(settingsProvider.getEnabled());
    }

    public String getQibuildPath() {
        return qibuildDirPathField.getText();
    }

    public void setQibuildPath(String qibuildPath) {
        this.qibuildDirPathField.setText(qibuildPath);
    }

    public boolean getEnabled() {
        return enableNaoqiSupportCheckBox.isSelected();
    }

    public void setEnabled(boolean isEnabled) {
        this.enableNaoqiSupportCheckBox.setSelected(isEnabled);
    }
}