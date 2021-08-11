package qr.a.rooshen.hwkotlinlesson9

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(), MainNavigation {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val notShowItAnymore = getSharedPreferences("settingsHWKotlinlesson9", Context.MODE_PRIVATE)
       if (notShowItAnymore.getBoolean("notShowItAnymore", false)) {
        //if(notShowItAnymore.contains("notShowItAnymore")){
            openAuthorizationFragmentNotShowItAnymore()
           Log.d("TAG","${notShowItAnymore.getBoolean("notShowItAnymore", false)}")
        } else {
            openGreeting()
           Log.d("TAG","${notShowItAnymore.getBoolean("notShowItAnymore", false)}")
        }

    }

    override fun openGreeting() {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.clRootActivity, GreetingFragment())
            .commit()
    }

    override fun openAuthorizationFragmentNotShowItAnymore() {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.clRootActivity, AuthorizationFragment())
            .commit()
    }

    override fun openMenu() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.clRootActivity, MenuFragment())
            .addToBackStack("Menu")
            .commit()
    }

    override fun openMenuList() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.clRootActivity, MenuListFragment())
            .commit()
    }

    override fun openMenuListContainerMenu() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.flContainerMenu, MenuListFragment())
            .commit()
    }

    override fun openDialogBasket() {
        DialogBasket().show(supportFragmentManager, "BottomTest")
    }

    override fun openAuthorizationFragment() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.clRootActivity, AuthorizationFragment())
            .addToBackStack("AuthorizationFragment")
            .commit()
    }

    override fun openBasketFragment(phoneNumber: String) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.clRootActivity, BasketFragment.newInstance(phoneNumber))
            .addToBackStack("BasketFragment")
            .commit()
    }

}