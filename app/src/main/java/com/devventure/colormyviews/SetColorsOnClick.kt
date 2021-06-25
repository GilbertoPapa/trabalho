package com.devventure.colormyviews

import android.view.View

/**
 * Função salva o Bitmap gerado da view como um file em um diretório privado, utilizando getExternalFilesDir(),
 * portanto os arquivos serão removidos quando o app for desinstalado
 * @param view elemento para definir o click
 * @param pincelColor cor para cada click
 * @return Int cor para pintar os elementos
 */
fun setColorsOnClick(view: View, pincelColor: Int): Int {
    var color = 0
    view.setOnClickListener {
        color = pincelColor
    }
    return color
}

