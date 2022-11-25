// Generated by view binder compiler. Do not edit!
package com.miguelrochefort.fitnesscamera.databinding;

import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.miguelrochefort.fitnesscamera.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class TfePnActivityPosenetBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button finPushup;

  @NonNull
  public final Button finSquart;

  @NonNull
  public final SurfaceView surfaceView;

  @NonNull
  public final TextView textView;

  private TfePnActivityPosenetBinding(@NonNull ConstraintLayout rootView, @NonNull Button finPushup,
      @NonNull Button finSquart, @NonNull SurfaceView surfaceView, @NonNull TextView textView) {
    this.rootView = rootView;
    this.finPushup = finPushup;
    this.finSquart = finSquart;
    this.surfaceView = surfaceView;
    this.textView = textView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static TfePnActivityPosenetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static TfePnActivityPosenetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.tfe_pn_activity_posenet, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static TfePnActivityPosenetBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.fin_pushup;
      Button finPushup = ViewBindings.findChildViewById(rootView, id);
      if (finPushup == null) {
        break missingId;
      }

      id = R.id.fin_squart;
      Button finSquart = ViewBindings.findChildViewById(rootView, id);
      if (finSquart == null) {
        break missingId;
      }

      id = R.id.surfaceView;
      SurfaceView surfaceView = ViewBindings.findChildViewById(rootView, id);
      if (surfaceView == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new TfePnActivityPosenetBinding((ConstraintLayout) rootView, finPushup, finSquart,
          surfaceView, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}