package cz.mg.vulkan;

public class VkSampleCountFlags extends VkFlags {
    public VkSampleCountFlags() {
    }

    protected VkSampleCountFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSampleCountFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSampleCountFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkSampleCountFlags(int value) {
        setValue(value);
    }
}
