package com.aldebaran.intellij.lang.injector;

import com.intellij.psi.InjectedLanguagePlaces;
import com.intellij.psi.LanguageInjector;
import com.intellij.psi.PsiLanguageInjectionHost;
import org.jetbrains.annotations.NotNull;

public class XarPythonInjector implements LanguageInjector {

    @Override
    public void getLanguagesToInject(@NotNull PsiLanguageInjectionHost host, @NotNull InjectedLanguagePlaces injectedLanguagePlaces) {
        System.out.println(host);
        System.out.println(injectedLanguagePlaces);
    }
}
