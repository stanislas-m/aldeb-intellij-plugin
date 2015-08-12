package com.aldebaran.intellij.lang.injector;

import com.intellij.lang.Language;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.InjectedLanguagePlaces;
import com.intellij.psi.LanguageInjector;
import com.intellij.psi.PsiLanguageInjectionHost;
import com.intellij.psi.xml.XmlText;
import org.jetbrains.annotations.NotNull;

public class XarPythonInjector implements LanguageInjector {

    @Override
    public void getLanguagesToInject(@NotNull PsiLanguageInjectionHost host, @NotNull InjectedLanguagePlaces injectedLanguagePlaces) {
        if (!"xar".equals(host.getContainingFile().getVirtualFile().getExtension())) return;
        if (!(host instanceof XmlText)) return;

        final XmlText xmlText = (XmlText) host;

        if (xmlText.getContext().getNode().findLeafElementAt(1) != null && "content".equals(xmlText.getContext().getNode().findLeafElementAt(1).getText())) {
            injectedLanguagePlaces.addPlace(Language.findLanguageByID("Python"), TextRange.from(0, host.getTextLength()), "<!CDATA[", "]]>");
        }
    }
}
