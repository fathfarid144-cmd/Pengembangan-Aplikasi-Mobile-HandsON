package com.itera.pam.p1.latihan

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.itera.pam.p1.getPlatformName

// Hands-on 3: Layout Dasar — Profile Card
// Tugas: Susun sebuah "kartu profil" sederhana berisi nama, NIM, dan platform
// yang sedang berjalan, menggunakan Card, Column, Row, dan Modifier.

@Composable
fun Handson3Screen() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "Kartu Profil Mahasiswa",
                style = MaterialTheme.typography.titleMedium
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Nama: Muhammad Fatahillah Farid",
                style = MaterialTheme.typography.bodyLarge
            )
            Text(
                text = "NIM: 123140203",
                style = MaterialTheme.typography.bodyLarge
            )
            Row(modifier = Modifier.padding(top = 4.dp)) {
                Text(
                    text = "Platform: ",
                    style = MaterialTheme.typography.bodyMedium
                )
                Text(
                    text = getPlatformName(),
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}
