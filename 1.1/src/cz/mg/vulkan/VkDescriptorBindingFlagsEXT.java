package cz.mg.vulkan;

public class VkDescriptorBindingFlagsEXT extends VkFlags {
    public VkDescriptorBindingFlagsEXT() {
    }

    protected VkDescriptorBindingFlagsEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDescriptorBindingFlagsEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDescriptorBindingFlagsEXT(VkPointer pointer) {
        super(pointer);
    }



    public VkDescriptorBindingFlagsEXT(int value) {
        setValue(value);
    }
}
