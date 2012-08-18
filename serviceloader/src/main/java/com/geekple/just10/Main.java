package com.geekple.just10;

import java.util.ServiceLoader;

public class Main {
  private ServiceLoader<BootHook> bootHooks = ServiceLoader.load(BootHook.class);
  private ServiceLoader<ShutdownHook> shutdownHooks = ServiceLoader.load(ShutdownHook.class);

  public Main() {
  }

  public void boot() {
    for (BootHook hook : bootHooks) {
      hook.boot();
    }
  }

  public void shutdown() {
    for (ShutdownHook hook : shutdownHooks) {
      hook.shutdown();
    }
  }

  public static void main(String[] args) {
    Main main = new Main();
    main.boot();

    main.shutdown();
  }
}
