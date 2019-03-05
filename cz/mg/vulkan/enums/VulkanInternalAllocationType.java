package cz.mg.vulkan.enums;

import cz.mg.vulkan.jna.enums.VkInternalAllocationType;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanInternalAllocationType {
    public static final int EXECUTABLE = VkInternalAllocationType.VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE;

    public final VkInternalAllocationType enums;

    public VulkanInternalAllocationType() {
        this(0);
    }

    public VulkanInternalAllocationType(int value) {
        this(new VkInternalAllocationType(value));
    }

    public VulkanInternalAllocationType(VkInternalAllocationType enums) {
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
        return ToString.constantToString(enums.value, VkInternalAllocationType.class);
    }
}
