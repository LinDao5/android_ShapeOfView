// Generated code from Butter Knife. Do not modify!
package com.github.florent37.shapeofview.sample;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MaterialDesignShrineActivity_ViewBinding implements Unbinder {
  private MaterialDesignShrineActivity target;

  private View view7f080095;

  private View view7f080109;

  private View view7f08001c;

  @UiThread
  public MaterialDesignShrineActivity_ViewBinding(MaterialDesignShrineActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MaterialDesignShrineActivity_ViewBinding(final MaterialDesignShrineActivity target,
      View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.menu, "field 'menu' and method 'onMenuClicked'");
    target.menu = view;
    view7f080095 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onMenuClicked();
      }
    });
    target.bottomSheet = Utils.findRequiredView(source, R.id.bottomSheet, "field 'bottomSheet'");
    target.middleSheet = Utils.findRequiredView(source, R.id.middleSheet, "field 'middleSheet'");
    view = Utils.findRequiredView(source, R.id.topSheet, "field 'topSheet' and method 'onTopSheetClicked'");
    target.topSheet = view;
    view7f080109 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onTopSheetClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.addToCart, "method 'onAddToCartClicked'");
    view7f08001c = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onAddToCartClicked();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    MaterialDesignShrineActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.menu = null;
    target.bottomSheet = null;
    target.middleSheet = null;
    target.topSheet = null;

    view7f080095.setOnClickListener(null);
    view7f080095 = null;
    view7f080109.setOnClickListener(null);
    view7f080109 = null;
    view7f08001c.setOnClickListener(null);
    view7f08001c = null;
  }
}
