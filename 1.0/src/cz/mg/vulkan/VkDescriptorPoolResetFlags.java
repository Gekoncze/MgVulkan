package cz.mg.vulkan;

public class VkDescriptorPoolResetFlags extends VkFlags {
    public VkDescriptorPoolResetFlags() {
    }

    protected VkDescriptorPoolResetFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDescriptorPoolResetFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDescriptorPoolResetFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkDescriptorPoolResetFlags(int value) {
        setValue(value);
    }
}
