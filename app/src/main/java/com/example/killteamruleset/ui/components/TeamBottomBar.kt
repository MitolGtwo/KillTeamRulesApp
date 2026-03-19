package com.example.killteamruleset.ui.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.automirrored.filled.MenuBook
import androidx.compose.material.icons.filled.Bolt
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.FlashOn
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.MenuBook
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ViewList
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.ui.model.TeamScreen

@Composable
fun TeamBottomBar(
    currentScreen: TeamScreen,
    onNavigate: (TeamScreen) -> Unit,
    teamIconRes: Int? = null
) {

    NavigationBar(
        modifier = Modifier.navigationBarsPadding(),
        containerColor = Color.Black
    ) {

        BottomItem(
            icon = Icons.Default.Person,
            selected = currentScreen == TeamScreen.OPERATIVES,
            onClick = { onNavigate(TeamScreen.OPERATIVES) }
        )

        BottomItem(
            icon = Icons.Default.ViewList,
            selected = currentScreen == TeamScreen.SELECTION,
            onClick = { onNavigate(TeamScreen.SELECTION) }
        )
        if (teamIconRes != null) {

            NavigationBarItem(
                selected = currentScreen == TeamScreen.RULES,
                onClick = { onNavigate(TeamScreen.RULES) },
                icon = {

                    val tint by animateColorAsState(
                        targetValue =
                            if (currentScreen == TeamScreen.RULES)
                                Color(0xFFFF6A00)
                            else
                                Color.Gray,
                        label = ""
                    )

                    Image(
                        painter = painterResource(teamIconRes),
                        contentDescription = null,
                        modifier = Modifier.size(26.dp),
                        colorFilter = ColorFilter.tint(tint)
                    )
                }
            )

        } else {

            BottomItem(
                icon = Icons.Default.MenuBook,
                selected = currentScreen == TeamScreen.RULES,
                onClick = { onNavigate(TeamScreen.RULES) }
            )
        }
        BottomItem(
            icon = Icons.Default.Build,
            selected = currentScreen == TeamScreen.EQUIPMENT,
            onClick = { onNavigate(TeamScreen.EQUIPMENT) }
        )

        BottomItem(
            icon = Icons.Default.MenuBook,
            selected = currentScreen == TeamScreen.PLOYS,
            onClick = { onNavigate(TeamScreen.PLOYS) }
        )
    }
}

@Composable
fun RowScope.BottomItem(
    icon: ImageVector,
    selected: Boolean,
    onClick: () -> Unit
) {

    val tint by animateColorAsState(
        targetValue = if (selected) Color(0xFFFF6A00) else Color.Gray,
        label = ""
    )

    NavigationBarItem(
        selected = selected,
        onClick = onClick,
        icon = {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = tint
            )
        }
    )
}