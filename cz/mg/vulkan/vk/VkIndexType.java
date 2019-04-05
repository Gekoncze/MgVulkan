package cz.mg.vulkan.vk;

public class VkIndexType extends VkEnum {
    public static final int VK_INDEX_TYPE_UINT16 = 0;
    public static final int VK_INDEX_TYPE_UINT32 = 1;

    public VkIndexType() {
    }

    public VkIndexType(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkIndexType(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkIndexType(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_INDEX_TYPE_UINT16) return "VK_INDEX_TYPE_UINT16";
        if(getValue() == VK_INDEX_TYPE_UINT32) return "VK_INDEX_TYPE_UINT32";
        return "UNKNOWN";
    }
}
