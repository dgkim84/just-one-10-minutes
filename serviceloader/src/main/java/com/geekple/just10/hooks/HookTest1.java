package com.geekple.just10.hooks;

import com.geekple.just10.BootHook;

public class HookTest1 implements BootHook {
  public void boot() {
    System.out.println("test boot hook!");
  }
}
