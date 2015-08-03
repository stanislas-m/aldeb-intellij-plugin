package icons;

import com.intellij.openapi.util.IconLoader;

import javax.swing.*;

public class AldebaranIcons {
    private static Icon load(String path) {
        return IconLoader.getIcon(path, AldebaranIcons.class);
    }

    public static final Icon PmlFile = load("/icons/pml_file.png"); // 16x16
    public static final Icon PkgFile = load("/icons/pkg_file.png"); // 16x16
    public static final Icon XarFile = load("/icons/xar_file.png"); // 16x16
}
