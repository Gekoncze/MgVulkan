package cz.mg.vulkan;

public class VkDescriptorPoolResetFlags extends VkFlags {
    public VkDescriptorPoolResetFlags() {
    }

    public VkDescriptorPoolResetFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDescriptorPoolResetFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDescriptorPoolResetFlags(int value) {
        setValue(value);
    }
}
