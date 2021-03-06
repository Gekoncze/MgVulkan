package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkDescriptorBindingFlagBitsEXT extends VkFlagBits {
    public static final int VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT = 0x00000001;
    public static final int VK_DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT_EXT = 0x00000002;
    public static final int VK_DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT_EXT = 0x00000004;
    public static final int VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT_EXT = 0x00000008;

    public VkDescriptorBindingFlagBitsEXT() {
    }

    protected VkDescriptorBindingFlagBitsEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDescriptorBindingFlagBitsEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDescriptorBindingFlagBitsEXT(VkPointer pointer) {
        super(pointer);
    }



    public VkDescriptorBindingFlagBitsEXT(int value) {
        setValue(value);
    }

    public VkDescriptorBindingFlagBitsEXT(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT) != 0) s.addLast("VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT");
        if((getValue() & VK_DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT_EXT) != 0) s.addLast("VK_DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT_EXT");
        if((getValue() & VK_DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT_EXT) != 0) s.addLast("VK_DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT_EXT");
        if((getValue() & VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT_EXT) != 0) s.addLast("VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT_EXT");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
