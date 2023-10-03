package com.example.calculadoraandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import net.objecthunter.exp4j.ExpressionBuilder


class MainActivity : AppCompatActivity() {

    private lateinit var btnApagarTudo: Button
    private lateinit var btnExcluir: Button
    private lateinit var btnPorcentagem: Button
    private lateinit var btnDividir: Button
    private lateinit var btnIgual: Button

    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button
    private lateinit var btn4: Button

    private lateinit var btn5: Button
    private lateinit var btn6: Button
    private lateinit var btn7: Button
    private lateinit var btn8: Button

    private lateinit var btn9: Button
    private lateinit var btn0: Button
    private lateinit var btnPonto: Button
    private lateinit var btnAdicao: Button

    private lateinit var txtView: TextView
    private lateinit var txtResultados: TextView
    private lateinit var btnSubtrair: Button
    private lateinit var btnMultiplicar: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inicializarComponentes()

        btnApagarTudo.setOnClickListener(){
            txtView.setText("")
        }

        btnExcluir.setOnClickListener(){

            var string = txtView.text.toString()
            var meuArray = string.toCharArray().map { it.toString() }.toTypedArray()
            var excluido = meuArray.dropLast(1).toTypedArray()
            var pronto = excluido.joinToString("")
            txtView.text = pronto

        }

        btnPorcentagem.setOnClickListener(){
            var texto = txtView.text
            var novo = "${texto}%"
            txtView.text = novo
        }

        btnDividir.setOnClickListener(){
            var texto = txtView.text
            var novo = "${texto}/"
            txtView.text = novo
        }

        btnIgual.setOnClickListener(){
            val expressao = ExpressionBuilder(txtView.text.toString()).build().evaluate()
            val resultado = expressao
            val resultadoLong = expressao.toLong()

            if(resultado == resultadoLong.toDouble()){
                txtResultados.text = resultadoLong.toString()
            }
            else{
                txtResultados.text = resultado.toString()
            }

        }

        btn1.setOnClickListener(){
            var texto = txtView.text
            var novo = "${texto}1"
            txtView.text = novo
        }

        btn2.setOnClickListener(){
            var texto = txtView.text
            var novo = "${texto}2"
            txtView.text = novo
        }

        btn3.setOnClickListener(){
            var texto = txtView.text
            var novo = "${texto}3"
            txtView.text = novo
        }

        btn4.setOnClickListener(){
            var texto = txtView.text
            var novo = "${texto}4"
            txtView.text = novo
        }

        btn5.setOnClickListener(){
            var texto = txtView.text
            var novo = "${texto}5"
            txtView.text = novo
        }

        btn6.setOnClickListener(){
            var texto = txtView.text
            var novo = "${texto}6"
            txtView.text = novo
        }

        btn7.setOnClickListener(){
            var texto = txtView.text
            var novo = "${texto}7"
            txtView.text = novo
        }

        btn8.setOnClickListener(){
            var texto = txtView.text
            var novo = "${texto}8"
            txtView.text = novo
        }

        btn9.setOnClickListener(){
            var texto = txtView.text
            var novo = "${texto}9"
            txtView.text = novo
        }

        btn0.setOnClickListener(){
            var texto = txtView.text
            var novo = "${texto}0"
            txtView.text = novo
        }

        btnPonto.setOnClickListener(){
            var texto = txtView.text
            var novo = "${texto}."
            txtView.text = novo
        }

        btnAdicao.setOnClickListener(){
            var texto = txtView.text
            var novo = "${texto}+"
            txtView.text = novo
        }

        btnSubtrair.setOnClickListener(){
            var texto = txtView.text
            var novo = "${texto}-"
            txtView.text = novo
        }

        btnMultiplicar.setOnClickListener(){
            var texto = txtView.text
            var novo = "${texto}*"
            txtView.text = novo
        }
    }

    private fun inicializarComponentes() {
        btnApagarTudo = findViewById(R.id.btn_apagar_tudo)
        btnExcluir = findViewById(R.id.btn_excluir)
        btnPorcentagem = findViewById(R.id.btn_porcentagem)
        btnDividir = findViewById(R.id.btn_dividir)
        btnIgual = findViewById(R.id.btn_igual)

        btn1 = findViewById(R.id.btn_1)
        btn2 = findViewById(R.id.btn_2)
        btn3 = findViewById(R.id.btn_3)
        btn4 = findViewById(R.id.btn_4)

        btn5 = findViewById(R.id.btn_5)
        btn6 = findViewById(R.id.btn_6)
        btn7 = findViewById(R.id.btn_7)
        btn8 = findViewById(R.id.btn_8)

        btn9 = findViewById(R.id.btn_9)
        btn0 = findViewById(R.id.btn_0)
        btnPonto = findViewById(R.id.btn_ponto)
        btnAdicao = findViewById(R.id.btn_adicao)

        txtView = findViewById(R.id.txt_view)
        txtResultados = findViewById(R.id.txt_resultados)
        btnSubtrair = findViewById(R.id.btn_subtracao)
        btnMultiplicar = findViewById(R.id.btn_multiplicacao)
    }
}