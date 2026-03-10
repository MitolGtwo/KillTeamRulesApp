package com.example.killteamruleset.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ViewCarousel
import androidx.compose.material.icons.filled.ViewList
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable

import kotlinx.coroutines.launch
import com.example.killteamruleset.ui.components.ExpandableCharacterCard
import com.example.killteamruleset.ui.components.KeywordPopup
import com.example.killteamruleset.ui.components.KillTeamBackground
import com.example.killteamruleset.ui.model.KeywordInfo
import com.example.killteamruleset.ui.model.Operative

@Composable
fun OperativesListScreen(
    operatives: List<Operative>,
    onBack: () -> Unit
) {
    KillTeamBackground {

        var selectedKeyword by remember { mutableStateOf<KeywordInfo?>(null) }
        var cardView by remember { mutableStateOf(false) }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .navigationBarsPadding()
        ) {

            // header row
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {

                TextButton(onClick = onBack) {
                    Text("← Back")
                }

                IconButton(
                    onClick = { cardView = !cardView },
                    modifier = Modifier.size(48.dp)
                ) {

                    Icon(
                        imageVector =
                            if (cardView)
                                Icons.Default.ViewList
                            else
                                Icons.Default.ViewCarousel,
                        contentDescription = null,
                        tint = Color.White
                    )
                }
            }

            if (!cardView) {

                LazyColumn(
                    contentPadding = PaddingValues(16.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {

                    items(operatives) { operative ->

                        ExpandableCharacterCard(
                            operative = operative,
                            onKeywordClick = { keyword ->
                                selectedKeyword = keyword
                            }
                        )
                    }
                }

            } else {

                OperativesCarouselView(
                    operatives = operatives,

                    onKeywordClick = { keyword ->
                        selectedKeyword = keyword
                    }

                )

            }

            // popup stays INSIDE the screen
            selectedKeyword?.let { keyword ->

                KeywordPopup(
                    keyword = keyword,
                    onDismiss = { selectedKeyword = null }
                )
            }
        }
    }

}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OperativesCarouselView(
    operatives: List<Operative>,
    onKeywordClick: (KeywordInfo) -> Unit
) {
    val scope = rememberCoroutineScope()
    val pagerState = rememberPagerState { operatives.size }

    Column {

        LazyRow(
            modifier = Modifier.padding(8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {

            itemsIndexed(operatives) { index, operative ->

                Image(
                    painter = painterResource(
                        operative.portraitRes ?: operative.imageRes
                    ),
                    contentDescription = null,
                    modifier = Modifier
                        .size(64.dp)
                        .clip(CircleShape)
                        .border(
                            2.dp,
                            if (index == pagerState.currentPage)
                                Color(0xFFFF6A00)
                            else
                                Color.Gray,
                            CircleShape
                        )
                        .clickable {
                            scope.launch {
                                pagerState.animateScrollToPage(index)
                            }
                        }
                )
            }
        }

        HorizontalPager(
            state = pagerState,
            modifier = Modifier.fillMaxSize()
        ) { page ->

            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(bottom = 32.dp)
            ) {

                item {

                    ExpandableCharacterCard(
                        operative = operatives[page],
                        alwaysExpanded = true,
                        onKeywordClick = onKeywordClick
                    )

                }

            }
        }
    }
}