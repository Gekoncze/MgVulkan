package cz.mg.vulkan.vk;

public class VkCommandPoolCreateFlags extends VkFlags {
    public VkCommandPoolCreateFlags() {
    }

    public VkCommandPoolCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkCommandPoolCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkCommandPoolCreateFlags(int value) {
        setValue(value);
    }
}
