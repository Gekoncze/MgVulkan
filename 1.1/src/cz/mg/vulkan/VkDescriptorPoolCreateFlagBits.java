package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkDescriptorPoolCreateFlagBits extends VkFlagBits {
    public static final int VK_DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT = 0x00000001;
    public static final int VK_DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT_EXT = 0x00000002;

    public VkDescriptorPoolCreateFlagBits() {
    }

    protected VkDescriptorPoolCreateFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDescriptorPoolCreateFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDescriptorPoolCreateFlagBits(VkPointer pointer) {
        super(pointer);
    }



    public VkDescriptorPoolCreateFlagBits(int value) {
        setValue(value);
    }

    public VkDescriptorPoolCreateFlagBits(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT) != 0) s.addLast("VK_DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT");
        if((getValue() & VK_DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT_EXT) != 0) s.addLast("VK_DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT_EXT");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
