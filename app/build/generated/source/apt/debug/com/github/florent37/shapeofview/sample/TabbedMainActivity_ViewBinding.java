// Generated code from Butter Knife. Do not modify!
package com.github.florent37.shapeofview.sample;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class TabbedMainActivity_ViewBinding implements Unbinder {
  private TabbedMainActivity target;

  @UiThread
  public TabbedMainActivity_ViewBinding(TabbedMainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public TabbedMainActivity_ViewBinding(TabbedMainActivity target, View source) {
    this.target = target;

    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.tabLayout = Utils.findRequiredViewAsType(source, R.id.tabs, "field 'tabLayout'", ListenableTabLayout.class);
    target.viewPager = Utils.findRequiredViewAsType(source, R.id.viewPager, "field 'viewPager'", ViewPager.class);
    target.triangle = Utils.findRequiredView(source, R.id.triangle, "field 'triangle'");
  }

  @Override
  @CallSuper
  public void unbind() {
    TabbedMainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.tabLayout = null;
    target.viewPager = null;
    target.triangle = null;
  }
}
