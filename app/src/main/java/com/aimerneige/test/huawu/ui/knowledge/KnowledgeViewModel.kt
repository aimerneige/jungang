package com.aimerneige.test.huawu.ui.knowledge

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class KnowledgeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is knowledge Fragment"
    }
    val text: LiveData<String> = _text
}