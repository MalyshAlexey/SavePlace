package com.example.placebook.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\u0018\u0000 :2\u00020\u00012\u00020\u0002:\u0002:;B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\u0014\u0010\u0018\u001a\u00020\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u001aJ\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u001a\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\u0010\u0010#\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010$\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010%\u001a\u00020\u0017H\u0003J\u0010\u0010&\u001a\u00020\u00172\u0006\u0010\'\u001a\u00020\u0013H\u0002J\u0012\u0010(\u001a\u00020\u00172\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J\u0010\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\tH\u0016J-\u0010-\u001a\u00020\u00172\u0006\u0010.\u001a\u00020/2\u000e\u00100\u001a\n\u0012\u0006\b\u0001\u0012\u000202012\u0006\u00103\u001a\u000204H\u0016\u00a2\u0006\u0002\u00105J\b\u00106\u001a\u00020\u0017H\u0002J\b\u00107\u001a\u00020\u0017H\u0002J\b\u00108\u001a\u00020\u0017H\u0002J\b\u00109\u001a\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006<"}, d2 = {"Lcom/example/placebook/ui/MapsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "()V", "binding", "Lcom/example/placebook/databinding/ActivityMapsBinding;", "fusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "mMap", "Lcom/google/android/gms/maps/GoogleMap;", "mapsViewModel", "Lcom/example/placebook/viewmodel/MapsViewModel;", "getMapsViewModel", "()Lcom/example/placebook/viewmodel/MapsViewModel;", "mapsViewModel$delegate", "Lkotlin/Lazy;", "placesClient", "Lcom/google/android/libraries/places/api/net/PlacesClient;", "addPlaceMarker", "Lcom/google/android/gms/maps/model/Marker;", "bookmark", "Lcom/example/placebook/viewmodel/MapsViewModel$BookmarkMarkerView;", "createBookmarkMarkerObserver", "", "displayAllBookmarks", "bookmarks", "", "displayPoi", "pointOfInterest", "Lcom/google/android/gms/maps/model/PointOfInterest;", "displayPoiDisplayStep", "place", "Lcom/google/android/libraries/places/api/model/Place;", "photo", "Landroid/graphics/Bitmap;", "displayPoiGetPhotoStep", "displayPoiGetPlaceStep", "getCurrentLocation", "handleInfoWindowClick", "marker", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onMapReady", "googleMap", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "requestLocationPermissions", "setupLocationClient", "setupMapListeners", "setupPlacesClient", "Companion", "PlaceInfo", "app_debug"})
public final class MapsActivity extends androidx.appcompat.app.AppCompatActivity implements com.google.android.gms.maps.OnMapReadyCallback {
    private com.google.android.gms.maps.GoogleMap mMap;
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient;
    private com.example.placebook.databinding.ActivityMapsBinding binding;
    private com.google.android.libraries.places.api.net.PlacesClient placesClient;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.placebook.ui.MapsActivity.Companion Companion = null;
    private static final int REQUEST_LOCATION = 1;
    private static final java.lang.String TAG = "MapsActivity";
    private final kotlin.Lazy mapsViewModel$delegate = null;
    
    public MapsActivity() {
        super();
    }
    
    private final com.example.placebook.viewmodel.MapsViewModel getMapsViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    private final void setupPlacesClient() {
    }
    
    private final void setupLocationClient() {
    }
    
    private final void requestLocationPermissions() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void getCurrentLocation() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void displayPoi(com.google.android.gms.maps.model.PointOfInterest pointOfInterest) {
    }
    
    private final void displayPoiGetPlaceStep(com.google.android.gms.maps.model.PointOfInterest pointOfInterest) {
    }
    
    private final void displayPoiGetPhotoStep(com.google.android.libraries.places.api.model.Place place) {
    }
    
    private final void displayPoiDisplayStep(com.google.android.libraries.places.api.model.Place place, android.graphics.Bitmap photo) {
    }
    
    private final void setupMapListeners() {
    }
    
    private final void handleInfoWindowClick(com.google.android.gms.maps.model.Marker marker) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.maps.model.Marker addPlaceMarker(@org.jetbrains.annotations.NotNull()
    com.example.placebook.viewmodel.MapsViewModel.BookmarkMarkerView bookmark) {
        return null;
    }
    
    public final void createBookmarkMarkerObserver() {
    }
    
    public final void displayAllBookmarks(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.placebook.viewmodel.MapsViewModel.BookmarkMarkerView> bookmarks) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/example/placebook/ui/MapsActivity$PlaceInfo;", "", "place", "Lcom/google/android/libraries/places/api/model/Place;", "image", "Landroid/graphics/Bitmap;", "(Lcom/google/android/libraries/places/api/model/Place;Landroid/graphics/Bitmap;)V", "getImage", "()Landroid/graphics/Bitmap;", "getPlace", "()Lcom/google/android/libraries/places/api/model/Place;", "app_debug"})
    public static final class PlaceInfo {
        @org.jetbrains.annotations.Nullable()
        private final com.google.android.libraries.places.api.model.Place place = null;
        @org.jetbrains.annotations.Nullable()
        private final android.graphics.Bitmap image = null;
        
        public PlaceInfo() {
            super();
        }
        
        public PlaceInfo(@org.jetbrains.annotations.Nullable()
        com.google.android.libraries.places.api.model.Place place, @org.jetbrains.annotations.Nullable()
        android.graphics.Bitmap image) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.google.android.libraries.places.api.model.Place getPlace() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.graphics.Bitmap getImage() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/placebook/ui/MapsActivity$Companion;", "", "()V", "REQUEST_LOCATION", "", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}