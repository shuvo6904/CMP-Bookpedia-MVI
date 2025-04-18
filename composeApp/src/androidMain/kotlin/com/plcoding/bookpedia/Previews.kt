package com.plcoding.bookpedia

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.plcoding.bookpedia.book.presentation.book_list.components.BookSearchBar

@Preview(showBackground = true)
@Composable
fun BookSearchBarPreview(modifier: Modifier = Modifier) {
    BookSearchBar(
        searchQuery = "",
        onSearchQueryChange = {},
        onImeSearch = {},
        modifier = modifier
            .fillMaxWidth()
    )
}