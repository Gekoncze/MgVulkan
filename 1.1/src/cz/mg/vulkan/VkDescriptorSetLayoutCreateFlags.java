package cz.mg.vulkan;

public class VkDescriptorSetLayoutCreateFlags extends VkFlags {
    public VkDescriptorSetLayoutCreateFlags() {
    }

    protected VkDescriptorSetLayoutCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDescriptorSetLayoutCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDescriptorSetLayoutCreateFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkDescriptorSetLayoutCreateFlags(int value) {
        setValue(value);
    }
}
