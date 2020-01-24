package org.github.olloginov.ideavcshooks;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vcs.checkout.CheckoutListener;

import java.io.File;

public class CheckoutListenerImpl implements CheckoutListener {
    @Override
    public boolean processCheckedOutDirectory(Project project, File file) {
        return false;
    }

    @Override
    public void processOpenedProject(Project project) {

    }
}
