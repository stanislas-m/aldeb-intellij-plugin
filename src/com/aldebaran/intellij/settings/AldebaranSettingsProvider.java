package com.aldebaran.intellij.settings;


import com.intellij.openapi.components.*;
import com.intellij.openapi.project.Project;

@State(
        name = "AldebaranSettingsProvider",
        storages = {
                @Storage(id="default", file = StoragePathMacros.WORKSPACE_FILE)
        }
)
public class AldebaranSettingsProvider implements PersistentStateComponent<AldebaranSettingsProvider.State> {
    private State state = new State();

    public void setQibuildPath(String qibuildPath) {
        state.qibuildPath = qibuildPath;
    }

    public String getQibuildPath() {
        return state.qibuildPath;
    }

    public void setEnabled(boolean isEnabled) {
        state.isEnabled = isEnabled;
    }

    public boolean getEnabled() {
        return state.isEnabled;
    }

    public static AldebaranSettingsProvider getInstance(Project project) {
        return ServiceManager.getService(project, AldebaranSettingsProvider.class);
    }

    @Override
    public State getState() {
        return state;
    }

    @Override
    public void loadState(State state) {
        this.state.qibuildPath = state.qibuildPath;
        this.state.isEnabled = state.isEnabled;
    }

    /******************************/

    public static class State {
        public String qibuildPath;
        public boolean isEnabled;
    }
}
