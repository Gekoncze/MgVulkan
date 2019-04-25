package cz.mg.vulkan;

public class VkCommandPoolTrimFlags extends VkFlags {
    public VkCommandPoolTrimFlags() {
    }

    protected VkCommandPoolTrimFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkCommandPoolTrimFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkCommandPoolTrimFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkCommandPoolTrimFlags(int value) {
        setValue(value);
    }
}
