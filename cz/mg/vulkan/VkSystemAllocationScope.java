package cz.mg.vulkan;

public class VkSystemAllocationScope extends VkEnum {
    public static final int VK_SYSTEM_ALLOCATION_SCOPE_COMMAND = 0;
    public static final int VK_SYSTEM_ALLOCATION_SCOPE_OBJECT = 1;
    public static final int VK_SYSTEM_ALLOCATION_SCOPE_CACHE = 2;
    public static final int VK_SYSTEM_ALLOCATION_SCOPE_DEVICE = 3;
    public static final int VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE = 4;

    public VkSystemAllocationScope() {
    }

    public VkSystemAllocationScope(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSystemAllocationScope(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSystemAllocationScope(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_SYSTEM_ALLOCATION_SCOPE_COMMAND) return "VK_SYSTEM_ALLOCATION_SCOPE_COMMAND";
        if(getValue() == VK_SYSTEM_ALLOCATION_SCOPE_OBJECT) return "VK_SYSTEM_ALLOCATION_SCOPE_OBJECT";
        if(getValue() == VK_SYSTEM_ALLOCATION_SCOPE_CACHE) return "VK_SYSTEM_ALLOCATION_SCOPE_CACHE";
        if(getValue() == VK_SYSTEM_ALLOCATION_SCOPE_DEVICE) return "VK_SYSTEM_ALLOCATION_SCOPE_DEVICE";
        if(getValue() == VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE) return "VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE";
        return "UNKNOWN";
    }
}
