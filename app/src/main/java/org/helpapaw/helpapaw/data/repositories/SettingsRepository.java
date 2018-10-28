package org.helpapaw.helpapaw.data.repositories;

import android.content.SharedPreferences;

public class SettingsRepository implements ISettingsRepository {

    private SharedPreferences preferences;

    public SettingsRepository(SharedPreferences preferences) {
        this.preferences = preferences;
    }

    @Override
    public void saveRadius(int radius) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt("radius", radius * 1000);
        editor.apply();
    }

    @Override
    public void saveTimeout(int timeout) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt("timeout", timeout);
        editor.apply();
    }

    @Override
    public int getRadius() {
        return preferences.getInt("radius", 0);
    }

    @Override
    public int getTimeout() {
        return preferences.getInt("timeout", 0);
    }
}
