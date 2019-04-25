package cz.mg.vulkan;

public class VkCommandPoolResetFlags extends VkFlags {
    public VkCommandPoolResetFlags() {
    }

    protected VkCommandPoolResetFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkCommandPoolResetFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkCommandPoolResetFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkCommandPoolResetFlags(int value) {
        setValue(value);
    }
}
