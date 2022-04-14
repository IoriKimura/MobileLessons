package ru.mirea.ivanov.mireaproject.ui.stories;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ItemDao {
    @Query("SELECT * FROM item")
    List<ru.mirea.ivanov.mireaproject.ui.stories.Item> getAll();

    @Query ("SELECT * FROM item WHERE id = :id")
    ru.mirea.ivanov.mireaproject.ui.stories.Item getById(long id);

    @Insert
    void insert(ru.mirea.ivanov.mireaproject.ui.stories.Item item);
    @Update
    void update(ru.mirea.ivanov.mireaproject.ui.stories.Item item);
    @Delete
    void delete(ru.mirea.ivanov.mireaproject.ui.stories.Item item);
}
