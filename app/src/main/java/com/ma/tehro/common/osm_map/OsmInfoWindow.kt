package com.ma.tehro.common.osm_map

import android.view.View
import org.osmdroid.views.overlay.infowindow.InfoWindow

class OsmInfoWindow(view: View, mapView: OsmMapView) : InfoWindow(view, mapView) {
    override fun onOpen(item: Any?) {
    }

    override fun onClose() {
    }
}