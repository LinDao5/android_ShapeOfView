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

public class ShapeOfViewMainActivity_ViewBinding implements Unbinder {
  private ShapeOfViewMainActivity target;

  private View view7f080020;

  private View view7f080083;

  private View view7f0800e8;

  private View view7f0800ba;

  private View view7f0800e9;

  private View view7f0800ea;

  private View view7f0800d7;

  private View view7f0800d2;

  private View view7f080053;

  @UiThread
  public ShapeOfViewMainActivity_ViewBinding(ShapeOfViewMainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ShapeOfViewMainActivity_ViewBinding(final ShapeOfViewMainActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.anim, "method 'onAnimClicked'");
    view7f080020 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onAnimClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.jackman, "method 'onJackmanClicked'");
    view7f080083 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onJackmanClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.star, "method 'onStarClicked'");
    view7f0800e8 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onStarClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.round, "method 'onRoundClicked'");
    view7f0800ba = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onRoundClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.star_wars, "method 'onStarWarsClicked'");
    view7f0800e9 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onStarWarsClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.star_wars_animated, "method 'onStarWarsAnimatedClicked'");
    view7f0800ea = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onStarWarsAnimatedClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.shrine, "method 'onShrineClicked'");
    view7f0800d7 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onShrineClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.shapes, "method 'onShapesClicked'");
    view7f0800d2 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onShapesClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.dottedEdges, "method 'onDottedEdgesClicked'");
    view7f080053 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onDottedEdgesClicked();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view7f080020.setOnClickListener(null);
    view7f080020 = null;
    view7f080083.setOnClickListener(null);
    view7f080083 = null;
    view7f0800e8.setOnClickListener(null);
    view7f0800e8 = null;
    view7f0800ba.setOnClickListener(null);
    view7f0800ba = null;
    view7f0800e9.setOnClickListener(null);
    view7f0800e9 = null;
    view7f0800ea.setOnClickListener(null);
    view7f0800ea = null;
    view7f0800d7.setOnClickListener(null);
    view7f0800d7 = null;
    view7f0800d2.setOnClickListener(null);
    view7f0800d2 = null;
    view7f080053.setOnClickListener(null);
    view7f080053 = null;
  }
}
