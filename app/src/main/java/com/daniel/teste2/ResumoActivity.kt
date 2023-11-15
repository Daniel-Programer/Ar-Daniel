package com.daniel.teste2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.daniel.teste2.databinding.ActivityOpcoesBinding

class ResumoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOpcoesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOpcoesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent

        var vlSapato = i.getDoubleExtra("vlSapato", 0.0)
        var qtdSapato = i.getStringExtra("qtdSapato")
        var vlCamisa = i.getDoubleExtra("vlCamisa", 0.0)
        var qtdCamisa = i.getStringExtra("qtdCamisa")
        var vlBermuda = i.getDoubleExtra("vlBermuda", 0.0)
        var qtdBermuda = i.getStringExtra("qtdBermuda")

    }
}