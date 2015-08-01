package com.aldebaran.intellij.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PackageAppAction extends AnAction {

    private static String VENV = "/home/michalakst/Documents/Dev/aldeb-intellij-plugin/venv/";

    public void actionPerformed(AnActionEvent e) {
        System.out.println("Package action triggered");
        try {
            String line;
            String[] cmds = {
                    VENV + "bin/qipkg",
                    "make-package",
                    "/home/michalakst/Documents/Dev/hep-garcon/app/hep-garcon.pml",
                    "-o",
                    "/home/michalakst/Documents/Dev/hep-garcon/hep-garcon.pkg",
            };

            Process p = new ProcessBuilder(cmds).start();
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
            System.out.println("Done.");
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }
}
