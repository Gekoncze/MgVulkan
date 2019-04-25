package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkDescriptorSetLayoutCreateFlagBits extends VkFlagBits {
    public static final int VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR = 0x00000001;
    public static final int VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT = 0x00000002;

    public VkDescriptorSetLayoutCreateFlagBits() {
    }

    protected VkDescriptorSetLayoutCreateFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDescriptorSetLayoutCreateFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDescriptorSetLayoutCreateFlagBits(VkPointer pointer) {
        super(pointer);
    }



    public VkDescriptorSetLayoutCreateFlagBits(int value) {
        setValue(value);
    }

    public VkDescriptorSetLayoutCreateFlagBits(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR) != 0) s.addLast("VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR");
        if((getValue() & VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT) != 0) s.addLast("VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
