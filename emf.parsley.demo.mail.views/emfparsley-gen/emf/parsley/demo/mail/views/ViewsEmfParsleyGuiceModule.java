package emf.parsley.demo.mail.views;

import emf.parsley.demo.mail.views.config.ViewsConfigurator;
import emf.parsley.demo.mail.views.resource.ViewsResourceManager;
import org.eclipse.emf.parsley.EmfParsleyGuiceModule;
import org.eclipse.emf.parsley.config.Configurator;
import org.eclipse.emf.parsley.resource.ResourceManager;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * emf.parsley.demo.mail.views EMF Parsley Dsl Module file
 */
@SuppressWarnings("all")
public class ViewsEmfParsleyGuiceModule extends EmfParsleyGuiceModule {
  public ViewsEmfParsleyGuiceModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }

  @Override
  public Class<? extends Configurator> bindConfigurator() {
    return ViewsConfigurator.class;
  }

  @Override
  public Class<? extends ResourceManager> bindResourceManager() {
    return ViewsResourceManager.class;
  }
}
