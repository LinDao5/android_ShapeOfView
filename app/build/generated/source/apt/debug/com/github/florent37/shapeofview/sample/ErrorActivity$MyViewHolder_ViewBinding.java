// Generated code from Butter Knife. Do not modify!
package com.github.florent37.shapeofview.sample;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ErrorActivity$MyViewHolder_ViewBinding implements Unbinder {
  private ErrorActivity.MyViewHolder target;

  @UiThread
  public ErrorActivity$MyViewHolder_ViewBinding(ErrorActivity.MyViewHolder target, View source) {
    this.target = target;

    target.img_flyer_list = Utils.findRequiredViewAsType(source, R.id.img_flyer_list, "field 'img_flyer_list'", ImageView.class);
    target.tv_cell_title = Utils.findRequiredViewAsType(source, R.id.tv_cell_title, "field 'tv_cell_title'", TextView.class);
    target.tv_cell_description = Utils.findRequiredViewAsType(source, R.id.tv_cell_description, "field 'tv_cell_description'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ErrorActivity.MyViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.img_flyer_list = null;
    target.tv_cell_title = null;
    target.tv_cell_description = null;
  }
}
