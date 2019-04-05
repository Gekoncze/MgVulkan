package cz.mg.vulkan.vk;

public class VkDescriptorSetLayoutCreateFlagBits extends VkFlagBits {
    public static final int VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR = 0x00000001;
    public static final int VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT = 0x00000002;

    public VkDescriptorSetLayoutCreateFlagBits() {
    }

    public VkDescriptorSetLayoutCreateFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDescriptorSetLayoutCreateFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDescriptorSetLayoutCreateFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR) s += "VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR";
        if(getValue() == VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT) s += "VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
