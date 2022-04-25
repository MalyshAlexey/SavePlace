package com.example.placebook.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\b\u00a2\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\bR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/placebook/repository/BookmarkRepo;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "allBookmarks", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/placebook/model/Bookmark;", "getAllBookmarks", "()Landroidx/lifecycle/LiveData;", "bookmarkDao", "Lcom/example/placebook/db/BookmarkDao;", "db", "Lcom/example/placebook/db/PlaceBookDatabase;", "addBookmark", "", "bookmark", "(Lcom/example/placebook/model/Bookmark;)Ljava/lang/Long;", "createBookmark", "app_debug"})
public final class BookmarkRepo {
    private final com.example.placebook.db.PlaceBookDatabase db = null;
    private final com.example.placebook.db.BookmarkDao bookmarkDao = null;
    
    public BookmarkRepo(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long addBookmark(@org.jetbrains.annotations.NotNull()
    com.example.placebook.model.Bookmark bookmark) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.placebook.model.Bookmark createBookmark() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.placebook.model.Bookmark>> getAllBookmarks() {
        return null;
    }
}