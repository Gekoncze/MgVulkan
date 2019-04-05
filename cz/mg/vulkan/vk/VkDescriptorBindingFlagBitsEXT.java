package cz.mg.vulkan.vk;

public class VkDescriptorBindingFlagBitsEXT extends VkFlagBits {
    public static final int VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT = 0x00000001;
    public static final int VK_DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT_EXT = 0x00000002;
    public static final int VK_DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT_EXT = 0x00000004;
    public static final int VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT_EXT = 0x00000008;

    public VkDescriptorBindingFlagBitsEXT() {
    }

    public VkDescriptorBindingFlagBitsEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDescriptorBindingFlagBitsEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDescriptorBindingFlagBitsEXT(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT) s += "VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT";
        if(getValue() == VK_DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT_EXT) s += "VK_DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT_EXT";
        if(getValue() == VK_DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT_EXT) s += "VK_DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT_EXT";
        if(getValue() == VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT_EXT) s += "VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT_EXT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
