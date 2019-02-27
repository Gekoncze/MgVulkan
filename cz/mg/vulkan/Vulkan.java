package cz.mg.vulkan;

import cz.mg.vulkan.jna.VulkanNative;
import cz.mg.vulkan.jna.VulkanNativeSimplified;


public class Vulkan {
    final VulkanNative vk;
    final VulkanNativeSimplified vks;

    public Vulkan() {
        this(VulkanNative.loadLibrary());
    }

    public Vulkan(String libraryName) {
        this(VulkanNative.loadLibrary(libraryName));
    }

    public Vulkan(VulkanNative vk) {
        this.vk = vk;
        this.vks = new VulkanNativeSimplified(vk);
    }
}
