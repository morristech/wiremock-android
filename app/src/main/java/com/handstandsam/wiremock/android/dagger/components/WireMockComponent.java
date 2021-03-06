package com.handstandsam.wiremock.android.dagger.components;

import com.handstandsam.wiremock.android.DashboardFragment;
import com.handstandsam.wiremock.android.WireMockServerBackgroundService;
import com.handstandsam.wiremock.android.dagger.modules.AppModule;
import com.handstandsam.wiremock.android.dagger.modules.WireMockModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, WireMockModule.class})
public interface WireMockComponent {

    void inject(DashboardFragment activity);

    void inject(WireMockServerBackgroundService wireMockServerBackgroundService);
}