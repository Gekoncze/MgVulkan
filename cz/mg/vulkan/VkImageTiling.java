package cz.mg.vulkan;

public class VkImageTiling extends VkEnum {
    public static final int VK_IMAGE_TILING_OPTIMAL = 0;
    public static final int VK_IMAGE_TILING_LINEAR = 1;

    public VkImageTiling() {
    }

    public VkImageTiling(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImageTiling(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkImageTiling(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_IMAGE_TILING_OPTIMAL) return "VK_IMAGE_TILING_OPTIMAL";
        if(getValue() == VK_IMAGE_TILING_LINEAR) return "VK_IMAGE_TILING_LINEAR";
        return "UNKNOWN";
    }
}
