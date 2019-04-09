package cz.mg.vulkan;

public class VkBufferUsageFlagBits extends VkFlagBits {
    public static final int VK_BUFFER_USAGE_TRANSFER_SRC_BIT = 0x00000001;
    public static final int VK_BUFFER_USAGE_TRANSFER_DST_BIT = 0x00000002;
    public static final int VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT = 0x00000004;
    public static final int VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT = 0x00000008;
    public static final int VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT = 0x00000010;
    public static final int VK_BUFFER_USAGE_STORAGE_BUFFER_BIT = 0x00000020;
    public static final int VK_BUFFER_USAGE_INDEX_BUFFER_BIT = 0x00000040;
    public static final int VK_BUFFER_USAGE_VERTEX_BUFFER_BIT = 0x00000080;
    public static final int VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT = 0x00000100;

    public VkBufferUsageFlagBits() {
    }

    public VkBufferUsageFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkBufferUsageFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkBufferUsageFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_BUFFER_USAGE_TRANSFER_SRC_BIT) s += "VK_BUFFER_USAGE_TRANSFER_SRC_BIT";
        if(getValue() == VK_BUFFER_USAGE_TRANSFER_DST_BIT) s += "VK_BUFFER_USAGE_TRANSFER_DST_BIT";
        if(getValue() == VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT) s += "VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT";
        if(getValue() == VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT) s += "VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT";
        if(getValue() == VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT) s += "VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT";
        if(getValue() == VK_BUFFER_USAGE_STORAGE_BUFFER_BIT) s += "VK_BUFFER_USAGE_STORAGE_BUFFER_BIT";
        if(getValue() == VK_BUFFER_USAGE_INDEX_BUFFER_BIT) s += "VK_BUFFER_USAGE_INDEX_BUFFER_BIT";
        if(getValue() == VK_BUFFER_USAGE_VERTEX_BUFFER_BIT) s += "VK_BUFFER_USAGE_VERTEX_BUFFER_BIT";
        if(getValue() == VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT) s += "VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
