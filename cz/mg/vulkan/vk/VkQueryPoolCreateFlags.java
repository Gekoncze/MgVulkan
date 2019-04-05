package cz.mg.vulkan.vk;

public class VkQueryPoolCreateFlags extends VkFlags {
    public VkQueryPoolCreateFlags() {
    }

    public VkQueryPoolCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkQueryPoolCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkQueryPoolCreateFlags(int value) {
        setValue(value);
    }
}
