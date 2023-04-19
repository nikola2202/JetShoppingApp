package hoods.com.jetshopping.ui.detail

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import hoods.com.jetshopping.ui.Category
import java.util.*

@Composable
fun DetailScreen(
    id:Int,
    navigateUp:() -> Unit
) {
    val viewModel = viewModel<DetailViewModel>(factory = DetailViewModelFactory(id))
    Scaffold {

    }
}

@Composable
private fun DetailEntry(
    modifier: Modifier = Modifier,
    state: DetailState,
    onDateSelected:(Date) -> Unit,
    onStoreChange:(String) -> Unit,
    onItemChange:(String) -> Unit,
    onQtyChange:(String) -> Unit,
    onCategoryChange:(Category) -> Unit,
    onDialogDismissed:(Category) -> Unit,
    onSaveStore:() -> Unit,
    updateItem:() -> Unit,
    saveItem:() -> Unit,
    navigateUp:() -> Unit,
) {

    var isNewEnabled by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = modifier.padding(16.dp)
    ) {



    }


}