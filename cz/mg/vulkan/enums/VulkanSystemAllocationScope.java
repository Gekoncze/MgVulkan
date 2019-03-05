package cz.mg.vulkan.enums;

import cz.mg.vulkan.jna.enums.VkSystemAllocationScope;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanSystemAllocationScope {
    public static final int COMMAND = VkSystemAllocationScope.VK_SYSTEM_ALLOCATION_SCOPE_COMMAND;
    public static final int OBJECT = VkSystemAllocationScope.VK_SYSTEM_ALLOCATION_SCOPE_OBJECT;
    public static final int CACHE = VkSystemAllocationScope.VK_SYSTEM_ALLOCATION_SCOPE_CACHE;
    public static final int DEVICE = VkSystemAllocationScope.VK_SYSTEM_ALLOCATION_SCOPE_DEVICE;
    public static final int INSTANCE = VkSystemAllocationScope.VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE;

    public final VkSystemAllocationScope enums;

    public VulkanSystemAllocationScope() {
        this(0);
    }

    public VulkanSystemAllocationScope(int value) {
        this(new VkSystemAllocationScope(value));
    }

    public VulkanSystemAllocationScope(VkSystemAllocationScope enums) {
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
        return ToString.constantToString(enums.value, VkSystemAllocationScope.class);
    }
}
