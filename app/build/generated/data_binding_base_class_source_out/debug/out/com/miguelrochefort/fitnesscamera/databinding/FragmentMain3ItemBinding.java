// Generated by view binder compiler. Do not edit!
package com.miguelrochefort.fitnesscamera.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.miguelrochefort.fitnesscamera.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentMain3ItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView contentTv;

  @NonNull
  public final TextView nameTv;

  @NonNull
  public final TextView titleTv;

  @NonNull
  public final TextView writeDate;

  private FragmentMain3ItemBinding(@NonNull LinearLayout rootView, @NonNull TextView contentTv,
      @NonNull TextView nameTv, @NonNull TextView titleTv, @NonNull TextView writeDate) {
    this.rootView = rootView;
    this.contentTv = contentTv;
    this.nameTv = nameTv;
    this.titleTv = titleTv;
    this.writeDate = writeDate;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMain3ItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMain3ItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_main3_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMain3ItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.content_tv;
      TextView contentTv = ViewBindings.findChildViewById(rootView, id);
      if (contentTv == null) {
        break missingId;
      }

      id = R.id.name_tv;
      TextView nameTv = ViewBindings.findChildViewById(rootView, id);
      if (nameTv == null) {
        break missingId;
      }

      id = R.id.title_tv;
      TextView titleTv = ViewBindings.findChildViewById(rootView, id);
      if (titleTv == null) {
        break missingId;
      }

      id = R.id.writeDate;
      TextView writeDate = ViewBindings.findChildViewById(rootView, id);
      if (writeDate == null) {
        break missingId;
      }

      return new FragmentMain3ItemBinding((LinearLayout) rootView, contentTv, nameTv, titleTv,
          writeDate);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}