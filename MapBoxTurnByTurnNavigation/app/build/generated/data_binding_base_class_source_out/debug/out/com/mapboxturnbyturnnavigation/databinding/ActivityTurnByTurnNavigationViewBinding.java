// Generated by view binder compiler. Do not edit!
package com.mapboxturnbyturnnavigation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.mapbox.maps.MapView;
import com.mapbox.navigation.ui.maneuver.view.MapboxManeuverView;
import com.mapbox.navigation.ui.maps.camera.view.MapboxRecenterButton;
import com.mapbox.navigation.ui.maps.camera.view.MapboxRouteOverviewButton;
import com.mapbox.navigation.ui.voice.view.MapboxSoundButton;
import com.mapboxturnbyturnnavigation.R;
import com.mapboxturnbyturnnavigation.tripprogress.view.MapboxTripProgressView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityTurnByTurnNavigationViewBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MapboxManeuverView maneuverView;

  @NonNull
  public final MapView mapView;

  @NonNull
  public final MapboxRecenterButton recenter;

  @NonNull
  public final MapboxRouteOverviewButton routeOverview;

  @NonNull
  public final MapboxSoundButton soundButton;

  @NonNull
  public final ImageView stop;

  @NonNull
  public final CardView tripProgressCard;

  @NonNull
  public final MapboxTripProgressView tripProgressView;

  private ActivityTurnByTurnNavigationViewBinding(@NonNull ConstraintLayout rootView,
      @NonNull MapboxManeuverView maneuverView, @NonNull MapView mapView,
      @NonNull MapboxRecenterButton recenter, @NonNull MapboxRouteOverviewButton routeOverview,
      @NonNull MapboxSoundButton soundButton, @NonNull ImageView stop,
      @NonNull CardView tripProgressCard, @NonNull MapboxTripProgressView tripProgressView) {
    this.rootView = rootView;
    this.maneuverView = maneuverView;
    this.mapView = mapView;
    this.recenter = recenter;
    this.routeOverview = routeOverview;
    this.soundButton = soundButton;
    this.stop = stop;
    this.tripProgressCard = tripProgressCard;
    this.tripProgressView = tripProgressView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityTurnByTurnNavigationViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityTurnByTurnNavigationViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_turn_by_turn_navigation_view, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityTurnByTurnNavigationViewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.maneuverView;
      MapboxManeuverView maneuverView = ViewBindings.findChildViewById(rootView, id);
      if (maneuverView == null) {
        break missingId;
      }

      id = R.id.mapView;
      MapView mapView = ViewBindings.findChildViewById(rootView, id);
      if (mapView == null) {
        break missingId;
      }

      id = R.id.recenter;
      MapboxRecenterButton recenter = ViewBindings.findChildViewById(rootView, id);
      if (recenter == null) {
        break missingId;
      }

      id = R.id.routeOverview;
      MapboxRouteOverviewButton routeOverview = ViewBindings.findChildViewById(rootView, id);
      if (routeOverview == null) {
        break missingId;
      }

      id = R.id.soundButton;
      MapboxSoundButton soundButton = ViewBindings.findChildViewById(rootView, id);
      if (soundButton == null) {
        break missingId;
      }

      id = R.id.stop;
      ImageView stop = ViewBindings.findChildViewById(rootView, id);
      if (stop == null) {
        break missingId;
      }

      id = R.id.tripProgressCard;
      CardView tripProgressCard = ViewBindings.findChildViewById(rootView, id);
      if (tripProgressCard == null) {
        break missingId;
      }

      id = R.id.tripProgressView;
      MapboxTripProgressView tripProgressView = ViewBindings.findChildViewById(rootView, id);
      if (tripProgressView == null) {
        break missingId;
      }

      return new ActivityTurnByTurnNavigationViewBinding((ConstraintLayout) rootView, maneuverView,
          mapView, recenter, routeOverview, soundButton, stop, tripProgressCard, tripProgressView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
