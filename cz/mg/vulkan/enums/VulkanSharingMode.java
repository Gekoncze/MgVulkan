package cz.mg.vulkan.enums;

import cz.mg.vulkan.jna.enums.VkSharingMode;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanSharingMode {
    public static final int EXCLUSIVE = VkSharingMode.VK_SHARING_MODE_EXCLUSIVE;
    public static final int CONCURRENT = VkSharingMode.VK_SHARING_MODE_CONCURRENT;

    public final VkSharingMode enums;

    public VulkanSharingMode() {
        this(0);
    }

    public VulkanSharingMode(int value) {
        this(new VkSharingMode(value));
    }

    public VulkanSharingMode(VkSharingMode enums) {
        this.enums = enums;
    }

    public boolean is(int value){
        return this.enums.value == value;
    }

    public void set(int value){
        this.enums.value = value;
    }

    @Override
    public String toString() {
        return ToString.constantToString(enums.value, VkSharingMode.class);
    }
}
