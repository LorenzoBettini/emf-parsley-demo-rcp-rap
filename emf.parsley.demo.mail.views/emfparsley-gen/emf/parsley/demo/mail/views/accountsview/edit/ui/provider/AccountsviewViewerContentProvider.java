package emf.parsley.demo.mail.views.accountsview.edit.ui.provider;

import com.google.inject.Inject;
import emf.parsley.demo.mail.model.mail.Folder;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.parsley.edit.ui.provider.ViewerContentProvider;

@SuppressWarnings("all")
public class AccountsviewViewerContentProvider extends ViewerContentProvider {
  @Inject
  public AccountsviewViewerContentProvider(final AdapterFactory adapterFactory) {
    super(adapterFactory);
  }

  public Object children(final Folder it) {
    EList<Folder> _subfolders = it.getSubfolders();
    return _subfolders;
  }
}
