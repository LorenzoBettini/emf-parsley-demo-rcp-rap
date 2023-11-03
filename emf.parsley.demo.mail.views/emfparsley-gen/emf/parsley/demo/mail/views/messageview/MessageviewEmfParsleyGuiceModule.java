package emf.parsley.demo.mail.views.messageview;

import emf.parsley.demo.mail.views.messageview.binding.MessageviewFormControlFactory;
import emf.parsley.demo.mail.views.messageview.ui.provider.MessageviewFeatureCaptionProvider;
import emf.parsley.demo.mail.views.messageview.ui.provider.MessageviewFeaturesProvider;
import emf.parsley.demo.mail.views.messageview.ui.provider.MessageviewLabelProvider;
import org.eclipse.emf.parsley.EmfParsleyGuiceModule;
import org.eclipse.emf.parsley.composite.FormControlFactory;
import org.eclipse.emf.parsley.ui.provider.FeatureCaptionProvider;
import org.eclipse.emf.parsley.ui.provider.FeaturesProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.ui.plugin.AbstractUIPlugin;

@SuppressWarnings("all")
public class MessageviewEmfParsleyGuiceModule extends EmfParsleyGuiceModule {
  public MessageviewEmfParsleyGuiceModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }

  @Override
  public Class<? extends ILabelProvider> bindILabelProvider() {
    return MessageviewLabelProvider.class;
  }

  @Override
  public Class<? extends FeatureCaptionProvider> bindFeatureCaptionProvider() {
    return MessageviewFeatureCaptionProvider.class;
  }

  @Override
  public Class<? extends FeaturesProvider> bindFeaturesProvider() {
    return MessageviewFeaturesProvider.class;
  }

  @Override
  public Class<? extends FormControlFactory> bindFormControlFactory() {
    return MessageviewFormControlFactory.class;
  }
}
