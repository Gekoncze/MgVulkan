package cz.mg.vulkan;

public class VkDescriptorBindingFlagsEXT extends VkFlags {
    public VkDescriptorBindingFlagsEXT() {
    }

    public VkDescriptorBindingFlagsEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDescriptorBindingFlagsEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkDescriptorBindingFlagsEXT(int value) {
        setValue(value);
    }
}
