package cz.mg.vulkan;

public class VkSparseImageFormatFlagBits extends VkFlagBits {
    public static final int VK_SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT = 0x00000001;
    public static final int VK_SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT = 0x00000002;
    public static final int VK_SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT = 0x00000004;

    public VkSparseImageFormatFlagBits() {
    }

    public VkSparseImageFormatFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSparseImageFormatFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSparseImageFormatFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT) s += "VK_SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT";
        if(getValue() == VK_SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT) s += "VK_SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT";
        if(getValue() == VK_SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT) s += "VK_SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
