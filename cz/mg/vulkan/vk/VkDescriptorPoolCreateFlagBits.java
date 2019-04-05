package cz.mg.vulkan.vk;

public class VkDescriptorPoolCreateFlagBits extends VkFlagBits {
    public static final int VK_DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT = 0x00000001;
    public static final int VK_DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT_EXT = 0x00000002;

    public VkDescriptorPoolCreateFlagBits() {
    }

    public VkDescriptorPoolCreateFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDescriptorPoolCreateFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDescriptorPoolCreateFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT) s += "VK_DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT";
        if(getValue() == VK_DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT_EXT) s += "VK_DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT_EXT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
