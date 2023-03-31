package hoods.com.jetshopping

import android.content.Context
import hoods.com.jetshopping.data.room.ShoppingListDatabase
import hoods.com.jetshopping.ui.repository.Repository

object Graph {

    lateinit var db: ShoppingListDatabase
        private set

    val repostitory by lazy {
        Repository(
            listDao = db.listDao(),
            storeDao = db.storeDao(),
            itemDAo = db.itemDao()
        )
    }

    fun provide(context: Context) {
        db = ShoppingListDatabase.getDatabase(context)
    }

}