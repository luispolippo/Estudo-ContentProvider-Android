package com.polippo.applicationcontentprovider

import android.database.Cursor

interface NoteClickedListener {

    fun NoteClickedItem(cursor: Cursor)
    fun NoteRemoveItem(cursor: Cursor?)

}