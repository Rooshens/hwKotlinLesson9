package qr.a.rooshen.hwkotlinlesson9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import qr.a.rooshen.hwkotlinlesson9.R


class MainActivity : AppCompatActivity(), MainNavigation {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openAuthorizationFragment()

    }

    override fun openMenu() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.clRootActivity, MenuFragment())
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
            .add(R.id.clRootActivity, AuthorizationFragment())
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