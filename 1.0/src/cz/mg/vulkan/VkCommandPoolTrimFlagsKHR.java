package cz.mg.vulkan;

public class VkCommandPoolTrimFlagsKHR extends VkFlags {
    public VkCommandPoolTrimFlagsKHR() {
    }

    public VkCommandPoolTrimFlagsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkCommandPoolTrimFlagsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkCommandPoolTrimFlagsKHR(int value) {
        setValue(value);
    }
}
