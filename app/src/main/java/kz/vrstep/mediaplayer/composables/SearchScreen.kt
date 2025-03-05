package kz.vrstep.mediaplayer.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SearchScreen() {
    var searchQuery by remember { mutableStateOf("") }
    var recentSearches by remember { mutableStateOf(listOf<String>()) }

    Column {
        OutlinedTextField(
            value = searchQuery,
            onValueChange = { searchQuery = it },
            label = { Text("Search") },
            modifier = Modifier.fillMaxWidth().padding(8.dp)
        )
        Button(onClick = {
            if (searchQuery.isNotEmpty()) {
                recentSearches = listOf(searchQuery) + recentSearches.take(4)
                searchQuery = ""
            }
        }) { Text("Search") }

        LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(recentSearches) { search ->
                Text(text = search, modifier = Modifier.padding(8.dp))
            }
        }
    }
}