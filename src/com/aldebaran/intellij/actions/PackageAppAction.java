package com.aldebaran.intellij.actions;

import com.aldebaran.intellij.settings.AldebaranSettingsProvider;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.MessageType;
import com.intellij.openapi.ui.popup.Balloon;
import com.intellij.openapi.ui.popup.JBPopupFactory;
import com.intellij.openapi.wm.StatusBar;
import com.intellij.openapi.wm.WindowManager;
import com.intellij.ui.awt.RelativePoint;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class PackageAppAction extends AnAction {

    public void actionPerformed(AnActionEvent e) {
        Project project = CommonDataKeys.PROJECT.getData(e.getDataContext());
        StatusBar statusBar = WindowManager.getInstance().getStatusBar(project);

        if (project != null) {

            File buildsDir = new File(project.getBasePath() + "/builds");
            if (!buildsDir.exists()) {
                buildsDir.mkdir();
            }

            String qiBuildPath = getQibuildDir(project);
            System.out.println("Package action triggered");
            try {
                String line;
                String[][] cmds = {
                        {
                                qiBuildPath + "/qipkg",
                                "make-package",
                                "../app/hep-garcon.pml"
                        },
                        {
                                qiBuildPath + "/qipkg",
                                "bump-version",
                                "../app/manifest.xml"
                        }
                };

                for (String[] cmd : cmds) {
                    Process p = new ProcessBuilder(cmd).directory(buildsDir).start();
                    BufferedReader bri = new BufferedReader
                            (new InputStreamReader(p.getInputStream()));
                    BufferedReader bre = new BufferedReader
                            (new InputStreamReader(p.getErrorStream()));
                    while ((line = bri.readLine()) != null) {
                        System.out.println(line);
                    }
                    bri.close();
                    while ((line = bre.readLine()) != null) {
                        System.out.println(line);
                    }
                    bre.close();
                    p.waitFor();
                }
                JBPopupFactory.getInstance()
                        .createHtmlTextBalloonBuilder("Package successfully built!", MessageType.INFO, null)
                        .setFadeoutTime(7500)
                        .createBalloon()
                        .show(RelativePoint.getCenterOf(statusBar.getComponent()),
                                Balloon.Position.atRight);

            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    }

    public String getQibuildDir(Project p) {
        return AldebaranSettingsProvider.getInstance(p).getQibuildPath();
    }
}
