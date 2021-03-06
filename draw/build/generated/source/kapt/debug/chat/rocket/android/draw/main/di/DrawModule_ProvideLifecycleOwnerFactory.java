// Generated by Dagger (https://google.github.io/dagger).
package chat.rocket.android.draw.main.di;

import androidx.lifecycle.LifecycleOwner;
import chat.rocket.android.draw.main.ui.DrawingActivity;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class DrawModule_ProvideLifecycleOwnerFactory implements Factory<LifecycleOwner> {
  private final DrawModule module;

  private final Provider<DrawingActivity> activityProvider;

  public DrawModule_ProvideLifecycleOwnerFactory(
      DrawModule module, Provider<DrawingActivity> activityProvider) {
    this.module = module;
    this.activityProvider = activityProvider;
  }

  @Override
  public LifecycleOwner get() {
    return provideInstance(module, activityProvider);
  }

  public static LifecycleOwner provideInstance(
      DrawModule module, Provider<DrawingActivity> activityProvider) {
    return proxyProvideLifecycleOwner(module, activityProvider.get());
  }

  public static DrawModule_ProvideLifecycleOwnerFactory create(
      DrawModule module, Provider<DrawingActivity> activityProvider) {
    return new DrawModule_ProvideLifecycleOwnerFactory(module, activityProvider);
  }

  public static LifecycleOwner proxyProvideLifecycleOwner(
      DrawModule instance, DrawingActivity activity) {
    return Preconditions.checkNotNull(
        instance.provideLifecycleOwner(activity),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
