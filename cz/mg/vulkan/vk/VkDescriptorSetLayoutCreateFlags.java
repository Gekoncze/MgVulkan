package cz.mg.vulkan.vk;

public class VkDescriptorSetLayoutCreateFlags extends VkFlags {
    public VkDescriptorSetLayoutCreateFlags() {
    }

    public VkDescriptorSetLayoutCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDescriptorSetLayoutCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDescriptorSetLayoutCreateFlags(int value) {
        setValue(value);
    }
}
