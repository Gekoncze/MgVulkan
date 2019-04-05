package cz.mg.vulkan.vk;

public class VkFilter extends VkEnum {
    public static final int VK_FILTER_NEAREST = 0;
    public static final int VK_FILTER_LINEAR = 1;
    public static final int VK_FILTER_CUBIC_IMG = 1000015000;

    public VkFilter() {
    }

    public VkFilter(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkFilter(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkFilter(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_FILTER_NEAREST) return "VK_FILTER_NEAREST";
        if(getValue() == VK_FILTER_LINEAR) return "VK_FILTER_LINEAR";
        if(getValue() == VK_FILTER_CUBIC_IMG) return "VK_FILTER_CUBIC_IMG";
        return "UNKNOWN";
    }
}
