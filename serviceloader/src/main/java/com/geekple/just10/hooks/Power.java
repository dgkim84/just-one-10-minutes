package com.geekple.just10.hooks;

import com.geekple.just10.BootHook;
import com.geekple.just10.ShutdownHook;

public class Power implements BootHook, ShutdownHook {
  public void boot() {
    System.out.println("Power Up!");
  }

  public void shutdown() {
    System.out.println("Power Down!");
  }
}
