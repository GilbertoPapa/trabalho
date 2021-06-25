package com.devventure.colormyviews

import android.content.SharedPreferences
import android.view.View

/**
 * Função defini o background e devolve um editor para activity
 * @param view elemento a ser colorido
 * @param pincelColor cor para o elemento
 * @param editor elemento do SharedPreferences a ser preenchido
 * @return o Editor preenchido
 */
fun setBackground(view: View, pincelColor: Int, editor: SharedPreferences.Editor): SharedPreferences.Editor{
    view.setOnClickListener {
        view.setBackgroundResource(pincelColor)
        editor.putInt(view.id.toString(), pincelColor)
    }
    return editor
}