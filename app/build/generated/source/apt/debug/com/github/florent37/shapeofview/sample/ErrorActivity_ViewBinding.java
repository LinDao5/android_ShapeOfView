// Generated code from Butter Knife. Do not modify!
package com.github.florent37.shapeofview.sample;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ErrorActivity_ViewBinding implements Unbinder {
  private ErrorActivity target;

  @UiThread
  public ErrorActivity_ViewBinding(ErrorActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ErrorActivity_ViewBinding(ErrorActivity target, View source) {
    this.target = target;

    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ErrorActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.recyclerView = null;
  }
}
