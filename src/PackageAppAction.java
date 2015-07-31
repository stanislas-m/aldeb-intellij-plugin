import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PackageAppAction extends AnAction {

    private static String QI_PKG = "/home/smichalak/.local/bin/qipkg";

    public void actionPerformed(AnActionEvent e) {
        System.out.println("Package action triggered");
        try {
            String line;
            Runtime r = Runtime.getRuntime();
            String[] cmds = {QI_PKG + " make-package /home/smichalak/Documents/dev/aldebaran/tablet-micro-framework/app/tablet-micro-framework.pml -o /home/smichalak/Documents/dev/aldebaran/tablet-micro-framework/tablet-micro-framework.pkg"};

            for (String cmd : cmds) {
                Process p = r.exec(cmd);
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
            System.out.println("Done.");
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }
}
