package com.example.planetaryapod.di

import android.content.Context
import androidx.room.Room
import com.example.planetaryapod.datasource.roomdb.DATABASE_NAME
import com.example.planetaryapod.datasource.roomdb.PlanetaryDao
import com.example.planetaryapod.datasource.roomdb.PlanetaryDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext context: Context): PlanetaryDatabase {
        return Room.databaseBuilder(
            context,
            PlanetaryDatabase::class.java,
            DATABASE_NAME
        ).fallbackToDestructiveMigration().build()
    }

    @Singleton
    @Provides
    fun providePlanetaryDao(db: PlanetaryDatabase): PlanetaryDao {
        return db.getPlanetaryDao()
    }

}