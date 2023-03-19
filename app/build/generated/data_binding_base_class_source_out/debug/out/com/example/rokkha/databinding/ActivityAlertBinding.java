// Generated by view binder compiler. Do not edit!
package com.example.rokkha.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.rokkha.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAlertBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button addcontact;

  @NonNull
  public final Button buttonalert;

  private ActivityAlertBinding(@NonNull ConstraintLayout rootView, @NonNull Button addcontact,
      @NonNull Button buttonalert) {
    this.rootView = rootView;
    this.addcontact = addcontact;
    this.buttonalert = buttonalert;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAlertBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAlertBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_alert, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAlertBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addcontact;
      Button addcontact = ViewBindings.findChildViewById(rootView, id);
      if (addcontact == null) {
        break missingId;
      }

      id = R.id.buttonalert;
      Button buttonalert = ViewBindings.findChildViewById(rootView, id);
      if (buttonalert == null) {
        break missingId;
      }

      return new ActivityAlertBinding((ConstraintLayout) rootView, addcontact, buttonalert);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}