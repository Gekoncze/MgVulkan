package cz.mg.vulkan.vk;

public class VkSharingMode extends VkEnum {
    public static final int VK_SHARING_MODE_EXCLUSIVE = 0;
    public static final int VK_SHARING_MODE_CONCURRENT = 1;

    public VkSharingMode() {
    }

    public VkSharingMode(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSharingMode(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSharingMode(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_SHARING_MODE_EXCLUSIVE) return "VK_SHARING_MODE_EXCLUSIVE";
        if(getValue() == VK_SHARING_MODE_CONCURRENT) return "VK_SHARING_MODE_CONCURRENT";
        return "UNKNOWN";
    }
}
