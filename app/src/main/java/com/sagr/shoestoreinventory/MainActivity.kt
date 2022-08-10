package com.sagr.shoestoreinventory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.sagr.shoestoreinventory.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var drawerLayout: DrawerLayout
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
        setSupportActionBar(binding.toolbar)
        val navHostFragment = this.supportFragmentManager.findFragmentById(R.id.nav_host_fragment)
        val navController = navHostFragment?.findNavController()
        if (navController != null) {
            NavigationUI.setupActionBarWithNavController(this, navController)
        }
        appBarConfiguration = AppBarConfiguration(navController!!.graph)

        navController.addOnDestinationChangedListener { nc: NavController,
                                                        nd: NavDestination, _: Bundle? ->
            if (nd.id == R.id.shoeList) {
                supportActionBar?.setDisplayHomeAsUpEnabled(false)
            }
        }


    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.nav_host_fragment)
        return navController.navigateUp()
    }
}