package cz.mg.vulkan;

public class VkCommandPoolTrimFlagsKHR extends VkFlags {
    public VkCommandPoolTrimFlagsKHR() {
    }

    protected VkCommandPoolTrimFlagsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkCommandPoolTrimFlagsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkCommandPoolTrimFlagsKHR(VkPointer pointer) {
        super(pointer);
    }



    public VkCommandPoolTrimFlagsKHR(int value) {
        setValue(value);
    }
}
