package com.example.practical10

class MapsActivity {
    private val TAG = "MapActivity" private

    lateinit var mMap: GoogleMap private lateinit var
    binding: ActivityMapsBinding
    private var lat = -34.0 private
    var log = 151.0
    private var title = "Marker in Sydney"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val obj = intent.getSerializableExtra("Object") as Person
        Log.i(TAG, "onCreate: Object:$obj")
        lat = obj.Latitude log
        = obj.Longitude title
        = obj.Name binding =
        ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }
    override fun onMapReady(googleMap: GoogleMap) { mMap
        = googleMap val sydney = LatLng(lat, log)
        mMap.addMarker(MarkerOptions().position(sydney).title("Marker in Sydney"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))
    }
}

}