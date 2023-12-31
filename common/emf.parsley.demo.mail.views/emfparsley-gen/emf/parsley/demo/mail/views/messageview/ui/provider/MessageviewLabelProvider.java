package emf.parsley.demo.mail.views.messageview.ui.provider;

import com.google.inject.Inject;
import emf.parsley.demo.mail.model.mail.Mail;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.parsley.ui.provider.ViewerLabelProvider;

@SuppressWarnings("all")
public class MessageviewLabelProvider extends ViewerLabelProvider {
  @Inject
  public MessageviewLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }

  public String text(final Mail it) {
    String _subject = it.getSubject();
    return _subject;
  }

  public Object image(final Mail it) {
    return "email.png";
  }
}
