package com.example.killteamruleset.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.R

@Composable
fun GeneralRulesWhatYouNeed() {
    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier
            .fillMaxWidth()
            .navigationBarsPadding()
    ) {

        Text(
            text = "WHAT YOU NEED",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        Text(
            text = "Two Kill Teams",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        GeneralRulesBullet("Each player must bring a complete Kill Team, you can get your own in amazon or your local game store.")

        Spacer(Modifier.height(8.dp))

        RulesImageRow(
            leftImage = R.drawable.whatyouneedkt1,
            rightImage = R.drawable.whatyouneedkt2
        )
    }

        GeneralRulesBullet("Terrain set")

        GeneralRulesBullet("D6 dice, with 6-12 dice should be enough")
        GeneralRulesBullet("Measuring tools (inches)")

        GeneralRulesBullet("Tokens (Orders, Objectives, Wounds, etc.)")

        RulesImage(
            R.drawable.whatyouneedtokens
        )

        Divider(
            thickness = 1.dp,
            color = MaterialTheme.colorScheme.primary.copy(alpha = 0.3f)
        )

        Text(
            text = "OPTIONAL",
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )
        GeneralRulesBullet("Tac Ops cards / see below")
        GeneralRulesBullet("Approved Crit Ops card / see below")
        GeneralRulesBullet("Datacards or reference sheets")


    Text(
        text = "You dont need to have it all",
        fontWeight = FontWeight.Bold,
        color = MaterialTheme.colorScheme.primary
    )

    Text(
        text = "For CritOps, you can use an app and determine the mission, and for TacOps" +
                " we can use the local method: you use the app, take a screenshot of the TacOp" +
                " you will run this mission, and send the picture to your opponent as a 1 time" +
                " view message.",
        color = MaterialTheme.colorScheme.surface
    )

    Text(
        text = "Proxy",
        fontWeight = FontWeight.Bold,
        color = MaterialTheme.colorScheme.primary
    )

    Text(
        text = "In this hobby, proxying is how is called using a miniature as it was another type" +
                " of miniature, as long as the base size is the same, you can talk with your opponent" +
                " and reach an agreement to allow the proxy",
        color = MaterialTheme.colorScheme.surface
    )
    Text(
        text = "In summary, in casual games you dont need the exact miniature to play it, you can proxy it" +
                " with another miniature with the same base size.",
        color = MaterialTheme.colorScheme.surface
    )


    }


