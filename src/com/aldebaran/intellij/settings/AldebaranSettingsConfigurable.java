package com.aldebaran.intellij.settings;

import com.intellij.openapi.Disposable;
import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SearchableConfigurable;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.Disposer;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class AldebaranSettingsConfigurable implements SearchableConfigurable, Configurable.NoScroll, Disposable {

    public static final String CONSOLE_SETTINGS_HELP_REFERENCE = "reference.settings.ssh.terminal";

    private AldebaranSettingsProvider settingsProvider;
    private AldebaranSettingsPanel panel;

    private Project project;

    public AldebaranSettingsConfigurable(Project project) {
        settingsProvider = AldebaranSettingsProvider.getInstance(project);
        this.project = project;
    }

    @Nls
    @Override
    public String getDisplayName() {
        return "Aldebaran Robotics";
    }

    @Nullable
    @Override
    public String getHelpTopic() {
        return CONSOLE_SETTINGS_HELP_REFERENCE;
    }

    @Override
    public void dispose() {
        panel = null;
    }

    @NotNull
    @Override
    public String getId() {
        return "aldebaran";
    }

    @Nullable
    @Override
    public Runnable enableSearch(String option) {
        return null;
    }

    @Nullable
    @Override
    public JComponent createComponent() {
        panel = new AldebaranSettingsPanel(settingsProvider);

        return panel.createPanel();
    }

    @Override
    public boolean isModified() {
        return panel.isModified();
    }

    @Override
    public void apply() throws ConfigurationException {
        panel.apply();
    }

    @Override
    public void reset() {
        panel.reset();
    }

    @Override
    public void disposeUIResources() {
        Disposer.dispose(this);
    }
}
