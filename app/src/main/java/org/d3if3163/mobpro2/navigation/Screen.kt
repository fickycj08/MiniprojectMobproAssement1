package org.d3if3163.mobpro2.navigation

    sealed class Screen(val route: String) {
        data object Home : Screen("mainScreen")
        data object About : Screen("aboutscreen")
    }

